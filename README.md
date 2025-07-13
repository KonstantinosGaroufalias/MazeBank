# JavaFX Master Class: Create A Banking Application

This repository contains the project files and resources for the Udemy course **"JavaFX Master Class: Create A Banking Application"** by Patrick T. [1, 2, 4]

This course provides a comprehensive understanding of JavaFX, focusing on building a real-world banking application. It emphasizes best practices in software architecture, design patterns, and data persistence using databases. [1, 2, 3, 4]

## About the Course

You've arrived at the most comprehensive and latest JavaFX course. This course is designed to help you gain a concrete understanding of JavaFX and scale your Java knowledge. We focus on good design and industry best practices in software architecture. We regularly update this course with new material and projects. [1, 2, 3, 4]

The course aims to bridge the gap between basic programming concepts and building complex, high-level applications. [1, 2]

### What You'll Learn

*   Understand and apply JavaFX fundamentals. [1, 2, 4]
*   Best practices and software architecture. [1, 2, 4]
*   How to add data persistence using a database (e.g., SQLite). [1, 2, 5]
*   How to manage large applications and design for future expansion. [1, 2, 4]
*   JavaFX architecture and execution cycle. [1, 3]
*   Customizing and styling JavaFX controls and layouts. [1, 3]
*   Applying design patterns and data structures in JavaFX. [1, 3]

### Who This Course Is For

*   Java developers looking to build rich client applications. [1, 2, 4, 6]
*   Students who want to go beyond basic "Hello World" applications and build portfolio-worthy projects. [1, 2]
*   Anyone interested in learning JavaFX the right way and applying it to real-world scenarios. [1, 3, 4]

## Project Structure

A typical project structure for a JavaFX application might include:

*   `src/`
    *   `main/java/`
        *   `com/yourcompany/bankingapp/`
            *   `MainApp.java` (Entry point)
            *   `controllers/`
                *   `LoginController.java`
                *   `DashboardController.java`
                *   ...
            *   `model/`
                *   `Account.java`
                *   `Customer.java`
                *   ...
            *   `view/` (FXML files)
                *   `LoginView.fxml`
                *   `DashboardView.fxml`
                *   ...
            *   `util/`
                *   `DatabaseUtil.java`
            *   ...
    *   `main/resources/`
        *   `com/yourcompany/bankingapp/`
            *   `views/` (FXML files, CSS)
                *   `LoginView.fxml`
                *   `styles.css`
                *   ...

## Prerequisites

*   **Java Development Kit (JDK):** Version 8 or higher is recommended. [8]
*   **JavaFX:** Ensure JavaFX is properly set up in your project. For JDK 11+, JavaFX is not bundled and needs to be downloaded from the OpenJFX website and configured with your IDE or build tool. [8]
*   **IDE:** An Integrated Development Environment like IntelliJ IDEA or Eclipse is recommended. [8]
*   **(Optional) Database:** For data persistence, you might need a database like MySQL or SQLite installed and configured. [5, 8]

## Getting Started

1.  **Clone the repository:**
    ```bash
    git clone <repository_url>
    ```
    *(Replace `<repository_url>` with the actual GitHub repository URL if this were a project repo.)*

2.  **Set up JavaFX:** Follow the instructions for your IDE to properly configure JavaFX dependencies.

3.  **Database Setup (if applicable):**
    *   Install your chosen database (e.g., SQLite, MySQL).
    *   Create a database and necessary tables as per the course instructions.
    *   Configure the application's database connection settings.

4.  **Build and Run:**
    *   Open the project in your preferred IDE.
    *   Build the project to compile the source code and resolve dependencies.
    *   Run the main application class
