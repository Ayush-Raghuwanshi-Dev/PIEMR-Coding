public class Industry_Question_06 {
    public static void main(String[] args) {
        
        String hex17 = "1A2G";
        char[] characters = hex17.toCharArray();
        
        int decimalValue = 0;
        int power = 1;
        int i = characters.length - 1;

        while (i >= 0) {
            char c = characters[i];
            int digit = 0;

            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'G') {
                digit = c - 'A' + 10;
            } else if (c >= 'a' && c <= 'g') {
                digit = c - 'a' + 10;
            }

            decimalValue = decimalValue + (digit * power);
            power = power * 17;
            i--;
        }

        System.out.println("Decimal value: " + decimalValue);
    }
}