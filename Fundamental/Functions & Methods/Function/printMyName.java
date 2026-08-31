import java.util.*;
public class printMyName {

    //Function Declaration
    public static void Name(String name){
        System.out.println(name);
        return;
    }

    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        Name(name); //----> Function call
    }
}