package basic;

import java.util.Locale;

public class strings_KE {
    public static void main(String[] args) {
        String literal = "Ini value untuk string literal";
        String stringObject = new String("Ini value untuk string object");


        Integer integerLiteral = 1;
        Integer integerObject = new Integer(23);

        //ngitung karakter, untuk set max input
        String input = "Ini input";
        System.out.println(input.length());

        //kapital and non kapital
        System.out.println(input.toUpperCase(Locale.ENGLISH)); //kapital
        System.out.println(input.toLowerCase(Locale.ENGLISH)); //non kapital

        //bisa select beberapa karakter
        System.out.println(input.substring(4,6));

        //kapital only awal huruf di setiap
        input = "NAMA saya NABILA basya ZULIEN";
        String[] inputs = input.split(" ");
        for (String kata : inputs) {
            System.out.println(kata);
        }
    }
}
