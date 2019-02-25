package system.model;

public class Tour {

    public Tour() {
    }

    private int id;
    private int direction;
    private int customer;
    private int kodForGuide;
    private int peopleCount;
    private int priceOfTour;
    private int ticketPrice;
    private int transportPrice;
    private int otherPrice;
    private double dayOfTour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getKodForGuide() {
        return kodForGuide;
    }

    public void setKodForGuide(int kodForGuide) {
        this.kodForGuide = kodForGuide;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getPriceOfTour() {
        return priceOfTour;
    }

    public void setPriceOfTour(int priceOfTour) {
        this.priceOfTour = priceOfTour;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTransportPrice() {
        return transportPrice;
    }

    public void setTransportPrice(int transportPrice) {
        this.transportPrice = transportPrice;
    }

    public int getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(int otherPrice) {
        this.otherPrice = otherPrice;
    }

    public double getDayOfTour() {
        return dayOfTour;
    }

    public void setDayOfTour(double dayOfTour) {
        this.dayOfTour = dayOfTour;
    }
}
