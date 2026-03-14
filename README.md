```markdown
# 🛒 Amazon Automation Testing Project

## 📌 Project Overview
This project is an **End-to-End Automation Testing framework** built using **Java, Selenium WebDriver, and TestNG**.

The automation simulates a real user workflow on an e-commerce website including:

🔍 Searching for a product  
📦 Selecting the product  
🛒 Adding the product to the cart  
💳 Navigating to the payment page  
✅ Reaching the order confirmation page  

The framework follows the **Page Object Model (POM)** design pattern to keep automation code **clean, reusable, and maintainable**.

---

# 🚀 Technologies Used

| Technology | Purpose |
|------------|---------|
| ☕ Java | Programming language |
| 🌐 Selenium WebDriver | Browser automation |
| 🧪 TestNG | Test execution framework |
| 📦 Maven | Dependency management |
| 💻 IntelliJ IDEA | Development IDE |
| 🔗 Git & GitHub | Version control |

---

# 🏗 Framework Design

This project follows the **Page Object Model (POM)** architecture.

Each page in the application has its own class containing:

✔ Web element locators  
✔ Page actions  
✔ Reusable methods  

This improves **code readability, scalability, and maintenance**.

---

# 📂 Project Structure

```

amazon-automation-task
│
├── 📁 src
│   │
│   ├── 📁 main
│   │   └── 📁 java
│   │       └── 📁 pages
│   │           ├── 📄 ProductSearch.java
│   │           ├── 📄 AddToCart.java
│   │           ├── 📄 PaymentPage.java
│   │           └── 📄 OrderConfirmation.java
│   │
│   └── 📁 test
│       └── 📁 java
│           └── 📁 tests
│               └── 📄 EndToEndTest.java
│
├── 📄 pom.xml
└── 📄 testng.xml

````

---

# 🔄 Test Flow

The automated test performs the following steps:

1️⃣ Launch the browser using Selenium WebDriver  
2️⃣ Navigate to the website  
3️⃣ Search for a product  
4️⃣ Select a product from the search results  
5️⃣ Add the product to the cart  
6️⃣ Proceed to the payment page  
7️⃣ Navigate to the order confirmation page  

---

# ▶️ How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Karthik-0304/amazon-automation-task.git
````

### 2️⃣ Open the Project

Open the project using **💻 IntelliJ IDEA**.

---

### 3️⃣ Install Dependencies

Maven will automatically download dependencies from:

```
pom.xml
```

---

### 4️⃣ Run the Test

Run the test class:

```
EndToEndTest.java
```

or run using:

```
testng.xml
```

---

# ⭐ Key Features

✔ End-to-End automation workflow
✔ Selenium WebDriver automation
✔ TestNG test execution
✔ Page Object Model framework
✔ Maven dependency management

---

# 🔮 Future Improvements

📊 Integrate Extent Reports
📸 Capture screenshots on failure
📜 Add logging framework
⚡ Enable parallel test execution
🥒 Integrate Cucumber BDD

---

# 👨‍💻 Author

**Karthik S**

🔗 GitHub:
https://github.com/Karthik-0304

---

# 📖 Note

This project was created for **automation testing practice and learning purposes**.

```
```
