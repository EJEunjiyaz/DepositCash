Test Suite
---
- AccountPermitTest
    - Test account that is permit or not suspended account.
- DepositCashTest
    - Test amount of deposit in one transaction isn't greater than 30,000.
    - Test amount of deposit in one day per person isn't greater than 50,000.
- MinimumDepositCashTest
    - Test amount of deposit in one transaction isn't lower than 100.

Requirement
---
1. **Java SE Development Kit (JDK)** Version 11 or higher.
2. **Apache Maven** Version 3 or higher.

Installation
---
1. Install JDK and Add ‘JAVA_HOME’ Environment Variable
    - To install java, [download JDK installer](https://www.oracle.com/java/technologies/javase-downloads.html) and add/update the `JAVA_HOME` variable to JDK install folder.
2. Download Maven and add ‘MAVEN_HOME’ and ‘M2_HOME’ Environment Variables
    - Maven can be downloaded from this [location](https://maven.apache.org/download.cgi). Set the `M2_HOME` and `MAVEN_HOME` variable to maven installation folder. [Installation Guide](https://maven.apache.org/install.html) here.
3. Access to project directory. For example,
    ```
    /yourpath/depositCash $
    ```
4. Run the command
    ```
    mvn test
    ```
   All tests must be execute via this command, if you want to test only specific class, you may run
   ```
   mvn -Dtest=ClassNameTest test
   ```
   For example,
   ```
   mvn -Dtest=DepositCashTest test
   ```
   
Developer
---
- Vichyawat Nakarugsa
- Student ID: 6110545635
- Software and Knowledge Engineering
- Kasetsart University