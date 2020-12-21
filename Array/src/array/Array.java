
package array;

public class Array {
    public static void main(String[] args) {
        
    }
    public static boolean isNumberInArray(int num, int []arr) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }
    public static int [] unionArrays(int []arr1, int []arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i=0; i < arr1.length; i++) {
            if (! isNumberInArray(arr1[i], arr3)) {
                arr3[k] = arr1[i];
                k++;
            }
               
        }
        return arr3;
    }
}
