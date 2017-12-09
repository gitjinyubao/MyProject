package jihe;

import java.util.HashSet;
import java.util.Set;

public class Student {
	public String name;
	public String id;
	public Set<Course> set;
	public Student(String id,String name)
	{
	      this.id=id;
	      this.name=name;
	      this.set=new HashSet<Course>();
	}
}
