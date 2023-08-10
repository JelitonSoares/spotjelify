package br.com.jeiton.spotjelify.main.models;

import br.com.jeiton.spotjelify.main.filter.Sortable;

public class Music extends Audio implements Sortable {
    private String singer;
    private String composer;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Override
    public void displayTechnicalSheet() {
        System.out.println("""
                Nome: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Cantor: %s
                Compositor: %s
                Media de avaliações: %.2f
                """.formatted(name, releaseYear, durationInMinutes,singer, composer, takeMedium()));
    }

    @Override
    public int getClassification() {
        return (int) takeMedium() / 2;
    }
}
