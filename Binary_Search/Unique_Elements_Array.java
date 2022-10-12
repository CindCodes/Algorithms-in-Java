import java.util.Arrays;
public class Main{
  public static int[] invertIndex(int[] a1, int[] a2){
      int x = a1.length;
      int y = a2.length;
      int n = x>y ? y:x;
      int[] ans = new int[n];
      int k = 0;
        for(int i=0;i<x;i++){
          for(int j = 0;j<y;j++){
            if (a1[i] == a2[j]){
              if(k>0){
                if (ans[k-1] != a1[i]){
                  ans[k++] = a1[i];
                }
              }
              else{
                ans[k++] = a1[i];
                break;
              }
            }
          }
        }
    return ans;
  }
 public static boolean binarySearch(int[] a2,int x){
     int n = a2.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a2[mid] == x) {
                return true;
            }
            else if (a2[mid] < x) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return false;
    }
  public static void main(String[] args){
    int[] arr1 = {1,5,6,6,9,9,9,11,11,21};
    int[] arr2 = {6,6,9,11,21,21,21};
    int[] ans = invertIndex(arr1,arr2);
      for(int i=0;i<ans.length&&ans[i]!=0;i++){
        System.out.print(ans[i]+" ");
      }
  }
}
