# TestSphere

# **Demo Web Shop – Selenium Automation Suite**  

🚀 **End-to-End Automated Testing for [Demo Web Shop](https://demowebshop.tricentis.com/)** utilizing **Selenium WebDriver, Java, TestNG, and Maven** to validate functionality, performance, and user interaction across the platform.  

---

## 🔹 **Project Overview**  
This repository features a robust **Page Object Model (POM)-based test automation framework** for automating critical workflows on Demo Web Shop. The suite covers a comprehensive set of scenarios, from user login to checkout, ensuring smooth interactions and accurate data handling in the application.

---

## 🛠 **Tech Stack & Tools Used**  
- **Programming Language**: Java  
- **Automation Framework**: Selenium WebDriver  
- **Test Framework**: TestNG  
- **Build Tool**: Maven  
- **Reporting**: Extent Reports, TestNG Reports  
- **Data-Driven Testing**: Apache POI (Excel)  
- **Cross-Browser Testing**: Chrome, Firefox, Edge  

---

## 📌 **Key Automation Features**  

### **1️⃣ Functional Testing**  
- **User Authentication**: Seamless login/logout flow, including password reset and error handling.  
- **Product Search & Navigation**: Validating search functionality, filters, and category navigation.  
- **Shopping Cart & Checkout**: Testing add/remove items, quantity adjustments, and order validation.  
- **Payment Gateway**: Handling payment processing, error handling, and order confirmation.  
- **Wishlist & Comparison**: Validating item persistence in wishlist and compare features.

### **2️⃣ UI & Cross-Browser Testing**  
- Testing layout integrity and responsiveness across **Chrome, Firefox, and Edge** to ensure compatibility.  

### **3️⃣ Page Object Model (POM) Architecture**  
- Promotes **reusability** and **maintainability** by separating test logic and UI locators.  
- Facilitates easy updates to UI elements while keeping test scripts clean and modular.

### **4️⃣ Data-Driven Testing (DDT)**  
- Efficiently manage test data using **Apache POI** to drive tests with multiple datasets, enhancing test coverage and validation.

### **5️⃣ Test Execution & Reporting**  
- Run tests in **parallel** using TestNG to speed up execution.  
- Generate **real-time reports** with **Extent Reports** and **TestNG Reports** for easy tracking of results and performance metrics.

---

## 📂 **Project Structure**  
```
📂 DemoWebShopAutomation
 ┣ 📂 src/main/java
 ┃ ┣ 📂 pages              # Page Object Model (POM) Classes
 ┃ ┣ 📂 utils              # Utility Functions (Excel, Reporting, Configurations)
 ┣ 📂 src/test/java
 ┃ ┣ 📂 testcases          # TestNG Test Scripts
 ┣ 📂 reports              # Extent Reports & Logs
 ┣ 📜 pom.xml              # Maven Dependencies
 ┣ 📜 testng.xml           # Test Execution Configuration
 ┣ 📜 README.md            # Project Documentation
```

---

## 🔥 **How to Run the Tests**  

1️⃣ **Clone the repository:**  
```bash
git clone https://github.com/shubhampancheshwar9503/DemoWebShopAutomation.git
```

2️⃣ **Navigate to the project directory:**  
```bash
cd DemoWebShopAutomation
```

3️⃣ **Install dependencies:**  
```bash
mvn clean install
```

4️⃣ **Run the test suite using TestNG:**  
```bash
mvn test
```

5️⃣ **View test reports:**  
- Reports are generated in the `/reports/` folder as **Extent Reports** for real-time test results.  

---

## 📌 **Contributions & Issues**  
🔹 Contributions are welcome! Feel free to **fork, star ⭐, and raise issues**. Suggestions for improvement are always appreciated.  

---

## 📞 **Contact**  
👤 **Shubham Pancheshwar**  
📧 [pancheshwarshubham1234@gmail.com](mailto:pancheshwarshubham1234@gmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/shubham9503/) | [GitHub](https://github.com/shubhampancheshwar9503/)  

---
