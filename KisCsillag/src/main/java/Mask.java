public class Mask {

    public String doMask(String text){

        String[] words = text.split(" ",-1);

        for (int i = 0; i < words.length; i++) {
            int modulus = words[i].length()%2;

            if(modulus == 0){
                String mask= "";
                for (int j = 0; j < words[i].length(); j++) {
                    mask += "*";
                }
                words[i]= mask;
            }


        }
    // állnak * férfiak
        String result = "";
        for (int i = 0; i < words.length; i++) {

            result = result + words[i] + " ";

        }
        return result;
    }

}
