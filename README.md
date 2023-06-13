<h1>ToDo-SpringBoot-Application</h1>
<h3>This is the Spring Boot back-end part of my "ToDo" fullstack application. </h3>

## TODO Resource Details

All REST API are protected by JWT Authentication with Spring Security.

POST to http://localhost:5000/authenticate

```
{
  "username":"andriiv",
  "password":"password"
}
```

- GET - http://localhost:5000/andriiv/todos

```json
[
  {
    "id": 1,
    "username": "andriiv",
    "description": "Learn Java",
    "targetDate": "2023-06-13",
    "done": true
  },
  {
    "id": 2,
    "username": "andriiv",
    "description": "Learn Spring",
    "targetDate": "2023-06-14",
    "done": true
  },
  {
    "id": 3,
    "username": "andriiv",
    "description": "Learn React",
    "targetDate": "2023-06-15",
    "done": true
  },
  {
    "id": 4,
    "username": "andriiv",
    "description": "Find a job",
    "targetDate": "2023-06-16",
    "done": true
  }
]
```

#### Retrieve a specific todo

- GET - http://localhost:5000/andriiv/todos/1

```json
{
  "id": 1,
  "username": "andriiv",
  "description": "Learn Java",
  "targetDate": "2023-06-13",
  "done": true
}
```

#### Creating a new todo

- POST to http://localhost:5000/andriiv/todos with BODY of Request given below

```json
{
  "username": "andriiv",
  "description": "Learn to Drive a Car",
  "targetDate": "2023-06-30",
  "done": false
}
```

#### Updating a new todo

- http://localhost:5000/users/in28minutes/todos/10001 with BODY of Request given below

```json
{
  "id": 5,
  "username": "andriiv",
  "description": "Learn to Drive a Car",
  "targetDate": "2024-01-01",
  "done": false
}
```

#### Delete todo

- DELETE to http://localhost:5000/andriiv/todos/1