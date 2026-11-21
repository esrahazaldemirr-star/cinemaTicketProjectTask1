public class TicketList {
    private Ticket head; // head of the list if it is empty returns null

    public TicketList(){
        this.head= null;
    }
    //adds the new ticket to the end
    public void addTicket(Ticket ticket){
        if(head== null){//if its empty new ticket will be head
            head=ticket;
        }else{ // if it is not empty go througt the last element
            Ticket current= head;
            while(current.next !=null){
                current =current.next;
            }
            current.next=ticket; // end of the loop current is the last element then we add thw new ticket
        }
        System.out.println("ticket is added: ID" + ticket.ticketId);
    }
    //removes the ticket by ID
    public void removeTicket(int id){
        if(head==null){
            return;
        }
        //check is it the first element
        if(head.ticketId== id){
            head=head.next; // make the head element next one then head will be removed
            System.out.println(id + "is removed");
            return;
        }
        // lopp for remove in between or the end
        Ticket current=head;
        while(current.next!=null &&current.next.ticketId != id){
            current =current.next;
        }
        //if removed one is this one
        if(current.next!= null){
            current.next=current.next.next;// cut the connection and tie it to next one the element in between is removed
            System.out.println(id +"is removed");
        }else{
            System.out.println("ticket not found");
        }
    }
    //search with ID and returns ticket info
    public Ticket findTicket(int id){
        Ticket current = head;
        while(current !=null){
            if(current.ticketId ==id){
                return current; // ticket is found, return it
            }
            current = current.next;
        }
        return null; // ticket not found
    }
    //prints the all ticket informations
    public void printList(){
        if(head == null){
            System.out.println("there is no active ticket reservaton");
            return;
        }
        Ticket current= head;
        System.out.println("=====active ticket list=====");
        while(current!=null){
            System.out.println("ID: "+ current.ticketId +"name: " + current.customerName +"movie: " + current.movieName + "seat: " + current.seatNumber + "show time: " + current.showTime);
            current=current.next;//look for next ticket
        }
    }
}
