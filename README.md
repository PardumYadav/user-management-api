# user-management-api
This project is a simple Spring Boot RESTful web service that allows you to:  - Create new users - View all users - View a specific user by ID - Update user details - Delete users


## 🚀 Features

- Create new users
- Retrieve all users
- Retrieve user by ID
- Update user details
- Delete a user
- Data persisted using MySQL (or H2 for development)

---

## 🧑‍💻 Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- MySQL 
- Maven
- RESTful APIs

---

## 📦 API Endpoints

| Method | Endpoint           | Description          |
|--------|--------------------|----------------------|
| POST   | `/api/users`       | Create a new user    |
| GET    | `/api/users`       | Get all users        |
| GET    | `/api/users/{id}`  | Get user by ID       |
| PUT    | `/api/users/{id}`  | Update user          |
| DELETE | `/api/users/{id}`  | Delete user by ID    |

---

## 🧾 Sample User JSON

```json
{
  "name": "Rohan",
  "lastName": "Yadav",
  "email": "yadav.pardum360@gmail.com",
  "mobile": 1800025482
}

