import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(assertEquals(formatName("         NAGLIS     "), "Naglis"));
        System.out.println(assertEquals(formatName("         nAGLIS     "), "Naglis"));
        System.out.println(assertEquals(formatName("labas vakaras"), "Labas Vakaras"));
        System.out.println(assertEquals(formatName("labas    vakaras"), "Labas Vakaras"));
        System.out.println(assertEquals(formatName("  labas vakaras"), "Labas Vakaras"));
        System.out.println(assertEquals(formatName("labas vakaras  "), "Labas Vakaras"));

    }


    public static String formatName(String name) {
       name = name.replaceAll("\\s+", " ");

        name = name.strip();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        char[] nameChars = name.toCharArray();

        for (int i = 0; i < nameChars.length - 1; i++) {
            if (nameChars[i] == ' ') {
                nameChars[i + 1] = Character.toUpperCase(nameChars[i + 1]);

            }
        }


        return String.valueOf(nameChars);//suformatuotas Namecase

    }

    public static boolean assertEquals(String actual, String expected) {
        return actual.equals(expected);
    }


}