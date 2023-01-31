import java.util.Scanner;
public class Main {
    public static void main(String[] args) {




        pop(celsius( fah()));





    }
    static String fah(){
        Scanner myObj = new Scanner(System.in);
        String f;

        // Enter temp and press Enter
        System.out.println("Enter tempature");
        f = myObj.nextLine();
        return f;
    }
    static double celsius(String a){
        int b=Integer.parseInt(a);
        double c=b-32;
        double d=c/0.555555555;
        return d;
    }
    static void pop(double a){
        System.out.println(a);

    }




}