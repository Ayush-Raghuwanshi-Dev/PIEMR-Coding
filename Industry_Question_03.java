public class Industry_Question_03 {
    public static void main(String[] args) {

        String text = "Hello World";
        String lowerText = text.toLowerCase();
        char[] characters = lowerText.toCharArray();

        int vowels = 0;
        int consonants = 0;
        int i = 0;

        while (i < characters.length) {
            char c = characters[i];

            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            i++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}