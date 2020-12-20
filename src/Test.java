public class Test {

    String[] getWords() throws Exception {

            Input in = new Input();
            String arr = in.trimStr();

            String[] words = arr.split(" ");

            if(words.length == 3) {
                return words;
            }else{
                throw new Exception("Symbols must be three!");
            }

    }
}
