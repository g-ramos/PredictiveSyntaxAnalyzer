package core.psa;

public class Main {


    public static void main(String[] args) {
        Terminal asd = new Terminal("id");
        NonTerminal fgh = new NonTerminal("NT");

        System.out.println(asd.toString() + " " + fgh.toString());
    }
}