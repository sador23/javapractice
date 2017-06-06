public class FloorWorker extends StudentWorker {


    public FloorWorker(String name) {
        super(name);
        this.setPaymentRate(0.5);
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
