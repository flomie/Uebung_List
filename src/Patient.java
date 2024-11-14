
import java.time.LocalDate;
public class Patient implements Comparable<Patient> {

    String fallNr;
    int svNr;
    String vorname;
    String nachname;
    LocalDate gebdat;

    public Patient(String fallNr, int svNr, String vorname, String nachname, LocalDate gebdat) {
        this.fallNr = fallNr;
        this.svNr = svNr;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebdat = gebdat;
    }
    public String getFallNr() {
        return fallNr;
    }

    public int getSvNr() {
        return svNr;
    }

    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public LocalDate getGebdat() {
        return gebdat;
    }
    @Override
    public int compareTo(Patient p){
        int c = this.nachname.compareTo(p.nachname);
        return c;

    }
}
