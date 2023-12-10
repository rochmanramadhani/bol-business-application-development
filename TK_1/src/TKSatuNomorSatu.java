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
