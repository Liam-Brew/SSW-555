# Lecture 01: Introduction to Extreme Programming/XP

What is the right level of planning for software projects?

- Depends on task

How should we decide?

- what's the domain?
- how complete are the requirements?
- how stable are the requirements?
- what's the cost of doing the wrong thing?
- what's the cost of doing the right thing too slowly?
- what are the risks?
- what are the rewards?

SDLC

- software specification -> what functionality must we support?
- software development -> how do we create the software that delivers the functionality?
- software validation -> how do we verify that the software does what it's supposed to do?
- software evolution -> how does the software evolve to meet customer needs?

## Waterfall Model

Waterfall methodology is rigid and sequential
Plan everything in sufficient detail so its right the first time (not likely)
Popular with traditional engineering problems (ex: bridge building)
Formal process

- extensive documentation
- serial execution
  - complete each stage before advancing to the next
  - difficult to return to earlier stages
- strict handoffs between stages
- Requirements -> Design -> Implementation -> Verification -> Maintenance
- can add verification and testing to each step of the waterfall model
  - must complete rigorous testing before proceeding to the next step
  - but still is inflexible as you can't go back to the previous step without restarting

## Boehm's Spiral Model

Recognizes limitations of Waterfall (hard to get right the first time, customer's don't know what they want etc.)
Adds focus on risk assessment
Encourages incremental development and iterations (learn from previous iterations)
Each spiral includes

- objective setting
- risk assessment and reduction
- development and validation
- planning

## Iterative Models SDLC

Recognizes limitations of Waterfall (hard to get right the first time, customer's don't know what they want etc.)
Identify requirements up front
Build subsets of requirements (sequentially or in parallel with multiple groups of developers)
Requirements are mostly stable but may change
Works well for large project that can be developed in parallel efforts
Delivers early functionality to customers for review

## Agile Methods SDLC

Frequent iterations and deliverables
Close collaboration between customers and developers (customer is a critical partner in the process rather than an observer)
Supports changing requirements
Frequent reflection and continuous improvement

- what are we doing well?
- what can we improve?
- learn and improve from experience

## Big Bang

Little to no planning
Figure it out as you go
Typically used for very small projects
Not highly recommended

## Software Development in the 1990s

Large projects (> 40 people, > 1 year)

- used plan-based methods such as Rational Unified Process (RUP)
- more incremental than waterfall, but a heavy process
- focus on quality, discipline, and process improvement

Medium sized projects (7-40 people, 3-12 months)

- some used plan-based methods, some used ad hoc methods
- struggled to reduce process overhead while maintaining quality

Small projects (< 7 people, < 3 months)

- many used ad hoc methods (or no methods)
- struggled to achieve greater speed

## Software Development Before Agile

1960s:

- original software crisis leads to "software engineering"
- apply techniques from other engineering disciplines to software

1970s:

- adoption of traditional engineering methods such as the waterfall model

1980s:

- many attacks on complexity (OO, CASE tools, formal methods, iterative process models, process maturity)
- "No silver bullet" published by Brooks
- software market expands from DoD and large business to home PCs

1990s:

- WWW, dot-com boom, and Internet time
- backlash against heavy process

## Rational Unified Process (RUP)

Developed at Rational Software in late 1990s and incorporated some OO strategies and paradigms
Based on 6 Best Practices of Software Engineering

- develop iteratively
  - solutions are too complex to get right in one pass
  - use an iterative approach and focus on the highest risk items in each pass
  - customer involvement
  - accomodate changes in requirements
- manage requirements
  - use cases and scenarios to help identify requirements
  - requirements provide traceable thread from customer needs through development to end product
- use component-based architectures
  - creating and base lining an architecture is a gate for development
  - architecture should be flexible to accommodate change
  - focus on reusable, component-based software
- model software visually (UML)
  - capture structure and behaviour in Unified Modeling Language (UML)
  - UML helps to visualize the system and interactions
- continuously verify software quality
  - verification and validation is part of the process and not an afterthought
  - focus on reliability, functionality and performance
- control changes
  - change is inevitable
  - actively manage the change request process
  - control, track and monitor changes

RUP project lifecycle phases

- inception: scope system for cost and budget, create basic use case model
- elaboration: mitigate risks by elaboration of use case model and design of software architecture
- construction: implement and test software
- transition: plan and execute delivery of system to customer

Each phase ends with a milestone when stakeholders review progress and make go/no-go decisions

RUP supporting disciplines

- configuration and change management: manage access to project work products
- project management: manage risks, direct people, and coordinate with other stakeholders
- environment: ensure that process, guidance, and tools are available

## Agile Manifesto (2001)

Better ways of developing software through collaboration and favoring

- individuals and interactions over processes and tools
- working software over comprehensive documentation
- customer collaboration over contract negotiation
- responding to change over following a plan

## The Planning Game

Business people decide:

- scope
- priority
- release dates

Technical people decide:

- estimates of effort
- technical consequences
- process
- detailed scheduling

## Small Releases

Every release should be as small as possible
Every release should completely implement its new features
Every release should contain the most valuable business features

- contrast with RUP where you focus on the biggest risk first

## Metaphor

Metaphor is a simple explanation of the project

- agreed upon by all members of the team
- simple enough for customers to understand
- detailed enough to drive the architecture

Metaphor replaces architecture as the 10,000 feet view of the system

## Simple Design

Successfully run all tests
Has no duplicated logic
States every intention important to programmers
Has the fewest possible classes and methods

## Testing

Every feature must have an automated test
Programmers need confidence in correct operation
Customers need confidence in correct operation

## Refactoring

Rewrite or restructure the code to improve the implementation
Always ask if there is a way to make the program simpler
When the system requires duplication of code, it is asking for refactoring
Can always find a series of small, low-risk steps

## Pair Programming

All code written with two people at one machine
Driver thinks about the best way to implement
Navigator thinks

- about the viability of the whole approach
- of new tests
- of simpler ways

Switch roles frequently

## Collective Ownership

Anybody who sees an opportunity to add value to any portion of the code is required to do so
Everyone knows something about everything
Everyone feels obligated to make improvements

## Continuous Integration

Integrate and test every few hours, at least once per day (don't wait until the very end!)
All tests must pass
East to tell who broke the code (problem is likely to be in code that was most recently changed)

## Sustainable Pace (40-hour week)

People should be fresh and eager every morning
Overtime is a symptom of a serious problem
XP only allows one week of overtime

## Whole Team (On-site customer)

Customer is a member of the team (real customer will use the finished system)
Programmers need to ask questions of a real customer (clarify requirements or explain what's needed)
Customer sits with the team (customer can get some other work done while sitting with programmers)

## Coding Standards

Everyone edits everyone's code
Standard should require least amount of overhead
Standard should be adopted voluntarily by the team
