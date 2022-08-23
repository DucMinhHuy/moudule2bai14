public class BubbleSort {
    //cai dat thuat toan sap xep noi bot
    static int[]list={2,3,2,5,6,1,-3,13,16};
    public static void bubbleSort(int[]list){
//        boolean needNextPass=true;
        for(int k=1;k<list.length;k++){
//            needNextPass=false;
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
//                    needNextPass =true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]+"");
        }
    }
}
