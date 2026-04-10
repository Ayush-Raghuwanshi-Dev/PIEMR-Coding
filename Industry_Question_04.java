public class Industry_Question_04 {
    public static void main(String[] args) {
        
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {2, 3, 1, 0, 5};

        int i = 0;
        while (i < firstArray.length) {
            int target = firstArray[i];
            boolean found = false;
            
            int j = 0;
            while (j < secondArray.length) {
                if (secondArray[j] == target) {
                    found = true;
                }
                j++;
            }

            if (found == false) {
                System.out.println(target + " is not present in the second array.");
            }
            
            i++;
        }
    }
}