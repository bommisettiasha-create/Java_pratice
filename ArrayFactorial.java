public class ArrayFactorial {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5};

        for (int num : arr) {

            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println(num + "! = " + fact);
        }
    }
}