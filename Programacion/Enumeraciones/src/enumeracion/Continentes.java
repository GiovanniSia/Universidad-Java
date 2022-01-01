package enumeracion;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1 billones"),
    ASIA(44, "2.5 billones"),
    AMERICA(34, "1.1 billones"),
    OCEANIA(14, "1.5 billones"); // SE LE AGREGA UN ";" al final

    private final int paises;
    private final String habitantes;

    //este constructor se asocia a cada enumeracion
    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return habitantes;
    }

}
