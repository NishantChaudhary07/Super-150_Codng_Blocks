package Sorting;

public class Insertion_Sort {
    public void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int item=arr[i];
            while(j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
    }

    public static void main(String[] args) {
        int[] arr={4,5,3,6,1,2};
        Insertion_Sort obj=new Insertion_Sort();
        obj.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
