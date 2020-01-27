
package self.model;

public class Student {
    private String name ;
    private int weight ;
    private double height ;

    public Student(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    
    
}

