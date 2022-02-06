package Tests;


import MyCool.Input;

public class Inputtest {
   

    public static void main(String[] args) throws Exception {
        test(AskStrings());
    }

    public static String[] AskStrings() throws Exception {
        return Input.ask("What items (divide by ,)?").get(1).split(",");
    }

    public static void test(String[] strings) throws Exception {
        for (String string : strings) {
            if (Input.ask(string).get(0) == string) {
                System.out.println("Prompt " + string + " matches.");
            }
        }
    }
}
