import java.time.LocalDate;

public class BankAccount {

     String firstName;
     String lastName;
     LocalDate dateOfBirth;
     String accountNumber;
     int balance;

     public BankAccount(String insertFirstName, String insertLastName, LocalDate insertDateOfBirth, String insertAccountNumber) {
          this.firstName = insertFirstName;
          this.lastName = insertLastName;
          this.dateOfBirth = insertDateOfBirth;
          this.accountNumber = insertAccountNumber;
          this.balance = 0;
     }

     public String getFirstName() {
          return firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public LocalDate getDateOfBirth() {
          return dateOfBirth;
     }
     public String getAccountNumber() {
          return accountNumber;
     }

     public double getBalance() {
          return balance;
     }

     public void setBalance(int balance) {
          this.balance = balance;
     }
     // DEPOSIT METHOD
     public void deposit(int value) {
          if (value > 0) {
               balance += value;
               System.out.println(value + "Money Added");
          } else {
               System.out.println("Amount of deposit not valid");
          }
     }

//      WITHDRAWAL METHOD
     public void withdrawal(int value) {
          if (value > 0 && value <= balance) {
               balance = balance - value;
               System.out.println(value + "Money Added");
          } else {
               System.out.println("Amount of withdrawal not valid");
          }
     }
     //    ALLOW ACCOUNT TO PAY INTEREST
     public void allowInterest(int interestRate) {
          if (interestRate >= 0) {
               int interest = balance * interestRate / 100;
               balance = balance + interest;
               System.out.println(interest + "Is the interest included");
          } else {
               System.out.println("interest rate not applicable");
          }

     }
}

