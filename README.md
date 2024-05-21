# Bubble Sort Console Application

## Overview
This Java application provides a console-based interface for working with a one-dimensional array. Users can enter array elements, sort the array in ascending or descending order using the bubble sort algorithm, and exit the application.

## Features
- **Enter Array Elements**: Allows the user to input the elements of the array.
- **Sort in Ascending Order**: Sorts the array elements in ascending order using the bubble sort algorithm.
- **Sort in Descending Order**: Sorts the array elements in descending order using the bubble sort algorithm.
- **Exit**: Exits the application.

## Class Structure
The application is structured into three main classes:
- Main
- Display
- Backend

## How to Run
1. **Compile the Java files**: Open your terminal or command prompt and navigate to the directory containing the Java files. Run the following command to compile the files:
   ```sh
   javac Main.java Display.java Backend.java
   ```
2. **Running the Application**: After compilation, run the application using the following command:
    ```sh
    java Main
    ```
## Usage

- **Enter Array Elements:** Choose option 1 and input the number of elements followed by the elements themselves.
- **Sort in Ascending Order:** Choose option 2 to sort the array in ascending order and display the sorted array.
- **Sort in Descending Order:** Choose option 3 to sort the array in descending order and display the sorted array.
- **Exit:** Choose option 4 to exit the application.

### Error Handling

The application ensures that the user inputs valid integers. If an invalid input is detected, the user is prompted to enter a valid integer.

### Notes

- The bubble sort algorithm is used for sorting the array. This algorithm is simple but not efficient for large arrays.
- Ensure that the array is initialized by entering its elements before attempting to sort it.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
   
