public class TestRim {


    String getRim(int rez) {
        int numbers[] = {1, 4, 5, 9, 10, 50, 100};
        String letters[] = {"I", "IV", "V", "IX", "X", "L", "C"};

        int N = rez;
        String numbRoman = "";

            while(N > 0) {
                for(int i = 0; i < numbers.length; i++) {
                    if ( N < numbers[i] ){
                        N -=numbers[i-1];
                        numbRoman += letters[i-1];
                        break;
                    }

                }
            }
        System.out.println(numbRoman);
        return numbRoman;
    }
}
