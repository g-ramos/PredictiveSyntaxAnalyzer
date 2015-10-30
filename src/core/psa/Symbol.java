package core.psa;


public abstract class Symbol {
    protected String name;

    public String getValue() {
        return this.name;
    }

    public void setValue(String symbolValue) {
        this.name = symbolValue;
    }

    public abstract boolean isTerminal();

    public abstract boolean isNonTerminal();

    public abstract String toString();

}