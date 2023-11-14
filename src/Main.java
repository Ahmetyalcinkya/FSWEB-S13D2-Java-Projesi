import java.net.Inet4Address;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Palindrome Number
        System.out.println("Bir sayı giriniz :");
        int palindromeNumber = intScanner();
        if(isPalindrome(palindromeNumber)){
           System.out.println("Palindrome sayıdır!! ---> " + isPalindrome(palindromeNumber));
        }else {
           System.out.println("Palindrome sayısı değildir! ---> " + isPalindrome(palindromeNumber));
        }

        // Perfect Number
        System.out.println("Bir sayı giriniz :");
        int perfectNumber = intScanner();
        if(isPerfectNumber(perfectNumber)){
            System.out.println("Mükemmel sayıdır! ---> " + isPerfectNumber(perfectNumber));
        }else {
            System.out.println("Mükemmel sayı değildir! ---> " + isPerfectNumber(perfectNumber));
        }

        // Number to Words
        System.out.println("Bir sayı giriniz :");
        int wordNumber = intScanner();
        System.out.println(numberToWords(wordNumber));

    }
    public static int intScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean isPalindrome(int palindromeNum){
        String reverse = "";
        String convertedNumber = Integer.toString(palindromeNum);

        for(int i = convertedNumber.length() -1; i >= 0; i--){
            reverse += convertedNumber.charAt(i);
        }
        return reverse.equals(convertedNumber);
    }
    public static boolean isPerfectNumber(int perfectNum){
        if(perfectNum < 0) return false;
        int total = 0;
        for(int i = 2; i < perfectNum ; i++){
            if(perfectNum % i == 0){
                total += i;
            }
        }
        total += 1 + perfectNum;
        return total == perfectNum * 2;
    }

    public static String numberToWords(int number){
        String[] words = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if(number < 0) return "Invalid Number";
        String convertedNumber = Integer.toString(number);
        String result = "";
        for(int i = 0 ; i < convertedNumber.length(); i++ ){
            char temp = convertedNumber.charAt(i);
            int tempNum = Character.getNumericValue(temp);
            String word = words[tempNum];
            result += " " + word;
        }
        return result;
    }
}