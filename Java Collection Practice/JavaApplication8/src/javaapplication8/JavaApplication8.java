
package javaapplication8;

public class JavaApplication8 {

    
    public static void main(String[] args) {
       
     int rand;
     char rand1;
     char rand2;
   
     char aName='A';
     char zName='Z';
     char bName='a';
     char cName='z';    
   
    int i= (int)(Math.random()*(10-1+1)+1);
    System.out.println(i);
    
    rand1 = (char)(Math.random()*(zName-aName+1)+aName);
    System.out.print(rand1);
    rand2 = (char)(Math.random()*(cName-bName+1)+bName);
    System.out.print(rand2);
    rand1 = (char)(Math.random()*(zName-aName+1)+aName);
    System.out.print(rand1);
    rand2 = (char)(Math.random()*(cName-bName+1)+bName);
    System.out.print(rand2);
     
    
    
    
    }
    
}
