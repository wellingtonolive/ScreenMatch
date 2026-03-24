package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("Tropa de Elite", 2005);
        meuFilme.avalia(6);
        meuFilme.setDuracaoEmMinutos(220);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme("Hulk", 2023);
        outroFilme.avalia(7);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);

        var maisUmFilme = new Filme("Peaky Blinders", 2023);
        maisUmFilme.setDuracaoEmMinutos(150);
        maisUmFilme.avalia(10);
        maisUmFilme.setIncluidoNoPlano(true);

        Serie minhaSerie = new Serie("Agente Noturno", 2023);
        minhaSerie.setAtiva(true);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setDuracaoEmMinutos(100);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setTemporadas(3);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(maisUmFilme);
        lista.add(minhaSerie);

       for (Titulo item: lista){
           System.out.println(item.getNome());

           if (item instanceof Filme filme && filme.getClassificacao() > 2){
               System.out.println("Classificacao " + filme.getClassificacao());
           }
       }


    }
}
