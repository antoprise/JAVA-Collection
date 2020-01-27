
package javaapplication13;


public class highestScore {
    public static void main(String[] args) {
        double iTuition=10000,rate=5;
        int nYear=10;
        for (int i=1; i<=10; i++){
           iTuition = iTuition+iTuition*rate/100;
            System.out.println("year :"+i+" iTuition: "+iTuition);
        }
        System.out.println("The total tuition 4 year later after 10th years = "
        +totalTuition(4,iTuition,rate));
    }
    public static double totalTuition (int nYear,double iTuition,double rate){
        double sum = 0;
        for (int i = 1; i<=nYear ; i++){
            iTuition = iTuition+iTuition*rate/100;
            sum = sum+iTuition;
        }
        return sum;
    }
}
