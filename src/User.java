import java.util.Scanner;
import java.util.StringJoiner;

public class User
{
    private String username ;
    private String password ;
    private int valet ;



    /*********************************************************************************************************************/
    Signs signs_menu = new Signs();
    Print print_menus = new Print();
    Scanner cin = new Scanner(System.in);
    String  inputBookId ;
    int flag = 0 ;
    int flagBooking = 0 ;
    int checkCounter = 0 ;
    /*********************************************************************************************************************/
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
    public void setValet(int valet) {
        this.valet = valet;
    }

    public int getValet() {
        return valet;
    }
    /**********************************************************************************************************************/

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
/*************************************************************************************************************************/
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
        System.out.println("password change");
        Print.user_menu();



    }

    else
    {

        System.out.println("last password not correct ");
        change_pass();

    }




}
/**************************************************************************************************************************/
public void searching()
{

print_menus.searchPrint();
int inputSearch = cin.nextInt();
switch (inputSearch)
{
    case 1 :
    searchOrigin();
    break;
    case 2 :
    searchDestination();
        break;
    case 3 :
     searchDate();
        break;
    case 4 :
        searchTime();
        break;
    case  5 :
        searchPrice();
        break;
    case  6 :
        searchId();
        break;
    default:
         print_menus.searchPrint();
        break;




}
user_menu();
}
/************************************************************************************************************************/
public void booking_ticket()
{
    System.out.println("Enter Flight Id ");
      inputBookId = cin.next();
      checkFlightId() ;
      if ( flagBooking == 1 )
      {
          if ( Print.flightObjects[checkCounter].getFlightSeat() > 0 )
          {

              if ( Print.userlist[Signs.count_in].getValet() > Print.flightObjects[checkCounter].getFlightPrice() )
              {
                Print.userlist[Signs.count_in].setValet(Print.userlist[Signs.count_in].getValet() - Print.flightObjects[checkCounter].getFlightPrice());
                  System.out.println("booking done");
                  user_menu();

              }
              else
              {
                  System.out.println("Pleas charge your valet");
                  user_menu();
              }

          }
          System.out.println("all tickets selled");
          user_menu();
      }
      else
      {
          System.out.println("Flight not exist");
          user_menu();
      }




}
/*************************************************************************************************************************/
public void canceling()
{

}
/*************************************************************************************************************************/
public void booked_ticket()
{

}
/*************************************************************************************************************************/
public void charge()
{
    System.out.println("Enter How much do you want to charge");
    int inputValet = cin.nextInt();
    Print.userlist[Signs.count_in].setValet(inputValet);
    Print.user_menu();

}
/*************************************************************************************************************************/
public void sign_out()
{
    print_menus.menu();


}
/*************************************************************************************************************************/
public int checkPassword(String last_pass)

