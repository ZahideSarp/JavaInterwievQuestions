package Questions;

import java.util.Arrays;

public class Question03 {
/* maxEnd3
Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public static void main(String[] args) {


    int[] arr = {12,11,3,11};

    System.out.println(Arrays.toString(maxEnd(arr)));

}

  /*  private static int[] maxEnd(int[] arr) {

    int[] newArr=new int[arr.length];
    int max=0;

    if(arr[0]> arr[arr.length-1]){
        max=arr[0];
    }else{
        max=arr[arr.length-1];

    }
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=max;

        }
        return newArr;

    }*/
  /*private static void maxEnd3(int[] arr) {

      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {

          max = Math.max(max,arr[i]);

      }

      for (int i=0; i<arr.length; i++) {

          arr[i] = max;

      }
      System.out.println(Arrays.toString(arr));


  }*/
  private static int[] maxEnd(int[] arr) {
      int a = Math.max(arr[0], arr[arr.length - 1]);
      Arrays.fill(arr, a);
      return arr;
  }

}
