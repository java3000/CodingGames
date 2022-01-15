package sberfight;

/*
Доблестный или почти доблестный Робин Гуд и отправляетесь в новый поход в лес.
Дан массив passersby , в котором содержится количество золотых у каждого путника в лесу,
которого можно обокрасть. В результате кражи все деньги путника переходят к Робину.

Но, каждый раз после того как совершена кража,
Робин обязан отдать часть денег другому путнику, иначе его будут считать просто вором.
Для очищения совести достаточно умножить сумму золотых прохожего вдвое, то есть,
выгоднее всего отдавать деньги бедным.

Робин Гуд волен сам выбирать у какого путника будет красть золотые,
он также вправе не трогать проходящего человека.
Главная задача Робина Гуда - оставить максимальное количество золотых себе, найдите это количество.

Ввод:

passersby - массив прохожих, где passerby[i] - количество золотых прохожего i
Вывод:

Integer - количество золотых, которые остались у Робин Гуда
Пример:

passersby = [3, 10, 4, 8]
getResult(passersby) = 11

Робин Гуд обокрал путников с 10 и 8 золотыми и одарил остальных двух на 3 и 4 золотых соответственно.
То есть 10+8-3-4
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 10, 4, 8};
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(3);
        li.add(10);
        li.add(4);
        li.add(8);
        System.out.println(getResult(li));

    }

    static int getResult(List<Integer> li){
        Integer[] arr = li.toArray(new Integer[0]);
        Arrays.sort(arr);
        int gold = 0;

        if(arr.length > 1){
            for (int i = arr.length - 1, j = 0; i >= arr.length / 2 ; i--, j++){
                gold += arr[i];
                gold -= arr[j];
            }
        }
        return gold;
    }
}
