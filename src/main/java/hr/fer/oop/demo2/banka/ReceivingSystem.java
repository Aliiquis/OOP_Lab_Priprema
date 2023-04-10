package hr.fer.oop.demo2.banka;

public interface ReceivingSystem {
    void customerArrived(boolean urgent);

    void customerLeft(boolean urgent);

    void calculateEmployeeStatus();

    int getUrgentListSize();

    int getNonUrgentListSize();

    boolean isEmployeeOccupied();

    int getNumberOfArrivedCustomers();
}
