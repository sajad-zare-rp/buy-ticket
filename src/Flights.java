public class Flights
{
private String flightId ;
private String flightOrigin ;

private  String flightDestination ;
private String flightDate ;

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public String getFlightPrice() {
        return flightPrice;
    }

    public String getFlightSeat() {
        return flightSeat;
    }

    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public void setFlightPrice(String flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setFlightSeat(String flightSeat) {
        this.flightSeat = flightSeat;
    }

    private String flightTime ;

private String flightPrice ;
private String flightSeat ;

public void flight_defualt()
{
    Print.flightObjects[1].flightId = "WX-12" ;
    Print.flightObjects[1].flightDate = "1401-12-10" ;
    Print.flightObjects[1].flightOrigin = "Yazd" ;
    Print.flightObjects[1].flightDestination = "Tehran" ;
    Print.flightObjects[1].flightTime = "12:30" ;
    Print.flightObjects[1].flightPrice = "700'000" ;
    Print.flightObjects[1].flightSeat = "51" ;
    Print.flightObjects[2].flightId = "WZ-15" ;
    Print.flightObjects[2].flightOrigin = "Mashad" ;
    Print.flightObjects[2].flightDestination = "Ahvaz" ;
    Print.flightObjects[2].flightDate = "1401-12-11" ;
    Print.flightObjects[2].flightTime = "08:00" ;
    Print.flightObjects[2].flightPrice = "900'000" ;
    Print.flightObjects[2].flightSeat = "245" ;
    Print.flightObjects[3].flightId = "BG-22" ;
    Print.flightObjects[3].flightOrigin = "Shiraz" ;
    Print.flightObjects[3].flightDestination = "Tabriz" ;
    Print.flightObjects[3].flightDate = "1401-12-12" ;
    Print.flightObjects[3].flightTime = "22:30" ;
    Print.flightObjects[3].flightSeat = "12";
    Print.flightObjects[3].flightPrice = "1'100'000" ;



}


}
