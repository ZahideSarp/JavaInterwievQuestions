package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* noTeen (lambda)
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
 */
public class Question05 {
    public static void main(String[] args) {

int[] arr={12,13,19,20};

noTeen(arr);
    }

    private static void noTeen(int[] arr) {

        List<Integer> newList=new ArrayList<>();
      
        for (int i = 0; i < arr.length; i++) {
            if(!(arr[i]>=13 && arr[i]<=19))  newList.add(arr[i]);
        }  System.out.println(newList);
    }
}
