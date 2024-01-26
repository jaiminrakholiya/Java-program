import java.util.Scanner;

public class Temperatare {
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Please enter temperatare in celsius: ");
    float tempc=input.nextFloat();
    float tempf=(tempc*9 / 5)+32;
    System.out.println(tempf);
}
    
}