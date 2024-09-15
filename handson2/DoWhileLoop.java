package handson2;

public class DoWhileLoop {
    public static void main(String[] args) {
        int angka = 1;
        do {
            if (angka % 2 == 0){
                System.out.println(angka);
            }
            angka++;
        } while (angka <= 20);
    }
}
