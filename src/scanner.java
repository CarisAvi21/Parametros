import java.util.Scanner; // import the Scanner class

class MyClass {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String [] separeteString;

        // Enter Parametro and press Enter
        System.out.println("Parametro");
        String completeString = myObj.nextLine();
       // System.out.println("Parametro");


        separeteString = completeString.split("(%)");

        for (int i = 0; i <separeteString.length; i++){

        System.out.println("Data " + i + "is: " + separeteString[i]);
        }
    }
}

    // public static void main (String[] args){
      //  String[] separeteString;


//for (int i = 0; i < separeteString.length; i++){
        //String  completeString = "%7B%22programId%22:%229999%22,%22locationId%22:%229999%22,%22recruiterSide%22:false,%22needsAggregateGrade%22:false,%22stageName%22:%22registrationForm%22,%22country%22:%22gb%22%7D";
        //separeteString = completeString.split("(%)");
          //  System.out.println("data " + i + " is: " + separeteString[i]);
        //}
    //}
//}
