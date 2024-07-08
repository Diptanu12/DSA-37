public class SkipEntireString {
    public static void main(String[] args) {
        System.out.println(skipString("sdhhdhdhjhjapplevkjv"));
        System.out.println(skipAppNotApple("sdhhdhdhjhjapplvkjv"));

    }

    public static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("apple")) {
            return skipString(str.substring(5));
        } else {
            return str.charAt(0) + skipString(str.substring
                    (1));
        }
    }
    public static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring
                    (1));
        }
    }
}
