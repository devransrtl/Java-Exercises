# ✈️ Flight Ticket Calculator

A **Java console application** that calculates flight ticket prices based on **distance**, **age**, and **travel type** (one-way or round-trip). This project is a simple but educational exercise to practice **Java basics**, **user input**, and **conditional logic**.

---

## 🛠️ Features

- Interactive user input for:
  - Distance in kilometers
  - Passenger age
  - Travel type (1 = One-way, 2 = Round-trip)
- Age-based discounts:
  - Children (<12 years): 50% off
  - Youth (12–24 years): 10% off
  - Seniors (65+ years): 30% off
- Round-trip discount: 10% off total fare
- Simple console output showing total price

---
## 💻 How to Run:

1. Make sure **Java** is installed on your system.  
2. Compile the program:

```
javac Main.java
```
3- Run the program:
```
java Main
```
4- Follow the prompts in the console to enter your data.

5- The program will calculate and display the total ticket price.
📝 Example:
```
Distance (km): 100
Age: 20
Travel Type (1 = One-way, 2 = Round-trip): 2
Total ticket price: 180.0₺
```
⚙️ Technical Details:

- Uses Scanner for reading user input

- Applies if/else statements for discount logic

- Calculates price with formulas combining distance, age discount, and travel type

