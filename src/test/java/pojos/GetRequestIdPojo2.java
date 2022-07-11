package pojos;

public class GetRequestIdPojo2 {

    /*
    {
            "firstname": "Millie",
            "lastname": "Mohr",
            "totalprice": 1000,
            "depositpaid": false,
            "bookingdates": {
                "checkin": "2022-03-22",
                "checkout": "2023-04-18"
    }
    }
    */
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private GetRequestBookingdatesPojo2 bookingdates2;



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

    public GetRequestBookingdatesPojo2 getBookingdates2() {
        return bookingdates2;
    }

    public void setBookingdates2(GetRequestBookingdatesPojo2 bookingdates2) {
        this.bookingdates2 = bookingdates2;
    }

    public GetRequestIdPojo2() {
    }

    public GetRequestIdPojo2(String firstname, String lastname, int totalprice, boolean depositpaid, GetRequestBookingdatesPojo2 bookingdates2) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates2 = bookingdates2;
    }


    @Override
    public String toString() {
        return "GetRequestIdPojo2{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", bookingdates2=" + bookingdates2 +
                '}';
    }

}





