class ArrayManipulator{
    private int [] array;
    ArrayManipulator(int numOfElements){
        array = new int[numOfElements];
    }
    public void setArray(int element,int index){
        array[index] = element;
    }

    public int getMiddleIndex(){
        int middleIndex;
        if (array.length%2==0){
            middleIndex = array.length/2-1;
        }
        else{
            middleIndex = array.length/2;
        }
        return middleIndex;
    }

    public double getAvg(){
        double sum = array[0]+array[array.length-1]+array[this.getMiddleIndex()];
        return sum/array.length;
    }

    public void displayArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
class PalindromicNumber{
    private int [] pallindromes;
    public static String decimalToBinary(int d){
        String str_binary ="";
        while (d>0){
            str_binary=d%2+str_binary;
            d=d/2;
        }

        return str_binary;
    }
    public static boolean PallindromeChecker(String s){
        boolean bool=true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                bool = false;
            }
        }
        return bool;
    }
    public static boolean isPallindrome(int num){
        if (PallindromeChecker(String.valueOf(num)) && PallindromeChecker(decimalToBinary(num))){
            return true;
        }
        return false;
    }
    PalindromicNumber(int numOfPalindromes, int start){
        pallindromes= new int[numOfPalindromes];
        int count = 0;
        for (int i = start; count <5 ; i++) {
            if (isPallindrome(i)){
                pallindromes[count]=i;
                count+=1;
            }
        }

    }
    public int getValue(int x){
        return pallindromes[x];
    }
    public int sum(){
        int sum=0;
        for (int i = 0; i < pallindromes.length; i++) {
            sum+=pallindromes[i];
        }
        return sum;
    }
}
public class Main{
    public static void main(String[] args){
        ArrayManipulator list1 = new ArrayManipulator(4);
        ArrayManipulator list2 = new ArrayManipulator(5);
        list1.setArray(2,1);
        System.out.println(list1.getMiddleIndex() + " "+ list1.getAvg());
        System.out.println();
        list2.setArray(4,2);
        System.out.println(list2.getMiddleIndex() + " "+ list2.getAvg());


        
        PalindromicNumber list1 = new PalindromicNumber(5,7);
        System.out.println(list1.getValue(0));
        System.out.println(list1.getValue(1));
        System.out.println(list1.getValue(2));
        System.out.println(list1.getValue(3));
        System.out.println(list1.getValue(4));
        System.out.println(list1.sum());
    }
}