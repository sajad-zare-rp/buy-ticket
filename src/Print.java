import java.util.Scanner;

public class Print {
   static Signs entring = new Signs();
    static User[] userlist = new User[20];
    static User userEntering =new User();
    static Admin adminEntering = new Admin();
    static Flights[] flightObjects = new Flights[20];
    static Flights flightRun = new Flights() ;
    Scanner cin = new Scanner(System.in);

/***************************************************************************************************************/

    void welcome()
    {

        user_newer();
        flight_newer();
        flightDefualt();
        menu();
    }
    /****************************************************************************************************************/
        public void menu ()
        {
            System.out.println("Enter a number");
            System.out.println("1-sign up");
            System.out.println("2-sign in");
            int input = cin.nextInt();
            switch (input)
            {

                case 1 :
                    entring.signUp(userlist);
                    break;
                case 2:
                    entring.signIn(userlist);
                    break;
                default:
                    menu();
                    break;
            }
        }
        /****************************************************************************************************************/
        public static void user_newer()
        {
            for (int i = 0; i < userlist.length ; i++)
            {
                userlist[i] = new User();
            }
        }
        /****************************************************************************************************************/
    static public void flight_newer ()
    {
        for (int i = 0; i <flightObjects.length ; i++)
        {

            flightObjects[i] = new Flights() ;

        }
    }
    /*******************************************************************************************************************/

        public static void user_menu()
        {
            System.out.println("Enter a number ");
            System.out.println("1-change password");
            System.out.println("2-searching flight");
            System.out.println("3-booking ticket");
            System.out.println("4-ticket canceling");
            System.out.println("5-booked ticket");
            System.out.println("6-add charge");
            System.out.println("0-sign out");
            userEntering.user_menu();



        }
        /****************************************************************************************************************/
        public static void adminMenu()
        {
            System.out.println("Enter a number");
            System.out.println("1-add");
            System.out.println("2-update");
            System.out.println("3-remove");
            System.out.println("4-flight schedules");
            System.out.println("0-sign out");
            adminEntering.adminMenu();

        }
        /****************************************************************************************************************/
        public void searchPrint ()
        {
            System.out.println("Choose How To search ");
            System.out.println("1-Origin");
            System.out.println("2-Destination");
            System.out.println("3-Date");
            System.out.println("4-Time");
            System.out.println("5-Price");
            System.out.println("6-Id");

        }
        /****************************************************************************************************************/
public void printTable ()
{

    for (int i = 0; i <flightObjects.length ; i++)
    {





    }

}
    public void flightDefualt()
    {

        Print.flightObjects[0].setFlightId("WX-12");
        Print.flightObjects[0].setFlightDate("1401-12-10");
        Print.flightObjects[0].setFlightOrigin("Yazd");
        Print.flightObjects[0].setFlightDestination("Tehran");
        Print.flightObjects[0].setFlightTime("12:30");
        Print.flightObjects[0].setFlightPrice(700000);
        Print.flightObjects[0].setFlightSeat(51);
        /***************************************************************/
        Print.flightObjects[1].setFlightId("WZ-15");
        Print.flightObjects[1].setFlightOrigin("Mashad");
        Print.flightObjects[1].setFlightDestination("Ahvaz");
        Print.flightObjects[1].setFlightDate("1401-12-11");
        Print.flightObjects[1].setFlightTime("08:00");
        Print.flightObjects[1].setFlightPrice(900000);
        Print.flightObjects[1].setFlightSeat(245);
        /**************************************************************/
        Print.flightObjects[2].setFlightId("BG-22" );
        Print.flightObjects[2].setFlightOrigin("Shiraz");
        Print.flightObjects[2].setFlightDestination("Tabriz");
        Print.flightObjects[2].setFlightDate("1401-12-12");
        Print.flightObjects[2].setFlightTime("22:30" );
        Print.flightObjects[2].setFlightPrice(12);
        Print.flightObjects[2].setFlightSeat (1100000);



    }

    private void  print_flight() {

        System.out.print("\n\t\t\t\t\t\t\t\t\t\033[90m      << Flights List >>\033[97m\n");

        System.out.println("\033[35m");
        System.out.print("\t\t\t\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");
        System.out.print("\n\t\t\t\t\t");
        System.out.printf("| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s| %-1s|", "\033[33m  Flight ID  \033[35m", "\033[33m   Origins   \033[35m", "\033[33m  Destention  \033[35m", "\033[33m    Data    \033[35m", "\033[33m   Time   \033[35m", "\033[33m   Price   \033[35m", "\033[33m Seats \033[35m");
        System.out.println();
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
        }
        ;


        for (int i = 0; i < flightObjects.length; i++) {

            if (flightObjects[i].getFlightId() != null) {
                System.out.print("\033[35m\t\t\t\t\t");
                System.out.print("+---------------------------------------------------------------------------------------------+");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;


                System.out.print("\n\t\t\t\t\t");
                System.out.printf("|\033[97m    %-10s\033[35m|\033[97m    %-10s\033[35m|\033[97m    %-11s\033[35m|\033[97m %-12s\033[35m|\033[97m  %-9s\033[35m|\033[97m  %-10s\033[35m|\033[97m  %-4s\033[35m  ", flightObjects[i].getFlightId(), flightObjects[i].getFlightOrigin(), flightObjects[i].getFlightDestination(), flightObjects[i].getFlightDate(), flightObjects[i].getFlightTime(), flightObjects[i].getFlightPrice(), flightObjects[i].getFlightSeat());
                System.out.println("|");
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                }
                ;
            }
        }

        System.out.print("\t\t\t\t\t");
        System.out.print("+---------------------------------------------------------------------------------------------+");

        System.out.println("\t\t\t\t\t Press something to go back");
        while (true) {
            String go_back = cin.next();

            adminMenu();

            break;
        }
    }


}
