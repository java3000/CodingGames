package sberfight;

import java.util.*;

/*Дан массив состоящий из латинских символов.
Каждый символ в массиве можно заменить на любое целочисленное число.
После замены все идентичные символы будут также заменены на такое же число.

Определите, возможно ли сделать сумму значений массива равной k.

Ввод:
sub_array - массив латинских символов
k - значение суммы массива, которую нужно получить

Вывод:
Boolean - можно или нельзя сделать сумму значений массива sub_array равной k

Пример:
sub_array = ["x", "x", "x", "y", "y"]
k = 12
getResult(sub_array, k) = True // Можно заменить x на 2, y на 3, тогда получится [2, 2, 2, 3, 3]*/


public class Five {
    public static void main(String[] args) {

        System.out.println(getResult());
    }

    public static boolean getResult() {
        return new Random().nextBoolean();
    }
}
