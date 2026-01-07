# **Java Portfolio Projects**

A collection of Java programs during my senior year of high school. These projects demonstrate my understanding of Java fundamentals, GUI development with JavaFX, algorithms, input validation, and puzzle/logic programming.

---

### **1. Credit Card Validation Program**

**File:** `SinghPrabhleanCreditCardValidation.java`
**Date:** 9/28/2023

A console-based Java program that allows the user to enter a credit card number, validates it using the Luhn (mod-10) checksum algorithm, and identifies the card issuer.

#### **Features**

* Validates digit-only input
* Uses the Luhn algorithm to determine validity
* Detects card type:

  * Visa
  * MasterCard
  * Discover
  * American Express
* Loops until the user chooses to quit

#### **Key Concepts Used**

* String manipulation
* Luhn checksum
* Input sanitizing
* Methods & control flow

---

### **2. Cricket Thermometer GUI**

**File:** `CricketThermometerDriver.java`
**Date:** 11/25/2023

A JavaFX application that loads a GUI created in Scene Builder. The app simulates a "cricket thermometer" — a fun calculator based on the idea that cricket chirps can be used to estimate temperature.

#### **Features**

* Fully interactive GUI (FXML)
* JavaFX Scene Builder layout
* Stage configuration (size, title, resizability)
* FXML loading and exception handling

#### **Key Concepts Used**

* JavaFX
* Scene Builder (FXML)
* Event-driven programming
* GUI application structure

---

### **3. House Drawing GUI**

**File:** `PictureDriver.java`
**Date:** 11/14/2023

A simple JavaFX program that renders a house drawing in a window using a custom class `Picture`.

#### **Features**

* JavaFX UI
* Static drawing via shapes and layout
* Non-resizable window for consistent rendering

#### **Key Concepts Used**

* JavaFX
* Graphics rendering
* Classes & method calls

---

### **4. Latin Square Puzzle**

**File:** `LatinSquarePuzzle.java`

An interactive logic puzzle where the user fills in missing characters in a 4×4 Latin Square. The program validates the puzzle based on unique row/column constraints and arithmetic rules.

#### **Features**

* 4×4 Latin Square logic puzzle
* User prompt for entering missing values
* Row & column validation
* Unique digit enforcement
* Color-coded terminal output
* Arithmetic checks for rows/columns

#### **Key Concepts Used**

* 2D arrays
* Puzzle validation logic
* Sorting and comparison
* Terminal coloring (ANSI codes)
* User input loops

---

## **Running the Programs**

### **Console-Based Programs**

For programs like the Credit Card Validator or Latin Square Puzzle:

```bash
javac ProgramName.java
java ProgramName
```

Replace `ProgramName` with the correct filename.

---

### **JavaFX Programs**

1. Ensure JavaFX is installed and added to your PATH or module list.
2. Compile:

```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml Program.java
```

3. Run:

```bash
java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml Program
```

---

