
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
                    if (PrimeChecker.isPrime(i)) {
                        System.out.println(i + "-PRIME");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
