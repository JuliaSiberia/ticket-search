public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected int prices;
    protected String from;
    protected String to;
    protected int time;

    public Ticket(int id, int prices, String from, String to, int time) {
        this.id = id;
        this.prices = prices;
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Ticket o) {
        if (prices < o.getPrices()) {
            return -1;
        } else if (prices > o.getPrices()) {
            return 1;
        } else {
            return 0;
        }
    }
}

