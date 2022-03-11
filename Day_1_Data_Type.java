import java.util.Scanner;

public class Day_1_Data_Type {
    public static void main(String[] args) {
        //Data Type in java
        // Intager Data Types byte short int long
        // use according to your requirement
        byte a=120;         //store small number 2 to 3 digit number according to range
        short b=20000;      //store 4 to 5 digit number according to range
        int c=300000000;    //store 8 to 9 digit number according to range
        long d=400000000;   //store long integer value
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
        // Taking user inpur using scanner class
        // To use scanner class firstly create object of scanner class

        Scanner sc=new Scanner(System.in);  //create object of scanner class sc is a object.
        System.out.println("Enter First Number");   //use to print statement on screen
        int No1=sc.nextInt();       //using this statement accept user input
        System.out.println("Enter second number");
        int No2=sc.nextInt();
        int sum=No1+No2;
        System.out.println("Addition Of "+No1+" and "+No2+" is = "+sum);

    }
}
