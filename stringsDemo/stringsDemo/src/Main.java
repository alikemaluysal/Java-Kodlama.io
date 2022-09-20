public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println(message);
        System.out.println();

/*
        System.out.println("Eleman sayısı: " + message.length());
        System.out.println("5. Eleman: " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message);
        System.out.println(message.startsWith("B"));
        System.out.println(message.startsWith("b"));
        System.out.println(message.endsWith("k"));
        char[] chars = new char[5];
        message.getChars(0,5,chars,0);
        System.out.println(chars);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.indexOf("x"));
*/
        System.out.println(message
                .replace("ü", "u")
                .replace("ç", "c")
                .replace(" ", "-")
                .toLowerCase());

        System.out.println(message.substring(2,7));
        for (String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message2 = "   Bugün hava çok kötü!       ";
        System.out.println(message2);
        System.out.println(message2.trim());
    }
}