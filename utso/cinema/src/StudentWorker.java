
public abstract class StudentWorker extends Employee {

    private double paymentRate = 1;

    //Current sale quantity
    private int currentSales;

    //Sale quantity at last raised payment
    //so we can see the difference
    private int raisedValue;

    public StudentWorker(String name) {
        super(name);
        this.currentSales=0;
        this.raisedValue=0;
    }

    public abstract void increasePayment();

    public double getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(double paymentRate) {
        this.paymentRate = paymentRate;
    }

    public int getCurrentSales() {
        return currentSales;
    }

    public void addSale(){
        this.currentSales++;
    }

    public int getRaisedValue() {
        return raisedValue;
    }

    public void setRaisedValue(int number){
        this.raisedValue=number;

    }



}
