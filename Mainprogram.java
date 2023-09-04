import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Mainprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sign in :");
        System.out.println("Enter your desired username");
        String username = sc.nextLine();
        System.out.println("Enter your desired password");
        String password = sc.nextLine();

        System.out.println("Thank you for signing up, please log in");

        System.out.print("Enter the username: ");
        String user_username = sc.nextLine();

        System.out.print("Enter the password: ");
        String user_password = sc.nextLine();

        if (user_username.equals(username) && user_password.equals(password)) {



            System.out.println("Login Success!, Hi,"+ user_username+ " Please Pick a Program");
            System.out.println("1) Calculator");
            System.out.println("2) Greatest Number Finder");
            System.out.println("3) Result Calculator");
            System.out.println("4) Guessing Game");

            System.out.println("Pick a program by entering its number");
            int program_number = sc.nextInt();
            //Calculator
            if(program_number==1){

                System.out.println("\t\t\t\tcalculator");

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter operator: + , - , *, /");
                char operator = sc.next().charAt(0);

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                double result = 0;

                switch (operator) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        System.out.println("operator not found");
                        break;
                }

                System.out.println("the answer is" + result);

            }

            //Greatest number finder
            else if(program_number == 2){


                System.out.println("Enter the first Number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();
                System.out.println("Enter the third number");
                int c = sc.nextInt();


                if (a >= b && a >= c) {
                    System.out.println("The greatest number is " + a);
                } else if (b >= a && b >= c) {
                    System.out.println("The greatest number is " + b);
                } else {
                    System.out.println("The greatest number is: " + c);
                }

            }
            // Result Calculator
            else if (program_number == 3){


                System.out.println("Enter Marks in Chemistry");
                float chem = sc.nextFloat();

                System.out.println("Enter Marks in Math");
                float maths = sc.nextFloat();

                System.out.println("Enter Marks in Physics");
                float physics = sc.nextFloat();

                float totalgottenmarks = chem + maths + physics;
                float percentage = (float) ((totalgottenmarks*100) / 300);
                System.out.println("Your total percentage is "+ percentage+ "%");

                if (percentage<25)
                {
                    System.out.println("Your Grade : D");
                }
                else if (percentage>25 && percentage<50)
                {
                    System.out.println("Your Grade : C ");
                }
                else if (percentage>50 && percentage<75) {

                    System.out.println("Your Grade : B ");
                } else if (percentage>75 && percentage<90) {
                    System.out.println("Your Grade : A");
                } else if (percentage>90 && percentage<100) {
                    System.out.println("Your Grade : A+");
                }

            }
            //Guessing Game
            else if(program_number==4){
                Random random = new Random();
                int mainnumber = random.nextInt(10);
                System.out.println("Guess The Number! ");
                int guess = sc.nextInt();

                if (guess > mainnumber){

                    System.out.println("A Little Higher");
                }

                else if (guess < mainnumber){
                    System.out.println(" A Little Lower");
                }
                else if(guess == mainnumber){
                    System.out.println("VICTORY!!");
                }
                else{
                    System.out.println("Try Again");
                }


            }



        }

        else {
            System.out.println("Invalid ID");
        }
    }
}

