package MyCool;
//says error this is FALSE

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Hello World!");
        Input x = new Input();  
        try{
            System.out.print(Input.ask("Main: "));
            System.out.print(Input.ask("Minor: "));
            x.close();
            System.out.print(Input.ask("Hi:"));
        } catch (ForcedException e) {
            e.printStackTrace();
            e.GetReason();
        }
        
    }
}
