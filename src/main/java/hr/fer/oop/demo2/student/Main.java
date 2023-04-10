package hr.fer.oop.demo2.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("a", "a", 5);
        Student s2 = new Student("b", "a", 1);
        Student s3 = new Student("c", "a", 6);
        Student s4 = new Student("d", "a", 2);
        Student s5 = new Student("e", "a", 2);
        Student[] students = new Student[]{s1, s2, s3, s4, s5};
        Student.sortStudentsOnAge(students);
        for (Student s : students) {
            System.out.println(s.getName() + ' ' + s.getAge());
        }
    }
}
