package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
		private   int   id ;
		private   String   name;
		private   Classes  classes;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Classes getClasses() {
			return classes;
		}
		public void setClasses(Classes classes) {
			this.classes = classes;
		}
		public Student(int id, String name, Classes classes) {
			super();
			this.id = id;
			this.name = name;
			this.classes = classes;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", classes="
					+ classes + "]";
		}
}
