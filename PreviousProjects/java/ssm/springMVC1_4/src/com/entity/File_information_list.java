package com.entity;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class File_information_list {
	private    List<String>             filenameList;
	private    List<MultipartFile>      fileList;
	public List<String> getFilenameList() {
		return filenameList;
	}
	public void setFilenameList(List<String> filenameList) {
		this.filenameList = filenameList;
	}
	public List<MultipartFile> getFileList() {
		return fileList;
	}
	public void setFileList(List<MultipartFile> fileList) {
		this.fileList = fileList;
	}
	public File_information_list(List<String> filenameList,
			List<MultipartFile> fileList) {
		super();
		this.filenameList = filenameList;
		this.fileList = fileList;
	}
	public File_information_list() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "File_information_list [filenameList=" + filenameList
				+ ", fileList=" + fileList + "]";
	}
}
