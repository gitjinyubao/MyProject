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
	//�ϴ����ļ����Զ��󶨵�MultipartFile��
	public   String    doFilter(HttpServletRequest   request,@RequestParam("description")   String  description,Model    model, @RequestParam("file")   MultipartFile  file) throws Exception, Exception  		                    
	{
		//����ļ���Ϊ�գ�д���ϴ�·��
		if(!file.isEmpty())
		{
			//�ϴ�·��
			//Ӧ��·������洢
			//String     path=request.getRealPath("/images");
			//ָ��·������洢
			String     path="F:///images";   
			//�ϴ��ļ���
			String   filename=file.getOriginalFilename();
			String   filenameSuffix=filename.substring(filename.length()-4);
			String   filenameTrue=description+filenameSuffix;
			File     file1=new File(path,filenameTrue);
			//�ж�·���Ƿ���ڣ���������ھʹ���һ��
			if(!file1.getParentFile().exists())
			{
				file1.getParentFile().mkdirs();
			}
			//���ϴ��ļ����浽һ��Ŀ���ļ���
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
		
		//�����ļ�·��
		//String     path=request.getRealPath("/images");
		String   path="F:///images/";
		//copyһ��Ŀ���ļ�
		File   file=new  File(path+File.separator+filename);
		HttpHeaders headers=new  HttpHeaders();
		//������ʾ���ļ����������������
		String  downLoadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//֪ͨ�������attachment(���ط�ʽ����ͼƬ
		headers.setContentDispositionFormData("attachment", downLoadFileName);
		//application/octet-stream:�����������ݣ���� �ļ����أ�
		headers.setContentType(org.springframework.http.MediaType.APPLICATION_OCTET_STREAM);
		//201  HttpStatus.CREATED
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,HttpStatus.CREATED);
	}
}
