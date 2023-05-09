package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question01 {
/*
   Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

    Example
    For inputArray = [3, 6, -2, -5, 7, 3], the output should be
    solution(inputArray) = 21.
            7 and 3 produce the largest product.
*/


    public static void main(String[] args) {
        int max = 0;
        List<Integer> list = new ArrayList<>();
        int[] arr = {3, 6, -2, -5, 7, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            list.add(arr[i] * arr[i + 1]);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }

}


