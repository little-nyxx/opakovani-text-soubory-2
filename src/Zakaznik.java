public class Zakaznik {
    private String jmeno;
    private int id;
    private String prijmeni;

    public Zakaznik(String jmeno, int id, String prijmeni) {
        this.jmeno = jmeno;
        this.id = id;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
}