{
    flag = 0 ;
if (Print.userlist[Signs.count_in].getPassword().equals(last_pass))
    {
        flag = 1 ;
    }


return flag ;
}
/************************************************************************************************************************/
public void searchId()
{

    System.out.println("Enter flight id");
    int flag = 0 ;
    String inputId = cin.next();
    System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");

    System.out.println("\033[35m");
    System.out.print("\t\t\t\t\t");
    System.out.print("+---------------------------------------------------------------------------------------------+");
    System.out.print("\n\t\t\t\t\t");
    System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "\033[33m  Flight ID  \033[35m", "\033[33m   Origins   \033[35m", "\033[33m  Destention  \033[35m", "\033[33m    Data    \033[35m", "\033[33m   Time   \033[35m", "\033[33m   Price   \033[35m", "\033[33m Seats \033[35m");
    System.out.println();

    for (int i = 0; i < Print.flightObjects.length ; i++)
    {

        if ( Print.flightObjects[i].getFlightId()!=null && Print.flightObjects[i].getFlightId().equals(inputId) )
        {
            flag = 1 ;

            if (Print.flightObjects[i].getFlightId() != null)
            {
                System.out.print("\033[35m\t\t\t\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;


                System.out.print("\n\t\t\t\t\t");
                System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ", Print.flightObjects[i].getFlightId(), Print.flightObjects[i].getFlightOrigin(), Print.flightObjects[i].getFlightDestination(), Print.flightObjects[i].getFlightDate(), Print.flightObjects[i].getFlightTime(),Print.flightObjects[i].getFlightPrice(), Print.flightObjects[i].getFlightSeat());
                System.out.println("|");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;
            }



        }




    }
    if ( flag == 1 )
    {

        Print.user_menu();

    }
    else
    {
        System.out.println("Id not exist");
        Print.user_menu();
    }







}
/*************************************************************************************************************************/
public void searchOrigin ()
{


    int flag = 0 ;
    String inputOrigin = cin.next();
    System.out.println("Enter flight origin");
    System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");

    System.out.println("\033[35m");
    System.out.print("\t\t\t\t\t");
    System.out.print("+---------------------------------------------------------------------------------------------+");
    System.out.print("\n\t\t\t\t\t");
    System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "\033[33m  Flight ID  \033[35m", "\033[33m   Origins   \033[35m", "\033[33m  Destention  \033[35m", "\033[33m    Data    \033[35m", "\033[33m   Time   \033[35m", "\033[33m   Price   \033[35m", "\033[33m Seats \033[35m");
    System.out.println();
    for (int i = 0; i < Print.flightObjects.length ; i++)
    {

        if ( Print.flightObjects[i].equals(inputOrigin) )
        {
            flag = 1 ;
            if (Print.flightObjects[i].getFlightId() != null)
            {
                System.out.print("\033[35m\t\t\t\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;


                System.out.print("\n\t\t\t\t\t");
                System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ", Print.flightObjects[i].getFlightId(), Print.flightObjects[i].getFlightOrigin(), Print.flightObjects[i].getFlightDestination(), Print.flightObjects[i].getFlightDate(), Print.flightObjects[i].getFlightTime(),Print.flightObjects[i].getFlightPrice(), Print.flightObjects[i].getFlightSeat());
                System.out.println("|");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;
            }


        }


    }
    if ( flag == 1  )
    {
        Print.user_menu();
    }
    else
    {
        System.out.println("Origin not exist");
        Print.user_menu();
    }



        System.out.println("Flight Not Exist");
    user_menu();



}
/*************************************************************************************************************************/
public void searchDestination()

