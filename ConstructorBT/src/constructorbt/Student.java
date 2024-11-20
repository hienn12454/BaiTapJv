/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorbt;

/**
 *
 * @author TUF
 */
public class Student {
    private String StudentId;
    private String StudentName;
    private int age;

    public Student() {
    }

    public Student(String StudentId, String StudentName, int age) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.age = age;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
