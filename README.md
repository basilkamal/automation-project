# SauceDemo Automation Framework

A complete test automation framework built with **Selenium WebDriver**, **Java**, **TestNG**, and **Cucumber (BDD)**, targeting the [SauceDemo](https://www.saucedemo.com) e-commerce demo site.

![Test Status](https://img.shields.io/badge/tests-passing-brightgreen)
![Java](https://img.shields.io/badge/Java-21-orange)
![Selenium](https://img.shields.io/badge/Selenium-4.25.0-green)

## 📊 Live Test Report

The latest Allure test report is automatically published here:
**[View Live Report](https://basilkamal.github.io/automation-project/)**

## 🏗️ Architecture

This framework follows the **Page Object Model (POM)** design pattern, with additional layers for maintainability:

- **Page Objects** — one class per page (`LoginPage`, `ProductsPage`)
- **Component Objects** — reusable UI components shared across pages (`CartComponent`)
- **Fluent Interface Pattern** — chainable methods for readable test steps
- **BaseTest** — centralized WebDriver lifecycle management
- **Cucumber (BDD)** — Gherkin feature files with Step Definitions for business-readable scenarios

## 🛠️ Tech Stack

| Category | Tool |
|---|---|
| Language | Java 21 |
| Build Tool | Maven |
| Test Framework | TestNG |
| BDD Framework | Cucumber |
| Browser Automation | Selenium WebDriver 4.25.0 |
| Driver Management | WebDriverManager |
| Reporting | Allure Report |
| CI/CD | GitHub Actions |

## ✅ Features

- Page Object Model with Fluent interface
- Cucumber BDD scenarios (Gherkin)
- Explicit waits for reliable element interaction
- Automatic retry mechanism for flaky test resilience
- Automatic screenshot capture on test failure
- Allure reporting with steps, severity levels, and environment info
- Fully automated CI/CD pipeline (GitHub Actions):
    - Runs on every push and daily via scheduled cron job
    - Headless Chrome execution
    - Automatic report publishing to GitHub Pages
    - Email notifications with report link

## 🚀 Getting Started

### Prerequisites
- Java 21 (JDK)
- Maven
- Git

### Clone the repository
```bash
git clone https://github.com/basilkamal/automation-project.git
cd automation-project
```

### Run all tests
```bash
mvn test
```

### Generate and view the Allure report locally
```bash
allure generate allure-results --clean -o allure-report
allure open allure-report
```

## 📁 Project Structure