package core.psa;

public class NonTerminal extends Symbol {

    public NonTerminal (String symbolName) {
        this.name = symbolName;
    }

    public boolean isTerminal() {
        return false;
    }

    public boolean isNonTerminal() {
        return true;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        NonTerminal t = (NonTerminal) o;
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