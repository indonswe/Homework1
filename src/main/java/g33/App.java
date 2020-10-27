package g33;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {

        //For added functionality take away the following signs "//" from every row except this one

        String myName = "Adrian";
        System.out.println(myName);

        String firstName = "Adrian";
        String lastName = "Nilsson";
        System.out.println(firstName + " " + lastName);

        Double number1 = 1.23, number2 = 3.45, result;
        result = number1 + number2;
        //System.out.println(result = number1 + number2);

        Car typeR = new Car();
        typeR.brand = "Honda";
        typeR.regNumber = "crx 123";
        typeR.maxSpeed = 270;
        typeR.ownerName = "Kalle Anka";
        //System.out.println(typeR.getInformation());


        int score = 89;
        if (score >= 65){
            System.out.println("you passed");
        }else{
            System.out.println("you did not pass");
        }

        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        //System.out.println(answer);



    }

}

class Car{
    String brand;
    String regNumber;
    int maxSpeed;
    String ownerName;

    //public String getInformation() {
    //    return ownerName + " owns a " + brand + " with regnr: " + regNumber + " that has a maxspeed of " + maxSpeed + " km/h.";
    //}
}
