import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Percentage calculator");
        System.out.print("Enter maximum marks: ");
        float max_marks = sc.nextFloat();
        System.out.println("Enter marks in Subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks in Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks in Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter marks in Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter marks in Subject 5: ");
        float sub5 = sc.nextFloat();
        float total_marks = sub1 +sub2 +sub3+sub4+sub5;
        double percentage = (total_marks/(max_marks*5))*100;
        System.out.println(percentage + "%");
    }
}