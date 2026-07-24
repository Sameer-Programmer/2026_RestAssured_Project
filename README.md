# 2026_RestAssured_Project 🚀

![Java](https://img.shields.io/badge/Java-17%2B-blue.svg) ![Maven](https://img.shields.io/badge/Maven-3.x-red.svg) ![Rest Assured](https://img.shields.io/badge/Rest%20Assured-5.x-green.svg) ![TestNG](https://img.shields.io/badge/TestNG-7.x-orange.svg)

## Overview ✨

This project serves as a comprehensive demonstration and practice ground for API automation testing using **Rest Assured**, a popular Java library for testing RESTful web services. It covers a wide array of features, from basic HTTP requests to advanced authentication mechanisms, data serialization, and schema validation. The project is structured to provide clear examples of how to interact with various API endpoints, primarily using the [GoRest API](https://gorest.co.in/) for practical scenarios. It's an excellent resource for anyone looking to master API testing with Java.

## Key Features 🔑

*   **CRUD Operations**: Demonstrates **C**reate, **R**ead, **U**pdate, and **D**elete operations against REST APIs. ➕📖✍️❌
*   **HTTP Methods**: Comprehensive examples for GET, POST, PUT, and DELETE requests. 🌐
*   **Authentication**: Covers different authentication types including Basic Auth, Bearer Token, OAuth, and API Key authentication. 🔒
*   **JSON and XML Handling**: Includes examples for parsing JSON and XML responses, as well as JSON and XML schema validation. 📄
*   **Serialization and Deserialization**: Shows how to convert Java objects to JSON (serialization) and JSON to Java objects (deserialization) using POJO classes. 🔄
*   **Data-Driven Testing**: Utilizes external JSON files and the [Faker library](https://github.com/DiUS/java-faker) for dynamic test data generation. 📊
*   **Test Framework**: Built with [TestNG](https://testng.org/doc/) for robust test organization, execution, and reporting. ✅
*   **Logging**: Comprehensive logging of requests and responses for effective debugging. 📝

## Technologies Used 🛠️

*   **Java**: Programming Language (JDK 17+)
*   **Maven**: Build Automation Tool (3.x)
*   **Rest Assured**: API Automation Library (5.x)
*   **TestNG**: Testing Framework (7.x)
*   **Jackson Databind**: For JSON processing (Serialization/Deserialization)
*   **Gson**: For JSON processing
*   **JSON Path**: For navigating JSON structures
*   **JSON Schema Validator**: For validating JSON responses against a schema
*   **ScribeJava APIs**: For OAuth authentication
*   **JavaFaker**: For generating realistic test data

## Project Structure 📁

The project follows a standard Maven directory structure, making it easy to navigate and understand:

```
2026_RestAssured_Project/
├── pom.xml                         # ⚙️ Maven Project Object Model file
├── src/
│   ├── main/
│   │   └── java/                   # 📦 Main application code (if any, currently minimal)
│   └── test/
│       ├── java/                   # 🧪 Test source code
│       │   ├── Package_Day1/       # ➡️ Basic HTTP requests, CRUD, assertions
│       │   ├── Package_Day2/       # ➡️ Data-driven testing, JSON file usage
│       │   ├── Package_Practice/   # ➡️ Practice assignments
│       │   ├── Utils/              # ➡️ Utility classes like DataGenerator
│       │   ├── Week1_SchoolOfBasics/ # ➡️ Fundamental Rest Assured concepts
│       │   ├── Week2DemoSerialization/ # ➡️ Serialization and Deserialization examples
│       │   └── Week3AuthenticationTopics/ # ➡️ Various authentication methods
│       └── Resources/              # 🗄️ Test resources (JSON schemas, XML schemas)
└── JsonFiles/                      # 📄 External JSON payload files for tests
└── AboutProject/                   # ℹ️ Project notes and documentation
```

## Getting Started 🚀

To get a local copy up and running, follow these simple steps.

### Prerequisites ✅

Ensure you have the following installed:

*   **Java Development Kit (JDK)**: Version 17 or higher
*   **Apache Maven**: Version 3.x
*   An IDE like IntelliJ IDEA or Eclipse (optional, but highly recommended for development)

### Installation ⬇️

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/Sameer-Programmer/2026_RestAssured_Project.git
    cd 2026_RestAssured_Project
    ```

2.  **Build the project with Maven:**

    ```bash
    mvn clean install
    ```

### Running Tests ▶️

All tests are written using TestNG. You can execute them from your IDE or using Maven from the command line:

```bash
mvn test
```

To run specific test classes or methods, you can configure your `testng.xml` or use Maven command-line options for more granular control.

## Configuration ⚙️

Some tests, particularly those interacting with `gorest.co.in`, require a Bearer Token for authentication. This token is currently hardcoded within test files (e.g., `Package_Day1/Test4.java` and `Package_Day2/Test2.java`).

**⚠️ Important**: For actual usage and security best practices, it is highly recommended to replace the hardcoded token with an environment variable or a secure configuration management system. You can obtain a new token from [GoRest](https://gorest.co.in/developers/)

## Examples 💡

Here are some key examples to help you get started and understand the project's capabilities:

*   **Basic CRUD Operations**: See `src/test/java/Package_Day1/Test4.java` for an end-to-end example. 🔄
*   **Data-Driven Testing with JSON**: Refer to `src/test/java/Package_Day2/Test2.java` and `JsonFiles/File2.json`. 📊
*   **Basic Authentication**: Check `src/test/java/Week3AuthenticationTopics/Test001BasicAuth.java`. 🔐
*   **Serialization/Deserialization**: Explore `src/test/java/Week2DemoSerialization/Basics14_Serialization_AND_Deserilization.java` and `src/test/java/Week2DemoSerialization/DemoPojoPostRequest.java`. ↔️
*   **JSON Schema Validation**: An example is available in `src/test/java/Week1_SchoolOfBasics/Basics12_JsonResonseSchemaValidation.java`. ✅

## Contributing 🤝

Contributions are welcome! If you have suggestions for improvements or new features, please feel free to fork the repository, make your changes, and submit a pull request. We appreciate your input! 🙏

## License 📄

Distributed under the MIT License. See the `LICENSE` file for more information. ⚖️

## Contact 📧

Sameer - [Your Email/GitHub Profile Link (Optional)]

Project Link: [https://github.com/Sameer-Programmer/2026_RestAssured_Project](https://github.com/Sameer-Programmer/2026_RestAssured_Project)
