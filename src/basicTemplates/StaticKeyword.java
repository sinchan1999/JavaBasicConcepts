package basicTemplates;

class Emp{

    int empID,salary;
    String name;
    static String ceo;

    /*This static block info is valid for all the objects.This block runs only once when the class is created.*/

    static { // Loads only once in class loader.
        ceo="Chamaan Pichai";
        System.out.println("I am the Static block!");
    }

    public Emp() { // Gets called when object is created.
        empID=1;
        salary=100;
        System.out.println("I am the default construtor!");

    }
    public void show() {
        System.out.println("Employee ID:"+empID+" Salary:"+salary+" Name-"+name+" CEO-"+ceo);

    }

}

public class StaticKeyword {
    public static void main(String args[]) {
        Emp Ramu =new Emp();
        Ramu.empID=127;
        Ramu.salary=25000;
        Ramu.name="Ramu";

        Emp Hritesh =new Emp();
        Hritesh.empID=399;
        Hritesh.salary=21000;
        Hritesh.name="Hritesh";

        Emp Manishaa =new Emp();
        Manishaa.empID=599;
        Manishaa.salary=16000;
        Manishaa.name="Manishaa";

        Ramu.show();
        Hritesh.show();
        Manishaa.show();


    }


}
