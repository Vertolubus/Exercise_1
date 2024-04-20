//Задание 1.1
//public class Main
//{
//    public static void main(String[] args)
//    {
//        System.out.println("Hello, World!");
//    }
//}


//Задание 1.2
//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner (System.in);
//
//        System.out.println("Enter 3 double numbers: ");
//
//        double x = in.nextDouble();
//        double y = in.nextDouble();
//        double z = in.nextDouble();
//
//        double[] array = new double[3];
//        array[0] = x;
//        array[1] = y;
//        array[2] = z;
//
//
//        System.out.println("Multiplication = " + x * y * z);
//        System.out.println("Average = " + (x + y + z) / 3);
//
//        System.out.println("Sorted: ");
//
//        for(int i = 1; i < 3; i++)
//        {
//            for(int j = 0; j < 3 - i; j++)
//            {
//                if(array[j] > array[j + 1])
//                {
//                    double temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        for(int i = 0; i < 3; i++)
//        {
//            System.out.print(array[i] + " ");
//        }
//
//        in.close();
//    }
//}

//Задание 1.3
//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner (System.in);
//
//        System.out.println("Enter 3 double numbers: ");
//
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
//
//        int[] array = new int[3];
//        array[0] = x;
//        array[1] = y;
//        array[2] = z;
//
//
//        System.out.println("Multiplication = " + x * y * z);
//        System.out.println("Average = " + (x + y + z) / 3.0);
//
//        System.out.println("Sorted: ");
//
//        for(int i = 1; i < 3; i++)
//        {
//            for(int j = 0; j < 3 - i; j++)
//            {
//                if(array[j] > array[j + 1])
//                {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        for(int i = 0; i < 3; i++)
//        {
//            System.out.print(array[i] + " ");
//        }
//
//        in.close();
//    }
//}

//Задание 1.4
//import java.util.Scanner;
//public class Main
//{
//    public static void main (String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Print 3 double numbers (a,b,c): ");
//        double a = in.nextDouble();
//        double b = in.nextDouble();
//        double c = in.nextDouble();
//        double discriminant, x1, x2;
//
//        if(a != 0)
//        {
//            discriminant = Math.sqrt((b * b) - (4 * a * c));
//
//            if (discriminant >= 0)
//            {
//                if(discriminant > 0)
//                {
//                    x1 = (-b - discriminant) / (2 * a);
//                    x2 = (-b + discriminant) / (2 * a);
//                    System.out.println("Roots of an equation: X1 = " + x1 + "X2 = " + x2);
//                }
//                else
//                {
//                    x1 = -b / (2 * a);
//                    System.out.println("Root of an equation: X = " + x1);
//                }
//            }
//            else
//            {
//                System.out.println("No roots. Discriminant < 0");
//            }
//        }
//        else
//        {
//            if(b != 0)
//            {
//                x1 = (-c) / b;
//                System.out.println("Root of an equation: X = " + x1);
//            }
//            else
//            {
//                if(c != 0)
//                {
//                    System.out.println("No roots. A and B = 0, C != 0");
//                }
//                else
//                {
//                    System.out.println("Any root is suitable. A, B, C = 0");
//                }
//            }
//        }
//        in.close();
//    }
//}

//Задание 1.5
//import java.util.Scanner;
//public class Main
//{
//    public static void main (String[] args)
//    {
//        Scanner in = new Scanner (System.in);
//
//        System.out.println("Enter the segment on which you want to tabulate the function: ");
//        double x1 = in.nextDouble();
//        double x2 = in.nextDouble();
//
//        if(x1 > x2)
//        {
//            double temp = x1;
//            x1 = x2;
//            x2 = temp;
//        }
//
//        System.out.println("Enter function step: ");
//        double stepFunc = in.nextDouble();
//        while(stepFunc <= 0)
//        {
//            System.out.println("Step function should be > 0. Enter function step: ");
//            stepFunc = in.nextDouble();
//
//        }
//
//        System.out.println("Function tabulation: ");
//        for(double i = x1; i < x2; i += stepFunc)
//        {
//            System.out.println("X value: " + i);
//            System.out.println("Function value: " + Math.sin(i));
//        }
//
//        in.close();
//    }
//}

//Задание 1.6
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter coefficients of equations with two variables: ");
        System.out.println("The equation has the following form: Ax + By = M");

        double Ax = in.nextDouble();
        double By = in.nextDouble();
        double M = in.nextDouble();
        double Cx = in.nextDouble();
        double Dy = in.nextDouble();
        double N = in.nextDouble();
        double x, y;

        double delta = (Ax * Dy) - (By * Cx);

        if(delta == 0)
        {
            double deltaX = (M * Dy) - (N * By);
            double deltaY = (Ax * N) - (Cx * M);

            if(deltaX == 0 && deltaY == 0)
            {
                System.out.println("The system has infinitely many solutions");
            }
            if(deltaX != 0 && deltaY != 0)
            {
                System.out.println("The system has no solutions");
            }
        }
        else
        {
            double deltaX = (M * Dy) - (N * By);
            double deltaY = (Ax * N) - (Cx * M);

            x = deltaX / delta;
            y = deltaY / delta;

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
}

//Задание 1.7
//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the precision for calculating the exp(x) function.");
//        double precision = in.nextDouble(); //точность ряда Тейлора
//
//        System.out.println("Enter X values");
//        double x = in.nextDouble();
//
//        double factorial = 1;
//        double eTaylor = 1;
//        double taylorElement = 1;
//        int i = 1;
//
//        while(Math.abs(taylorElement) > precision)
//        {
//            factorial *= i;
//            taylorElement = (Math.pow(x, i)) / factorial;
//            eTaylor += taylorElement;
//            i++;
//        }
//
//        System.out.println("exp(x) = " + Math.exp(x));
//        System.out.println("Taylor exp(x) = " + eTaylor);
//    }
//}


//        for(int i = 1; i <= precision; i++)
//        {
//            factorial *= i;
//            eTaylor += (Math.pow(x, i)) / factorial;
//        }


//    double eTaylor = 1;
//    double taylorElement = 0;
//    double factorial = 1;
//    int n = 2;

//        for(int i = 1; i <= n; i++)
//        {
//            factorial *= i;
//            eTaylor += (Math.pow(x, i)) / factorial;
//            if(Math.abs(eTaylor - Math.exp(x)) >= precision)
//            {
//                n += 1;
//            }
//        }