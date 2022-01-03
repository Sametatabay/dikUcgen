import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a,b;
    double c;
    Scanner inp = new Scanner(System.in);


    System.out.println("First Value :");
    a= inp.nextInt();

    System.out.println("Second Value :");
    b=inp.nextInt();

    c=Math.sqrt((a*a) + (b*b));
    System.out.println("Hipotenus :"+c);

    }
}
