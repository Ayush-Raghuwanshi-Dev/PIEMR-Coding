public class Industry_Question_02 {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 9, 10}; 
        
        int n = 10;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        int i = 0;

        while (i < numbers.length) {
            actualSum = actualSum + numbers[i];
            i++;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);
    }
}