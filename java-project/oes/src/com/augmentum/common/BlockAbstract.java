package com.augmentum.common;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.servlet.jsp.PageContext;

import org.apache.log4j.Logger;

public abstract class BlockAbstract {
    private Logger log = Logger.getLogger(BlockAbstract.class);
    private String template;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String displayBlock(PageContext pageContext) {
        execute(pageContext);
        Writer body = new StringWriter();

        try {
            if (template != null && !template.trim().equals("")) {
                pageContext.pushBody(body);
                pageContext.include(template); //include jsp template
                pageContext.popBody();
                return body.toString();
            }
        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                body.close();
            } catch (IOException e) {
                log.error(e);
            }
        }
        return "";
    }

    protected abstract void execute(PageContext pageContext);
}
