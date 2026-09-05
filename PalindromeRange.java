public class PalindromeRange {
    public static void main(String[] args) {

        for (int num = 1; num <= 200; num++) {

            int temp = num;
            int reverse = 0;

            while (temp != 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }

            if (reverse == num)
                System.out.print(num + " ");
        }
    }
}