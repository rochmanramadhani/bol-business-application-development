# Binus Online Learning - Information System
**ISYS6514035 - Business Application Development**

**Instructor(s):**
1. Ferdinand Ariandy Luwinda, S.Kom., M.T.I. (Primary Instructor)

## Personal Assignment 1 - Rochman Ramadhani Chiefto Irawan (2502149204)

### 1. Understanding Java Concepts:

#### 1.1 Identifier, Variable, and Constant:
In Java programming, there are distinctions among identifier, variable, and constant:

- **Identifier:**
  - An identifier is a name given to elements in a Java program, such as variables, methods, classes, etc.
  - It must follow certain rules in naming, such as starting with a letter or underscore (_), followed by letters, numbers, or underscores.
  - Identifiers are case-sensitive.
  - *Example Identifiers:* `variableName`, `calculateResult`, `CONSTANT_VALUE`, `MyClass`.

- **Variable:**
  - A variable is a storage location whose value can be changed during program execution.
  - It has a data type that determines the type of values it can hold.
  - Variable names are a type of identifier in Java.
  - *Example Variables:*
    ```java
    // Example integer variable
    int number = 10;
    
    // Example double variable
    double piValue = 3.14;
    
    // Example String variable
    String name = "John Doe";
    ```

- **Constant:**
  - A constant is a value that remains constant and cannot be changed during program execution.
  - It is often declared using the `final` keyword to prevent modification after initialization.
  - Constant names are also a type of identifier in Java.
  - *Example Constants:*
    ```java
    // Example constant for Pi value
    final double PI = 3.14159;
    
    // Example constant for maximum iterations
    final int MAX_ITERATIONS = 1000;
    
    // Example constant for application name
    final String APP_NAME = "Java Application";
    ```

### 2. Built-in Classes in Java:

#### 2.1 Overview:
Java provides a rich set of built-in classes that cover various functionalities. Here are explanations for some mentioned classes:

- **String:**
  - Used for representing and manipulating text or strings.

- **Integer:**
  - Represents integer values and provides methods for manipulation and conversion.

- **Double:**
  - Represents double-precision floating-point values and offers methods for manipulation and conversion.

- **Boolean:**
  - Represents true or false values and provides methods for logical operations.

- **ArrayList:**
  - Implements a dynamic array, allowing dynamic addition, removal, and access of elements.

- **HashMap:**
  - Implements a map or dictionary structure with key-value pairs.

- **Date:**
  - Represents date and time values, allowing manipulation and formatting.

- **Math:**
  - Provides various mathematical functions for arithmetic, trigonometry, logarithm, etc.

### 3. Prime Number Checker Program:

#### 3.1 Description:
The program checks whether a given integer is a prime number or not. It also provides a reason if the number is not prime.

#### 3.2 Full Source Code: [CheckPrimeNumber.java](https://github.com/rochmanramadhani/bol-business-application-development/blob/main/TP_1/src/CheckPrimeNumber.java)
```java
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
```

### 4. Library System Program:

#### 4.1 Description:
The program calculates fines for overdue books based on their types (pelajaran, novel, skripsi) and the number of overdue days.

#### 4.2 Full Source Code: [LibrarySystem.java](https://github.com/rochmanramadhani/bol-business-application-development/blob/main/TP_1/src/LibrarySystem.java)
```java
import java.util.Scanner;

/**
 * @author Rochman Ramadhani Chiefto Irawan
 */

public class LibrarySystem {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("========= Selamat datang di Perpustakaan =========");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("Kami memiliki buku-buku pelajaran, novel, dan skripsi.");

        Scanner scanner = new Scanner(System.in);
        String bookType;
        int overdueDays;
        boolean isValidInput;

        do {
            System.out.print("Masukkan jenis buku (pelajaran/novel/skripsi): ");
            bookType = scanner.nextLine().toLowerCase();

            // Memastikan jenis buku yang dimasukkan valid
            isValidInput = isValidBookType(bookType);

            if (!isValidInput) {
                System.out.println("Jenis buku tidak valid. Silakan coba lagi.");
            }

        } while (!isValidInput);

        do {
            System.out.print("Masukkan jumlah hari keterlamb

atan: ");

            // Menangani input yang bukan bilangan bulat
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan bilangan bulat.");
                System.out.print("Masukkan jumlah hari keterlambatan: ");
                scanner.next(); // Mengonsumsi input yang tidak valid
            }

            overdueDays = scanner.nextInt();

            // Memastikan jumlah hari keterlambatan tidak negatif
            if (overdueDays < 0) {
                System.out.println("Jumlah hari keterlambatan tidak valid. Silakan coba lagi.");
            }

        } while (overdueDays < 0);

        // Menghitung denda berdasarkan jenis buku
        int fine = calculateFine(bookType, overdueDays);

        if (fine > 0) {
            System.out.println("Denda yang harus dibayar: Rp" + fine);
        } else {
            System.out.println("Tidak ada denda. Buku dikembalikan tepat waktu.");
        }
    }

    // Fungsi untuk memeriksa apakah jenis buku valid
    private static boolean isValidBookType(String bookType) {
        return bookType.equals("pelajaran") || bookType.equals("novel") || bookType.equals("skripsi");
    }

    // Fungsi untuk menghitung denda berdasarkan jenis buku dan jumlah hari keterlambatan
    private static int calculateFine(String bookType, int overdueDays) {
        int finePerDay;

        switch (bookType) {
            case "pelajaran":
                finePerDay = 2000;
                break;
            case "novel":
                finePerDay = 5000;
                break;
            case "skripsi":
                finePerDay = 10000;
                break;
            default:
                return 0; // Mengembalikan 0 jika jenis buku tidak valid
        }

        // Menghitung total denda
        return Math.max(0, finePerDay * overdueDays);
    }
}
```

For any questions or clarifications, please contact Rochman Ramadhani Chiefto Irawan at [rochmanramadhani12@gmail.com](mailto:rochmanramadhani12@gmail.com).
