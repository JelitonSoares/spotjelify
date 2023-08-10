package br.com.jeiton.spotjelify.main.filter;

public class FilterRecommendation {

    public void recomends (Sortable sortable) {
        if (sortable.getClassification() >= 4) {
            System.out.println(sortable.getName() + " Esta entre os melhores!!");
        } else if (sortable.getClassification() >= 2) {
            System.out.println(sortable.getName() + " É uma boa escolha pra se ouvir!!");
        } else {
            System.out.println("Adicione " + sortable.getName() + " a sua playlist para ouvir depois!!");
        }
    }


}
