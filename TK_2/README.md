# Binus Online Learning - Information System
**ISYS6514035 - Business Application Development**

**Instructor(s):**
1. Ferdinand Ariandy Luwinda, S.Kom., M.T.I. (Primary Instructor)

## Group 1 - Group Assignment 2

**Group Members:**
- Fandi Rochmat - 2502142135
- Rochman Ramadhani Chiefto Irawan - 2502149204
- Reynaldi Ramadhana - 2502144550
- Kania Yemima Ginting - 2502154274
- Bryan - 2502154993

### Task 1: Characteristics of Object-Oriented Programming (OOP)

#### Characteristics:

1. **Encapsulation:**
   - *Explanation:* Enapsulation involves bundling data (variables) and methods (functions) into a single unit or object.
   - *Example Implementation:*
     ```java
     public class Employee {
         private String name;
         private int age;

         // Getter and setter methods
         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             this.age = age;
         }
     }
     ```

2. **Inheritance:**
   - *Explanation:* Inheritance is a concept where a class can inherit properties and methods from another class.
   - *Example Implementation:*
     ```java
     public class Manager extends Employee {
         private String department;

         // Additional methods specific to Manager
         public String getDepartment() {
             return department;
         }

         public void setDepartment(String department) {
             this.department = department;
         }
     }
     ```

3. **Polymorphism:**
   - *Explanation:* Polymorphism is a concept where an object can have different forms or behaviors under certain conditions.
   - *Example Implementation:*
     ```java
     public interface Shape {
         void draw();
     }

     public class Circle implements Shape {
         @Override
         public void draw() {
             System.out.println("Drawing Circle");
         }
     }

     public class Square implements Shape {
         @Override
         public void draw() {
             System.out.println("Drawing Square");
         }
     }
     ```

### Task 2: Age Calculation Program

#### Output Program:

Full Source Code: [AgeCalculator.java](https://github.com/rochmanramadhani/bol-business-application-development/blob/main/TK_2/src/AgeCalculator.java)

```java
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("Masukkan umur pelamar: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input bukan angka. Mohon masukkan angka.");
                System.out.print("Masukkan umur pelamar: ");
                scanner.next(); // Clear the buffer
            }
            age = scanner.nextInt();

            if (age <= 0) {
                System.out.println("Umur tidak valid. Mohon masukkan umur yang lebih dari 0.");
            } else {
                checkPositionEligibility(age);

                // Ask if the user wants to repeat
                System.out.print("Apakah ingin mengulang? (y/n): ");
                String response = scanner.next().toLowerCase();
                if (!response.equals("y")) {
                    break; // Exit the loop if the user chooses not to repeat
                }
            }
        } while (true); // Loop until the user chooses to exit
    }

    private static void checkPositionEligibility(int age) {
        if (age <= 17) {
            System.out.println("Pelamar masih dibawah umur untuk bekerja.");
        } else if (age <= 25) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Staff.");
        } else if (age <= 30) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Officer.");
        } else if (age <= 35) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Supervisor.");
        } else if (age <= 40) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Manager.");
        } else {
            System.out.println("Umur pelamar melebihi batas maksimal.");
        }
    }
}
```

### Task 3: Binary to Decimal Converter Program

#### Output Program:

Full Source Code: [BinaryToDecimalConverter.java](https://github.com/rochmanramadhani/bol-business-application-development/blob/main/TK_2/src/BinaryToDecimalConverter.java)

```java
import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Input angka biner (maksimal 8 digit): ");
            String binaryString = scanner.nextLine();

            convertBinaryToDecimal(binaryString);

            // Ask if the user wants to repeat
            System.out.print("Apakah ingin mengulang? (y/n): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("y")) {
                break; // Exit the loop if the user chooses not to repeat
            }

            // Clear the buffer
            scanner.nextLine();

        } while (true); // Loop until the user chooses to exit
    }

    private static void convertBinaryToDecimal(String binaryString) {
        if (binaryString.length() > 8) {
            System.out.println("Digit kelebihan. Mohon input maksimal 8 digit.");
            return;
        }

        if (!binaryString.matches("[01]+")) {
            System.out.println("Input tidak valid. Hanya diperbolehkan angka biner (0 atau 1).");
            return;
        }

        try {
            int decimal = Integer.parseInt(binaryString, 2);
            System.out.println("Angka desimal dari biner " + binaryString + " adalah: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Input bukan angka biner yang valid.");
        }
    }
}
```

Feel free to navigate through the repository to access the source code and related content.