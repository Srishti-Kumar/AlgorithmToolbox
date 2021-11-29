package myownjavaprac;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
    int changeNo = 0;
        //write your code here
        if (m >= 10) {
            changeNo += m / 10;
            m = m % 10;

        } if (m < 10 && m >= 5) {
            changeNo += m / 5;
            m = m % 5;

        } if (m < 5 && m > 0) {
            changeNo += m;
        }
        return changeNo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
