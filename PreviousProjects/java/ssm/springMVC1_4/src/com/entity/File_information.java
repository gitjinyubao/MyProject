package com.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class File_information {
	private    String      filename;
	private    MultipartFile      file;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public File_information(String filename, MultipartFile file) {
		super();
		this.filename = filename;
		this.file = file;
	}
	public File_information() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "File_information [filename=" + filename + ", file=" + file
				+ "]";
	}
	
}
