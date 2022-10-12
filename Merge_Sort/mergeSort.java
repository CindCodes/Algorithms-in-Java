import java.util.Arrays;

public class Main {
    static void mergeSort(int arr[]){
      int len = arr.length;
      if(len<2){
        return;
      }
      int mid=len/2;
      int[] left=new int[mid];
      int[] right=new int[len-mid];
      for(int i=0;i<mid;i++){
        left[i]=arr[i];
      }
      for(int i=mid;i<len;i++){
        right[i-mid]=arr[i];
      }
      mergeSort(left);
      mergeSort(right);
      merge(arr,left,right);
    }
    static void merge(int[] arr,int[] left,int[] right){
      int leftLen=left.length;
      int rightLen=right.length;
      int i=0;
      int j=0;
      int k=0;
      while(i<leftLen&&j<rightLen){
        if(left[i]<=right[j]){
          arr[k]=left[i];
          i++;
        }
        else{
          arr[k]=right[j];
          j++;
        }
        k++;
      }
      while(i<leftLen){
        arr[k]=left[i];
        i++;
        k++;
      }
      while(j<rightLen){
        arr[k]=right[j];
        j++;
        k++;
      }
    }
    static int deDuplication(int[]arr,int n){
      if(n==0||n==1){
        return n;
      }
      int j=0;
      for(int i=0;i<n-1;i++){
        if(arr[i]!=arr[i+1]){
          arr[j++]=arr[i];
        }
      }
      arr[j++]=arr[n-1];
      return j;
    }
    public static void main(String[] args){
      int[] arr={50,11,33,21,40,50,40,40,21};
      int n=arr.length;
      mergeSort(arr);
      n=deDuplication(arr,n-1);
      for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
