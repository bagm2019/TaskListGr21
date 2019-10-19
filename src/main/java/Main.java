import model.Priority;
import model.Status;
import model.Task;


public class Main {
    public static void main(String[] args) {

       Task t2 = Task.builder().withTitle("Zadanie 2").build();
       Task t3 = Task.builder().withTitle("Zadanie 3").withPriority(Priority.MEDIUM)
                .withDescription("Jakis opis zadania 3").withStatus(Status.OPEN).build();
        System.out.println(t3);

    }
}
