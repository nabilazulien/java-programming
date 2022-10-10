package basic;

public class OOP_KE {
    public static void main(String[] args) {
        Orang nabila = new Orang();

        //print sebelum di assign
        System.out.println(nabila.nama);

        //assign
        nabila.nama = "Nabila Basya Zuien";

        //print sesudah di assign
        System.out.println(nabila.nama);

        nabila.nama = "Nabila Basya Zulien";
        nabila.ttl = "Kebumen, 23 Mei 2003";
        nabila.umur = "19";
        nabila.gender = "Perempuan";

    }



    class Orang {
        String nama;
        String ttl;
        String umur;
        String gender;
    }
}
