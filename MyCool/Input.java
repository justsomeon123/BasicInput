package MyCool;
//says error this is FALSE

import java.util.ArrayList;
import java.util.List;

public  class Input {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static Boolean isClosed = false;

    public static List<String> ask(String prompt) throws java.io.IOException,ForcedException {
        if (isClosed == true){
            throw new ForcedException("Scanner of object is closed");
        }
        else{
            System.out.print(prompt);
            String x = scanner.nextLine();
            final List<String> List = new ArrayList<String>();
            List.add(prompt);
            List.add(x);
            return List;
        }
    }

    public void close() throws java.io.IOException {
        scanner.close();
        isClosed = true;
    }
}
            
final class ForcedException extends Exception {
    private String reason;

    public ForcedException(String Reason) {
        this.reason = Reason;
    }
    
    public void GetReason(){
        System.out.println(reason);
    };      
};