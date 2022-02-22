package chapter15.filematchingwithmultipletransactions;

import java.io.Serializable;

/*
15.5 (File Matching with Multiple Transactions) It’s possible (and actually common) to have several
transaction records with the same record key. This situation occurs, for example, when a customer makes
several purchases and cash payments during a business period. Rewrite your accounts receivable
file-matching program from Exercise 15.4 to provide for the possibility of handling several transaction
records with the same record key. Modify the test data of CreateData.java to include the additional
transaction records in Fig. 15.16.

                Account number  Dollar amount
                300             83.89
                700             80.78
                700             1.53

                Fig. 15.16 | Additional transaction records
 */

public class Account implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // initializes an Account with default values
    public Account() {
        this(0, "", "", 0.0); // call other constructor
    }

    // initializes an Account with provided values
    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // set account number
    public void setAccount(int acct) {
        this.account = account;
    }

    // get account number
    public int getAccount() {
        return account;
    }

    // set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    // set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // get balance
    public double getBalance() {
        return balance;
    }
    // end class Account

    public double combine(TransactionRecord tr) {
        return tr.getAmount() + getBalance();
    }
}
