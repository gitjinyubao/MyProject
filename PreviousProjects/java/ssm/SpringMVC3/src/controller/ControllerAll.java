package controller;



import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspsmart.upload.SmartUpload;



@Controller
@RequestMapping("/jin")
public class ControllerAll {
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public  String   doLogin(@RequestParam("username") String  username,Model  model)
	{
		System.out.println("username"+username);
		model.addAttribute("username",username);
	    return    "../index.jsp"; 
	}
	
	@RequestMapping(value="/shang",method=RequestMethod.POST)
	public   void    doShang(HttpServletRequest   req,HttpServletResponse  res) throws ServletException
	{
		@SuppressWarnings("deprecation")
		String  filePath=req.getRealPath("/")+"fileOne";
		File  file=new File(filePath);
		if(!file.exists())
		{
			file.mkdir();
		}
		SmartUpload   su=new   SmartUpload();
		su.setAllowedFilesList("txt,doc,gif,jpg,mp3");
		su.setMaxFileSize(1024);
		su.setTotalMaxFileSize(1024*1024);
	}
}
