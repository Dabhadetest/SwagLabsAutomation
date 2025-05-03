# SwagLabs Automation Framework

🚀 Objective

This project is designed to automate functional UI test cases for [Swag Labs](https://www.saucedemo.com/) using Selenium WebDriver with Java, TestNG, and Page Object Model (POM). It includes logging with Log4j, reporting with TestNG default reports, and basic retry and parallel execution features.


🖥️ Setup Instructions:

Prerequisites
- Java 17 or above installed and configured (`java -version`)
- Chrome browser
- Maven installed (`mvn -version`)
- Eclipse/IDEA or any preferred IDE
   - Ensure that Java, Maven, and ChromeDriver are properly set up.
   - Clone the repository and install dependencies via Maven.
   
---

📁 Project Structure:
   - Includes a description of the folder and file structure, such as where the Page Object Model classes, test classes, and utility classes are located.

SwagLabsAutomation/
│
├── pom.xml                                    # Maven Project Object Model file (dependencies)
│
├── src/
│   └── test/
│       └── java/
│           ├── base/
│           │   └── BaseTest.java               # BaseTest class for WebDriver setup
│           ├── pages/
│           │   ├── CartPage.java               # CartPage class (Page Object Model)
│           │   ├── CheckoutCompletePage.java   # CheckoutCompletePage class (POM)
│           │   ├── CheckoutPage.java           # CheckoutPage class (POM)
│           │   ├── LoginPage.java              # LoginPage class (POM)
│           │   └── ProductsPage.java           # ProductsPage class (POM)
│           ├── tests/
│           │   ├── LoginTest.java              # Test case for Login
│           │   ├── CartTest.java               # Test case for Cart actions
│           │   └── CheckoutTest.java           # Test case for Checkout flow
│           └── utils/
│               └── RetryAnalyzer.java          # RetryAnalyzer class for retry logic
│
└── target/                                     # Maven's build output folder
    └── screenshots/                           # Screenshots folder (if test fails)


🧪 Test Scenarios Covered

1. ✅ Login with valid credentials
2. ❌ Login with invalid credentials
3. 🛒 Add a product to the cart
4. 📦 Complete checkout process

---

⚙️ Tech Stack

- Language:Java 17+
- Build Tool:Maven
- Automation:Selenium WebDriver
- Test Framework:TestNG
- Design Pattern:Page Object Model (POM)
- Reporting:TestNG Reports
- Logging:Log4j 2
- Retry Mechanism:TestNG RetryAnalyzer
- Parallel Execution:TestNG XML configuration

---

📦 Dependencies

Managed in `pom.xml`:
						- `selenium-java`
						- `testng`
						- `log4j-api`, `log4j-core`
						- `extentreports` (optional for enhancement)

---

 ✅ Summary of Framework Design Decisions:
   
   The framework is built using Selenium WebDriver, TestNG, Page Object Model (POM), and includes features like logging, retry logic, and screenshot capture on failure.
  
TestNG: Chosen for its annotations, suite management, parallel execution, and reporting.
Page Object Model (POM): Ensures maintainable and reusable code by separating test logic from UI locators/actions.
Selenium WebDriver: Automates browser actions; ChromeDriver used as default with option for others.
Retry Logic: Implemented using `IRetryAnalyzer` to automatically re-run flaky tests.
Logging: Uses `java.util.logging` (can upgrade to Log4j/SLF4J) to track test flow and issues.
Screenshots on Failure: Captures browser state on test failure via TestNG listeners.
Parallel Execution: Enabled using TestNG’s `testng.xml` with `thread-count` for faster runs.
Maven: Manages project dependencies and build lifecycle for easy setup and execution.
Reporting: Default TestNG reports included; framework extensible for ExtentReports or Allure.


Thanks!!

