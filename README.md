# Maven Learning Repository
Welcome to my Maven Learning Repository! This repository is dedicated to documenting and experimenting with Apache Maven, a powerful build automation tool primarily used for Java projects. Throughout this journey, I will be learning about dependency management, project structure, build lifecycles, and various Maven plugins while progressing through different exercises and small projects. This README will guide you through the project structure, installation instructions, and provide a roadmap of my Maven learning journey.

This repository consists of various Maven projects I am working on to understand different concepts of Maven. Each project is designed to progressively explore Maven's features, from basic project setup to more advanced dependency management and plugin integration.


## Installation Instructions
Follow these steps to set up Maven and run the projects locally.

1. Install Java Development Kit (JDK)
Maven requires JDK to compile Java code. You can download and install the latest JDK from Oracle's website or use OpenJDK.

2. Install Apache Maven
You can download Maven from the official website:
[Apache Maven Downloads](https://maven.apache.org/download.cgi)

* For macOS (using Homebrew):
```
brew install maven
```

* For Linux (using APT):
```
sudo apt update
sudo apt install maven
```
* For Windows:<br>
  * Download the latest Maven binary zip file.
  * Extract it to a directory.
  * Add the Maven bin/ directory to your system's PATH variable.

3. Verify Maven Installation
Run the following command to verify Maven is installed correctly:
```
mvn --version
```
You should see output similar to:
```
Apache Maven 3.8.x (some version)
Maven home: /path/to/maven
Java version: 11.0.x, vendor: Oracle Corporation
```

4. Clone the Repository
Clone the repository using Git:
```
git clone https://github.com/Hrk84ya/Maven.git
```
5. Navigate to Project Directory
Once the repository is cloned, navigate into any project directory. For example, for calculator:

```
cd <Name of the repository>/calculator
```
6. Build the Project
Use Maven to build the project:
```
mvn clean install
```
This will compile the Java source code, run any tests, and package the project into a JAR file. The output can be found in the target/ directory.
