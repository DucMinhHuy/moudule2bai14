public class SelectionSort {
    //cai dat thuat toan sap xep chon
    static double[]list={1,6,2,4,5,-4.5};
    public static void selectionSort(double[]list){
        for(int i=0;i<list.length-1;i++){
            double currenMin=list[i];
            int currenMinIndex=i;
            for(int j=i+1;j<list.length;j++){
                if(currenMin>list[j]){
                    currenMin=list[j];
                    currenMinIndex=j;
                }
            }
            if(currenMinIndex!=i){
                list[currenMinIndex]=list[i];
                list[i]=currenMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for(int i=0;i<list.length;i++)
            System.out.println(list[i]+"");
    }
}
