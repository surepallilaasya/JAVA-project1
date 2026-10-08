class MovieTicket {
     String movieName;
     double ticketPrice;
     int numberOfTickets;

    public int CalculateTotal(double ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        return (int) (ticketPrice * numberOfTickets);
    }

    public int calculateDiscount(double ticketPrice, int numberOfTickets) {
       if(numberOfTickets >= 5) {
           return (int) (ticketPrice * numberOfTickets * 0.1); // 10% discount for 5 or more tickets
       } else {
           return 0; // No discount for less than 5 tickets
       }
    }

    public double calculateFinalAmount(double ticketPrice, int numberOfTickets) {
       if(numberOfTickets >= 5) {
           return ticketPrice * numberOfTickets * 0.9; // Apply 10% discount
       } else {
           return ticketPrice * numberOfTickets; // No discount
       }
    }

    public void displayBill() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Amount: $" + CalculateTotal(ticketPrice, numberOfTickets));
        System.out.println("Discount: $" + calculateDiscount(ticketPrice, numberOfTickets));
        System.out.println("Final Amount: $" + calculateFinalAmount(ticketPrice, numberOfTickets));
    }
public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.movieName = "Inception";
        ticket.ticketPrice = 12.50;
        ticket.numberOfTickets = 6;
        ticket.CalculateTotal(ticket.ticketPrice, ticket.numberOfTickets);
        ticket.calculateDiscount(ticket.ticketPrice, ticket.numberOfTickets);
        ticket.calculateFinalAmount(ticket.ticketPrice, ticket.numberOfTickets);
        ticket.displayBill();
    }
}