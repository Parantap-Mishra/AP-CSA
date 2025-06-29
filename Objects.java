class Employee{
    String name;
    private int id;
    private double pay_rate;

    //Method
    //This is a non-static method
    void non_static(){
        System.out.println("Non static method");
    }
    static void m_static(){
        System.out.println("Static");
    }


    // Creating constructors

    //Default Constructor
    Employee(){
        name = null;
    }

    //Parametrized Constructor
    Employee(String emp_name,int emp_id, double emp_pay_rate){
        name = emp_name;
        id =emp_id;
        pay_rate = emp_pay_rate;
    }

    // Constructor may also have given value for some parameters and some default parameters
    Employee(String nm, int emp_id){
        name = nm;
        id= emp_id;
        pay_rate=20;
    }

}
class Cow {
    private String type;
    private String sound;
    private int milkings;
    static int numberCows;


    public Cow(){ //Default constructor
        //if we don't write anything inside the variables will get default values like null and 0
        type ="";
        sound ="moo";
        numberCows++;

    }

    public Cow(String t, String s){
        type =t;
        sound =s;
        numberCows++;
    }
    public String getSound(){
        return sound;
    }
    public String getType(){
        return type;
    }
    public void milkCow(int times){
        milkings+=times;
    }
    public int getNumMilkings(){
        return milkings;
    }
    public String toString(){
        return "Type: "+ type +"\nSound: " + sound + "\nNumber of milkings: " + milkings;
    }
    public static int getNumCows(){
        return numberCows;
    }


}
public class Main {
    //defining a class Employee
    static class Employee{
        private String name;
        private int id;
        private double pay_rate;

        //Method
        //This is a non-static method
        void non_static(){
            System.out.println("Non static method");
        }
        static void m_static(){
            System.out.println("Static");
        }


        // Creating constructors

        //Default Constructor
        Employee(){
            name = null;
        }

        //Parametrized Constructor
        Employee(String emp_name,int emp_id, double emp_pay_rate){
            name = emp_name;
            id =emp_id;
            pay_rate = emp_pay_rate;
        }

        // Constructor may also have given value for some parameters and some default parameters
        Employee(String nm, int emp_id){
            name = nm;
            id= emp_id;
            pay_rate=20;
        }

    }

    public class Letter{
        void letter(){
            opening();
            closing();

        }
        void opening(){
            System.out.println("Greetings");
        }
        void closing(){
            System.out.println("Bye");
        }
    } // Not writing static here

    //A static method
    static double lunchCalc(double bill, int numOfFriends){
        double amt = bill/numOfFriends;
        return amt;
    }

    public static class Frog{
        void move_frwd(){
            System.out.println("Frog moved 3 steps forward");
        }
        void move_frwd(int s){
            System.out.println("Frog moved "+ s + " steps forward");
        }
        void move(int s, String lr){
            System.out.println("Frog moved " + s+ " steps to the " + lr);
        }
    }


    public static void main(String[] args) {
        //Employee
        Employee default_emp = new Employee();                                         // Calls constructor 1
        Employee emp1 = new Employee("Mark", 1234, 6.1);  // Calls constructor 2
        Employee emp2 = new Employee("Oliver", 1234);                       // Calls constructor 3
        System.out.println(emp1.name); // Would have raised an error if name was set a private
        emp1.non_static(); // Since it is a non-static we had to create instance of class (object) and then call it
        Employee.m_static(); //Since it is static it belongs to class and we call it with class name.


        //Letter
        //Since letter class is a non-static nested class we will first create an instance of the outer class
        Main main = new Main();
        Main.Letter l = main.new Letter();
        l.letter();
        System.out.println(emp1.name);

        //Static method
        //Since this is a static method we directly write lunchCalc(34, 3) or Main.lunchCalc(34, 3) i.e. the class name
        //If this was non-static we would have written main.lunchCalc(34, 3) where main is the object created above
        System.out.println("Amount to be paid is "+ lunchCalc(34,3));


        //Frog
        Frog frog = new Frog();
        frog.move_frwd();
        frog.move_frwd(4);
        frog.move(3, "right\n");

        //Cow
        Cow bessie = new Cow("abc","moo");
        System.out.println(bessie.getType() + " : " + bessie.getSound());
        Cow bella = new Cow("def", "moo");
        bessie.milkCow(2);
        bessie.milkCow(2);
        bella.milkCow(3);
        System.out.println("Bessie: "+bessie.getNumMilkings());
        System.out.println("Bella: "+bella.getNumMilkings());
        System.out.println(bessie);
        System.out.println("Total number of Cows: " + Cow.getNumCows());







    }
}