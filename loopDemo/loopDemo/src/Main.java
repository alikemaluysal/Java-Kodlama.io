public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i+=3) {
            System.out.println(i);
        }
        System.out.println("End of for loop");

        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("End of while loop");

        int j = 1;
        do{
            System.out.println(j);
            j ++;
        }while (j );
        System.out.println("End of do-while loop");

    }
}