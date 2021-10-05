package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Cricketer implements Serializable {
    private int jerseyNumber;
    private LocalDate debut;
    private String country;
    private List<String> otherTeams;
    private String name;

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getOtherTeams() {
        return otherTeams;
    }

    public void setOtherTeams(List<String> otherTeams) {
        this.otherTeams = otherTeams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Name: "+this.getName());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Debut: "+this.getDebut().format(formatter));
        System.out.println("Country: "+this.getCountry());
        System.out.println("Jersey Number: "+this.getJerseyNumber());
        System.out.print("Other Teams: ");
        this.getOtherTeams().forEach(team -> System.out.print(team+" | "));
        System.out.println();
    }
}
