import java.util.Scanner;

public class Signs {
    Scanner cin = new Scanner(System.in);
    Print print_menu = new Print();
    /********************************************************************************************************************/
    static String input_us;
    static String input_pass;
    static String inptu_in;
    static String inputp_in;
   static int counter = 0;
   static int flag = 0;
   static int flag_in = 0;
   static int count_in = 0;
/************************************************************************************************************************/
    /**
     *
     * @param userList
     * creating account
     */
    public void signUp(User[] userList) {

        System.out.println("Enter username and password");
        System.out.println("username :");
        System.out.println("password :");

        input_us = cin.next();
        input_pass = cin.next();
        if ( inptu_in.equals("admin") )
        {
            signUp(userList);
        }
        searchUp(userList);
        if (flag == 0) {
            userList[counter].setUsername(input_us);
            userList[counter].setPassword(input_pass);



            counter++;
            print_menu.menu();

        } else {

            signUp(userList);

        }


    }
    /*********************************************************************************************************************/

    /**
     *
     * @param userlist
     * Entering account
     */

    public void signIn(User[] userlist ) {
        System.out.println("Enter your username nad password");
        System.out.println("username :");
        System.out.println("password");

        inptu_in = cin.next();
        inputp_in = cin.next();
        if (inptu_in.equals("admin") && inputp_in.equals("admin"))
        {

            print_menu.adminMenu();

        }
        searcingIn(userlist);
        if (flag_in == 1)
        {
            print_menu.user_menu();
        }
        else

        {
            signIn(userlist);
        }


    }
    /*********************************************************************************************************************/

    /**
     *
     * @param userList
     * @return flag
     * checking the differentc username
     */


    public int searchUp(User[] userList) {
        flag = 0 ;
        for (int i = 0; i < userList.length; i++) {
            if (userList[i] != null && userList[i].getUsername()!=null && userList[i].getUsername().equals(input_us)) {
                flag = 1;

            }
        }
        return flag;

    }
    /*********************************************************************************************************************/

    public int searcingIn(User[] userList ) {
        for (int i = 0; i < userList.length; i++) {
            if (userList[i] != null && userList[i].getUsername()!=null && userList[i].getUsername().equals(inptu_in)) {
                if (userList[i].getPassword().equals(inputp_in)) {
                    flag_in = 1;
                    count_in = i;

                }
            }

        }
        return flag_in;
    }
    /*********************************************************************************************************************/


}
