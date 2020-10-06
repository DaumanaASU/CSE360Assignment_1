

package cse360assignment02;
import java.util.*;

public class Maintest {
    public static void main (String[] args)
    {
        char input1 = 'Z';
        int value =0;
        Scanner scan = new Scanner(System.in);

        printMenu();
        AddingMachine machine = new AddingMachine();

        do  // will ask for user input
        {
            System.out.println("What action would you like to perform?");
            input1 = scan.next().charAt(0);


                // matches one of the case statement
                switch (input1)
                {
                    case 'A':

                        System.out.print("Enter value:\n");
                        value = scan.nextInt();
                        machine.add(value);
                        System.out.println(machine.getTotal());
                        break;
                    case 'S':
                        System.out.print("Enter value:\n");
                        value = scan.nextInt();
                        machine.subtract(value);
                        System.out.println(machine.getTotal());
                        break;
                    case 'Q':   //Quit
                        break;
                    case 'P':
                        System.out.println(machine.toString());
                        break;
                    case 'C':
                        machine.clear();
                        break;
                    default:
                        System.out.print("Unknown action\n");
                        break;
                }

        } while (input1 != 'Q');


    }
    public static void printMenu()
    {
        System.out.print("Choice\t\tAction\n" +
                "------\t\t------\n" +
                "A\t\tAdd\n" +
                "S\t\tSubtract\n" +
                "P\t\tPrint Memory\n" +
                "C\t\tClear Memory\n" +
                "Q\t\tQuit\n");
    }
}
