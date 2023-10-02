# student-record-console-project

## Re-write my code
Main
- main method
  - create instance of Scanner
  - create instance of AppMenu
  - Pass Scanner instance sa AppMenu
  - Start mo ung AppMenu 

AppMenu
- Create instance of StudentRepository
- start method
  - loop ung input continously
  - if input is create student
    - call method to create student, then call studentrepository to add the student sa list
  - if input is update student
    - call method to update student, call repository to get the list of students then perform update
  - if input is read
    - call method to read students, call repository to read the list
