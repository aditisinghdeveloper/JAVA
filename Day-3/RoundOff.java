import java.io.*;
import java.util.*;

public class RoundOff {
    public static void main(String args[]) {
        int n = 4722;
        System.out.print(round(n));
    }

    static int round(int n) {
        int a = (n / 10) * 10;
        int b = a + 10;
        return (n - a > b - n) ? b : a;
    }
}
