import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        String str = scanner.next();
        
        int consonantCount = 0;
        char thirdLastConsonant = ' ';
        
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (isConsonant(ch)) {
                consonantCount++;
                if (consonantCount == 3) {
                    thirdLastConsonant = ch;
                    break;
                }
            }
        }
        
        System.out.println(thirdLastConsonant);
        
        scanner.close();
    }
    
    private static boolean isConsonant(char ch) {
        return !("aeiouAEIOU".indexOf(ch) >= 0);
    }
}