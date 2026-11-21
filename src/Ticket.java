public class Ticket {// information about current and next ticket
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String showTime;
    Ticket next;// it is a pointer that shows the next ticket in the linked list

    // constructor for new ticket objects
    public Ticket(int ticketId , String customerName , String movieName , String seatNumber , String showTime){
        this.ticketId=ticketId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.showTime=showTime;
        this.next=null; // start with null, the is no next node
    }
}
