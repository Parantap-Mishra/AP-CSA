public class Main{
    //Selection Sort
    public static void selectionSort(int [] l){
        for (int outer = 0; outer < l.length; outer++) {
            int minIndex = outer;
            for (int inner = outer+1; inner < l.length; inner++) {
                if(l[inner]<l[minIndex]){
                    minIndex = inner; //Finding index of smallest element
                }
            }
            //Swapping
            int temp = l[outer];
            l[outer] = l[minIndex];
            l[minIndex] = temp;
        }
    }

    //Insertion Sort
    public static void insertionSort(ArrayList<Integer> al){
        for (int outer = 1; outer < al.size(); outer++) {
            int key = al.get(outer);
            int inner = outer-1;
            while (inner>=0 && al.get(inner)>key){
                al.set(inner+1,al.get(inner)); //shifting bigger elements to right
                inner--;
            }
            al.set(inner+1,key);
        }
    }

    //Binary Search
    //iterative method
    public static int binarySearch(int[] a, int target){
        int highPos = a.length-1;
        int lowPos = 0;
        int midPos=0;
        while(lowPos<=highPos){
            midPos=(lowPos+highPos)/2;
            if (a[midPos]==target){
                return midPos;
            }
            else if(a[midPos]>target){
                highPos=midPos-1;
            }
            else{
                lowPos=midPos+1;
            }
        }
        return -1;
    }
    //Recursive method
    public static int binarySearch(int[] a, int target, int highPos, int lowPos){
        int midPos;
        if (lowPos>highPos){
            return -1;
        }
        else{
            midPos= (highPos+lowPos)/2;
            if (a[midPos] > target){
                highPos=midPos-1;
                return binarySearch(a,target,highPos,lowPos);
            }
            else if (a[midPos]<target) {
                lowPos=midPos+1;
                return binarySearch(a, target,highPos,lowPos);
            }
            return midPos;
        }

    }

    public static void main(String[] args){
        int [] a1 = {4,5,3,2,6,1};
        ArrayList<Integer> al1= new ArrayList<Integer>();
        al1.add(4);
        al1.add(5);
        al1.add(3);
        al1.add(2);
        al1.add(6);
        al1.add(1);
        insertionSort(al1);
        for (int x:al1){
            System.out.print(x);
        }

        int [] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(a,6, a.length, 0));
    }
}