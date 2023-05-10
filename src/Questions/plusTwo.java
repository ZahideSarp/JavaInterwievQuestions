package Questions;

public class plusTwo {
    /* plusTwo
    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        plusTwo(arr1, arr2);
    }

    /*private static void plusTwo(int[] arr1, int[] arr2) {

    int count=arr1.length + arr2.length;
    int[] newarr=new int[count];

        for (int i = 0; i < arr1.length; i++) {
            newarr[i]=arr1[i];
        }
        int idx=0;
        for (int i = arr1.length; i <newarr.length; i++) {
            newarr[i]=arr2[idx];
            idx++;
        }
        System.out.println(Arrays.toString(newarr));
    }*/
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < result.length; i++) {
            if (i < a.length) result[i] = a[i];
            else result[i] = b[i - a.length];
        }
        return result;
    }
}
