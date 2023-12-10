# Binus Online Learning - Information System
**ISYS6514035 - Business Application Development**

**Instructor(s):**
1. Ferdinand Ariandy Luwinda, S.Kom., M.T.I. (Primary Instructor)

## Group 1 - Group Assignment 1

**Group Members:**
- Fandi Rochmat - 2502142135
- Rochman Ramadhani Chiefto Irawan - 2502149204
- Reynaldi Ramadhana - 2502144550
- Kania Yemima Ginting - 2502154274
- Bryan - 2502154993

### Task: String Manipulation Program

This Java program performs string manipulation based on the following rules:

1. **Swap Case:**
   - *Example Output:*
     ```plaintext
     String A: sAYA bELAJAR jAVA
     String B: jAVA ITU sANGAT mUDAH
     ```

2. **Count Letters:**
   - *Example Output:*
     ```plaintext
     Jumlah huruf String A: 15
     Jumlah huruf String B: 18
     ```

3. **Merge Strings:**
   - *Example Output:*
     ```plaintext
     Hasil penggabungan: Saya Belajar Java, Java itu Sangat Mudah
     ```

4. **Reverse Strings:**
   - *Example Output:*
     ```plaintext
     String A: avaJ rajaleB ayaS
     String B: haduM tagnaS uti avaJ
     ```

### Full Source Code - String Manipulation Program

```java
/**
 * @author Rochman Ramadhani Chiefto Irawan
 */
public class TKSatuNomorSatu {

    public static void main(String[] args) {
        String stringA = "Saya Belajar Java";
        String stringB = "Java itu Sangat Mudah";

        // a. Mengubah huruf kecil menjadi huruf besar dan sebaliknya
        String modifiedStringA = swapCase(stringA);
        String modifiedStringB = swapCase(stringB);

        System.out.println("a. Mengubah huruf kecil menjadi huruf besar dan huruf besar menjadi huruf kecil");
        System.out.println("String A: " + modifiedStringA);
        System.out.println("String B: " + modifiedStringB);

        // b. Menghitung jumlah huruf (tidak termasuk spasi)
        int countA = countLetters(stringA);
        int countB = countLetters(stringB);

        System.out.println("\nb. Menghitung jumlah huruf (tidak termasuk spasi)");
        System.out.println("Jumlah huruf String A: " + countA);
        System.out.println("Jumlah huruf String B: " + countB);

        // c. Menggabungkan String A dan String B dengan menyisipkan tanda koma dan spasi di antaranya
        String mergedString = mergeStrings(stringA, stringB);

        System.out.println("\nc. Menggabungkan String A dan String B dengan menyisipkan tanda koma dan spasi di antaranya");
        System.out.println("Hasil penggabungan: " + mergedString);

        // d. Membalik String A dan String B
        String reversedStringA = reverseString(stringA);
        String reversedStringB = reverseString(stringB);

        System.out.println("\nd. Membalik String A dan String B");
        System.out.println("String A: " + reversedStringA);
        System.out.println("String B: " + reversedStringB);
    }

    // Method untuk mengubah huruf kecil menjadi huruf besar dan sebaliknya
    public static String swapCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }

    // Method untuk menghitung jumlah huruf (tidak termasuk spasi)
    public static int countLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // Method untuk menggabungkan dua string dengan tanda koma dan spasi di antaranya
    public static String mergeStrings(String strA, String strB) {
        return strA + ", " + strB;
    }

    // Method untuk membalikkan sebuah string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
```

### Task: Array Operations

This Java program performs operations on an array of integers, including finding the smallest and largest numbers and calculating the average.

1. **Input:**
   - Enter the number of integers to input (minimum 3).
   - Enter each integer.

   *Example:*
   ```plaintext
   Masukkan jumlah bilangan: 4
   Masukkan bilangan ke-1: 70
   Masukkan bilangan ke-2: 30
   Masukkan bilangan ke-3: 80
   Masukkan bilangan ke-4: 40
   ```

2. **Output:**
   - Smallest number.
   - Largest number.
   - Average value.

   *Example:*
   ```plaintext
   Bilangan terkecil = 30
   Bilangan terbesar = 80
   
   Nilai rata

-rata = 55.0
   ```

### Full Source Code - Array Operations

```java
import java.util.Scanner;

/**
 * @author Rochman Ramadhani Chiefto Irawan
 */
public class TKSatuNomorDua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        if (jumlahBilangan < 3) {
            System.out.println("Jumlah bilangan harus minimal 3.");
            return;
        }

        int[] bilangan = new int[jumlahBilangan];

        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = scanner.nextInt();
        }

        int terkecil = bilangan[0];
        int terbesar = bilangan[0];
        int total = bilangan[0];

        for (int i = 1; i < jumlahBilangan; i++) {
            if (bilangan[i] < terkecil) {
                terkecil = bilangan[i];
            }
            if (bilangan[i] > terbesar) {
                terbesar = bilangan[i];
            }
            total += bilangan[i];
        }

        double rataRata = (double) total / jumlahBilangan;

        System.out.println("\nBilangan terkecil = " + terkecil);
        System.out.println("Bilangan terbesar = " + terbesar);
        System.out.println("\nNilai rata-rata = " + rataRata);

        scanner.close();
    }
}
```

Feel free to navigate through the repository to access the source code and related content.