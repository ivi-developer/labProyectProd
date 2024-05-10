package back;
import java.util.Scanner;
public class User{
    protected Scanner scanner=new Scanner(System.in);
    private String nick;
    private String password;
    public User(String nick,String password){
        this.nick=nick;
        this.password=password;
    }
    public User(){}
    protected void setNick(String nick){this.nick=nick;}
    protected String getNick(){return nick;}
    protected void setPassword(String password){this.password=password;}

    @Override
    public String toString() {
        return "User{" +
                " nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
