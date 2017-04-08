package ihmprototypage.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by mxm on 08/04/17.
 */
@Entity
public class Billet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nom;

    @NotNull
    private String Lieux;

    @NotNull
    private String ville;

    @NotNull
    private Date date;

    @NotNull
    private Double prix;

    @NotNull
    private String theme;

    @NotNull
    private String Artiste;

    public Billet(String nom,String lieux,String ville,Date date, Double prix, String theme, String artiste){
        this.Artiste =artiste;
        this.nom=nom;
        this.Lieux=lieux;
        this.ville = ville;
        this.date = date;
        this.prix = prix;
        this.theme =theme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLieux() {
        return Lieux;
    }

    public void setLieux(String lieux) {
        Lieux = lieux;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getArtiste() {
        return Artiste;
    }

    public void setArtiste(String artiste) {
        Artiste = artiste;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