{
    System.out.println("Enter Destination");
    int flag = 0 ;
    String inputDest = cin.next();
    System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");

    System.out.println("\033[35m");
    System.out.print("\t\t\t\t\t");
    System.out.print("+---------------------------------------------------------------------------------------------+");
    System.out.print("\n\t\t\t\t\t");
    System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "\033[33m  Flight ID  \033[35m", "\033[33m   Origins   \033[35m", "\033[33m  Destention  \033[35m", "\033[33m    Data    \033[35m", "\033[33m   Time   \033[35m", "\033[33m   Price   \033[35m", "\033[33m Seats \033[35m");
    System.out.println();
    for (int i = 0; i < Print.flightObjects.length;  i++)
    {

        if ( Print.flightObjects[i].getFlightDestination().equals(inputDest) )
        {
            flag = 1;
            if (Print.flightObjects[i].getFlightId() != null)
            {
                System.out.print("\033[35m\t\t\t\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;


                System.out.print("\n\t\t\t\t\t");
                System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ", Print.flightObjects[i].getFlightId(), Print.flightObjects[i].getFlightOrigin(), Print.flightObjects[i].getFlightDestination(), Print.flightObjects[i].getFlightDate(), Print.flightObjects[i].getFlightTime(),Print.flightObjects[i].getFlightPrice(), Print.flightObjects[i].getFlightSeat());
                System.out.println("|");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;
            }
        }

    }
    if ( flag == 1  )
    {
        Print.user_menu();
    }
    else
    {
        System.out.println("destination not exist");
        Print.user_menu();
    }
}
/**************************************************************************************************************************/
public void searchDate()
{

    System.out.println("Enter Date Of flight ");
    int flag = 0;
    String inputDate = cin.next();
    System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");

    System.out.println("\033[35m");
    System.out.print("\t\t\t\t\t");
    System.out.print("+---------------------------------------------------------------------------------------------+");
    System.out.print("\n\t\t\t\t\t");
    System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "\033[33m  Flight ID  \033[35m", "\033[33m   Origins   \033[35m", "\033[33m  Destention  \033[35m", "\033[33m    Data    \033[35m", "\033[33m   Time   \033[35m", "\033[33m   Price   \033[35m", "\033[33m Seats \033[35m");
    System.out.println();
    for (int i = 0; i < Print.flightObjects.length ; i++)
    {
        if ( Print.flightObjects[i].getFlightDate().equals(inputDate) )
        {
            if (Print.flightObjects[i].getFlightId() != null)
            {
                flag = 1 ;
                System.out.print("\033[35m\t\t\t\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;


                System.out.print("\n\t\t\t\t\t");
                System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ", Print.flightObjects[i].getFlightId(), Print.flightObjects[i].getFlightOrigin(), Print.flightObjects[i].getFlightDestination(), Print.flightObjects[i].getFlightDate(), Print.flightObjects[i].getFlightTime(),Print.flightObjects[i].getFlightPrice(), Print.flightObjects[i].getFlightSeat());
                System.out.println("|");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;
            }
        }

    }
    if ( flag == 1  )
    {
        Print.user_menu();
    }
    else
    {
        System.out.println("date not exist");
        Print.user_menu();
    }

}
/*************************************************************************************************************************/
public void searchTime ()
{
    System.out.println("Enter Flight,s Time ");
    int flag = 0 ;
    String inputTime = cin.next();
    System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");

    System.out.println("\033[35m");
    System.out.print("\t\t\t\t\t");
    System.out.print("+---------------------------------------------------------------------------------------------+");
    System.out.print("\n\t\t\t\t\t");
    System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "\033[33m  Flight ID  \033[35m", "\033[33m   Origins   \033[35m", "\033[33m  Destention  \033[35m", "\033[33m    Data    \033[35m", "\033[33m   Time   \033[35m", "\033[33m   Price   \033[35m", "\033[33m Seats \033[35m");
    System.out.println();
    for (int i = 0; i <Print.flightObjects.length ; i++)
    {

        if ( Print.flightObjects[i].getFlightTime().equals(inputTime) )
        {
            flag = 1 ;
            if (Print.flightObjects[i].getFlightId() != null)
            {
                System.out.print("\033[35m\t\t\t\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;


                System.out.print("\n\t\t\t\t\t");
                System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ", Print.flightObjects[i].getFlightId(), Print.flightObjects[i].getFlightOrigin(), Print.flightObjects[i].getFlightDestination(), Print.flightObjects[i].getFlightDate(), Print.flightObjects[i].getFlightTime(),Print.flightObjects[i].getFlightPrice(), Print.flightObjects[i].getFlightSeat());
                System.out.println("|");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;
            }
        }

    }
    if ( flag == 1  )
    {
        Print.user_menu();
    }
    else
    {
        System.out.println("time not exist");
        Print.user_menu();
    }
}
/*************************************************************************************************************************/
public void searchPrice ()
    {
        System.out.println("Enter Flight,s Price");
        int flag = 0 ;
        int inputPrice = cin.nextInt();
        System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");

        System.out.println("\033[35m");
        System.out.print("\t\t\t\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");
        System.out.print("\n\t\t\t\t\t");
        System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "\033[33m  Flight ID  \033[35m", "\033[33m   Origins   \033[35m", "\033[33m  Destention  \033[35m", "\033[33m    Data    \033[35m", "\033[33m   Time   \033[35m", "\033[33m   Price   \033[35m", "\033[33m Seats \033[35m");
        System.out.println();
        for (int i = 0; i <Print.flightObjects.length ; i++)
        {

            if ( Print.flightObjects[i].getFlightPrice() == (inputPrice) )
            {
                flag = 1 ;
                if (Print.flightObjects[i].getFlightId() != null)
                {
                    System.out.print("\033[35m\t\t\t\t\t");
                    System.out.print("+---------------------------------------------------------------------------------------------+");
                    try {
                        Thread.sleep(80);
                    } catch (InterruptedException e) {
                    }
                    ;


                    System.out.print("\n\t\t\t\t\t");
                    System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ", Print.flightObjects[i].getFlightId(), Print.flightObjects[i].getFlightOrigin(), Print.flightObjects[i].getFlightDestination(), Print.flightObjects[i].getFlightDate(), Print.flightObjects[i].getFlightTime(),Print.flightObjects[i].getFlightPrice(), Print.flightObjects[i].getFlightSeat());
                    System.out.println("|");
                    try {
                        Thread.sleep(80);
                    } catch (InterruptedException e) {
                    }
                    ;
                }
            }


        }
        if ( flag == 1  )
        {
            Print.user_menu();
        }
        else
        {
            System.out.println("price not exist");
            Print.user_menu();
        }

    }
    /**********************************************************************************************************************/
    public int checkFlightId()
    {
        for (int i = 0; i < Print.flightObjects.length ; i++)

        {

            if ( Print.flightObjects[i].getFlightId().equals(inputBookId) )
            {
                checkCounter = i ;
                flagBooking = 1 ;
            }
            else
            {
                notExist();
            }

        }
        return flagBooking ;



    }
    public void notExist ()
    {
        System.out.println("Fight not exist");
    }

}

