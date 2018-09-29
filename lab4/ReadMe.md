Classes:
1. Restaurant
2. YesCustomer
3. NoCustomer

Responsibility:
1. Restaurant
	-Keep track of number of seats available.
	-Add customers to the waitlist
	-Remove customers from waitlist
	-Check if current available seats can accommodate customer who is next on waitlist.
	-Notify customers of availability of the table.

2. YesCustomer:
	-Provide contact information
	-Keep track of notifications
	-Check if the available seats matches number of members.
	-Go to the restaurant when waitlist clears

3. NoCustomer:
	-Provide contact information
	-Keep track of notifications
	-Check if the available seats matches number of members.
	-Do not go to the restaurant when waitlist clears

- I have applied Observer pattern to the given problem. 
- Restaurant class is the Subject which is changing its state and notifying all the observers i.e. YesCustomer and NoCustomer.
- Restaurant extends ConcreteSubject class which in turn implements Subject Interface.
- YesCustomer and NoCustomer are extended from ConcreteObserver which implements Observer Interface.

Execution:

- After the restaurant has a table available, it sets the State to available and states how many seats are available. 
- setState() calls notifyObservers() to update them about the change
- The customers in waitlist are checked if their member count matches or is less than available seats.
- If it is, then they are offered the table.
- Depending upon the type of customer, The customer accepts or rejects the offer.
