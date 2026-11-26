## Week 8 inheritance

**which constructor initialises the common fields, and which initialises studentId?**
the common fields are initialised by the supers Tickets constructor and studentID is initialised by StudentID constructor

**A student wants a VIP ticket and qualifies for the student discount. Does the current hierarchy support both
behaviours easily? What limitation does this reveal about inheritance? No additional code is required.**

The current code does not support both behaviours easily as both classes override the calculateprice method. The 
limitation of inheritance is that a class cannot inherit from multiple classes simultaneously.