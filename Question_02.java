public class Question_02 {
    public static void main(String[] args) {
        
        String myText = "Hello World";
        char[] characters = myText.toCharArray();
        
        int i = characters.length - 1;
        String reversedText = "";

        while (i >= 0) {
            reversedText = reversedText + characters[i];
            i--;
        }

        System.out.println("Reversed string: " + reversedText);
    }
}