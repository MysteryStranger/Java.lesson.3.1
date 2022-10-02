public class Main {
    public static void main(String[] args) {
        var searchEngine = "google"
                // first simvol type char
                searchEngine.charAt(0); //'g'
                searchEngine.charAt(5); //'e'

        // zamena mest
        searchEngine.replace("go", "mo"); //moogle

        "hexlet".substring(1); //"exlet"
        "hexlet".substring(1, 2); // "e"
        "hexlet".substring(1, 3); // "ex"
        "hexlet".substring(3, 6); // "let"

        var one = "Naharis";
        var two = "Mormont";
        var three = "Sand";

        // BEGIN (write your solution here)
        one.charAt(2);
        System.out.println(one.charAt(2) + " " + two.charAt(1) + " " + three.charAt(3) + " " + two.charAt(4) + " " + two.charAt(2));
        // END
    }
    }
}