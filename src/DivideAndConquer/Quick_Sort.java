package DivideAndConquer;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr={9,7,2,3,5,1,4};
        sort(arr,0,arr.length-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void sort(int[] arr,int start,int end){
        if(start>=end)
            return;
        int idx=partition(arr,start,end);
        sort(arr,start,idx-1);
        sort(arr,idx+1,end);
    }

    public static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int pi=start;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[end];
        arr[end]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
}
