package sberfight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class One {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(2);
        li.add(1);
        li.add(1);
        //li.add(4);
        //li.add(5);
        //li.add(6);

        System.out.println(isPalindrome2(li));
    }

    static boolean isPalindrome(List<Integer> numb) {
        boolean result = false;
        Integer[] arr = numb.toArray(new Integer[0]);

        if (!numb.isEmpty()) {
            if (numb.size() % 2 == 0) {
                Integer[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
                Integer[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

                result = Arrays.stream(left).reduce(Integer::sum).get() == Arrays.stream(right).reduce(Integer::sum).get();

                System.out.println(Arrays.toString(left));
                System.out.println(Arrays.toString(right));
            } else {
                Integer[] left = Arrays.copyOfRange(arr, 0, (arr.length / 2) + 1);
                Integer[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

                result = Arrays.stream(left).reduce(Integer::sum).get() == Arrays.stream(right).reduce(Integer::sum).get();

                System.out.println(Arrays.toString(left));
                System.out.println(Arrays.toString(right));
            }
        }
        return result;
    }

    static boolean isPalindrome2(List<Integer> numb) {
        boolean result = false;
        int count = numb.size();

        do {
            Integer[] arr = numb.toArray(new Integer[0]);
            int leftEndIndex = (numb.size() % 2 == 0) ? (arr.length / 2) : (arr.length / 2) + 1;
            if (!numb.isEmpty()) {
                List<Integer> left = numb.subList(0, leftEndIndex);
                List<Integer> right = numb.subList(arr.length / 2, arr.length);

                result = left.stream().reduce(Integer::sum).get() == right.stream().reduce(Integer::sum).get();
                if (result) return true;
                count--;
                Collections.rotate(numb, 1);
            }
        } while (count != 0);
        return result;
    }
}
