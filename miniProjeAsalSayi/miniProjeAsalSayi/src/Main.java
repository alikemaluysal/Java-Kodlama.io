public class Main {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(isPrime(number));
    }
    static boolean isPrime(int number){
        if (number<2)
            return false;

        for (int i = 2; i<=Math.sqrt(number); i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }
}