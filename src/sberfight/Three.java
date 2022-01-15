package sberfight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Three {

    public static void main(String[] args) {
        int s = 8;
        ArrayList<Integer> cash = new ArrayList<Integer>();
        cash.add(1);
        cash.add(1);
        cash.add(1);
        cash.add(1);
        System.out.println(getResult(cash, s));
    }

    public static int getResult(List<Integer> cash, int s) {
        int result = 0, bias = 3, amount = s;

        if (!cash.isEmpty()) {
            while (amount >= bias) {
                Collections.sort(cash);
                //if (cash.get(0) < cash.get(cash.size() - 1)) {
                    cash.set(0, cash.get(0) + bias);
                    amount -= bias;
                //}
            }

            if (amount > 0){
                Collections.sort(cash);
                cash.set(0, cash.get(0) + amount);
            }

            Collections.sort(cash);

            for (int x : cash) {
                if (x < cash.get(cash.size() - 1))
                    result++;
            }
        }

        return result;
    }
}
