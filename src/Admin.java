import java.util.Scanner;

public class Admin
{
Scanner cin = new Scanner(System.in);
Print menus = new Print() ;
int counterAdd = 4 ;
int flagCheck = 0 ;
int countIdi = 0 ;
    String inputId ;


    public void adminMenu ()
{


    int inputAdmin = cin.nextInt();
    switch (inputAdmin)

    {
        case 1 :
            addedFlight();

        case 2 :
            updateFlight();

        case 3 :
            removeFlight();

        case 4 :
            flightSchedule();

        case 0 :
            signout();

    }

}
public  void addedFlight()
{

    System.out.println("Enter Flight Id");
      inputId = cin.next();
      checkAddid();
      if ( flagCheck == 1  )
      {
          Print.flightObjects[counterAdd].setFlightId(inputId);

      }




    System.out.println("Enter Flight Origin ");
    String inputOrigin = cin.next();
    Print.flightObjects[counterAdd].setFlightOrigin(inputOrigin);
    System.out.println("Enter Flight Destination ");
    String inputDest = cin.next();
    Print.flightObjects[counterAdd].setFlightDestination(inputDest);
    System.out.println("Enter Flight Date ");
    String inputDate = cin.next();
    Print.flightObjects[counterAdd].setFlightDate(inputDate);
    System.out.println("Enter Flight Time");
    String inputTime = cin.next();
    Print.flightObjects[counterAdd].setFlightTime(inputTime);
    System.out.println("Enter Flight Price");
    String inputPrice = cin.next();
    Print.flightObjects[counterAdd].setFlightPrice(inputPrice);
    System.out.println("Enter Flight Seat");
    String inputSeat = cin.next();
    Print.flightObjects[counterAdd].setFlightSeat(inputSeat);


    flagCheck = 0 ;
}
public void updateFlight()
{

}
public void removeFlight()
{

}
public void flightSchedule()
{

}
public void signout()
{

menus.menu();
}
public void checkAddid ()
{
    for (int i = 0; i <Print.flightObjects.length ; i++)
    {

        if ( Print.flightObjects[i].getFlightId().equals(null) )
        {
            countIdi = i ;
            checkIddefreants();
        }

    }



}
public  int  checkIddefreants ()
{
    if ( !Print.flightObjects[countIdi].getFlightId().equals( inputId ) )
    {

        flagCheck = 1 ;

    }

    return flagCheck ;
}



}
