package DivideAndConquer;

public class Practice {
    public static void partition(int[] arr,int start,int end){
        int item=arr[end];
        int pi=start;
        for(int i=start;i<end;i++){
            if(arr[i]<item){
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[end];
        arr[end]=arr[pi];
        arr[pi]=temp;
    }
    public static void main(String[] args) {
        int[] arr={9,7,2,3,5,1,4};
        partition(arr,0,arr.length-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
