package oopsconcept;

import java.util.Scanner;

public class accessmodifiers {

    static class Student {
        public String name;
        private int marks;
        protected String grade;
        int rollNumber;

        void setMarks(int m) {
            if (m >= 0 && m <= 100) {
                marks = m;
                grade = (marks >= 40) ? "PASS" : "FAIL";
            }
        }

        String getGrade() {
            return grade;
        }

        void displayBasicInfo() {
            System.out.println(name + " " + rollNumber);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Name: ");
        s.name = sc.nextLine();

        System.out.print("Roll: ");
        s.rollNumber = sc.nextInt();

        System.out.print("Marks: ");
        s.setMarks(sc.nextInt());

        s.displayBasicInfo();
        System.out.println("Grade: " + s.getGrade());

        sc.close();
    }
}

