public class Cashier extends StudentWorker{

    public Cashier(String name) {
        super(name);
        this.setPaymentRate(0.1);
    }

    @Override
    public void increasePayment() {
        double payment = this.getPayment() + (this.getPayment()*this.getPaymentRate());
        if(this.getCurrentSales() >= this.getRaisedValue()+50) {
            this.setPayment(payment);
            this.setRaisedValue(this.getCurrentSales());
        }
    }
}
