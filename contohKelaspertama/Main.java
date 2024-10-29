package contohKelaspertama;

public class Main {
    public static void main(String[] args) {
        mobil  mobilHitam = new mobil("Hitam", "Toyota", 100);
        mobilHitam.tampilkanInfo();

        mobil mobilMerah = new mobil("Merah", "Honda", 200);
        mobilMerah.tampilkanInfo();
    }
}