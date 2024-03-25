import java.util.Scanner;

public class PasswordGenerator {
    //generate password
    public static String passwordGen(int size) {
        String password = "";
        int num ,max = 126, min = 33;
        char letter;

        int count = 0;
        while(count < size) {
            num = (int)Math.floor(Math.random() * (max-min+1) + min);
            letter = (char)num;
            password += String.valueOf(letter);
            count += 1;
        }

        return password;
    }
    public static void main(String[] args) {
        int size = 0;
        String pwd = "NULL";
        try (Scanner get = new Scanner(System.in)) {
            //catch InputMismatchError when input is not a digit
            try {
                System.out.println("Enter the length of the password[min length = 4]: ");
                size = get.nextInt();
                if(size >= 4) {
                    pwd = passwordGen(size);
                } else {
                    System.out.println("Password Length Should Be greater Than 4!");
                }
            } catch (Exception e) {
                System.out.println("Enter A Digit As A Value And Try Again!");
            }
        }
        System.out.println("Password: "+pwd);
    }
}