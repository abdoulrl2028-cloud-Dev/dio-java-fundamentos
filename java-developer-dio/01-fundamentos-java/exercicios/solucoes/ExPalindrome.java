import java.util.Scanner;

public class ExPalindrome {
    public static void main(String[] args) {
        String s;
        if (args.length > 0) {
            s = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe uma palavra: ");
            s = sc.nextLine();
            sc.close();
        }

        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        boolean pal = isPalindrome(cleaned);
        System.out.println("'" + s + "' é palíndromo? " + pal);
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
