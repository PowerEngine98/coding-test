# Coding test

### Task
Given a simple String AABBCCD112233.
All you need is to return a new String, that will not contain any duplicates.
The code should be clean, readable and optimized.
Also, we expect to see test coverage with different test cases

### Testing
This project uses JUnit unit tests, you can run them with:

```bash
./gradlew test
```

### Analysis of each approach

| Feature             | removeAllDuplicates `Set` approach | removeAllDuplicates2 `LinkedHashSet` Approach              | removeAllDuplicates3 Index-Based Check Approach | removeAllDuplicates4 Array-Based Check Approach                                   |
|---------------------|------------------------------------|------------------------------------------------------------|-------------------------------------------------|-----------------------------------------------------------------------------------|
| **Memory Usage**    | Requires extra memory for `Set`    | Requires extra memory for `Set`                            | No additional data structure                    | 128 bit array in case of ASCII characters                                         |
| **Time Complexity** | O(n)                               | O(n)                                                       | O(n²) (due to `indexOf`)                        | O(n) but less CPU required than other approaches using hashing                    |
| **Readability**     | Moderate                           | Moderate but a bit more overhead with the double iteration | Simple                                          | Moderate, and uses magic number and may throw exceptions for unsupported charsets |


