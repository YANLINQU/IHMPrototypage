package ihmprototypage.Domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull @Size(min = 1)
    private String nom ;

    @NotNull @Size(min = 1)
    private String prenom ;

    @NotNull @Email
    private String email ;

    private Date dateNaissance;

    @NotNull @Pattern(regexp = "^[MF]{1}$")
    private String sexe;


    public Utilisateur() {

    }

    public Utilisateur(String unNom, String unPrenom, String unEmail,
                       String unSexe, Date uneDateNaissance) {
        nom = unNom;
        prenom = unPrenom;
        email = unEmail;
        sexe = unSexe;
        dateNaissance = uneDateNaissance;
    }

    public Utilisateur(String unNom, String unPrenom, String unEmail,
                       String unSexe) {
        this(unNom, unPrenom, unEmail, unSexe, null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }




}
