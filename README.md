# Amazon Automation Task

## 📌 Project Overview
Amazon Automation Task is a Selenium-based UI automation testing project developed using **Java, Selenium WebDriver, TestNG, and Extent Reports**.

The project automates core user workflows of the Amazon website including **product search, add to cart, cart verification, and payment page navigation**.

It follows a **modular automation framework structure** to maintain scalability, readability, and maintainability.

The framework includes:

- Structured test modules
- Reusable utilities
- Page Object Model design
- Extent Reports for test reporting
- Automatic screenshot capture for failures

---

# 🧰 Framework & Technologies Used

| Technology | Purpose |
|------------|--------|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution framework |
| Maven | Dependency management |
| Extent Reports | Test reporting |
| ChromeDriver | Browser driver |
| Page Object Model (POM) | Maintainable automation design |

---

# 📊 Live Automation Report

The Extent Report generated during automation execution contains:

- Test execution summary
- Pass / Fail status
- Execution timeline
- Screenshots for failed tests

Reports are generated automatically after test execution.

---

# 📂 Project Structure

```
amazon-automation-task
│
├── reports
│   └── screenshots
│
├── src
│   │
│   ├── main
│   │   └── java
│   │       └── pages
│   │           ├── LoginPage.java
│   │           ├── ProductSearch.java
│   │           ├── CartPage.java
│   │           └── PaymentPage.java
│   │
│   └── test
│       └── java
│           │
│           ├── tests
│           │   └── EndToEndTest.java
│           │
│           ├── testcomponents
│           │   ├── BaseClass.java
│           │   └── Listenersclass.java
│           │
│           └── utilities
│               └── ScreenshotUtility.java
│
├── resources
│   └── config.properties
│
├── pom.xml
│
└── README.md
```

---

# 🏗 Framework Architecture

The framework follows a layered architecture:

```
Test Layer
   ↓
Page Object Layer
   ↓
Utility Layer
   ↓
WebDriver Layer
```

---

# Layers Explanation

## Test Layer
Contains all **TestNG test classes** responsible for executing automation scenarios.

## Page Object Layer
Contains **page classes representing UI pages** and stores **locators and actions**.

Example pages include:

- LoginPage
- ProductSearch
- CartPage
- PaymentPage

## Utility Layer
Reusable helper classes for:

- Screenshot capture
- Explicit waits
- Driver initialization
- Reporting utilities

## Reporting Layer

Extent Reports generate a **detailed HTML test report** including:

- Execution summary
- Pass / Fail status
- Screenshots on failure

---

# 🚀 Setup Instructions

## 1️⃣ Clone the Repository

```
git clone https://github.com/Karthik-0304/amazon-automation-task.git
```

---

## 2️⃣ Open the Project

Open the project in:

- IntelliJ IDEA  
OR  
- Eclipse

---

## 3️⃣ Install Dependencies

Run Maven to install required dependencies:

```
mvn clean install
```

Dependencies include:

- Selenium WebDriver
- TestNG
- Extent Reports
- commons-io

---

# ▶️ How to Run the Automation

### Method 1 — Run using TestNG

Run the test class directly:

```
EndToEndTest.java
```

---

### Method 2 — Run using Maven

```
mvn test
```

---

# 📊 Test Reports

After execution, Extent Reports are generated at:

```
reports/index.html
```

The report includes:

- Test execution summary
- Passed / Failed tests
- Execution time
- Screenshot on failure

---

# 📸 Screenshots

Screenshots are automatically captured for failed test cases and stored in:

```
reports/screenshots/
```

This helps in debugging failures quickly.

---

# 🌐 Application Under Test

Main website used for automation:

```
https://www.amazon.in
```

Automated workflows include:

- Product Search
- Product Selection
- Add to Cart
- Cart Validation
- Checkout Navigation
- Payment Page Verification

---

# 🧪 Test Coverage

The automation suite covers the following areas:

- Product search functionality
- Add to cart validation
- Cart page verification
- Checkout flow navigation
- Payment page loading verification
- UI interaction validation

---

# 🔮 Future Improvements

Planned improvements for the framework:

- CI/CD integration using GitHub Actions
- Cross-browser testing
- Parallel execution
- Data-driven testing
- Docker-based test execution

---

# 🧠 Automation Approach

The automation solution was designed using a **Page Object Model (POM) based framework** to ensure clean separation between test logic and page interactions.

Development approach:

- Explore Amazon user workflows
- Identify stable locators using browser developer tools
- Design modular framework using Page Object Model
- Implement automated test scenarios using TestNG
- Integrate Extent Reports for execution reporting
- Capture screenshots automatically on test failures

This approach improves **maintainability, scalability, and readability** of the automation framework.

---

# 📄 Solution Summary

This automation project validates key **e-commerce workflows on Amazon** using Selenium automation.

Objectives:

- Automate important user journeys
- Verify UI interactions
- Validate product search and cart functionality
- Generate execution reports for analysis

Key features include:

- Modular Page Object Model framework
- Structured TestNG execution
- Extent Reports integration
- Screenshot capture on failures

The framework is designed to be **scalable and extendable**, allowing additional automation scenarios to be added easily.

---

# 👨‍💻 Author

**Karthik S**

Automation Enthusiast  
Java | Selenium | TestNG | Automation Framework Development

GitHub  
https://github.com/Karthik-0304
