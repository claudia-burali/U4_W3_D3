package claudia_burali.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "invitati")
public class Persona {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;
    @Enumerated(EnumType.STRING)
    private GenerePersona generePersona;
    private String[] listaPartecipazioni;

    public Persona() {
    }

    public Persona(String nome, String cognome, String email, LocalDate dataNascita, GenerePersona generePersona, String[] listaPartecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.generePersona = generePersona;
        this.listaPartecipazioni = listaPartecipazioni;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDataNascia() {
        return dataNascita;
    }
    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
    public GenerePersona getGenerePersona() {
        return generePersona;
    }
    public void setGenerePersona(GenerePersona generePersona) {
        this.generePersona = generePersona;
    }

    @Override
    public String toString() {
        return "Invitato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", data_di_nascita=" + dataNascita +
                ", genere=" + generePersona +
                '}';
    }
}
