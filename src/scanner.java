import java.util.Scanner; // import the Scanner class

class MyClass {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String [] separeteString;

        // Enter Parametro and press Enter
        System.out.println("Parametro");
        String completeString = myObj.nextLine();
       // System.out.println("Parametro");


        separeteString = completeString.split("[\\%\\$\\|\\&\\.]");

        for (int i = 0; i <separeteString.length; i++){

        System.out.println("Data " + i + "is: " + separeteString[i]);
        }
    }
}
