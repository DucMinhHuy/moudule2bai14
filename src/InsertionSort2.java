import java.util.Scanner;

public class InsertionSort2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap do dai :");
        int size=sc.nextInt();
        System.out.println("nhap tung gia tri cua mang");
        int []arr=new int[size];
        System.out.println("enter\t"+arr.length+"values :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("mang arr");
        for(int k=0;k<arr.length;k++) {
            System.out.println(arr[k]);
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
//                    System.out.println("vi tri j:"+arr[j] +"vi tri j+1"+arr[j+1]);
                    j--;
                }
                arr[j + 1] = temp;
//            System.out.println("phan tu thu j+1:"+temp);

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
