package baitap1;

public class InsertionSort {
    // thuat toan sap xep chen
    public static void main(String[] args) {
        int[] arr={2,4,6,2,4,6,7,23,5};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0&& temp<arr[j]){
                arr[j+1]=arr[j];
//                System.out.println("phan tu thu j:"+j);
                j--;
            }
            arr[j+1]=temp;
            System.out.println("phan tu thu j+1:"+temp);
        }
//        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
