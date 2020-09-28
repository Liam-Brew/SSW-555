# Quiz 04: Testing

**1. How is testing different from debugging?**

Testing is when the system is examined to locate problems and errors, whereas debugging is when developers go in and actually fix these problems.

**2. Why should you only write a few tests at a time when practicing TDD?**

Tests should be written to match the lines of code written. As it is recommended that not much code is written at once, test cases should match this limited amount. More tests mean that more code is written at once, which is suboptimal. Limited testing means that the code coverage of the program is increased as smaller, more specific segments of code are tested and are given greater attention and time.

**3. What types of feedback do tests provide?**

For programmers, feedback includes the number of tests that failed or passed, locates areas that are especially prone to failures and need extra development work, and where errors and bugs are located. Tests allow customers to see the current health and state of the software system, as well as what features are/aren't working.Tests also provide metrics by which management can grade the health and effectiveness of the project as well as the development team.

**4. What is the purpose of the fixture in FitNesse?**

The fixture in FitNesse serves to link user test cases to the system under test. In doing this, tests are easier to manage and understand as they are mapped directly to source code that implements them.

**5. What is the advantage of frequent integration?**

Frequent integration allows errors to be more efficiently located. This is because under frequent integration, developed code is divided into smaller groups for testing and integration at a more rapid pace. Due to the smaller sizes at play here, it is easier to locate errors as the environment is much more condensed and transparent. In a larger implementation size, the error can be hiding within a greater amount of code and therefore be more difficult to trace and resolve.
