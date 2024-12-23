package main;
import java.util.Enumeration;

public class Main {
	
	public static void main(String[] args) {
	    Course course = new Course();
	    course.setTitle("Computer Science 101");

	    Student student1 = new Student();
	    student1.setName("Alice");

	    Student student2 = new Student();
	    student2.setName("Bob");

	    CourseRecord record1 = new CourseRecord();
	    record1.setStudent(student1);

	    CourseRecord record2 = new CourseRecord();
	    record2.setStudent(student2);

	    Assignment assignment1 = new Assignment();
	    assignment1.setMark(85);
	    record1.addAssignment(assignment1);

	    Assignment assignment2 = new Assignment();
	    assignment2.setMark(90);
	    record1.addAssignment(assignment2);

	    Assignment assignment3 = new Assignment();
	    assignment3.setMark(75);
	    record2.addAssignment(assignment3);

	    Assignment assignment4 = new Assignment();
	    assignment4.setMark(80);
	    record2.addAssignment(assignment4);

	    course.addCourseRecord(record1);
	    course.addCourseRecord(record2);

	    course.printCourseStudents();

	    course.printBestStudent();

	    course.printFinalExamStudents();
	    
	    try {
	        double mark = assignment1.getMark(); 
	        System.out.println("Nilai: " + mark);
	    } catch (NotYetSetException e) {
	        System.err.println("Error: " + e.getMessage());
	    }

	}
}

