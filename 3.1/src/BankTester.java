public class BankTester {
public static void main(String args[]) {

//Explicit parameter comes in order of (Initial deposit, Date of Account opened["mm/dd/yyyy"], transaction fee, and maximum of free transfers)
BankAccount myBank = new BankAccount(1000, "01/24/2020", 5, 3);

//All operation down here
//Explicit parameter comes in order of (Amount of transaction, date of transaction)
myBank.deposit(50, "01/03/2020");
myBank.withdrawal(25, "01/05/2020");
myBank.deposit(10, "01/07/2020");
myBank.withdrawal(5, "01/12/2020");

myBank.withdrawal(5, "02/12/2020");
myBank.deposit(15, "02/17/2020");
myBank.withdrawal(50, "02/18/2020");
myBank.deposit(15, "02/19/2020");
myBank.deposit(15, "02/19/2020");

myBank.print();

}
}