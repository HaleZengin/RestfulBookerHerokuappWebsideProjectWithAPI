package pojos;

public class GetRequestBookingdatesPojo2 {

    /*
    {
        .....
            "bookingdates": {
                 "checkin": "2022-03-22",
                 "checkout": "2023-04-18"
    }
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


    public GetRequestBookingdatesPojo2() {
    }


    public GetRequestBookingdatesPojo2(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }


    @Override
    public String toString() {
        return "GetrequestBookingdatesPojo{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }


}
