package models;

public class Contract {
    int numberContracts;
    int bookingCode;
    double depositAmount;
    double totalPayment;
    int idCustomer;

    public Contract() {
    }

    public Contract(int numberContracts, int bookingCode, double depositAmount, double totalPayment, int idCustomer) {
        this.numberContracts = numberContracts;
        this.bookingCode = bookingCode;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public int getNumberContracts() {
        return numberContracts;
    }

    public void setNumberContracts(int numberContracts) {
        this.numberContracts = numberContracts;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContracts=" + numberContracts +
                ", bookingCode=" + bookingCode +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
