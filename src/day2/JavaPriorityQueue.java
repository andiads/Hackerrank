/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 * @level: MEDIUM
 * @problem title: java priority queue 
 * @link: https://www.hackerrank.com/challenges/java-priority-queue/problem
 * @author ANDI DWI SAPUTRO
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */
class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> queue = new PriorityQueue<Student>(
                Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID)
        );

        List<Student> students = new ArrayList<Student>();

        for (String evt : events) {
            String[] data = evt.split(" ");
            if (data[0].startsWith("ENTER")) {
                int id = Integer.parseInt(data[3]);
                String name = data[1];
                double cgpa = Double.parseDouble(data[2]);

                Student student = new Student(id, name, cgpa);

                queue.add(student);
            } else if (data[0].startsWith("SERVED")) {
                Student firstIn = queue.poll();
            }
        }
        Student firstIn = queue.poll();

        if (firstIn == null) {
            return students;
        } else {
            while (!queue.isEmpty() || firstIn != null) {
                students.add(firstIn);
                firstIn = queue.poll();
            }
        }

        return students;
    }
}

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
