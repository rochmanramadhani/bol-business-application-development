import java.util.Scanner;

/**
 * @author Rochman Ramadhani Chiefto Irawan
 */

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menangani input yang tidak valid
        int num = getValidInput(scanner);

        String result = checkPrimeNumber(num);

        System.out.println(result);
    }

    // Fungsi untuk mengecek bilangan prima
    private static String checkPrimeNumber(int num) {
        String result = "";
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    result = num + " bukan angka prima karena bisa dibagi " + i;
                    break;
                }
            }
        }

        if (result.equals("")) {
            result = isPrime ? num + " adalah bilangan prima" : num + " bukan bilangan prima";
        }

        return result;
    }

    // Fungsi untuk mendapatkan input bilangan bulat yang valid
    private static int getValidInput(Scanner scanner) {
        int num = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Input sebuah angka bilangan bulat: ");
                num = Integer.parseInt(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Mohon masukkan bilangan bulat.");
            }
        }

        return num;
    }
}