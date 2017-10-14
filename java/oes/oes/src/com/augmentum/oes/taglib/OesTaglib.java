package com.augmentum.oes.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.context.ApplicationContext;

import com.augmentum.common.BlockAbstract;
import com.augmentum.oes.util.SpringUtil;

public class OesTaglib extends TagSupport {
    private static final long serialVersionUID = -8244767853532898528L;
    //Definition block's name，value like product_cat
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int doStartTag() throws JspTagException {
        return SKIP_BODY;
    }


    @Override
    public int doEndTag() throws JspTagException {
        //there use spring frame，if you dont use it，you should // block定义的xml文件 11
        ApplicationContext ctx = SpringUtil.getApplicationContext();
        //get block object
        BlockAbstract block = (BlockAbstract)ctx.getBean(name);
        //get Html content
        String content = block.displayBlock(pageContext);
        //out to oage
        JspWriter out = pageContext.getOut();
        try {
            out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }

    @Override
    public void release() {
        super.release();
    }

}
