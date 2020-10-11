# Quiz 06: Refactoring

**1. Describe the Litter Pickup refactoring workflow.**

During Litter Pickup refactoring, as a developer is working on things (either writing their own code, writing tests, peer reviewing someone else's code etc.) and discovers bad code, the developer should immediately fix it there and then. The developer should not ignore the problem or assume that another person will fix it, but should instead take initiative and fix it on their own. This ensures that the problem is resolved there and then and will not persist into the future.

**2. What is technical debt? How is it paid off?**

Technical debt is extra work that the project will require to attain acceptable standards. This is caused by developers rushing and/or "taking the easy way" by doing things such as writing bad code, not properly completing a system architecture design, and rushing and taking shortcuts. This debt will manifest itself by having the project require more work in terms of testing, maintenance and development down the line. Technical debt can be paid off by refactoring bad code into code that is more usable and of higher quality, reducing the amount of effort needed to improve and maintain the project.

**3. Describe the TDD refactoring workflow.**

For every section of code, the TDD refactoring workflow features the development of tests first and code second. The writing of the actual code itself is based on observing the requirements of the tests, how the tests failed, and the behavior needed to satisfy them. Code is then written and tests are re-run. The new results of the tests are analyzed, and this process continues until the required tests pass. The benefit of the TDD refactoring workflow is that the testing coverage of the program is greatly improved upon. This means that test results display a more accurate insight into the health of the program and that there is less of a chance for bugs to make it through to the product.

**4. Describe the planned refactoring workflow.**

In planned refactoring, a specific amount of time is budgeted in the project schedule reserved only for refactoring. While this can be useful in that the team knows how much time they can (at a minimum) dedicate to refactoring and that they will be able to use this time only for refactoring, it normally is a bad sign for a project. This can show that the refactoring effort is behind and that enough time is not be dedicated towards it, hence the need for a specific schedule slot.

**5. Describe two bad smells in code that suggest you should refactor.**

One bad code smell that indicates refactoring is necessary is the presence of duplicated code. This increases the coupling factor of the program and reduces modularity (for example if this duplicated code requires modification, then every instance of it must be located and changed as opposed to the single method/class). This both increases the likelihood of defects and errors as well as wastes the development team's time.

Another bad code smell is the presence of very long and/or complex methods. Most of the time, the objective of methods is to perform a specific task which can then be fed into other methods for other tasks. For the most part, if a method contains many parameters and has a ridiculously long length, it may be best to divide that method into several smaller ones with each focusing more precisely on a single subtask.
