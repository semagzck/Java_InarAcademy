package chapters.chapter_11.exercise;

public class Exercise2Test {
    public static void main(String[] args) {
        Person person=new Person("Sema","İzmir","0523653256","semagzckk@gmail.com");
        System.out.println(person.toString());
        System.out.println("---------------------");
        Student student=new Student("Sema","İzmir","0523653256","semagzckk@gmail.com","Senior");
        System.out.println(student.toString());
        System.out.println("---------------------");

        Employee employee=new Employee("Sema","İzmir","0523653256","semagzckk@gmail.com",10000,"ITU",new MyDate().toString());
        System.out.println(employee.toString());
        System.out.println("---------------------");

        Faculty faculty=new Faculty("Sema","11AM-6PM","Professor");
        System.out.println(faculty.toString());
        System.out.println("---------------------");

        Staff staff=new Staff("Sema","Dean");
        System.out.println(staff.toString());
    }

}
package chapters.chapter_11.exercise;

public class Exercise2Test {
	    public static void main(String[] args) {
		            Person person=new Person("Sema","İzmir","0523653256","semagzckk@gmail.com");
			            System.out.println(person.toString());
				            System.out.println("---------------------");
					            Student student=new Student("Sema","İzmir","0523653256","semagzckk@gmail.com","Senior");
						            System.out.println(student.toString());
							            System.out.println("---------------------");

								            Employee employee=new Employee("Sema","İzmir","0523653256","semagzckk@gmail.com",10000,"ITU",new MyDate().toString());
									            System.out.println(employee.toString());
										            System.out.println("---------------------");

											            Faculty faculty=new Faculty("Sema","11AM-6PM","Professor");
												            System.out.println(faculty.toString());
													            System.out.println("---------------------");

														            Staff staff=new Staff("Sema","Dean");
															            System.out.println(staff.toString());
																        }

}

