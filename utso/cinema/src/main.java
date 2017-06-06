
public class main {

    public static void main(String[] args) {
        //Instances
        CinemaOwner cinemaOwner = new CinemaOwner("Tamás");
        Manager manager = new Manager("Tomi");
        Cashier cashier = new Cashier("Éva");
        FoodSeller foodSeller = new FoodSeller("Eszt");
        FloorWorker floorWorker = new FloorWorker("Rita");
        Cinema cinema = new Cinema();

        //Add instances to cinema
        cinema.addLeader(cinemaOwner);
        cinema.addLeader(manager);
        cinema.addStudent(cashier);
        cinema.addStudent(foodSeller);
        cinema.addStudent(floorWorker);

        System.out.println("Cashier payment before: " +cashier.getPayment());
        for(int i=0; i<200;i++){
            cinema.addSaleAll();
            cinema.updatePayment();
        }
        System.out.println("Cashier payment after: " + cashier.getPayment());
    }
}
