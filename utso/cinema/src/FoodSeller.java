
public class FoodSeller  extends StudentWorker{

    public FoodSeller(String name) {
        super(name);
        this.setPaymentRate(0.7);
    }

    @Override
    public void increasePayment() {
        double newPayment = this.getPayment() + (this.getPayment()*this.getPaymentRate());
        if(this.getCurrentSales() >= this.getRaisedValue()+25) {
            this.setPayment(newPayment);
            this.setRaisedValue(this.getCurrentSales());
        }
    }
}
