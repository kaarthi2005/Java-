import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String compressed = "";

        int count = 1;

        for (int i = 0; i < input.length(); i++) {

            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed = compressed + input.charAt(i) + count;
                count = 1;
            }
        }

        int originalLength = input.length();
        int compressedLength = compressed.length();

        double ratio = ((double)(originalLength - compressedLength) / originalLength) * 100;

        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
        System.out.printf("Compression Ratio: %.2f%%", ratio);

        sc.close();
    }
}