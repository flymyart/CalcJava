public class Calc {

    
    int Case() throws Exception {
        IntTest i = new IntTest();
        String[] num = i.getInt();
        int rez;
        String op = num[1];
        Integer i1 = Integer.valueOf(num[0]);
        Integer i2 = Integer.valueOf(num[2]);
        Integer i3 = Integer.valueOf(num[3]);
        switch(op){
            case "+":
                rez = i1 + i2;
                break;
            case "-":
                rez = i1 - i2;
                break;
            case "*":
                rez = i1 * i2;
                break;
            case "/":
                rez = i1 / i2;
                break;
            default:
                throw new Exception("Symbol must be + , - , * or /!");
        }
        if (i3 == 1){
            TestRim rezRim = new TestRim();
            rezRim.getRim(rez);
        } else {
            System.out.println(rez);
        }
        return rez;
    }
}
