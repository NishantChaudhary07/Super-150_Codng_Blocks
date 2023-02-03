package DivideAndConquer;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,5,8,-11};
        int[] ans=merge_sort(arr,0,arr.length-1);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
    public static int[] merge_sort(int[] arr,int lo,int hi){
        if(lo==hi){
            int[] a=new int[1];
            a[0]=arr[lo];
            return a;
        }

        int mid=(lo+hi)/2;
        int[] arr1=merge_sort(arr,lo,mid);
        int[] arr2=merge_sort(arr,mid+1,hi);
        return merge_Two_Sorted_Array(arr1,arr2);
    }

    public static int[] merge_Two_Sorted_Array(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int n=arr1.length;
        int m=arr2.length;
        int[] arr=new int[m+n];
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
}
