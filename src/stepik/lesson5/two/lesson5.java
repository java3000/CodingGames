package stepik.lesson5.two;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class lesson5 {
    public static void main(String[] args) throws IOException {

        byte[] test = new byte[]{0x33, 0x45, 0x01};
        InputStream stream = new ByteArrayInputStream(test);
        System.out.println(checkSumOfStream(stream));
    }

    /*
    Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.
    Контрольная сумма данных вычисляется по следующему алгоритму:
    Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
    Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле:
    C_{n+1}=\mathrm{rotateLeft}(C_n)\ \mathrm{xor}\ b_{n+1}C
    Поскольку метод не открывал данный InputStream, то и закрывать его он не должен.
    Выброшенное из методов InputStream исключение должно выбрасываться из метода.
    Пример
    На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01.
    В качестве контрольной суммы должно быть возвращено число 71.
     */
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int b;
        while ((b = inputStream.read()) > 0) {
            result = (Integer.rotateLeft(result, 1) ^ ((byte) b & 0xFF));
        }
        return result;
    }
}
