package teststudent;

public class Student {

    private long id;
    private String name;
    private static int numOfStudent;

    public Student() {
        numOfStudent++;
    }

    public Student(long id, String name) {
        numOfStudent++;
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumOfStudent() {
        return Student.numOfStudent;
    }

    @Override
    public String toString() {
        String tempStr = "Student id : " + this.id
                + "\nStudent name : " + this.name;
        return tempStr;

    }

}
