public class Question_04 {
    public static void main(String[] args) {
        
        String myText = "Java is fun to learn";
        char[] characters = myText.toCharArray();
        
        int wordCount = 0;
        int i = 0;

        if (characters.length > 0) {
            wordCount = 1;
        }

        while (i < characters.length) {
            if (characters[i] == ' ') {
                wordCount++;
            }
            i++;
        }

        System.out.println("Total words: " + wordCount);
    }
}