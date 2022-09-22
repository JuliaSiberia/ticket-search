import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {

    Repository repo = new Repository();

    Ticket ticket1 = new Ticket(9, 7000, "SVO", "KZN", 120);
    Ticket ticket2 = new Ticket(17, 6500, "VKO", "KZN", 325);
    Ticket ticket3 = new Ticket(56, 13000, "KUF", "GOJ", 195);
    Ticket ticket4 = new Ticket(97, 26000, "SVO", "OGZ", 420);
    Ticket ticket5 = new Ticket(101, 18000, "LED", "FRU", 240);

    @Test

    public void displayAllTickets() {
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void removeById() {
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);

        repo.removeById(97);

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket5};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void removingMissingElement() {

        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(100);
        });
    }
}
