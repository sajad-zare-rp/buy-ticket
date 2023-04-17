import java.util.Scanner;

public class Admin
{
Scanner cin = new Scanner(System.in);
Print menus = new Print() ;
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
public void addedFlight()
{


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

}
