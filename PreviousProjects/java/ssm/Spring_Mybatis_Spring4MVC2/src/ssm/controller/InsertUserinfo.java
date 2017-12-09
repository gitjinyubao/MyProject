package ssm.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.jmx.snmp.Timestamp;


@Controller
@Transactional
public class InsertUserinfo extends  BaseAction{

	@RequestMapping("/insertUserinfo")
	public  String   insertUserinfo()
	{
		System.out.println("into  insertUserinfo  controller");
		this.getaAllService().getUserinfoService().insertUserinfo("123",100, new Date());
		return "index.jsp";
	}
}
