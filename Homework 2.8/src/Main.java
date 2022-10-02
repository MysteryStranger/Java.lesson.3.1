public class Main {
    public static void main(String[] args) {
        var what = "Kings" + "road";
        System.out.println(what) //Kingsroad

        var first = "Kings";
        var what = first + "road";
        System.out.println(what); //Kingsroad

        var first = "Kings";
        var last = "road";
        var what = first + last;
        System.out.println(what); //Kingsroad

        var info = "We couldn't verify you mother's maiden name.";
        var intro = "Here is important information about your account security.";

        var firstName = "Joffrey";
        var greeting = "Hello";

        // BEGIN (write your solution here)
        System.out.println(greeting + ", " + firstName + "!");
        System.out.println("Here is important information about your account security.\nWe couldn\'t verify you mother\'s maiden name.");
        // END
    }
}

    }
}