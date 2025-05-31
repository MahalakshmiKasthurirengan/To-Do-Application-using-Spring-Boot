
# 📝 To-Do Application

A simple and intuitive To-Do Application built using **Spring Boot**, **MySQL**, **Thymeleaf**, **Bootstrap**, and **HTML/CSS**.

This app allows users to:
- Add tasks
- View all tasks
- Update tasks
- Delete tasks

## 🚀 Tech Stack

- **Backend**: Spring Boot
- **Frontend**: Thymeleaf + HTML + CSS + Bootstrap
- **Database**: MySQL

---

## 📁 Project Structure

```

src/
├── main/
│   ├── java/
│   │   └── com/example/todoapp/    # Java source code
│   └── resources/
│       ├── templates/              # Thymeleaf HTML files
│       ├── static/                 # CSS, JS, Bootstrap
│       └── application.properties  # Configuration

```

---

## ⚙️ Prerequisites

Before running the application, ensure you have the following installed:

- Java 17 or above
- Maven
- MySQL Server
- Git

---

## 🛠️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/todo-application-springboot.git
cd todo-application-springboot
````

### 2. Configure MySQL Database

* Open MySQL Workbench or terminal and create the database:

```sql
CREATE DATABASE todoapp;
```

* Open `src/main/resources/application.properties` and ensure your DB credentials are correct:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=root
spring.datasource.password=Maha@2006
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

> ⚠️ Replace the `username` and `password` as per your local setup.

---

### 3. Build the Project

```bash
mvn clean install
```

### 4. Run the Application

```bash
mvn spring-boot:run
```

The application will be accessible at:

```
http://localhost:8080
```

---

## ✨ Features

* Add a new task with title and description
* View all your tasks in a clean Bootstrap-styled table
* Edit and update existing tasks
* Delete tasks with a single click
* Responsive UI using Bootstrap

---

## 🧪 Test

You can test CRUD operations from the homepage itself using simple HTML forms styled with Bootstrap and processed via Thymeleaf.

---

## 📸 Screenshots

(You can include screenshots of the UI here if desired.)

---

## 📌 License

This project is open-source and available under the MIT License.

---

## 🙌 Contribution

Feel free to fork the repo, raise issues, or create pull requests.

---

## 🤝 Connect

For any queries or suggestions, feel free to contact \[[mahalakshmikasthurirengan22@gmail.com](mailto:mahalakshmikasthurirengan22@gmail.com)]

```

---

Let me know if you'd like the Thymeleaf HTML template example or a GitHub repo structure template as well!
```
