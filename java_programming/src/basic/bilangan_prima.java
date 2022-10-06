package basic;

public class bilangan_prima {
    public static void main(String[] args) {
        int bilangan = 13, check=0;

        for (int i=1; i<=bilangan; i++){

            if (bilangan%i==0){
                check++;
            }
        }
        System.out.println("nilai "+check);
        if (check == 2){
            System.out.println("Bilangan "+bilangan+" adalah prima");
        }else {
            System.out.println("Bilangan "+bilangan+" adalah bukan prima");
        }

    }
}
