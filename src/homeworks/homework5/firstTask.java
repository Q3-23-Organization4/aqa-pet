package homeworks.homework5;

public class firstTask {
    public static void main(String[] args) {
        String toChar = "racecadff";

        char[] charArray = toChar.toCharArray();
        int length = charArray.length;

        int i = 0;
        int j = length - 1;

        while (i < j) {
            if (charArray[i] != charArray[j]) {
                System.out.println("It is not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("It is palindrome");

    }
}
