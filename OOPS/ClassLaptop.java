class Computer{
    // properties
    int id;
    String name;
    double price;

    // constructor
    public Computer(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // methods
    void printDetails(){
        System.out.println("ID is "+this.id);
        System.out.println("Name is "+this.name);
        System.out.println("Price is "+this.price);
    }

}
// Main class
public class ClassLaptop{
    // main method
    public static void main(String[] args) {
        //Creating a object from class Computer. We must give parameter value here
        Computer com1 = new Computer(1, "MSI",233.0);
        // Assign value to class properties
        System.out.println(com1.id);
        System.out.println(com1.name);
        System.out.println(com1.price);
    }
}