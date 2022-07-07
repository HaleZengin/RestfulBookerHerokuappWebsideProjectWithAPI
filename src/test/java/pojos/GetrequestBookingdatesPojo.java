package pojos;

public class GetrequestBookingdatesPojo {

    /*
    {
    "firstname": "Emilie",
    "lastname": "Kristensen",
    "totalprice": 593,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2022-07-06",
        "checkout": "2022-07-13"
    },
    "additionalneeds": "Newspaper"
}


     sadece "bookingdates": {
            "checkin": "2022-07-06",
            "checkout": "2022-07-13"
        },
     kismini yapacagiz


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


    public GetrequestBookingdatesPojo() {
    }


    public GetrequestBookingdatesPojo(String checkin, String checkout) {
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
