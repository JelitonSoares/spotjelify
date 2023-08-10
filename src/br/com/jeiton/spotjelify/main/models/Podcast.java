package br.com.jeiton.spotjelify.main.models;

import br.com.jeiton.spotjelify.main.filter.Sortable;

import javax.swing.text.AbstractDocument;

public class Podcast extends Audio implements Sortable {

    private String podcaster;
    private String participants;
    private String subject;
    public String getPodcaster() {
        return podcaster;
    }

    public void setPodcaster(String podcaster) {
        this.podcaster = podcaster;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayTechnicalSheet() {
        System.out.println("""
                Nome: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Apresentador: %s
                Convidados: %s
                Assunto: %s
                Media de avaliações: %.2f
                """.formatted(name, releaseYear, durationInMinutes, podcaster,
                participants, subject, takeMedium()));
    }

    @Override
    public int getClassification() {
        return (int) takeMedium() /2;
    }
}
