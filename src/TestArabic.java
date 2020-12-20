import java.util.Arrays;

public class TestArabic {
    String[] getNumbArab() throws Exception {
        Test words = new Test();
        String[] arr = words.getWords();
        String[] rimSymbols = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[3] = Integer.toString(0);

        for(int i = 0; i < rimSymbols.length; i++) {
            for(int j = 0; j < rimSymbols.length; j++)
                if (rimSymbols[i].equals(arr[0]) & rimSymbols[j].equals(arr[2])) {
                    arr[0] = Integer.toString(i + 1);
                    arr[2] = Integer.toString(j + 1);
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[3] = Integer.toString(1);
                }

        }
        return arr;
    }
}
