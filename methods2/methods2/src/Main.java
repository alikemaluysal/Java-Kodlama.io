public class Main {
    public static void main(String[] args) {

        System.out.println(add(12,3));
        System.out.println(add2(5,10,15,20));
    }
    public static void add(){
        System.out.println("Eklendi");
    }
    public static void update(){
        System.out.println("Eklendi");
    }
    public static void delete(){
        System.out.println("Eklendi");
    }
    public static int add(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
    //variable arguments
    public static int add2(int ... numbers){
        int result = 0;
        for (int number:numbers) {
            result += number;
        }
        return result;
    }
}