import java.util.Arrays;
public class Main {
  public static void main(String[] args){
  int[] arr ={11,21,33,40,50};
    int target=21;
    int n=arr.length;
    binarySearch(arr,0,n-1,target);
  }
  public static void binarySearch(int[] arr,int first, int last,int target){
    int mid=(first+last)/2;
    while(first<=last){
      if(arr[mid]<target){
        first=mid+1;
      }
      else if(arr[mid]==target){
        System.out.println("Element's index is: "+mid);
        break;
      }
      else{
        last=mid-1;
      }
      mid=(first+last)/2;
    }
    if (first>last){
      System.out.println("Element is not found.");
    }
  } 
}
