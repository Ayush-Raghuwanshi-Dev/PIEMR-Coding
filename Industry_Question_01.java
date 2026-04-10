public class Industry_Question_01 {

    public static boolean isPerfect(int num) {
        int sum = 0;
        int i = 1;

        while (i < num) {
            if (num % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 500;
        int current = start;

        System.out.println("Perfect numbers in range:");

        while (current <= end) {
            if (current > 0 && isPerfect(current)) {
                System.out.println(current);
            }
            current++;
        }
    }
}