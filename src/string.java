public class string {

    public static void main (String[] args){
        String[] separeteString;

        String  completeString = "%7B%22programId%22:%229999%22,%22locationId%22:%229999%22,%22recruiterSide%22:false,%22needsAggregateGrade%22:false,%22stageName%22:%22registrationForm%22,%22country%22:%22gb%22%7D";
        separeteString = completeString.split("(%)");

        for (int i = 0; i < separeteString.length; i++){
            System.out.println("data " + i + " is: " + separeteString[i]);
        }
    }
}
