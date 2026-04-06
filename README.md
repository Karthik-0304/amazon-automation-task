# 🛍️ Amazon Product Search Automation

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/>
  <img src="https://img.shields.io/badge/TestNG-Runner-red?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
  <img src="https://img.shields.io/badge/POM-Design%20Pattern-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/ExtentReports-HTML-blueviolet?style=for-the-badge"/>
</p>

<p align="center">
  A complete end-to-end automation project for the <strong>Amazon</strong> e-commerce platform, built with <strong>Java</strong>, <strong>Selenium WebDriver</strong>, and <strong>TestNG</strong>. Automates the full user purchase journey from product search through to order confirmation.
</p>

---

## 📑 Table of Contents
- [Overview](#-overview)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure)
- [Automated Test Flow](#-automated-test-flow)
- [Prerequisites](#-prerequisites)
- [Setup & Run](#-setup--run)
- [Key Features](#-key-features)
- [Future Improvements](#-future-improvements)

---

## 🔍 Overview

This project automates an end-to-end user journey on an e-commerce website, simulating a real customer's interaction from landing on the homepage through completing a purchase. The framework is built using the **Page Object Model (POM)** design pattern to ensure test code is clean, reusable, and easy to maintain.

**Languages:** Java 61.5% · HTML 38.5%

---

## 🛠 Tech Stack

| Technology         | Purpose                          |
|--------------------|----------------------------------|
| Java               | Core programming language        |
| Selenium WebDriver | Browser automation               |
| TestNG             | Test execution framework         |
| Maven              | Build and dependency management  |
| ExtentReports      | HTML test reports                |
| IntelliJ IDEA      | Development IDE                  |
| Git & GitHub       | Version control                  |

---

## 📁 Project Structure

```
amazon-automation-task/
├── src/
│   ├── main/java/pages/
│   │   ├── ProductSearch.java       # Search functionality
│   │   ├── AddToCart.java           # Cart interactions
│   │   ├── PaymentPage.java         # Payment page actions
│   │   └── OrderConfirmation.java   # Order confirmation validation
│   └── test/java/tests/
│       └── EndToEndTest.java        # Main test class
├── reports/                         # Generated HTML reports
├── pom.xml
└── testng.xml
```

---

## 🔄 Automated Test Flow

The test suite automates the following complete user journey:

1. **Launch** — Open the browser and navigate to the website
2. **Search** — Enter a product search query
3. **Select** — Click on a product from the search results
4. **Add to Cart** — Add the selected product to the shopping cart
5. **Proceed** — Navigate to the payment/checkout page
6. **Confirm** — Validate the order confirmation page

---

## ✅ Prerequisites

- Java JDK 17+
- Apache Maven 3.8+
- Google Chrome (latest)
- IntelliJ IDEA or Eclipse

---

## ⚙️ Setup & Run

**1. Clone the repository**
```
git clone https://github.com/Karthik-0304/amazon-automation-task.git
cd amazon-automation-task
```

**2. Open in IntelliJ IDEA**

Maven will automatically resolve and download all dependencies from `pom.xml`.

**3. Run the tests**

Option A — Maven command:
```
mvn clean test
```

Option B — Run `EndToEndTest.java` directly from the IDE

Option C — Run via TestNG XML:
```
mvn test -DsuiteXmlFile=testng.xml
```

---

## 💡 Key Features

- ✅ End-to-end purchase workflow automation
- ✅ Page Object Model for maintainable, reusable code
- ✅ Clean separation of locators and test logic
- ✅ TestNG for structured test execution and assertions
- ✅ ExtentReports HTML report generation
- ✅ Maven for dependency management

---

## 🔮 Future Improvements

- 📊 Enhanced Extent Reports with screenshots on failure
- 🥒 Integrate Cucumber BDD for Gherkin-style scenarios
- ⚡ Enable parallel test execution
- 📜 Add Log4j logging framework
- 🔁 CI/CD integration with GitHub Actions

---

<p align="center">Made with ❤️ by <a href="https://github.com/Karthik-0304">Karthik Sivakumar</a> · <a href="https://www.linkedin.com/in/karthik-s-772930248/">LinkedIn</a></p>
