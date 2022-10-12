import java.util.Arrays;

public class Main{
         static int partition(int[] arr, int low, int high){
         int pivot = arr[high];
         int i=(low-1);
         for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                 i++;
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
           
            return(i+1);
         }
  static void quickSort(int arr[],int low,int high){
    if(low<high){
      int pi =partition(arr,low,high);
      quickSort(arr,low,pi-1);
      quickSort(arr,pi+1,high);
    }
  }
      static int deDuplication(int []arr, int n){
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
  public static void main(String args[]){
    int arr[]={50,11,33,21,40,50,40,40,21};
    int n = arr.length;
    quickSort(arr,0, n-1);
    n=deDuplication(arr,n-1);
    for(int i=0;i<n;i++)
    System.out.print(arr[i]+" ");
   } 
}
