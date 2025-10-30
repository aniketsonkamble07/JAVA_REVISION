public class Student
{
	int rollno;
	String name;
	String branch;
	
	public Student(int rollno, String name, String branch)
	{
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==null)
		{
			return true;
		}
		if(obj==null)
		{
			return false;
		}
		
		Student s=(Student)obj;
		return this.rollno==s.rollno && this.name.equals(s.name);
	}
}