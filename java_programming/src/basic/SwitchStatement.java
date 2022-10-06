package basic;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        int days = 4;
        String nameDay = null;

        switch (days){
            case 1 :
                nameDay = "Senin";
                break;
            case 2 :
                nameDay = "Selasa";
                break;
            case 3 :
                nameDay = "Rabu";
                break;
            case 4 :
                nameDay = "Kamis";
                break;
            case 5:
                nameDay = "Jum'at";
                break;
            case 6:
                nameDay = "Sabtu";
                break;
            case 7 :
                nameDay = "Minggu";
                break;

        }
        System.out.println(nameDay);
    }
}
