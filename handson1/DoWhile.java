package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        do {
            System.out.println("Elemen ke " + (counter + 1) + " adalah : " + kumpulanBuah[counter]);
            counter++;
        } while (counter < kumpulanBuah.length);
    }
}