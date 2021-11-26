import java.util.Scanner;

public class Agrawacu_lab4 {
    public static void main(String args[]){

        char userChar;
        int userInt;
        double userDbl;
        String Val;

        Scanner in = new Scanner(System.in);
        userChar = '\0';
        userInt = 0;
        userDbl = 0.0;

        do{

            System.out.println("c-(for character)"
                    +  "\ni-(for integer)"
                    + "\nd-(for double)");
            Val = in.nextLine();


            if(Val.equalsIgnoreCase("c")){
                System.out.println("Enter a character");
                String valChar = in.nextLine();
                userChar = valChar.charAt(0);
                System.out.println(userChar);
            } else if(Val.equalsIgnoreCase("i")){
                System.out.println("Enter an integer value");
                String valInt = in.nextLine();
                userInt = Integer.parseInt(valInt);
                System.out.println(userInt);
            } else if(Val.equalsIgnoreCase("d")){
                System.out.println("Enter a double value");
                String valDbl = in.nextLine();
                userDbl = Double.parseDouble(valDbl);
                System.out.println(userDbl);
            } else if(Val.equalsIgnoreCase("x")){
                Val = "x";
                System.out.println("Integers: " + userInt +
                        " \nDoubles: " + userDbl + " \nCharacters: " + userChar);
            }
        } while(!(Val.equalsIgnoreCase("x")));

    }
}
