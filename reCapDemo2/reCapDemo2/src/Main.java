public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 3.7, 14.3, 12.5};
        double sum = 0;
        double max = myList[0];
        for (double number: myList) {
            if (number > max)
                max = number;
            sum += number;
        }
        System.out.println("Toplam: " + sum);
        System.out.println("En büyük: " + max);
    }
}