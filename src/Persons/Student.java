package Persons;

import java.util.Objects;

public class Student extends Person {
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    @Override
    public String toString() {
        return "Persons.Student{" +
                "className='" + className + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(className, student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), className);
    }

    public void printAllStudentsInfo() {
        System.err.println(getName()+" "+getSurName()+" "+ getAge()+" "+ getClassName());
    }
}
