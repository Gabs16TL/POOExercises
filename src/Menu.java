import java.util.Scanner;


/* Indicaciones del menú 1
 * Diseñar un algoritmo que pida un número por teclado y luego imprima el número siguiente al ingresado.
 * Diseñar un algoritmo que, dados tres números enteros, calcule e imprima el promedio entre ellos.
 * Diseñar un algoritmo que imprima el área y el perímetro de un rectángulo ingresando su base y altura.
 * Diseñar un algoritmo que genere un número aleatorio del 0 al 200, lo muestre y luego calcule y muestre el mismo número aumentado en un 30%
 * */


public class Menu {

    public static void main(String[] args) {
        int Action = 0;

        do {
            ShowMenu();
            Scanner userInputReader = new Scanner(System.in);
            Action = Integer.parseInt(userInputReader.nextLine());
            Resolve(Action);
        }
        while (Action <= 4);
    }

    public static void ShowMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("| You are going to see 4 different actions|");
        System.out.println("| 1 | Next number");
        System.out.println("| 2 | Average");
        System.out.println("| 3 | Area and perimeter");
        System.out.println("| 4 | Random Number");
        System.out.println("| 5 | Goodbye");
        System.out.println("-----------------------------------------");
        System.out.println("Select the number of the action, please:");
    }

    public static void Resolve(int Action) {
        int[] addition = new int[3];
        double[] measurements = new double[2];
        switch (Action) {
            case 1:
                System.out.println("You chose: Next Number");
                System.out.println("Type a number, please:");
                Scanner next = new Scanner(System.in);

                NextNumber Next = new NextNumber();
                int Caught = Next.CatchNumber(next.nextInt());
                System.out.println("The next number is: " + Next.FindNext(Caught));
                break;
            case 2:
                System.out.println("You chose: Average");
                for (int i = 0; i <= 2; i++) {
                    System.out.println("Type a number, please:");
                    Scanner numbers = new Scanner(System.in);
                    addition[i] = numbers.nextInt();
                }
                Average Avg = new Average();
                System.out.println("The addition is: " + Avg.Add(addition[0], addition[1], addition[2]));

                int NumbersForAverage = Avg.Add(addition[0], addition[1], addition[2]);
                System.out.println("The average of the numbers is: " + Avg.ObtainAverage(NumbersForAverage));
                break;

            case 3:
                System.out.println("You chose: Area and perimeter");
                System.out.println("We need you type the width and the height");

                for (int i = 0; i < 2; i++) {
                    System.out.println("Type a measure, please:");
                    Scanner measures = new Scanner(System.in);
                    measurements[i] = measures.nextInt();
                }
                Measurements Rectangle = new Measurements();

                System.out.println("The area for the rectangle is: " + Rectangle.FindArea(measurements[0], measurements[1]));
                System.out.println("The perimeter for the rectangle is: " + Rectangle.FindPerimeter(measurements[0], measurements[1]));
                break;

            case 4:
                System.out.println("You chose: Random Number");

                RandomNumber RndNumber = new RandomNumber();
                int RandomNumber = RndNumber.GetRandomNumber();
                System.out.println("We will give you a random number: " + RandomNumber);

                System.out.println("The number incresead in 30%: " + RndNumber.RandomNumberIncresead(RandomNumber));
                break;
            case 5:
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("Please select a number from 1-5");
                break;
        }
    }

}

