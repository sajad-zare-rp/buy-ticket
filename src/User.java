import java.util.Scanner;
import java.util.StringJoiner;

public class User
{
    private String username ;
    private String password ;
    Signs signs_menu = new Signs();
    Print print_menus = new Print();
    Scanner cin = new Scanner(System.in);
    int flag = 0 ;
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

public void user_menu()
{
    int input_user = cin.nextInt() ;
    switch (input_user)
    {

        case 1 :
            change_pass();
            break;
        case 2 :
            searching();
            break;
        case  3 :
            booking_ticket();
            break;
        case 4 :
            canceling();
            break;
        case 5 :
            booked_ticket();
            break;
        case 6 :
            charge();
            break;
        case 0 :
            sign_out();
            break;

    }

}
public void change_pass()
{
    System.out.println("Enter last password");
    String last_pass = cin.next();
    checkPassword(last_pass);
    if ( flag == 1 )
    {
        System.out.println("Enter a new password");
        String newPass = cin.next();
        Print.userlist[Signs.count_in].setPassword(newPass);



    }

            else
    {

        System.out.println("last password not correct ");
        change_pass();

    }





}

public void searching()
{

print_menus.searchPrint();
int inputSearch = cin.nextInt();
switch (inputSearch)
{
    case 1 :
    searchOrigin();
    case 2 :
    searchDestination();
    case 3 :
     searchDate();
    case 4 :
        searchTime();
    case  5 :
        searchPrice();
    case  6 :
        searchId();
    default:
         print_menus.searchPrint();




}
}
public void booking_ticket()
{

}
public void canceling()
{

}
public void booked_ticket()
{

}
public void charge()
{

}
public void sign_out()
{
    print_menus.menu();


}
public int checkPassword(String last_pass)

{
    flag = 0 ;
if (Print.userlist[Signs.count_in].getPassword().equals(last_pass))
    {
        flag = 1 ;
    }


return flag ;
}
public void searchId()
{
    System.out.println("Enter flight id");
    String inputId = cin.next();
    for (int i = 0; i < Print.flightObjects.length ; i++)
    {

        if ( Print.flightObjects[i].getFlightId(). equals(inputId) )
        {
            System.out.println(Print.flightObjects[i]);

        }
        else

        {

            System.out.println("Id Not Exist");
            print_menus.user_menu();

        }

    }

}
public void searchOrigin ()
{

    System.out.println("Enter flight origin");
    String inputOrigin = cin.next();
    for (int i = 0; i < Print.flightObjects.length ; i++)
    {

        if ( Print.flightObjects[i].equals(inputOrigin) )
        {
            System.out.println(Print.flightObjects[i]);

        }
        else

        {
            System.out.println("Flight Not Exist");
        }

    }

}
public void searchDestination()

{
    System.out.println("Enter Destination");
    String inputDest = cin.next();
    for (int i = 0; i < Print.flightObjects.length;  i++)
    {

        if ( Print.flightObjects[i].getFlightDestination().equals(inputDest) )
        {
            System.out.println(Print.flightObjects[i]);
        }

    }
}
public void searchDate()
{

    System.out.println("Enter Date Of flight ");
    String inputDate = cin.next();
    for (int i = 0; i < Print.flightObjects.length ; i++)
    {
        if ( Print.flightObjects[i].getFlightDate().equals(inputDate) )
        {
            System.out.println(Print.flightObjects[i]);
        }
        else

        {
            System.out.println("Flight Not Exist");
        }
    }

}
public void searchTime ()
{
    System.out.println("Enter Flight,s Time ");
    String inputTime = cin.next();
    for (int i = 0; i <Print.flightObjects.length ; i++)
    {

        if ( Print.flightObjects[i].getFlightTime().equals(inputTime) )
        {
            System.out.println(Print.flightObjects[i]);
        }
        else

        {
            System.out.println("Flight Not Exist");
        }

    }
}
public void searchPrice ()
    {
        System.out.println("Enter Flight,s Price");
        String inputPrice = cin.next();
        for (int i = 0; i <Print.flightObjects.length ; i++)
        {

            if ( Print.flightObjects[i].getFlightPrice().equals(inputPrice) )
            {
                System.out.println(Print.flightObjects[i]);
            }
            else

            {
                System.out.println("Flight Not Exist");
            }

        }

    }
}
