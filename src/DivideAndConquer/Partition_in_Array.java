package DivideAndConquer;

public class Partition_in_Array {
    public static void main(String[] args) {
        int[] arr={9,7,2,3,5,1,4};
       partition(arr,0,arr.length-1);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }

    }

    public static int partition(int[] arr,int si,int ei){
        int item=arr[ei];
        int pi=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<item){
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }

        int temp=arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
}
