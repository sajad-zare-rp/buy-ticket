import java.util.Scanner;

public class Print {
   static Signs entring = new Signs();
    static User[] userlist = new User[20];
    static User userEntering =new User();
    static Admin adminEntering = new Admin();
    Scanner cin = new Scanner(System.in);



    void welcome()
    {
        user_newer();
       // flight_newer();
        //flight_defualt();
        menu();
    }
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
        public static void user_newer()
        {
            for (int i = 0; i < userlist.length ; i++)
            {
                userlist[i] = new User();
            }
        }

        public void user_menu()
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
        public void adminMenu()
        {
            System.out.println("Enter a number");
            System.out.println("1-add");
            System.out.println("2-update");
            System.out.println("3-remove");
            System.out.println("4-flight schedules");
            System.out.println("0-sign out");
            adminEntering.adminMenu();

        }

}
