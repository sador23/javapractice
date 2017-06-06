
public class Leader extends Employee{

    public Leader(String name) {
        super(name);
    }

    public void order(FoodSeller foodSeller){
        System.out.println("Be a little faster, don't you see the queue?");
    };
    public void order(Cashier cashier){
        System.out.println("Be nicer to the guests!");
    };
    public void order(FloorWorker floorWorker){
        System.out.println("Don't let this problematic person into the cinema please!");
    };


}
