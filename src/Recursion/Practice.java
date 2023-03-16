///******************************************************************************
//
// Online Java Compiler.
// Code, Compile, Run and Debug java program online.
// Write your code in this editor and press "Run" button to execute it.
//
// *******************************************************************************/
//
//class Practice {
//    private int[] merge(int[] A1,int[] A2){
//        int l1=A1.length;
//        int l2=A2.length;
//        int[] res=new int[l1+l2];
//        int i=0,j=0,k=0;
//        while(i<l1 && j<l2){
//            if(A1[i]<A2[j]){
//                res[k]=A1[i];
//                i++;
//            }
//            else{
//                res[k]=A2[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<l1){
//            res[k]=A1[i];
//            i++;
//            k++;
//        }
//        while(j<l2){
//            res[k]=A2[j];
//            j++;
//            k++;
//        }
//        return res;
//    }
//
//    private int[] mergeSort(int[] nums,int start,int end){
//        if(start==end){
//            int[] A=new int[1];
//            A[0]=nums[start];
//            return A;
//        }
//        int mid=(start+end)/2;
//        int[] left=mergeSort(nums,start,mid);
//        int[] right=mergeSort(nums,mid+1,end);
//        return merge(left,right);
//    }
//    public static void main(String[] args){
//        Practice obj=new Practice();
//        int[] nums={5,1,1,2,0,0};
//        int[] ans=obj.mergeSort(nums,0,nums.length-1);
////        for(int ele:ans){
////            System.out.print(ele+" ");
////        }
//        System.out.println(Math.ceil(6/3));
//    }
//}
