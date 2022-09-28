import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] arguments) {
    CustomerManager customerManager = new CustomerManager();
    CustomerManager customerManager2 = new CustomerManager();
    customerManager = customerManager2;
    customerManager.Add();
    customerManager.Update();
    customerManager.Remove();

    //value types
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

    //reference types
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10,20,30};
        sayilar2 = sayilar1;
        sayilar1[0]=50;
        System.out.println(sayilar2[0]);

    }


}


