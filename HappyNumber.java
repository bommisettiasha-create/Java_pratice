public class HappyNumber {
static int sumOfSquares(int num) {
        int sum = 0;
 while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
 return sum;
    }
  public static void main(String[] args) {
        int num = 19;
while (num != 1 && num != 4) {
            num = sumOfSquares(num);
        }
if (num == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}
