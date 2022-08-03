package pojos;

public class PostRequestBookingdatesPojo {
    /*
    "bookingdates" : {
        "checkin" : "2022-08-28",
        "checkout" : "2022-09-03"
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

    public PostRequestBookingdatesPojo() {
    }

    public PostRequestBookingdatesPojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "PostRequestBookingdatesPojo{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }


}
