public class Palindrome {
        public static void main(String[] args) {
            long maxLong = Long.MAX_VALUE;
            int divisor = 10000019;

            int count = 0;
            for (long i = 1; i < maxLong; i++) {
                if (isPalindrome(i) && i % divisor == 0) {
                    count++;
                }
            }

            System.out.println("Number of palindromes less than max long divisible by 10000019: " + count);
        }

        public static boolean isPalindrome(long number) {
            String numberString = String.valueOf(number);
            int len = numberString.length();
            for (int i = 0; i < len / 2; i++) {
                if (numberString.charAt(i) != numberString.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }


