
package javaapplication6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaApplication6 {
   public static void main(String[] args) throws FileNotFoundException {
        
//        char kName='K'+3;
//        char aName='a'+3;
//        char sName='s'+3;
//        char iName='i'+3;
//        char pName='p'+3;
//        char nName='n'+3;
//        System.out.println(""+kName+aName+sName+iName+pName+aName+nName);
      String fName;
      String sName ;
      long stdID ;
      int bYear ;
      
//      Scanner inputFile=new Scanner(new File("folder/name.txt"));
      
      Scanner inputFile=new Scanner(System.in);
      
      fName = inputFile.next();
      sName = inputFile.next();
      stdID = inputFile.nextLong();
      bYear = inputFile.nextInt();
      
      System.out.println(fName+"\t"+sName+"\t"+stdID+"\t"+bYear);
      
      fName = inputFile.next();
      sName = inputFile.next();
      stdID = inputFile.nextLong();
      bYear = inputFile.nextInt();
      
      System.out.println(fName+"\t\t"+sName+"\t"+stdID+"\t"+bYear);
      
      fName = inputFile.next();
      sName = inputFile.next();
      stdID = inputFile.nextLong();
      bYear = inputFile.nextInt();
      
      System.out.println(fName+"\t"+sName+"\t"+stdID+"\t"+bYear);
      
      fName = inputFile.next();
      sName = inputFile.next();
      stdID = inputFile.nextLong();
      bYear = inputFile.nextInt();
      
      System.out.println(fName+"\t"+sName+"\t"+stdID+"\t"+bYear);
      
      fName = inputFile.next();
      sName = inputFile.next();
      stdID = inputFile.nextLong();
      bYear = inputFile.nextInt();
      
      System.out.println(fName+"\t"+sName+"\t"+stdID+"\t"+bYear);
        
    }
    
}
