package core.psa;

public class Terminal extends Symbol {

    private boolean emptySymbol;
    private boolean rightDelimiter;

    public Terminal (String symbolName) {
        this.name = symbolName;
        emptySymbol = false;
        rightDelimiter = false;
    }

    public boolean isTerminal() {
        return true;
    }

    public boolean isNonTerminal() {
        return false;
    }

    public boolean isEmptyTerminal() {
        return emptySymbol;
    }

    public boolean isRightDelimiter() {
        return rightDelimiter;
    }

    public void setAsEmptyTerminal() {
        this.emptySymbol = true;
    }

    public void setAsRightDelimiterTerminal() {
        this.rightDelimiter = true;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Terminal t = (Terminal) o;
        return name.equals(t.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}