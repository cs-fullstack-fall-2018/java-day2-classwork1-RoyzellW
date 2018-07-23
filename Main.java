import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.print("How awesome is kenn and kevin? ");
        String quit = userInput.nextLine();
        while (! quit.equals ("very awesome")){
            System.out.print("How awesome is kenn and kevin? ");
            quit = userInput.nextLine();
        }

        Scanner userPasswordInput = new Scanner(System.in);
        String enter12 = userPasswordInput.nextLine();
        String confirmPassword = "Black";


        while (! enter12.equals(confirmPassword)){
            System.out.print("Enter correct password: ");
            enter12 = userPasswordInput.nextLine();

    }

    int number1 = 0;
        int number2 = 100;


        while (number1!=(number2)){
            number1 = number1 + 1;
            System.out.println(number1);
        }



        int i = 0;
        while (i<100){
            i +=2;
            System.out.println(i);
        }

    }}