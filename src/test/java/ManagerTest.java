import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Repository repo = new Repository();
    Manager manager  = new Manager(repo);

    Ticket ticket1 = new Ticket(9, 7000, "SVO", "KZN", 120);
    Ticket ticket2 = new Ticket(17, 6500, "VKO", "KZN", 325);
    Ticket ticket3 = new Ticket(56, 13000, "KUF", "GOJ", 195);
    Ticket ticket4 = new Ticket(97, 26000, "SVO", "OGZ", 420);
    Ticket ticket5 = new Ticket(101, 18000, "LED", "FRU", 240);
    Ticket ticket6 = new Ticket(21, 6000, "SVO", "KZN", 180);

    @Test

    public void airportTicketSearch() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] actual = manager.searchBy("SVO", "OGZ");
        Ticket[] expected ={ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void searchForNonExistentTickets() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] actual = manager.searchBy("LED", "KZN");
        Ticket[] expected ={};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findMultipleTickets() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Ticket[] actual = manager.searchBy("SVO", "KZN");
        Ticket[] expected ={ticket6,ticket1};

        Assertions.assertArrayEquals(expected, actual);
    }
}
