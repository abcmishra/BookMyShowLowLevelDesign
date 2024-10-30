import java.util.ArrayList;
import java.util.List;

public class User {
    private String userid;
    private String userName;
    private  Address address;
    List<Ticket> ticketList;

    public User(String userid,String userName){
        this.userName=userName;
        this.userid=userid;
        this.ticketList=new ArrayList<>();
    }








    public void setUserid(String userid){
        this.userid=userid;
    }

    public String getUserName() {
        return userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public String getUserid() {
        return userid;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
}
