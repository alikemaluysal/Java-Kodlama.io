public class Main {
    public static void main(String[] args) {
        int sayi1 = 35;
        int sayi2 = 25;
        int sayi3 = 40;

        int enBuyuk = sayi1;
        if (sayi2 > sayi1) {
            enBuyuk = sayi2;
        }
        if (sayi3 > sayi2) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
    }
}