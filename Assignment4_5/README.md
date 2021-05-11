## Name: Suvansh Kumar

### UTD ID: 2021426838
### Net id: sxk170058

### Title: Assignment 6

The Main.java file contains the main function, that tests our strategy
classes.

I have added 8 main types of items in a hierarchical structure:

- Movie
  1. New Release Movie
  2. Children's Movie
  3. Regular Movie
    
- Video Game
  1. Racing Video Game
  2. RTS (Real Time Strategy) Video Game
  3. Action Video Game
    
- Popcorn
  1. Cheese Popcorn
  2. Chocolate Popcorn
    
The Items are Movie, VideoGame and Popcorn and sub-classes of Item, 
and the respective sub-types are sub-classes of those classes.

Each customer may engage in multiple transactions, and each transaction
has multiple transactionItems. Each transactionItem is either a Rental
or a Purchase. Thus, Rental class and Purchase class are sub-classes of
the TransactionItem class. 

Each type of item (the sub-classes) have their corresponding strategies:

- FrequentRenterPointStrategy
- RentalPriceStrategy
- PurchasePriceStrategy
- PurchaseRewardPointsStrategy

These allow us to rent and sell different kinds of items with different
pricing strategies as well as allowing for calculating frequent renter
points and purchase reward points for these classes of objects
separately.

The main function adds various transaction items for various test
customers, and uses the print statement function in the customer 
class to print the computed amount owed, the frequent renter points
earned, and the purchase reward points earned for the transactions.
