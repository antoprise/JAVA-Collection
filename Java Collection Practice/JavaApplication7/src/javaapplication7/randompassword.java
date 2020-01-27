
package javaapplication7;


public class randompassword {
    public static void main(String[] args) {
        
       String fName="Kasipan";
       String sName="Amornsurakarn";
       int  rand;
       int  rand3;
       char rand1;
       char rand2;
       
       char aName='A';
       char zName='Z';
       char bName='a';
       char cName='z'; 
       
       System.out.print(fName.charAt(0)+""+sName.charAt(0));
       
       rand1 = (char)(Math.random()*(zName-aName+1)+aName);
       System.out.print(rand1);
       rand1 = (char)(Math.random()*(zName-aName+1)+aName);
       System.out.print(rand1);
       
       rand2 = (char)(Math.random()*(cName-bName+1)+bName);
       System.out.print(rand2);
       rand2 = (char)(Math.random()*(cName-bName+1)+bName);
       System.out.print(rand2);
       
       int i= (int)(Math.random()*(9-0+1)+0);
       System.out.print(i);
       int j= (int)(Math.random()*(9-0+1)+0);
       System.out.print(j);
       
       
       
       
       
    }
}
