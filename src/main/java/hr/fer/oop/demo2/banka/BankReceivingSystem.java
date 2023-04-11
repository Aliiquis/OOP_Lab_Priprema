package hr.fer.oop.demo2.banka;

public class BankReceivingSystem implements ReceivingSystem {
    private boolean employeeBusy;
    private int urgentQueue;
    private int normalQueue;
    private int customers;

    public BankReceivingSystem() {
        this.employeeBusy = false;
        this.urgentQueue = 0;
        this.normalQueue = 0;
        this.customers = 0;
    }

    @Override
    public void customerArrived(boolean urgent) {
        if (urgent) {
            this.urgentQueue++;
        } else {
            this.normalQueue++;
        }
        calculateEmployeeStatus();
        this.customers++;
    }

    @Override
    public void customerLeft(boolean urgent) {
        if (urgent) {
            if (this.urgentQueue != 0) this.urgentQueue--;
        } else {
            if (this.normalQueue != 0) this.normalQueue--;
        }
        calculateEmployeeStatus();
    }

    @Override
    public void calculateEmployeeStatus() {
        this.employeeBusy = this.urgentQueue != 0 || this.normalQueue != 0;
    }

    @Override
    public int getUrgentListSize() {
        return this.urgentQueue;
    }

    @Override
    public int getNonUrgentListSize() {
        return this.normalQueue;
    }

    @Override
    public boolean isEmployeeOccupied() {
        return this.employeeBusy;
    }

    @Override
    public int getNumberOfArrivedCustomers() {
        return this.customers;
    }
}
