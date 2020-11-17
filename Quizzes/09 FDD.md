# Quiz 09: FDD

**1. Describe three items that FDD suggests be kept under configuration management.**

Items that FDD suggests be kept under configuration management are:

1. Requirements documents: the project specifications, goals, and objectives desired by the user. These should be tracked to measure how the project evolves over time and resolve any potential disputes with the user.
2. Test cases, harnesses, and results: how the project's code is tested. This enables one to see how the performance of the system increased over time and can potentially serve as data for future tests.
3. Analysis and design artifacts: data from the system's design and implementation planning. This can help track the development process and show why developers made certain decisions at certain points.

**2. Describe three of the six roles in FDD.**

Three roles of FDD are:

1. Domain Expert: this role serves as the primary customer representative to the development process. Domain Experts possess intricate knowledge of the problem domain itself as well as knowledge of what the user’s requirements are. They ensure that the development process is on track to satisfying the user’s needs.
2. Project Manager: this person is the leader of the project and serves to organize the overall development process. They fill an administrative role and oversee aspects such as budgeting and equipment management, planning, and progress reporting. They directly facilitate the work of the rest of the team.
3. Chief Architect: the Chief Architect is responsible for the overall design and planning of the system under development. They must have a large degree of technical knowledge surrounding the project and be able to plan the implementation of the system both now and down the road.

**3. Explain how FDD addresses the Agile Manifesto's concern about working software over comprehensive documentation.**

FDD's role system ensures that code is properly documented by those who know it best. This specifically deals with class ownership and the Class Owner role. By having individual developers dedicated to and responsible for specific pieces of code, this facilitates a large amount of familiarity being picked up by said developers. This translates to thorough and well thought-out documentation. Additionally, since it is the primary function of developers to produce working and operational code, this method also ensures that those who wrote the documentation know themselves that the code is working as described.

**4. FDD relies on which technique rather than pair programming?**

Inspections

**5. Describe FDD's Process 5: build by feature. Who's involved? What's the goal? What are the outcomes?**

In this process, the class owner, feature team, and Chief Programmer are involved. The objective is to complete the feature. The Class Owner themselves writes and tests the code and it is reviewed by the feature team. Once successful, it is implemented into the build via the Chief Programmer. Then the feature team is disbanded.
