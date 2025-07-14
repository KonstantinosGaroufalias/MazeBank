Generated text
# MOP Calculator: Production Tracking for Greek Manufacturing

MOP Calculator is a modern Android application designed for tracking and analyzing production efficiency in Greek manufacturing environments. The app calculates Μ.Ο.Π. (Μέσος Όρος Παραγωγής) - Mean Output Production - by tracking daily production quantities and working hours across different shifts. [1, 2]

![App Preview](https://img.shields.io/badge/Status-Portfolio%20Ready-brightgreen)
![Android](https://img.shields.io/badge/Android-Kotlin-blue)
![UI](https://img.shields.io/badge/UI-Material%20Design%203-red)
![Database](https://img.shields.io/badge/Database-Room-yellow)

## 🎯 Project Overview

MOP Calculator is a native Android application designed to provide manufacturers with detailed insights into their production processes. Built with modern Android development practices, it focuses on ease of use, real-time data analysis, and clear visualization of production efficiency. The project demonstrates proficiency in:

-   **Native Android Development** with Kotlin.
-   **UI/UX Design** following Material Design 3 guidelines.
-   **Local Data Persistence** using Room.
-   **Data Export and Sharing** capabilities.

## 📱 Demo

![MOP Calculator Demo](./gifs/mop-calculator-demo.gif)

*View the app in action: tracking production, calculating MOP, and viewing statistics.*

## ✨ Features

### 📊 Production Tracking
*   **2Φ & 3Φ Production Types**: Separate tracking for two-sheet and three-sheet production. [1]
*   **Three Daily Shifts**: Supports Morning (Πρωϊνή), Afternoon (Απογευματινή), and Night (Βραδυνή) shifts for detailed shift analysis. [2]
*   **Hours & Quantity Input**: Intuitive input for production quantities and working hours per shift. [1]
*   **Real-time MOP Calculation**: Automatic calculation of Μ.Ο.Π. (Mean Output Production) as data is entered. [1, 2]

### 📈 Analytics & Statistics
*   **Monthly Statistics**: Comprehensive analysis of production data aggregated monthly. [3]
*   **Daily MOP Tracking**: Individual efficiency metrics for each day. [3]
*   **Combined Summary**: Unified view comparing 2Φ and 3Φ production performance. [3]
*   **Trend Analysis**: Visualize monthly averages and track performance trends over time. [3]
*   **Min/Max Tracking**: Identify the best and worst performing days for process improvement. [4]

### 📅 Calendar Integration
*   **Interactive Calendar**: Easy date selection and navigation for accessing historical data. [5]
*   **Month Selection**: Ability to view statistics for any specific month and year. [5]
*   **Visual Date Picker**: User-friendly interface for date-based data entry and retrieval. [5]

### 📤 Export & Sharing
*   **CSV Export**: Export monthly production data in a CSV format compatible with spreadsheet applications. [6]
*   **Email Integration**: Share reports and statistics easily via email or other messaging platforms. [6]
*   **Greek Formatting**: All exports include proper Greek labels and formatting for clarity in local environments. [6]

### 🎨 Modern UI/UX
*   **Material Design 3**: Adheres to the latest Android design system for a clean, modern, and consistent user experience. [7]
*   **Dark Theme**: Offers a professional dark theme with specific dark red accents for a distinct aesthetic. [7]
*   **Smooth Animations**: Implements modern animations and transitions for a fluid and engaging user interface. [7]
*   **Responsive Layout**: Optimized for a seamless experience across various phone and tablet screen sizes. [7]

## 🛠️ Technology Stack

### Core Technologies
*   **Kotlin**: The primary programming language for Android development. [1]
*   **Material Components**: For building the user interface with Material Design principles. [7]
*   **Room Persistence Library**: An abstraction layer over SQLite for robust database access. [8]
*   **FileProvider**: For secure sharing of exported files. [6]

### Supported Languages
*   **Greek (el)**: Primary language support. [2]
*   **English (en)**: Fallback language (currently under development/not fully functional). [2]

## 🚀 Installation & Setup

### Prerequisites
*   Android Studio (latest stable version recommended)
*   Basic understanding of Kotlin and Android development concepts.

### Local Development
1.  **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/mop-calculator.git
    ```
    *(Replace `https://github.com/yourusername/mop-calculator.git` with the actual repository URL.)*

2.  **Open in Android Studio:**
    *   Launch Android Studio.
    *   Select "Open an Existing Project" and navigate to the cloned repository's directory.

3.  **Build and Run:**
    *   Allow Android Studio to build the project and download dependencies.
    *   Connect an Android device or start an emulator.
    *   Click the "Run" button to launch the MOP Calculator app.

---

## Contributing

Contributions are welcome! If you have suggestions for improvements, new features, or have found a bug, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
