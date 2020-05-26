package comparator;

import java.util.Arrays;

public class comparaTest {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","December"};
        Arrays.sort(months, (a, b) -> b.length() - a.length());
        System.out.println("按照字符串递减顺序排列");
        for (String month : months) {
            System.out.print(month + " ");
        }
        System.out.println(" ");

        System.out.println("按照字符串递增顺序排列");
        Arrays.sort(months, (a, b) -> Integer.signum(a.length() - b.length()));
        for (String month : months) {
            System.out.print(month + " ");
        }
        System.out.println(" ");
    }
}
