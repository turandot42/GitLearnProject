public class ReversedNumber {
    public static void main(String[] args) {
        int n = 672;
        int reversed =0;
        int digit = 0;

        while(n!=0){
            digit = n % 10;
            reversed = (reversed * 10) + digit;
            n = n / 10;
        }

        System.out.println(reversed);

    }
}