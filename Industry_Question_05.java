public class Industry_Question_05 {
    public static void main(String[] args) {
        
        int[] Arr = {0, 1, 0, 1, 1};
        int T = Arr.length;
        
        int northBikers = 0;
        int crossings = 0;
        int i = 0;

        while (i < T) {
            if (Arr[i] == 0) {
                northBikers = northBikers + 1;
            } else {
                crossings = crossings + northBikers;
            }
            i++;
        }

        System.out.println("Total crossing pairs: " + crossings);
    }
}