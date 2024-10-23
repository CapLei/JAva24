public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
    public static int sumDigits(int n) {
        int sum = 0;
        while(n != 0){
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }
}
