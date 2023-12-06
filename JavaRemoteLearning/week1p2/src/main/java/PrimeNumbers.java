
public class PrimeNumbers {
    public static void main(String[] args) {
                if (args.length < 1) {
                    System.out.println("Please provide a number as an argument.");
                    return;
                }

                int number = Integer.parseInt(args[0]);
                if (number <= 1) {
                    System.out.println("Please provide a number greater than 1.");
                    return;
                }

                for (int i = 1; i <= number; i++) {
                    if (isPrime(i)) {
                        System.out.println(i + "-PRIME");
                    } else {
                        System.out.println(i);
                    }
                }
            }

            // Function to check if a number is prime
            private static boolean isPrime(int number) {
                if (number <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
