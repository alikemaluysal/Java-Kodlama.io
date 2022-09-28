public class Main {
    public static void main(String[] args) {
    int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,10};
    sayiBulmaca(1,sayilar);
    sayiBulmaca(5,sayilar);
    sayiBulmaca(11,sayilar);
    sayiBulmaca(15,sayilar);
    }

    public static void sayiBulmaca(int aranacak, int[] sayilar){
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }

        }

        if(varMi){
            System.out.println("Sayı mevcuttur : " + aranacak);
        }
        else{
            System.out.println("Sayı mevcut değildir : " + aranacak);
        }
    }
}