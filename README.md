# Venmo
Venmo app – a digital wallet that allows you to easily pay friends when you owe them money.

---

# Venmo Transactions

## Description

The Venmo Transactions project is a Java-based implementation of a simplified version of the Venmo app – a digital wallet designed for easy money transactions among friends.

## Instructions

### Step 1: Update DecimalFormat in Venmo.java

- Open `Venmo.java`.
- In the `toString` method, update the statement to format the amount as USD to 2 decimal places using the `DecimalFormat` class.

### Step 2: Handle Negative Payments

- In `Venmo.java`, note the overloaded constructor and the `pay` method.
- If an amount less than 0 is passed in, the amount is set to 0, and a `NegativePaymentException` is thrown.
- Open `NegativePaymentException.java` to understand how this exception is implemented.

### Step 3: Handling Exceptions in VenmoDriver.java

- Open `VenmoDriver.java`.
- Replace `throws NegativePaymentException` with a try-catch block in the `main` method.
- Add a catch block to output the error message if a `NegativePaymentException` occurs.

### Step 4: Create a Data File

- Create a data file (`transactions.txt`) in the root of the project.
- Enter transaction values, one per line.

Example `transactions.txt`:
```plaintext
50.75
100
-32
3001
```

### Step 5: Read Data from File in VenmoDriver.java

- Modify `VenmoDriver.java` to read transaction data from the file using a `Scanner` object.
- Use a try-catch block or add `throws FileNotFoundException` to the main class.

### Step 6: Implement ExceedsMaximumException

- Create a new exception class named `ExceedsMaximumException`.
- Similar to `NegativePaymentException`, but with an output message stating that the amount must be less than $3000.

### Step 7: Update Venmo.java to Handle ExceedsMaximumException

- In `Venmo.java`, modify the overloaded constructor and `pay` method to check for amounts exceeding $3000.
- If the amount exceeds $3000, throw an `ExceedsMaximumException`.

### Step 8: Update VenmoDriver.java to Catch ExceedsMaximumException

- In `VenmoDriver.java`, add a second catch block after the one for `NegativePaymentException` to catch `ExceedsMaximumException`.

### Step 9: Create JUnit Tests

- Generate JUnit tests (`VenmoTest`) using JUnit 5.
- Include tests for:
  1. Instantiating a Venmo object using the no-arg constructor.
  2. Instantiating a Venmo object using the overloaded constructor with a valid value.
  3. Testing `NegativePaymentException` and `ExceedsMaximumException` separately.
  4. Validating the `pay` method for a valid amount, a negative amount, and an amount over $3000.

## Running the Program

- Compile and run `VenmoDriver.java`.
- Ensure the program reads and processes the transaction data correctly.

## Notes

- For tests expecting an exception, use `assertThrows` in JUnit tests.
