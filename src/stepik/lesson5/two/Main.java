package stepik.lesson5.two;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int read = System.in.read();
        while (read > 0) {
            if (read == 13) {
                int buf = System.in.read();
                if (buf == 10) {
                    System.out.write(buf);
                    read = System.in.read();
                } else {
                    System.out.write(read);
                    read = buf;
                }
            } else {
                System.out.write(read);
                read = System.in.read();
            }
        }
        System.out.flush();
    }
}
