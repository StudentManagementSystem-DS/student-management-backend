# StudentManagementSystem-Backend

Welcome to the Student Management System Backend project!

The Student Management project is a Spring Boot application that allows users to manage student information. It provides features such as creating, editing, viewing, and deleting student records.

## Functional Requirements

### Entities:
- **Students**: Each student has a unique ID, name, email, and other relevant details.
- **User**: User can add, view, edit, and delete student records.

### Features:
- **Add Students**: Users can add new students to the system.
- **View Students**: Users can view a list of all students.
- **Edit Students**: Users can edit existing student information.
- **Delete Students**: Users can delete students from the system.
- **Search Students**: Users can search for students by name or other criteria.

## Endpoints
- **GET /students**: View all students.
- **GET /students/student/{id}**: View a single student by ID.
- **POST /students**: Add a new student.
- **PUT /students/update{id}**: Edit an existing student.
- **DELETE /students/delete{id}**: Delete a student by ID.

## Technologies Used
- **Spring Boot**: Framework for building Java-based applications.
- **Spring Data JPA**: For data persistence.
- **Spring Web**: For building web applications.
- **MySQL**: Database for storing student information.
- **Lombok**: Library for reducing boilerplate code.
- **Postman**: Tool for testing API endpoints.

## Available Scripts

In the project directory, you can run:

### `mvn spring-boot:run`
Runs the app in the development mode.\
Open [http://localhost:9192](http://localhost:9192) to view it in your browser.

The application will restart when you make changes.\
You may also see any errors in the console.

### `mvn clean install`
Builds the app for production.\
It compiles the code and packages it into a JAR file.

## Installation
To install and run the Student Management Backend project locally, follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/StudentManagementSystem-DS/student-management-backend.git
    ```

2. Navigate to the project directory:
    ```sh
    cd student-management-backend
    ```

3. Install the dependencies and build the project:
    ```sh
    mvn clean install
    ```

4. Start the application:
    ```sh
    mvn spring-boot:run
    ```

5. The application will start on `http://localhost:9192`.

## Usage
Once the application is up and running, you can perform the following actions using Postman or any other API testing tool:

- **Add Students**: Send a POST request to `http://localhost:8080/students` with the student details in the request body.
- **View Students**: Send a GET request to `http://localhost:8080/students` to view the list of students.
- **View a Single Student**: Send a GET request to `http://localhost:8080/students/{id}` to view a single student by ID.
- **Edit Students**: Send a PUT request to `http://localhost:8080/students/{id}` with the updated student details in the request body.
- **Delete Students**: Send a DELETE request to `http://localhost:8080/students/{id}` to remove a student.
- **Search Students**: Use the search functionality to find students by name or other criteria.

