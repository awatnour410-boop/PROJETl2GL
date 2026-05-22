package gl;

import java.util.ArrayList;
import java.util.List;

public class SousPrefecture {
    private String nom;
    private String adresse;
    private List<Service> services;

    public SousPrefecture(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.services = new ArrayList<>();
    }

    public void ajouterService(Service service) {
        this.services.add(service);
    }