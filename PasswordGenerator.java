import java.util.Scanner;

public class PasswordGenerator {
    //generate password
    public static String passwordGen(int type, int size) {
        String password = "";
        int num, count = 0;;
        char letter;


        if(type == 1) {
            while(count < size) {
                //num = (int)Math.floor(Math.random() * (max-min+1) + min);
                num = (int)Math.floor(Math.random() * (57-48+1) + 48);
                letter = (char)num;
                password += String.valueOf(letter);
                count += 1;
            }
        } else if (type == 2) {
            while(count < size) {
                int k = (int)Math.floor(Math.random() * (2-1+1) + 1);
                if(k == 1) {
                    num = (int)Math.floor(Math.random() * (90-65+1) + 65);
                } else {
                    num = (int)Math.floor(Math.random() * (122-97+1) + 97);
                }
                letter = (char)num;
                password += String.valueOf(letter);
                count += 1;
            }

        } else if (type == 3) {
            while(count < size) {
                int k = (int)Math.floor(Math.random() * (3-1+1) + 1);
                if(k == 1) {
                    num = (int)Math.floor(Math.random() * (90-65+1) + 65);
                } else if(k == 2){
                    num = (int)Math.floor(Math.random() * (122-97+1) + 97);
                } else {
                    num = (int)Math.floor(Math.random() * (57-48+1) + 48);
                }
                letter = (char)num;
                password += String.valueOf(letter);
                count += 1;
            }
            
        } else if (type == 4) {
            while(count < size) {
                int k = (int)Math.floor(Math.random() * (4-1+1) + 1);
                if(k == 1) {
                    num = (int)Math.floor(Math.random() * (90-65+1) + 65);
                } else if(k == 2){
                    num = (int)Math.floor(Math.random() * (122-97+1) + 97);
                }  else if(k == 3){
                    num = (int)Math.floor(Math.random() * (47-33+1) + 33);
                }  else {
                    num = (int)Math.floor(Math.random() * (57-48+1) + 48);
                }
                letter = (char)num;
                password += String.valueOf(letter);
                count += 1;
            }
            
        } else {
            System.out.println("Password Type Either 1, 2, 3 or 4!");
        }

        return password;
    }
    public static void main(String[] args) {
        int size, type;
        String pwd = "NULL";
        try (Scanner get = new Scanner(System.in)) {
            //catch InputMismatchError when input is not a digit
            System.out.println("\nType of password: \n[1] Digits only \n[2] Letters only \n[3] Digits & Letters mixture \n[4] Digits & Letters & Special characters \nMinimum Password Length is 4\n");
            try {
                System.out.print("Type of password: ");
                type = get.nextInt();
                System.out.print("Length of the password: ");
                size = get.nextInt();
                if(size >= 4) {
                    pwd = passwordGen(type,size);
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