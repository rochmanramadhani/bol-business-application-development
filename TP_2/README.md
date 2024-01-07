# Binus Online Learning - Information System
**ISYS6514035 - Business Application Development**

**Instructor(s):**
1. Ferdinand Ariandy Luwinda, S.Kom., M.T.I. (Primary Instructor)

## Personal Assignment 2 - Rochman Ramadhani Chiefto Irawan (2502149204)

## 1. Interface in Java

#### 1.1 What is Interface in Java?

In Java, an interface is a contract that defines a set of methods that must be implemented by classes that use the interface. Interfaces allow achieving abstraction and inheritance without the need for multiple inheritances.

#### 1.2 Importance of Using Interface:

- **Abstraction:** Interface allows abstraction, separating method definitions from their implementations.
- **Inheritance Without Multiple Inheritance:** A class can implement multiple interfaces, overcoming the limitation of multiple inheritances in Java.

#### 1.3 Allowed and Not Allowed in Interface:

**Allowed:**
- Declaration of Methods without Implementation.
- Constant Variables (final and static).
- Multiple Inheritance.
- Default Methods (since Java 8).

**Not Allowed:**
- Methods with Bodies (Before Java 8).
- Non-Constant Variables.
- Attributes (Fields) other than constant variables.

#### 1.4 Example of Using Interface:

```java
interface Shape {
    double calculateArea(); // Method declaration without body
    void display(); // Method declaration without body
}

// Interface Implementation
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle Area: " + calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.display();
    }
}
```

## 2. Differences between JavaFX, AWT, and Swing

#### 2.1 AWT (Abstract Window Toolkit)

**2.1.1 Description:**
AWT is the built-in Java GUI toolkit that provides basic GUI components. AWT uses components provided by the operating system, so the GUI appearance may vary across platforms.

**2.1.2 Example Implementation:**
```java
import java.awt.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
```

#### 2.2 Swing

**2.2.1 Description:**
Swing is a GUI toolkit built on top of AWT. Unlike AWT, Swing provides components that are entirely independent of the operating system, resulting in a more consistent GUI appearance across platforms.

**2.2.2 Example Implementation:**
```java
import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click Me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

#### 2.3 JavaFX

**2.3.1 Description:**
JavaFX is a modern GUI toolkit designed to replace Swing. JavaFX provides a rich user interface with support for 2D and 3D graphics, animations, and flexible layouts.

**2.3.2 Example Implementation:**
```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Example");
        Button button = new Button("Click Me");
        StackPane root = new StackPane();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}
```

#### 2.4 Key Differences:

- **AWT:** Uses GUI components dependent on the operating system.
- **Swing:** Uses entirely independent components, providing a consistent GUI appearance.
- **JavaFX:** Offers a modern user interface with advanced graphic features and animation support.

#### 2.5 Selection Between Toolkits:

## 3. Clinic App CRUD Example
https://github.com/rochmanramadhani/bol-business-application-development/assets/115830242/e0325231-d430-4ead-9a6e-9593c0d7f261

- **AWT:** Suitable for simple applications and rapid development.
- **Swing:** Better for complex desktop applications requiring consistent appearance across platforms.
- **JavaFX:** Recommended for modern applications with sophisticated graphics and animation needs.

For any questions or clarifications, please contact Rochman Ramadhani Chiefto Irawan at [rochmanramadhani12@gmail.com](mailto:rochmanramadhani12@gmail.com).
