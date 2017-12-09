package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.File_information;


@Controller
public class ControllerImage {
	
	@RequestMapping("/upFile")
	public    String    doUpImage(@ModelAttribute("File_information")  File_information f_i,Model   model) throws Exception, IOException
	{
		if(!f_i.getFile().isEmpty())
		{
			 String    path=null;
			 String    fileOriginalNameSuffix=null;
			 String    fileOriginalName=f_i.getFile().getOriginalFilename();
			if(fileOriginalName.length()-fileOriginalName.indexOf(".")==4)
			{
			   fileOriginalNameSuffix=fileOriginalName.substring(fileOriginalName.length()-4);
			   path="F:///照片";
			}
			else if(fileOriginalName.length()-fileOriginalName.indexOf(".")==5)
			{
				fileOriginalNameSuffix=fileOriginalName.substring(fileOriginalName.length()-5);
				 path="F:///文档";
			}
			String    fileName=f_i.getFilename()+fileOriginalNameSuffix;
			File      file=new File(path,fileName);
			if(!file.getParentFile().exists())
			{
				//创建路径
				file.getParentFile().mkdirs();
			}
			f_i.getFile().transferTo(new  File(path+File.separator+fileName));
			model.addAttribute("state", "successful");
			return   "file";
		}
		else
		{
			model.addAttribute("state", "filure");
			return   "file";
		}
	}
	//批量上传
	@RequestMapping("/upFileList")
	public    String    doUpImageList(@RequestParam("file1")   MultipartFile  file1,@RequestParam("file2")   MultipartFile  file2,@RequestParam("file3")   MultipartFile  file3,Model   model) throws Exception, IOException
	{
		List<MultipartFile>   list=new ArrayList<MultipartFile>();
		list.add(file1);
		list.add(file2);
		list.add(file3);
		System.out.println(list.get(0).toString());
		if(list.size()!=0)
		{
			 String    path="F:///images";
			 for (MultipartFile multipartFile : list) {
				 File      file=new File(path,multipartFile.getOriginalFilename());
				 if(!file.getParentFile().exists())
					{
						file.getParentFile().mkdirs();
					}
				 multipartFile.transferTo(new  File(path+File.separator+multipartFile.getOriginalFilename()));
			}
			model.addAttribute("state", "successful");
			return   "fileList";
		}
		else
		{
			model.addAttribute("state", "filure");
			return   "fileList";
		}
	}
}