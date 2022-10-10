package basic;

//calculator
public class methods_KE {
    public static void main(String[] args) {
        int panjang = 5;
        int lebar = 10;
        Integer luasP = luasPersegi(panjang, lebar);
        System.out.println(luasP);


    }


    public static Integer luasPersegi(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;


    }

    public static Integer kelilingPersegi() {
        int pangjang = 5;
        int lebar = 10;
        int keliling = (pangjang + lebar) * 2;
        return keliling;
    }
}
