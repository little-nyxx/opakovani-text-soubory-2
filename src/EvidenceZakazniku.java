import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidenceZakazniku {
    public List<Zakaznik> evidence = new ArrayList<>();

    public void setEvidence(List<Zakaznik> evidence) {
        this.evidence = evidence;
    }

    public void pridejZakaznika(Zakaznik zakaznik){
        evidence.add(zakaznik);
    }

    public void prectiSoubor(String nazevSouboru, String oddelovac) throws ZakaznikExeption{
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("resources/" + nazevSouboru)))) {
            while (scanner.hasNextLine()) {
                String radek = scanner.nextLine();
                pridejZakaznika(parseZakaznik(radek, " "));
            }
        } catch (FileNotFoundException ex) {
            throw new ZakaznikExeption("Soubor: "+ nazevSouboru + " nebyl nalezen!");
        }
    }

    public Zakaznik parseZakaznik(String radek, String oddelovac) {
        String[] polozky = radek.split(oddelovac);
        String jmeno = polozky[1].trim();
        int id = Integer.parseInt(polozky[0].trim());
        String prijmeni = polozky[2].trim();
        return new Zakaznik(jmeno, id, prijmeni);
    }

  /* public int nactiIDIvan() {
        int id = 0;
        for (Zakaznik zakaznik : evidence) {
            if (zakaznik.getId() < 50 && zakaznik.getJmeno().equals("Ivana")) {
                id = zakaznik.getId();

            }
        }
        return id;
   }*/
  List<Zakaznik> ivana = new ArrayList<>();
    public List<Zakaznik> najdiIvanu() {
        List<Zakaznik> ivana = new ArrayList<>();
        for (Zakaznik zakaznik : evidence) {

            if (zakaznik.getJmeno().equals("Ivana") && zakaznik.getId() < 50) {
                ivana.add(zakaznik);
            }
        }
        return ivana;

    }
}
