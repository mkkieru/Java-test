import java.util.Scanner;

public class favouriteColor {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle");

            Integer a = sc.nextInt();

        System.out.println("Enter the second side of the triangle");

        Integer b = sc.nextInt();

        System.out.println("Enter the third side of the triangle");

        Integer c = sc.nextInt();

        triangle sides = new triangle();

        System.out.println(sides.type(a,b,c));




    }
}