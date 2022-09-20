public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(496));
    }

    static boolean isPerfectNumber(int number){
        if (number<0)
            return false;
        int sumOfDivisors = 0;
        for (int i = 1 ; i<number; i++){
            if (number%i == 0)
                sumOfDivisors += i;
        }
        if (number == sumOfDivisors)
            return true;

        return false;
    }
}

