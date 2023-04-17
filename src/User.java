import java.util.Scanner;

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
        Print.userlist[0].setPassword(newPass);



    }

            else
    {

        System.out.println("last password not correct ");
        change_pass();

    }





}

public void searching()
{

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
if (Print.userlist[0].getPassword().equals(last_pass))
    {
        flag = 1 ;
    }


return flag ;
}
}
