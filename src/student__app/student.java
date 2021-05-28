/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student__app;

/**
 *
 * @author Sanvir Singh Dhadda
 */
public class student {
   private String name;
   private int age;
   private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade<0 || grade>100)
            System.out.println("Invalid Grade");
        else
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", age=" + age + ", grade=" + grade + '}';
    }
}

