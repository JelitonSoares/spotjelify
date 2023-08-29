package br.com.jeiton.spotjelify.main;

import br.com.jeiton.spotjelify.main.filter.Sortable;
import br.com.jeiton.spotjelify.main.models.Audio;
import br.com.jeiton.spotjelify.main.models.Music;
import br.com.jeiton.spotjelify.main.models.Podcast;

import javax.swing.plaf.BorderUIResource;
import java.util.ArrayList;

public class MainList {
    public static void main (String[] args) {
        Music music = new Music("Sunroof", 2022);
        Music music1 = new Music("You Give Love A Bad Name", 1986);
        Music music2 = new Music("HymnFor The Weekend", 2015 );
        Music music3 = new Music("Sweater Weather", 2013);
        Podcast podcast = new Podcast("Space Today", 2023);
        Podcast podcast1 = new Podcast("Flow", 2019);
        Podcast podcast2 = new Podcast("Podpa", 2020);
        music.evaluate(8.4);
        music.evaluate(9.4);
        music.evaluate(9.2);
        music1.evaluate(9.5);
        music1.evaluate(10);
        music1.evaluate(9.7);
        music2.evaluate(10);
        music2.evaluate(10);
        music2.evaluate(9.9);
        music3.evaluate(9.5);
        music3.evaluate(9.8);
        music3.evaluate(9.4);
        podcast.evaluate(9.9);
        podcast.evaluate(9.5);
        podcast.evaluate(9.7);
        podcast1.evaluate(9.9);
        podcast1.evaluate(10);
        podcast1.evaluate(9.8);
        podcast2.evaluate(8.0);
        podcast2.evaluate(8.5);
        podcast2.evaluate(9.8);

        ArrayList<Audio> list = new ArrayList<>();

        list.add(music);
        list.add(music1);
        list.add(music2);
        list.add(music3);
        list.add(podcast1);
        list.add(podcast);
        list.add(podcast2);


        list.forEach(audio -> {
            System.out.println("Nome: " + audio.getName());

            if (audio instanceof Music || audio instanceof Podcast) {
                System.out.println("Classificação: " + (((Sortable) audio).getClassification()));
            }
        });
    }
}
