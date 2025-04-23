package KlasaMap;

public class Polaznik {
    String ime;
    String prezime;
    String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public Polaznik(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return ime + ' ' + prezime + ' ' + email;
    }
}
