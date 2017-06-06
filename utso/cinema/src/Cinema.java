import java.util.ArrayList;

public class Cinema {

    ArrayList<StudentWorker> students;
    ArrayList<Leader> leaders;

    public Cinema(){
        students = new ArrayList<>();
        leaders = new ArrayList<>();
    }

    public void addStudent(StudentWorker student){
        students.add(student);
    }

    public void addLeader(Leader leader){
        leaders.add(leader);
    }

    public void updatePayment(){
        students.forEach(n -> n.increasePayment());
    }

    public void addSaleAll(){
        students.forEach(n -> n.addSale());
    }
}
