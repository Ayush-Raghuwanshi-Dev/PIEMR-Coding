public class Question_01 {
    public static void main(String[] args) {
        
        String myText = "Hello World";
        char[] characters = myText.toCharArray();
        int count = 0;

        while (count < characters.length) {
            count++;
        }

        System.out.println("The length of the string is: " + count);
    }
}