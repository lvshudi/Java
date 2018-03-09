package t1;

class Person{
	int age;
	String name;
	String sex;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}

class Student extends Person{
	String school;
	int grade;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Student() {
		school = "henu";
		grade = 3;
	}
	public void fun() {
		System.out.println(school+grade+age);
	}
}

public class Convert16_8 {
	public static void main(String args[]) {
		Student aPerson = new Student();
		aPerson.setAge(30);
		aPerson.fun();
	}
}