# ANZ Assignment

### Development Approach
- Created project scaffolding with [Spring Starter](https://start.spring.io/)
- Followed `API first` approach. Created openapi definitions for 2 apis.
    - Generated Java code from API spec.
- Not implemented 
    - Validations for incoming data.
    - Authentication and Authorisation check.
    - Real entities with JPA. Just using a @data class to annotate entities.

### How to build 
Note - First Build is going to take time.
Prerequisite - Java 11 available on Classpath.
```
./gradlew clean build
``` 

### How to run
```
./gradlew bootRun
```

### How to verify 
```
Accounts API
curl -X GET http://localhost:8080/customers/234523/accounts 

Transaction API
curl -X GET http://localhost:8080/customers/234523/accounts/4353/transactions
```
