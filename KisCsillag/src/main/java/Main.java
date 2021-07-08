public class Main {
    static String lyrics = "Algás palástban országalmával\n" +
            "A tengerből kijött egy király.\n" +
            "Sörrel kezében a többiek közé,\n" +
            "A bolt elé, a napra áll.\n" +
            "Ott állnak a férfiak, rozsdásvas szagúak.\n" +
            "Állnak a férfiak, állnak a férfiak.\n" +
            "Nézik, kit lehet megdugni,\n" +
            "És sohase fogják megunni.\n" +
            "Csak állnak a férfiak, nézik a csajokat.";

    public static void main(String[] args) {
        Mask mask = new Mask();
        String result = mask.doMask(lyrics);
        System.out.println(result);

    }


}
