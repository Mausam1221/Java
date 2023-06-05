class car {
    String modelName;
    int modelYear;

    public car(String modelName,int modelYear){
        this.modelName=modelName;
        this.modelYear=modelYear;
    }
    public car(String modelName){
        this.modelName=modelName;
    

    }
    void printDetails(){
        System.out.println("this.modelName");
        System.out.println("this.modelYear");
    }
}
public class Main{
    public static void main(String[]args){
        car car1=new car("Mustang",1969);
        car1.printDetails();
    }
}
