/*
5.30 (Modified AutoPolicy Class) Modify class AutoPolicy in Fig. 5.11 to validate the two-letter
state codes for the northeast states. The codes are: CT for Connecticut, MA for Massachusetts, ME
for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
and VT for Vermont. In AutoPolicy method setState, use the logical OR (||) operator
(Section 5.9) to create a compound condition in an if…else statement that compares the method’s
argument with each two-letter code. If the code is incorrect, the else part of the if…else statement
should display an error message. In later chapters, you’ll learn how to use exception handling
to indicate that a method received an invalid value.
 */

package chapter5;

public class Autopolicy {
    private int accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation

    public Autopolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // sets the accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // returns the accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // sets the makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    // returns the makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        if(state == "CT" || state == "MA" || state == "ME" || state == "NH" || state == "NJ" || state == "NY" || state == "PA" || state == "VT") {
            this.state = state;
        }
    }

    // returns the state
    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
