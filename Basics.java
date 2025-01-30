class Car{
    String brand;
    String model;
    int price;

    public void drive(){
        System.out.println("Driving the car");
    }

    public void printBrand(){
        System.out.println(this.brand);
    }
}

class Student{
    String name;
    int rollNo;

    Student(Student s2){
        this.name = s2.name;
        this.rollNo = s2.rollNo;
    }
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;   
    }
}
public class Basics {
    public static void main(String[] args) {
        
    }
}