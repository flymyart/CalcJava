import javax.naming.PartialResultException;

public class IntTest {
    String[] getInt() throws Exception {

        try {
            TestArabic arabInt = new TestArabic();
            String[] arr1 = arabInt.getNumbArab();

            Integer symb1 = Integer.valueOf(arr1[0]);
            Integer symb2 = Integer.valueOf(arr1[2]);

            if (symb1 < 1 & symb1 > 10) {
                throw new Exception("First Symbol must be from 1 to 10!");
            }
            if (symb2 < 1 & symb2 > 10) {
                throw new Exception("Third Symbol must be from 1 to 10!");
            }
            return arr1;
        }
        catch (NumberFormatException e) {
            System.err.println("First and third symbols must be integer numbers!");
        }
        return null;
    }
}
