# Amazon Automation Testing Project

## Project Overview
This project is an **End-to-End Automation Testing framework** built using **Java, Selenium WebDriver, and TestNG**.

The automation simulates a real user workflow on an e-commerce website, including:
- Searching for a product
- Selecting a product
- Adding the product to the cart
- Navigating to the payment page
- Reaching the order confirmation page

The framework follows the **Page Object Model (POM)** design pattern to maintain clean and maintainable automation code.

---

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- IntelliJ IDEA
- Git & GitHub

---

## Framework Design

This project follows the **Page Object Model (POM)** architecture.

Each page of the application has a separate class that contains:
- Web element locators
- Page actions
- Reusable methods

---

## Project Structure

```

amazon-automation-task
│
├── src
│   │
│   ├── main
│   │   └── java
│   │       └── pages
│   │           ├── ProductSearch.java
│   │           ├── AddToCart.java
│   │           ├── PaymentPage.java
│   │           └── OrderConfirmation.java
│   │
│   └── test
│       └── java
│           └── tests
│               └── EndToEndTest.java
│
├── pom.xml
└── testng.xml

```

---

## Test Flow

The automated test performs the following steps:

1. Launch the browser using Selenium WebDriver  
2. Navigate to the website  
3. Search for a product  
4. Select a product from the search results  
5. Add the product to the cart  
6. Proceed to the payment page  
7. Navigate to the order confirmation page  

---

## How to Run the Project

### 1 Clone the Repository

```

git clone https://github.com/Karthik-0304/amazon-automation-task.git

```

### 2 Open the Project

Open the project using **IntelliJ IDEA**.

### 3 Install Dependencies

Maven will automatically download the required dependencies from the **pom.xml** file.

### 4 Run the Test

Run the test class:

```

EndToEndTest.java

```

or run using:

```

testng.xml

```

---

## Key Features

✔ End-to-End automation workflow  
✔ Selenium WebDriver automation  
✔ TestNG test execution  
✔ Page Object Model framework  
✔ Maven dependency management  

---

## Future Improvements

- Integrate Cucumber BDD framework  
- Add Extent Reports  
- Add Screenshot capture on failure  
- Implement logging  
- Add parallel test execution  

---

## Author

**Karthik S**

GitHub:  
https://github.com/Karthik-0304

---

## Note

This project is created for **automation testing learning and practice purposes**.
```
