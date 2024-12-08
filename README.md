# Lab 3
### Author: Anton Bur, Group IP-22, Variant #3

---

### Variant Calculations
| Parameter | Formula  | Result |  
|-----------|----------|--------|  
| **C11**   | `3 % 11` | 3      |  

---

### Task Variants
| C11 | Task Variant                                           |  
|-----|-------------------------------------------------------|  
| 3   | Define a class for a sea boat consisting of at least 5 fields. |  

---

### How to Run the Project

#### Prerequisites
Ensure [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) is [installed](https://maven.apache.org/download.cgi) on your computer.

#### Steps to Execute
1. Clone the repository:
   ```bash  
   git clone https://github.com/AntonIO-OI/Java-Lab3
   cd Java-Lab3
   ```  

2. Build the project (this will also run unit tests):
   ```bash  
   mvn package  
   ```  

3. Run the project:
   ```bash  
   mvn clean compile exec:java  
   ```  

4. Run unit tests:
   ```bash  
   mvn test  
   ```  

### How to Generate Javadoc

#### 1. Using `javadoc` Command:
1. Open a terminal in the project root directory.
2. Run the following command to generate the Javadoc:
   ```bash
   javadoc -d docs -sourcepath src/main/java -subpackages vegetable
   ```
3. After the process completes, navigate to the `/docs` folder to view the generated documentation.

#### 2. Using Maven:
1. Open a terminal in the project root directory.
2. Run the following Maven command to generate the Javadoc:
   ```bash
   mvn javadoc:javadoc
   ```
3. Once the process is finished, navigate to the `/target/reports/apidocs` folder to access the generated documentation.
