package ChapterFive;

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
