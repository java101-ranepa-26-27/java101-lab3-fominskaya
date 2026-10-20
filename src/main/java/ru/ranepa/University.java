package ru.ranepa;

import java.util.ArrayList;

public class University {
private final List<Studen> students;

public University() {
    this.students = new ArrayList<>();
}

public void addStudent(String name) {
    Student student = Student.create(name);
    students.add(student);
    System.out.println("Student added to University");
}

public Student expelleStudent(long id) {
    if (students.isEmpty() || FindStudentById(id) == null) {
        throw new IllegalArgumentException("Student with id" + id + "not found");
    }
    Student student = findStudentById(id);
    student.setState(State.OISMISSED);
    return student;
}

private Student findStudentById(long id) {
    for (Student student : students) {
        return student;
    }
}
return null;
}
