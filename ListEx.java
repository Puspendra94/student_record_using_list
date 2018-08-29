import java.util.*;

class Student{
	String name,roll;
	int sem;
	Student(String name,String roll,int sem)
	{
		this.name=name;
		this.roll=roll;
		this.sem=sem;
	}
}

class ListEx{
	public static void main(String... args){
			List<Student> l=new ArrayList<Student>();
			Student s1=new Student("Pandey","CSM15011",3);
			l.add(s1);
			System.out.println(s1.name+" "+s1.roll+" "+s1.sem);
		}
}
