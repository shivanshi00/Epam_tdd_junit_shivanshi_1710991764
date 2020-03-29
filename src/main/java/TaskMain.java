import java.util.Scanner;

public class TaskMain {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        RemoveCharacters removingCharacters = new RemoveCharacters();
        System.out.println("Enter String:  ");
        String str = removingCharacters.checkString(scanner.next());
        System.out.println("Final String : " + str);

    }
}
