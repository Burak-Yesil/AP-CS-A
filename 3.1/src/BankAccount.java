
public class BankAccount {

static double bal;
static double ceza;
static int bedavaTransLeft;
static int fazlaFreeTrans;
static boolean paralazim;
static String previousDate = new String("");
static String currentDate = new String("");

/**constructors*/

public void withdrawal(double withdrawalAmount, String date) {
currentDate = date;
bal = bal - withdrawalAmount;
System.out.println("<Today's date is " + date + ">\r\nwithdrawled $" + withdrawalAmount);
BankAccount.monthlyChargeDetector();
BankAccount.deductMonthlyCharge();
bedavaTransLeft = bedavaTransLeft - 1;
previousDate = date;
}

public void deposit(double depositAmount, String date) {
currentDate = date;
bal = bal + depositAmount;
System.out.println("<Today's date is " + date + ">\r\n deposited $" + depositAmount);
BankAccount.monthlyChargeDetector();
BankAccount.deductMonthlyCharge();
bedavaTransLeft = bedavaTransLeft - 1;
previousDate = date;
}

public BankAccount(double initialBalance, String date, double initialFee, int freeTrans) {
System.out.println("Your initial balance is $" + initialBalance + "\r\nYou have " + freeTrans + " time(s) left to freely transact.\r\n\r\n");
bal = initialBalance;
ceza = initialFee;
currentDate = date;
previousDate = date;
bedavaTransLeft = freeTrans;
fazlaFreeTrans = freeTrans;
}
/** these are the methods*/
public static void monthlyChargeDetector() {
String previousMonth = previousDate.substring(0,2);
String previousYear = previousDate.substring(6,8);
String currentMonth = currentDate.substring(0,2);
String currentYear = currentDate.substring(6,8);

if(!currentMonth.contentEquals(previousMonth) || !currentYear.contentEquals(previousYear)) {
	paralazim = false;
bedavaTransLeft = fazlaFreeTrans;
System.out.println("Your monthly maximum free transaction has been reset.");
}

}

public static void deductMonthlyCharge() {
if(bedavaTransLeft <= 1 && paralazim == false) {
bal = bal- ceza;
paralazim = true;
System.out.println("You have reached your maximum free transaction limit.\r\nYou will be charged a monthly fee of $" + ceza + " for the next transaction.");
} else if(paralazim == false) {
int newFreeTransLeft = bedavaTransLeft - 1;
System.out.println("You have " + newFreeTransLeft + " time(s) left to freely transact this month.");
}
System.out.println("\r\n");
}

public void print() {
System.out.println("\r\nYour current total balance is $" + bal);
}

}
