public class Question_03 {
    public static void main(String[] args) {
        
        String myText = "radar";
        char[] characters = myText.toCharArray();
        
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(myText + " is a palindrome");
        } else {
            System.out.println(myText + " is not a palindrome");
        }
    }
}