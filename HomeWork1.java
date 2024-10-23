public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }

    public static int factorial(int f) {
        if (f <= 1){
            return 1;
        }
        else{
            return f * factorial(f-1);
        }
    }
}
