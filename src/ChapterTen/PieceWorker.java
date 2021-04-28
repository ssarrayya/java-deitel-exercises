package ChapterTen;

public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0)
            throw new IllegalArgumentException("Wages cannot be less than zero!");
        if(pieces < 0)
            throw new IllegalArgumentException("Pieces cannot be less than zero!");

        this.wage = wage;
        this.pieces = pieces;
    }

    public void setPieces(int pieces) {
        if (pieces < 0.0)
            throw new IllegalArgumentException("Pieces cannot be less than zero!");
        this.pieces = pieces;
    }

    public double getPieces() {
        return pieces;
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Wages cannot be less than zero!");
        this.wage = wage;
    }

    public double getWage() { return wage;}

    @Override
    public double earnings() {
        return wage * pieces;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "piece worker", super.toString(),
                "wage per piece", getWage(),
                "commission rate", getPieces());
    }

}
