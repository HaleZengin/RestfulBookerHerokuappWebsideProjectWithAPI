package pojos;

public class PostRequest_ResponsePojo {

    /*
    {
    "bookingid": 242,
    "booking": {
        "firstname": "Hale",
        "lastname": "Hale",
        "totalprice": 250,
        "depositpaid": true,
        "bookingdates": {
            "checkin": "2022-08-28",
            "checkout": "2022-09-03"
        },
        "additionalneeds": "Breakfast"
    }
}
     */

    private int bookingid;
    private PostRequestPojo booking;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public PostRequestPojo getBooking() {
        return booking;
    }

    public void setBooking(PostRequestPojo booking) {
        this.booking = booking;
    }

    public PostRequest_ResponsePojo() {
    }

    public PostRequest_ResponsePojo(int bookingid, PostRequestPojo booking) {
        this.bookingid = bookingid;
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "PostRequest_ResponsePojo{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }


}
