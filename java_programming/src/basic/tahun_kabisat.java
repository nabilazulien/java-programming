package basic;

import java.util.Scanner;

public class tahun_kabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);

        System.out.println("Tahun");
        tahun = scan.nextInt();

        if (tahun % 400 == 0) {
            System.out.println(tahun + " Merupakan tahun kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun + " Bukan tahun kabisat");
        } else if (tahun % 4 ==0) {
            System.out.println(tahun + " Merupakan tahun kabisat");
        } else {
            System.out.println(tahun + " Bukan tahun kabisat");
        }
    }
}
