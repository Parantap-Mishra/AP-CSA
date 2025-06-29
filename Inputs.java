import java.util.Scanner; //Scanner class used for inputs
public class Main {
    public static void main(String[] args) {
        //Printing
        System.out.print("Hello world "); //There is no Enter after this line
        System.out.println("Welcome to my first Java program"); //There is an enter after this line

        //Data types
        //Integral Values
        byte a = 1;
        short b = 25;
        int c = 450;
        long d = 5804L; //Writing L is compulsory

        //Decimal
        float e = 0.24f; //Writing f is compulsory
        double f = 3.567d; //May or may not write D/d

        char g = 'A'; //Single quotes
        String h = "Hello moto";

        //Inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str1 = sc.next(); //Inputs only the first word
        System.out.println(str1);
        System.out.print("Enter another sentence: ");
        String str2 = sc.nextLine(); //Inputs the whole sentence
        System.out.println(str2);
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); //To input
        System.out.print("Enter: ");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
    }
}