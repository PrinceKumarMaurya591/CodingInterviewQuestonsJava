package org.example.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import org.example.entity.Student;

@FunctionalInterface
interface InterfaceForLambda {

	int operate(int a, int b);
	
}


public class LambdaAndStream {
public static void main(String[] args)  {
//	// Implementing the MathOperation interface using a lambda expression
//    InterfaceForLambda addition = (int a, int b) -> a + b;
//    
//    // Using the lambda function to perform addition
//    int result = addition.operate(10, 5);
//    System.out.println("Result of addition: " + result);
	
	List<String>lm=Arrays.asList("Alice", "Bob", "Charlie");
	lm.forEach(lms->System.out.println(lms));
	
	
	
	List<String>lst=Arrays.asList("Prince","Kumar","Maurya");
	lst.sort((s1, s2) -> s1.length() - s2.length());
	System.out.println(lst);
	
	
	List<Integer>list=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	List<Integer>even=list.stream().filter(n -> n%2==0).collect(Collectors.toList());
	System.out.println(even);



List<Student> listStudent = Arrays.asList(
	    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
	    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
	    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
	    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
	    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
	    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
	    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
	    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
	    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
	    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

//1-  Find list of students whose first name starts with alphabet A

List<Student>l=listStudent.stream().filter(s->s.getFirstName().startsWith("A")).collect(Collectors.toList());
System.out.println("List of students whose name starts with letter A : "+l);


//2- Group The Student By Department Names
Map<String,List<Student>>groupStudent=listStudent.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
System.out.println(groupStudent);

//3- Find the total count of student using stream
long countStudent = listStudent.stream().count();
System.out.println("Total count of students : "+countStudent);

//4- Find the max age of student
OptionalInt maxAge = listStudent.stream().mapToInt(age->age.getAge()).max();
System.out.println("Max age of student : "+maxAge.getAsInt());


//5- Find all departments names
List<String> lstDepartments = listStudent.stream().map(s -> s.getDepartmantName()).distinct()
		.collect(Collectors.toList());
System.out.println("All distinct department names : " + lstDepartments);

//6- Find the count of student in each department
Map<String, Long> countStudentInEachdept = listStudent.stream()
		.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
System.out.println("Student count in each department : " + countStudentInEachdept);

//7- Find the list of students whose age is less than 30
List<Student> lstStudent = listStudent.stream().filter(age -> age.getAge() < 30).collect(Collectors.toList());
System.out.println("List of students whose age is less than 30 : " + lstStudent);

//8- Find the list of students whose rank is in between 50 and 100
List<Student> lstStu = listStudent.stream().filter(rank -> rank.getRank() > 50 && rank.getRank() < 100)
		.collect(Collectors.toList());
System.out.println("List of students whose rank is between 50 and 100 : " + lstStu);

//9- Find the average age of male and female students
Map<String, Double> mapAvgAge = listStudent.stream()
		.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
System.out.println("Average age of male and female students : " + mapAvgAge);

//10- Find the department who is having maximum number of students
Entry<String, Long> entry = listStudent.stream()
		.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream()
		.max(Map.Entry.comparingByValue()).get();
System.out.println("Department having maximum number of students : " + entry);

//11- Find the Students who stays in Delhi and sort them by their names
List<Student> lstDelhistudent = listStudent.stream().filter(dt -> dt.getCity().equals("Delhi"))
		.sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
System.out.println("List of students who stays in Delhi and sort them by their names : " + lstDelhistudent);

//12- Find the average rank in all departments
Map<String, Double> collect = listStudent.stream()
		.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
System.out.println("Average rank in all departments  : " + collect);

//13- Find the highest rank in each department
Map<String, Optional<Student>> studentData = listStudent.stream().collect(
		Collectors.groupingBy(Student::getDepartmantName, Collectors.minBy(Comparator.comparing(Student::getRank))));
System.out.println("Highest rank in each department  : " + studentData);

//14- Find the list of students and sort them by their rank
List<Student> stuRankSorted = listStudent.stream().sorted(Comparator.comparing(Student::getRank))
		.collect(Collectors.toList());
System.out.println("List of students sorted by their rank  : " + stuRankSorted);

//15- Find the student who has second rank
Student student = listStudent.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
System.out.println("Second highest rank student  : " + student);

}
}
