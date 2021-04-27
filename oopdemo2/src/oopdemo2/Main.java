package oopdemo2;

public class Main {

	public static void main(String[] args) {
	
		Courses course1 = new Courses ();
		course1.id = 1453;
		course1.name = "C# & ANGULAR";
		course1.price = "Free";
		course1.teacher = "Engin Demirog";
		
		Courses course2 = new Courses ();
		course2.id = 1071;
		course2.name = "Java + React";
		course2.price = "Free";
		course2.teacher = "Engin Demirog";
		
		Courses course3 = new Courses ();
		course3.id = 1966;
		course3.name = "Phyton";
		course3.price = "Free";
		course3.teacher = "Bilgehan Yaradanakul";
		
		
		Courses course4 = new Courses (757,"C++","Free","Tolga YARADANAKUL");
	
		
		
		Teachers teacher1 = new Teachers ();
		teacher1.id = 55;
		teacher1.name = "Engin Demirog";
		
		
		Teachers teacher2 = new Teachers ();
		teacher2.id = 60;
		teacher2.name ="Bilgehan Yaradanakul";
		
		Courses []courses = {
			course1,course2,course3,course4
		};
		
		for (Courses course:courses) {
		System.out.println("Kurs Adı: "+ course.name);
		System.out.println("Kurs Fiyatı: "+ course.price);
		System.out.println("Kurs Hocası: "+ course.teacher);
		System.out.println("-------------------");
		}
		
		CoursesManager coursesManager = new CoursesManager ();
		coursesManager.add();
		coursesManager.delete();
		
		
		
		

	}

}
