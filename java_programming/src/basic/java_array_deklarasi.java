package basic;

public class java_array_deklarasi {
    public static void main(String[] args) {
        System.out.println("Deklaasi Array");
        float [] arrayfloat = new float[6];

        arrayfloat[2] = 13;
        arrayfloat[4] = 15;
        arrayfloat[1] = 10;

        System.out.println(arrayfloat[0]);
        System.out.println(arrayfloat[1]);
        System.out.println(arrayfloat[2]);
        System.out.println(arrayfloat[3]);
        System.out.println(arrayfloat[4]);
        System.out.println(arrayfloat[5]);
    }
}
