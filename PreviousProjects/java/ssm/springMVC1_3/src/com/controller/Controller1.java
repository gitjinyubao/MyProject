package com.controller;

import java.awt.PageAttributes.MediaType;
import java.io.File;
import java.io.UnsupportedEncodingException;


//import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;





@Controller
public class Controller1 {
	/*private   ServletContext   servletContext;
	public   void   setServletContext(ServletContext   servletContext)
	{
		this.servletContext=servletContext;
	}*/
	
	@RequestMapping(value="/fileUp.do",method=RequestMethod.POST)
	//上传的文件会自动绑定到MultipartFile中
	public   String    doFilter(HttpServletRequest   request,@RequestParam("description")   String  description,Model    model, @RequestParam("file")   MultipartFile  file) throws Exception, Exception  		                    
	{
		//如果文件不为空，写入上传路径
		if(!file.isEmpty())
		{
			//上传路径
			//应用路径下面存储
			//String     path=request.getRealPath("/images");
			//指定路径下面存储
			String     path="F:///images";   
			//上传文件名
			String   filename=file.getOriginalFilename();
			String   filenameSuffix=filename.substring(filename.length()-4);
			String   filenameTrue=description+filenameSuffix;
			File     file1=new File(path,filenameTrue);
			//判断路径是否存在，如果不存在就创建一个
			if(!file1.getParentFile().exists())
			{
				file1.getParentFile().mkdirs();
			}
			//将上传文件保存到一个目标文件中
			   //file.transferTo(new File(path+File.separator+filename));
			     file.transferTo(new File(path+File.separator+filenameTrue));
			   //model.addAttribute("path", path);
			   model.addAttribute("state","sucessful");
		}
		else
		{
			model.addAttribute("state","filure");
		}
		return   "file";
	}
	@RequestMapping(value="/fileLoad")
	public   ResponseEntity<byte[]>    doFilter1(HttpServletRequest  request,@RequestParam("filename")   String  filename,   Model   model) throws Exception
	{
		
		//下载文件路径
		//String     path=request.getRealPath("/images");
		String   path="F:///images/";
		//copy一份目标文件
		File   file=new  File(path+File.separator+filename);
		HttpHeaders headers=new  HttpHeaders();
		//下载显示的文件名，解决中文乱码
		String  downLoadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//通知浏览器以attachment(下载方式）打开图片
		headers.setContentDispositionFormData("attachment", downLoadFileName);
		//application/octet-stream:二进制流数据（最常见 文件下载）
		headers.setContentType(org.springframework.http.MediaType.APPLICATION_OCTET_STREAM);
		//201  HttpStatus.CREATED
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,HttpStatus.CREATED);
	}
}
