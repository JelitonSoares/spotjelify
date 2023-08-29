package br.com.jeiton.spotjelify.main;

import br.com.jeiton.spotjelify.main.filter.FilterRecommendation;
import br.com.jeiton.spotjelify.main.models.Audio;
import br.com.jeiton.spotjelify.main.models.Music;
import br.com.jeiton.spotjelify.main.models.Podcast;

public class Main {
    public static void main (String[] args) {

        Music music = new Music("Hynm for the weekend", 2015);
        music.setSinger("ColdPlay");
        music.setViews(10000);
        music.setDurationInMinutes(4);
        music.evaluate(8.5);
        music.evaluate(9.5);
        music.evaluate(10);
        music.evaluate(9.7);
        music.evaluate(9.4);
        music.evaluate(7.5);

        music.displayTechnicalSheet();

        Podcast podcast = new Podcast("Space Today", 2023);

        podcast.setPodcaster("Sergio Sacani");
        podcast.setParticipants("Gabriel Pato");
        podcast.setViews(50000);
        podcast.setSubject("Hackers");
        podcast.setDurationInMinutes(90);
        podcast.evaluate(1);
        podcast.evaluate(1.5);
        podcast.evaluate(2.8);
        podcast.evaluate(3.1);
        podcast.evaluate(1.7);
        podcast.evaluate(2.4);

        podcast.displayTechnicalSheet();

        FilterRecommendation filterRecommendation = new FilterRecommendation();
        filterRecommendation.recomends(podcast);
        filterRecommendation.recomends(music);

    }
}
