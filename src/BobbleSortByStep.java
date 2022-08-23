import java.util.Scanner;
// minh hoa thuat toan sap xep noi bot
public class BobbleSortByStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter list size");
        int size=sc.nextInt();
        int []list=new int[size];
        System.out.println("enter"+list.length+"values :");
        for(int i=0;i<list.length;i++){
            list[i]=sc.nextInt();
        }
        System.out.println("your input list:");
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]+"\t");
        }
        System.out.println("\n begin sort");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int []list){
//        boolean needNextPass=true;
        for(int k=1;k<list.length;k++){
//            needNextPass=false;
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    System.out.println("swap"+list[i]+"with"+list[i+1]);
                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
//                    needNextPass=true;
                }
            }
//            if(needNextPass==false){
//                System.out.println("array may be");
//                break;
//            }
            System.out.println("list after the"+k+"sort:");
            for(int j=0;j<list.length;j++){
                System.out.println(list[j]+"\t");
            }
            System.out.println();
        }
    }
}
