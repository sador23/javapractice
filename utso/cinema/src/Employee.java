
public abstract  class Employee {

    private String name;
    private int id;
    private static int idCounter;
    private double payment;

    public Employee(String name){
        this.name=name;
        this.id=idCounter ++;
        this.payment=5000;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
