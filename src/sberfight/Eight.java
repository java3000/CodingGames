package sberfight;

import java.util.List;

public class Eight {

    /*
    Илон Маск презентовал свой новый космический проект - он запустил в небо большое количество ракет.
    Дан массив rocket_pos, где rocket_pos[i] - высота, на которой находится i-я ракета и rocket_speed, где rocket_speed[i] - скорость i-й ракеты.

Если ракеты достигают одинаковой высоты, то они складываются в одну ракету, их скорость тоже складывается.

Определите, сколько ракет в итоге сложатся.

Ввод:

rocket_pos - начальные позиции каждой из ракет (Integer[]), 0<length(rocket_pos)<=10, 0<=rocket_pos[i]<=1000
rocket_speed - скорость каждой из ракет (Integer[]), 0<length(rocket_speed)<=10, 0<=rocket_speed[i]<=15
Вывод:

Integer - количество ракет по итогу всех "соединений"
Пример 1:

rocket_pos = [3, 11]
rocket_speed = [5, 1]
getResult(rocket_pos, rocket_speed) = 1 // Уже через 2 "шага" обе ракеты будут на высоте 13 и соединятся
Пример 2:

rocket_pos = [2, 3]
rocket_speed = [1, 2]
getResult(rocket_pos, rocket_speed) = 2 // Ракеты никогда не соединятся


Тест-кейс #1Провален 0.122 сек.
Аргументы
// 1: rocketPos: Integer[]
[3, 11]
// 2: rocketSpeed: Integer[]
[5, 1]
Ожидаемое значение 1
Фактическое значение 0
Тест-кейс #2Провален 0.156 сек.
Аргументы
// 1: rocketPos: Integer[]
[2, 3]
// 2: rocketSpeed: Integer[]
[1, 2]
Ожидаемое значение 2
Фактическое значение 0
Тест-кейс #3Провален 0.183 сек.
Аргументы
// 1: rocketPos: Integer[]
[4, 10]
// 2: rocketSpeed: Integer[]
[4, 3]
Ожидаемое значение 1

     */
    public static void main(String[] args) {

    }

    public static int getResult(List<Integer> rocketPos, List<Integer> rocketSpeed) {
        return 0;
    }
}
