/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import self.model.StudentBMI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import self.model.Student;

/**
 *
 * @author Wind
 */
public class StudentBMITest {
   private Student std[];
           
   public StudentBMITest(){
  
      std=new Student[]{new Student("Cherprang", 20, 1.2), new Student("Pun", 37, 1.4),
          new Student("Noey", 50, 1.4),new Student("Jane",110, 1.9),
          new Student("A",-1, 1),new Student("B",1, 0),new Student("C",1, -1)};
   }
   
   @Test
   public void bmiOfAllStudent(){
        String expect[]={"under weight", "normal weight", "over weight", "obesity","none","none","none"};
        String actual[]=StudentBMI.bmiStudents(std);
        assertArrayEquals(expect, actual);
   }
   
   
   
}