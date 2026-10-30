package altn72.tpfilrouge.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @Column(name = "id_connexion")
    private String idConnexion;

    @Column(name = "mot_de_passe_hache", nullable = false)
    private String motDePasseHache;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "profil", nullable = false)
    private String profil;

    public Utilisateur() {
    }

    public Utilisateur(String idConnexion, String motDePasseHache, String prenom, String profil) {
        this.idConnexion = idConnexion;
        this.motDePasseHache = motDePasseHache;
        this.prenom = prenom;
        this.profil = profil;
    }

    // Getters et Setters
    public String getIdConnexion() {
        return idConnexion;
    }

    public void setIdConnexion(String idConnexion) {
        this.idConnexion = idConnexion;
    }

    public String getMotDePasseHache() {
        return motDePasseHache;
    }

    public void setMotDePasseHache(String motDePasseHache) {
        this.motDePasseHache = motDePasseHache;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }
}