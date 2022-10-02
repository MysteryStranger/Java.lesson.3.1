public class Main {
    public static void main(String[] args) {
        var company = "hexlet";
        company.toUpperCase(); // в верхний регистр
        System.out.println(company); // => ?

        var language = "JAVA";
        language = language.toLowerCase();
        System.out.println(language); // => "java"

        var language = "JAVA";
        var processedLanguage = language.toLowerCase();
        System.out.println(processedLanguage); // => "java"

        var email = " SupporT@hexlet.io\n";

        // BEGIN (write your solution here)
        email = email.trim();
        email = email.toLowerCase();
        System.out.println(email);
        // END

    }
}