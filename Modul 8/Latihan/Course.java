package main;

import java.util.Enumeration;
import java.util.Vector;

public class Course {
    private String title;
    private Vector courseRecords;

    public Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    public void printCourseStudents() {
        System.out.println("Mahasiswa Terdaftar: " + title);
        Enumeration records = getCourseRecords();
        while (records.hasMoreElements()) {
            CourseRecord record = (CourseRecord) records.nextElement();
            System.out.println("- " + record.getStudent().getName());
        }
    }

    public void printBestStudent() {
        double highestAverage = -1;
        Student bestStudent = null;

        Enumeration records = getCourseRecords();
        while (records.hasMoreElements()) {
            CourseRecord record = (CourseRecord) records.nextElement();
            double totalMarks = 0;
            int assignmentCount = 0;

            Enumeration assignments = record.getAssignments();
            while (assignments.hasMoreElements()) {
                Assignment assignment = (Assignment) assignments.nextElement();
                try {
                    totalMarks += assignment.getMark();
                    assignmentCount++;
                } catch (NotYetSetException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            if (assignmentCount > 0) {
                double average = totalMarks / assignmentCount;
                if (average > highestAverage) {
                    highestAverage = average;
                    bestStudent = record.getStudent();
                }
            }
        }

        if (bestStudent != null) {
            System.out.println("Mahasiswa Terbaik: " + bestStudent.getName() + " dengan nilai rata-rata " + highestAverage);
        } else {
            System.out.println("Tidak ditemukan.");
        }
    }

    public void printFinalExamStudents() {
        System.out.println("Mahasiswa yang terdaftar dalam ujian akhir: " + title);
        Enumeration records = getCourseRecords();
        while (records.hasMoreElements()) {
            CourseRecord record = (CourseRecord) records.nextElement();
            double totalMarks = 0;
            int assignmentCount = 0;

            Enumeration assignments = record.getAssignments();
            while (assignments.hasMoreElements()) {
                Assignment assignment = (Assignment) assignments.nextElement();
                try {
                    totalMarks += assignment.getMark();
                    assignmentCount++;
                } catch (NotYetSetException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            if (assignmentCount > 0) {
                double average = totalMarks / assignmentCount;
                if (average >= 50) {
                    System.out.println("- " + record.getStudent().getName());
                }
            }
        }
    }
}

