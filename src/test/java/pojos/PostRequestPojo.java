package pojos;

public class PostRequestPojo {

    /*
    {
    "firstname" : "Hale",
    "lastname" : "Hale",
    "totalprice" : 250,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2022-08-28",
        "checkout" : "2022-09-03"
    },
    "additionalneeds" : "Breakfast"
    }
     */

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private PostRequestBookingdatesPojo bookingdatesPojo;
    private String additionalneeds;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public PostRequestBookingdatesPojo getBookingdatesPojo() {
        return bookingdatesPojo;
    }

    public void setBookingdatesPojo(PostRequestBookingdatesPojo bookingdatesPojo) {
        this.bookingdatesPojo = bookingdatesPojo;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public PostRequestPojo() {
    }

    public PostRequestPojo(String firstname, String lastname, int totalprice, boolean depositpaid, PostRequestBookingdatesPojo bookingdatesPojo, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdatesPojo = bookingdatesPojo;
        this.additionalneeds = additionalneeds;
    }

    @Override
    public String toString() {
        return "PostRequestPojo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", bookingdatesPojo=" + bookingdatesPojo +
                ", additionalneeds='" + additionalneeds + '\'' +
                '}';
    }

}
