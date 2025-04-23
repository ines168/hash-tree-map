package KlasaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EvidencijaPolaznika {
    public static void main(String[] args) {
        //HashMap<String, Polaznik> map = new HashMap<>();
        TreeMap<String, Polaznik> map = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi polaznika. Završi unošenje sa 'stop'.\n");

        do {
            System.out.print("Upiši ime polaznika:");
            String ime = sc.nextLine();
            if(ime.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Upiši prezime polaznika: ");
            String prezime = sc.nextLine();
            System.out.print("Upiši mail adresu polaznika: ");
            String mail = sc.nextLine();
            if(map.containsKey(mail)) {
                System.out.println("Polaznik već postoji!");
            } else {
                map.put(mail, new Polaznik(ime, prezime, mail));
            }
        } while(true);

        for (Polaznik polaznik : map.values()) {
            System.out.println(polaznik);
        }
    }
}
