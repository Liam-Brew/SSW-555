# Quiz 02: User Stories

**1. Compare and contrast the role of developers in Agile and plan driven cultures.**

In Agile culture, developers are organized into teams that are based on their experiences and skills. These teams tend to have a bit of autonomy and are capable of organizing themselves. The individual developers contribute their work towards the team and are able to decide what their tasks will be in coordination with the rest of the team. Each developer's performance metrics take in part from the success or failure of the entire team.

In plan driven culture, team organization is very hierarchical. The manager assigns required tasks to a developer, and the developer reports directly to that manager. The developer's performance is than evaluated based on these deliverables. Any teams are formed directly by the manager.

**2. Playing the role of the customer, make a list of the features you want in your system.**

As an application customer, I would like the following features:

- Calendar showing what locations are open and when
- Guest list showing potential conflicts with guests or VIPs
- The catering menus should be visible and interactive (e.g. add x amount of y item to the event shopping cart)
- Ability to save events in terms of both making them recurring as well as templates for future meetings
- Push notifications and reminders for upcoming events and unfinished tasks

**3. Playing the role of the customer, write at least 5 user stories. Be sure to include the following elements in your story:**
**- itle: a short phrase describing the story**
**- priority: the importance of the story (filled in later)**
**- story points: the difficulty of implementing the story (filled in later)**
**- description: a sentence or two describing the story**

My user stories are as follow:

- Story 1:
  - Title: Create Event
  - Priority: 1
  - Story Points: 5
  - Description: As a user I want to be able to create an overarching event that contains sub fields such as caterer, location, and date
- Story 2:
  - Title: Manage RSVP List
  - Priority: 2
  - Story Points: 3
  - Description: As a user I want to have access to a live-updating RSVP list that automatically displays and updates the status of guests
- Story 3:
  - Title: Guest Messages
  - Priority: 2
  - Story Points: 8
  - Description: As a user I want the ability to message both all guests simultaneously as well as guests individually
- Story 4:
  - Title: Date/Time/Place Picker
  - Priority: 1
  - Story Points: 8
  - Description: As a user I want the the option to use an interactive calendar and map tool to easily view empty dates and venues and schedule my event when I please
- Story 5:
  - Title: Interactive Catering Menu
  - Priority: 3
  - Story Points: 13
  - Description: As a user I want the ability to place my food order and securely purchase it through the app

**4. Playing the role of the developer, estimate how many days each story will take. If a story will take too long, break it into multiple stories. Write the number of story points in the appropriate place for each story.**

I estimate the following times for each story:

- Story 1: Create Event: I assigned this 5 story points as the functionality is relatively straight forward to implement. It primarily involves creating a database entry and populating a few fields through a non-extensive UI. I expect this to take no longer than half a work week
- Story 2: Manage RSVP List: I assigned this 3 story points as it primarily consists of simple database management.  I expect this to take no longer than 1.5 days
- Story 3: Guest Messages: I assigned this 8 story points as it has the potential to be somewhat complex. User groups need to be dealt with (messages to all or individuals) as well as actually sending the secure transmissions. Additionally, a messaging UI must be created. I estimate this story to take a week
- Story 4: Date/Time/Place Picker: I assigned this 8 story points as it will require a fairly complex UI in terms of the calendar and room selector. Additionally, database filtering must be performed to show available locations and dates. I estimate this story to take a week
- Story 5: Interactive Catering Menu: I assigned this 13 story points as it will require an extensive UI, database work, and secure transactions. This is the upper limit of what I would consider to be doable for a single story. I estimate this story to take the duration of a two-week sprint

**5. Playing the role of the customer, arrange the stories in priority order. Assign a priority of "1", "2" or "3" to each story, where the most important stories get a "1"**

I estimate the following priorities for each story:

- Story 1: Create Event: I assigned this priority to be 1. This is because this is one of the core features of the app in which many other features work to support it
- Story 2: Manage RSVP List: I assigned this priority 2 as it works in support of a core feature and provides important functionality
- Story 3: Guest Messages: I assigned this priority 2 as the ability to message attendees represents an important feature of the app and a feature requested by the user
- Story 4: Date/Time/Place Picker: I assigned this priority 1 as it is a core feature of the app. It populates the critical data of an Event so that guests may attend, an important functionality of the design
- Story 5: Interactive Catering Menu: I assigned this priority 3. While it would be a nice quality of life feature, it is not urgent as there exists alternatives which the user can make use of while it is in development
