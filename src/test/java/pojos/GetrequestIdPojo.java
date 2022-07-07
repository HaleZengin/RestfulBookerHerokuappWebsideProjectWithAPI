package pojos;

public class GetrequestIdPojo {

    /*
     {
    "firstname": "Emilie",
    "lastname": "Kristensen",
    "totalprice": 593,
    "depositpaid": true,
    "bookingdates": {
        .....................
    },
    "additionalneeds": "Newspaper"
}
     */

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private GetrequestBookingdatesPojo bookingdates;
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

    public GetrequestBookingdatesPojo getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(GetrequestBookingdatesPojo bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }


    public GetrequestIdPojo() {
    }


    public GetrequestIdPojo(String firstname, String lastname, int totalprice, boolean depositpaid, GetrequestBookingdatesPojo bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }

    @Override
    public String toString() {
        return "GetrequestIdPojo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", bookingdates=" + bookingdates +
                ", additionalneeds='" + additionalneeds + '\'' +
                '}';
    }




}
