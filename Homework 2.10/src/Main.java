public class Main {
    public static void main(String[] args) {
        var euros = 1000;
        var dollars = euros * 1.25; //1250
        var rubles = dollars * 60; //75000
        System.out.println(rubles); //75000

        var dollarsInEuro = 1.25;
        var roublesInDollar = 60;

        var euros = 1000;
        var dollars = euros * dollarsInEuro; // 1250
        var rubles = dollars * roublesInDollar; // 75000

        System.out.println(rubles); // => 75000

        var king = "King Balon the 6th";
        System.out.println(king + " has " + (6 * 17) + " rooms.");

        var king = "King Balon the 6th";

        // BEGIN (write your solution here)
        System.out.println(king + " has " + (6 * 17) + " rooms. ");
        // END
    }
}

    }
}