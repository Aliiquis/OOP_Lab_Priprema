package hr.fer.oop.demo2.student;

class Student {
    private String name, surname;
    private int age;

    public Student(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    static void sortStudentsOnAge(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length; j++) {
                if (students[j - 1].getAge() > students[j].getAge()) {
                    Student t = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = t;
                }
            }
        }
    }
}