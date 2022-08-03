import java.util.*;

public class FindBigger {
    public static void main(String[] args) {
        int x = 65241; //65241

        System.out.println(findNum(x));
    }

    static int findNum(int x){
        List<Integer> copy, list = new ArrayList<>();
        int result = 0;

        while (x > 0) {
            list.add( x % 10 );
            x = x / 10;
        }

        Collections.reverse(list);

        for (int i = list.size() - 1; i > 0 ; i--) {
            copy = new ArrayList<>(list);
            Collections.swap(copy, i, i -1);

            int listNum = Integer.parseInt(list.stream().map(Object::toString).reduce("", String::concat));
            int copyNum = Integer.parseInt(copy.stream().map(Object::toString).reduce("", String::concat));

            if (copyNum > listNum)  result = copyNum;
        }
        return result;
    }
}
