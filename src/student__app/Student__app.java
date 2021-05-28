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
public class Student__app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
    student s = new student();
    s.setName("david");
     s.setAge(20);
    // s.setGrade(1000);
     s.setGrade(90);
     System.out.println(s.toString());
    }
    
}
