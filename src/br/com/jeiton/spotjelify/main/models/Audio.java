package br.com.jeiton.spotjelify.main.models;

public class Audio {
    protected String name;
    protected int releaseYear;
    protected int durationInMinutes;
    private int totalGrades;
    protected int views;
    private double sumOfGrades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalGrades() {
        return totalGrades;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public double getSumOfGrades() {
        return sumOfGrades;
    }


    public void displayTechnicalSheet () {
        System.out.println("""
                Nome: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Media de avaliações: %.2f
                """.formatted(name, releaseYear, durationInMinutes, takeMedium()));
    }

    public void evaluate (double grade) {
        sumOfGrades += grade;
        totalGrades++;
    }

    protected double takeMedium () {
        double average = sumOfGrades / totalGrades;
        return average;
    }


}
