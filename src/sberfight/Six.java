package sberfight;


import java.util.Arrays;

/*
Дана строка s. Вы можете удалить из нее не более k символов.

Выведите максимально возможное количество совпадений символов с stringGoal,
то есть совпадением считается s[i] = stringGoal[i].

Например, строка "agddb" совпадает с "gdda" только одним символом.
Если убрать первый символ, тогда будет уже 3 совпадения - "gddb" "gdda".

Ввод:

s - строка с символами
k - максимальное количество удалений
stringGoal - строка для сравнения
Вывод:

Integer - максимальное количество совпадений s[i] = stringGoal[i]

Пример
s = "agdd"
k = 1
stringGoal = "gdd"
getResult(s, k, stringGoal) = 3
 */
public class Six {
    public static void main(String[] args) {

        String s = "gadd";
        int k = 1;
        String stringGoal = "gdd";

        System.out.println(getResult(s, k, stringGoal));
    }

    public static int getResult(String s, int k, String stringGoal) {
        //if ((s.length() - k) <= stringGoal.length() ){
        //    return stringGoal.length();
        //}else {
            int[] result = new int[10];
            for (int i = 0; i <= s.length() ; i++) {
                String x = s.substring(i);
                int count = 0;
                for (int j = 0; j < Math.min(x.length(), stringGoal.length()) ; j++) {
                    if (x.charAt(j) == stringGoal.charAt(j)) count++;
                    System.out.println(count);
                }
                result[i] = count;
            }
            return Arrays.stream(result).max().getAsInt();
        //}
    }

    public static int getResult2(String s, int k, String stringGoal) {
        int[] result = new int[10];
        for (int i = 0; i <= s.length() ; i++) {
            String x = s.substring(i);
            int count = 0;
            for (int j = 0; j < Math.min(x.length(), stringGoal.length()) ; j++) {
                if (x.charAt(j) == stringGoal.charAt(j)) count++;
            }
            result[i] = count;
        }
        return Arrays.stream(result).max().getAsInt();
        //}
    }
}
