
package self.model;

public class StudentBMI {
    public static void main(String[] args) {
      Student std[];
      std=new Student[]{new Student("Cherprang", 20, 1.2), new Student("Pun", 37, 1.4),
          new Student("Noey", 50, 1.4),new Student("Jane",110, 1.9),
          new Student("A",-1, 1),new Student("B",1, 0),new Student("C",1, -1)};
  
      String[] bmi = bmiStudents(std) ;
      for(int i=0; i<bmi.length;i++){
        System.out.println(bmi[i]);
      }
    }
    
    public static String[] bmiStudents(Student std[]){
        String bmiCate[] = new String[std.length] ;
        double[] bmi = bmiCalculate(std) ;
         for(int i=0; i<std.length;i++){
             if(bmi[i] < 18.5) bmiCate[i] = "under weight" ;
             else if(bmi[i] < 25 ) bmiCate[i] = "normal weight" ;
             else if(bmi[i] <= 30) bmiCate[i] = "over weight" ;
             else if(bmi[i] > 18.5) bmiCate[i] = "obesity" ;
             if(std[i].getHeight() < 0 || std[i].getWeight()< 0) bmiCate[i] = "none" ;
             if(std[i].getHeight() == 0 ) bmiCate[i] = "none" ;
             
         }
         return bmiCate ;
    }
    
  
    public static double[] bmiCalculate(Student std[]){
        double[] bmi = new double[std.length];
        for(int i=0; i<std.length;i++){
            double weight = std[i].getWeight();
            double height = std[i].getHeight();
            bmi[i] = weight / (Math.pow(height,2));
            
        }
        return bmi ;
        
        
        
    }
}
