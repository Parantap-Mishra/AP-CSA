import java.util.ArrayList;
import java.util.Scanner;

class Array{
    public static int min(int [] l){
        int min = l[0];
        for(int x:l){
            if (x<min){
               min =x;
            }
        }
        return min;
    }
    public static double avg(int [] l){
        double sum = 0;
        for(double x:l){
            sum+=x;
        }
        return sum/l.length;
    }
    public static void shift(int [] l, int s){
        //My way
        int [] result = new int[l.length];
        int count =0;
        for(int i =0; i<l.length; i++){
            if (i+s>l.length-1){
                result[count]=l[i];
                count++;
            }
            else{
                result[i+s] = l[i];
            }
        }
        for(int x:result){
            System.out.print(x);
        }

        //Ap CSA method
        //Right Shift
        int [] result = new int[l.length];
        for (int i = 0; i < l.length; i++) {
            result[Math.abs(s+i)%l.length] = l[i];
        }
        for(int x:result){
            System.out.print(x);
        }
        //Left Shift
        for (int count = 0; count < s; count++){
            int temp = l[0];
            for (int index = 0; index < l.length - 1; index++){
                l[index] = l[index + 1];
            }
            l[l.length - 1] = temp;
        }
        for(int x : l){
            System.out.print(x + " ");
        }
    }
    public static void Method1(ArrayList<Boolean> arr){
        String str1="hello";
        arr.set(0,str1);
    }
    public static ArrayList<String> Method2(){
        ArrayList <String> arr=new ArrayList<String>();
        String str1="Hello";
        arr.add(str1);
        return arr;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Sum of digits//
        //My way
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String s_num = num + " ";
        int count = 0;
        int sum =0;
        while (count<(s_num.length()-1)){
            int digit = num%10;
            sum+=digit;
            num = num/10;
            count++;
        }
        System.out.println(sum);
        //AP CSA way (better)
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum =0;
        while (num>0){
            int digi = num%10;
            sum+=digi;
            num= num /10;
        }
        System.out.println(sum);

        //Total amt after t number of years
        double r = 10.0/100;
        double total = 200;
        for (int t=1; t<=50; t++){ //note we take t=1 here otherwise code will run 51 times and first output would say 0 year but 220 dollars
            total += (total*r);
            System.out.println("Year " + t + " |Amt " + total);
        }

        //Verify a string contains a substring
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        System.out.print("Enter your substring: ");
        String sub_str = sc.nextLine();
        int len_sub = sub_str.length();
        for (int i=0; i<=str.length()-len_sub; i++){
            String sstr = str.substring(i, i+len_sub);
            System.out.println(sstr);
            if (sub_str.equals(sstr)){
                System.out.println("The substring is present at index " + i);
            }

        //Count vowels in string
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i =0; i<str.length(); i++){
            if (str.substring(i, i+1).equals("a")|| str.substring(i, i+1).equals("e") || str.substring(i, i+1).equals("i")
                    || str.substring(i, i+1).equals("o") || str.substring(i, i+1).equals("u")){
                count++;
            }
        }
        System.out.println(count);

        //Reverse characters of string
        //My Method
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        String reverse=""; // we need to = to "" otherwise it will get value null, and we can't concatenate with null.
        for (int i = str.length(); i>0; i--){
            reverse +=str.substring(i-1,i);
        }
        System.out.println(reverse);
        //AP CSA method (simpler)
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        String reversed= ""; // we need to = to "" otherwise it will get value null, and we can't concatenate with null.
        for (int i=0; i<str.length(); i++){
            reversed=str.substring(i,i+1)+reversed;
        }
        System.out.println(reversed);

        //Arrays
        int [] list = {2,1,4,5,0};
        System.out.print("Enter: ");
        int shift=sc.nextInt();
        Array.shift(list,shift);
    }
}