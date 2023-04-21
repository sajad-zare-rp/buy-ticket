import java.util.Scanner;

public class Admin
{
Scanner cin = new Scanner(System.in);
Print menus = new Print() ;
int counterAdd = 4 ;
int flagCheck = 0 ;
int countIdi = 0 ;
    String inputId ;
    /*********************************************************************************************************************/


    public void adminMenu ()
{


    int inputAdmin = cin.nextInt();
    switch (inputAdmin)

    {
        case 1 :
            addedFlight();
            break;
        case 2 :
            updateFlight();
            break;
        case 3 :
            removeFlight();
            break;
        case 4 :
            flightSchedule();
            break;
        case 0 :
            signout();
            break;
        default:
            adminMenu();
            break;
    }

}
/*************************************************************************************************************************/
public  void addedFlight()
{

    System.out.println("Enter Flight Id");
      inputId = cin.next();
      checkAddid();
      if ( flagCheck == 1  )
      {
          Print.flightObjects[counterAdd].setFlightId(inputId);

      }
      else
      {

          System.out.println("Id Not Exist");
          addedFlight();

      }




    System.out.println("Enter Flight Origin ");
    String inputOrigin = cin.next();
    Print.flightObjects[counterAdd].setFlightOrigin(inputOrigin);
    /********************************************************************/
    System.out.println("Enter Flight Destination ");
    String inputDest = cin.next();
    Print.flightObjects[counterAdd].setFlightDestination(inputDest);
    /*********************************************************************/
    System.out.println("Enter Flight Date ");
    String inputDate = cin.next();
    Print.flightObjects[counterAdd].setFlightDate(inputDate);
    /**********************************************************************/
    System.out.println("Enter Flight Time");
    String inputTime = cin.next();
    Print.flightObjects[counterAdd].setFlightTime(inputTime);
    /**********************************************************************/
    System.out.println("Enter Flight Price");
    String inputPrice = cin.next();
    Print.flightObjects[counterAdd].setFlightPrice(inputPrice);
    /**********************************************************************/
    System.out.println("Enter Flight Seat");
    String inputSeat = cin.next();
    Print.flightObjects[counterAdd].setFlightSeat(inputSeat);
    /***********************************************************************/


    flagCheck = 0 ;
}
    /*******************************************************************************************************************/

public void updateFlight()
{
    System.out.println("Enter last flight id ");
   String inputNewid = cin.next();
    checkIddefreants();
    if ( flagCheck == 0 )
    {

        editFlight();

    }


}
    /*******************************************************************************************************************/

public void removeFlight()
{

}
    /*******************************************************************************************************************/

public void flightSchedule()
{

}
    /*******************************************************************************************************************/

public void signout()
{

menus.menu();
}
    /*******************************************************************************************************************/

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
    /*******************************************************************************************************************/

public  int  checkIddefreants ()
{
    if ( !Print.flightObjects[countIdi].getFlightId().equals( inputId ) )
    {

        flagCheck = 1 ;

    }

    return flagCheck ;
}
    /*******************************************************************************************************************/


    public void editFlight ()
    {
        System.out.println("Enter new flight id");

        String inputNewid = cin.next();
        Print.flightObjects[countIdi].setFlightId(inputNewid);

        System.out.println("Enter new flight origin");

        String inputNewOrigin = cin.next();
        Print.flightObjects[countIdi].setFlightOrigin(inputNewOrigin);

        System.out.println("Enter new flight destination");
        String inputNewDestination = cin.next();
        Print.flightObjects[countIdi].setFlightDestination(inputNewDestination);

        System.out.println("Enter new flight date");
        String inputNewDate = cin.next();
        Print.flightObjects[countIdi].setFlightDate(inputNewDate);

        System.out.println("Enter new flight time ");
        String inputNewTime = cin.next();
        Print.flightObjects[countIdi].setFlightTime(inputNewTime);

        System.out.println("Enter new flight price");
        String inputNewPrice = cin.next();
        Print.flightObjects[countIdi].setFlightPrice(inputNewPrice);

        System.out.println("Enter new flight seat");
        String inputNewSeat = cin.next();
        Print.flightObjects[countIdi].setFlightPrice(inputNewSeat);


    }
    /*******************************************************************************************************************/


}
