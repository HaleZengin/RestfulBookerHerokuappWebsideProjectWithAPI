package pojos;

public class PutRequestBookingdatesPojo {

    /*
    {
    "firstname" : "Hale",
    "lastname" : "Hale",
    "totalprice" : 1000,
    "depositpaid" : false,
    "bookingdates" : {
        "checkin" : "2022-08-18",
        "checkout" : "2022-08-20"
    },
    "additionalneeds" : "Breakfast"
    }
     */

    private String checkin;
    private String checkout;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public PutRequestBookingdatesPojo() {
    }

    public PutRequestBookingdatesPojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }


    @Override
    public String toString() {
        return "PutRequestBookingdatesPojo{" +
                "checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}
