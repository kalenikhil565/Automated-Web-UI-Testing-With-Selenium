# Automated Web UI Testing With Selenium

## Project Duration: Jan 2025 - Mar 2025

## Overview
This project focuses on automating web UI testing using Selenium WebDriver and TestNG. It covers login functionality, form validation, and UI interactions like hover and drag-and-drop. The framework supports parallel testing and generates detailed reports.

## Technologies Used
- **Selenium WebDriver** - For browser automation
- **TestNG** - Test framework for managing execution and reports
- **Java** - Programming language for test scripts
- **Maven** - Dependency management and build tool

## Features
- Automated **Login & Authentication** tests
- **Form validation** automation
- UI interactions like **hover, drag-and-drop, and scrolling**
- **Parallel execution** for optimized test runs
- **Detailed reporting** with logs and screenshots

## Project Setup
### Prerequisites
Ensure you have the following installed:
- Java (JDK 8 or above)
- Maven
- Selenium WebDriver
- TestNG plugin (if using Eclipse/IntelliJ)
- ChromeDriver / GeckoDriver (as per the browser being used)

### Installation Steps
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd selenium-ui-testing
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```
3. Run test cases:
   ```sh
   mvn test
   ```

## Project Structure
```
selenium-ui-testing/
│── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/
│   │   │   │   ├── LoginTest.java
│   │   │   │   ├── FormValidationTest.java
│   │   │   │   ├── UIInteractionTest.java
│   │   │   ├── base/
│   │   │   │   ├── BaseTest.java
│   │   │   ├── utilities/
│   │   │   │   ├── TestUtil.java
│── pom.xml (Maven dependencies)
│── testng.xml (Test suite configuration)
```

## Test Execution
### Running Tests with TestNG
Run all test cases:
```sh
mvn test
```
Run specific test class:
```sh
mvn test -Dtest=LoginTest
```
Run with parallel execution:
```sh
mvn test -DsuiteXmlFile=testng.xml
```

## Reporting
The test execution reports are generated under:
```
target/surefire-reports/index.html
```
Open the report in a browser to view test results.

## Future Enhancements
- Integration with **CI/CD pipelines (Jenkins/GitHub Actions)**
- Extend test coverage for more UI elements
- Improve reporting with screenshots for failed tests

## Contributors
- **Nikhil Kale** (Automation Engineer)

## License
This project is open-source and available under the MIT License.
