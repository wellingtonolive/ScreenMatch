package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){

        Filme meuFilme = new Filme("Tropa de Elite", 2005);
        meuFilme.setDuracaoEmMinutos(220);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme("Hulk", 2023);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);

        var maisUmFilme = new Filme("Peaky Blinders", 2023);
        maisUmFilme.setDuracaoEmMinutos(150);
        maisUmFilme.setIncluidoNoPlano(true);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(maisUmFilme);

        System.out.println("Tamanho da Lista de Filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro Filmes: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        System.out.println("Total de avaliacoes: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Media das avaliacoes: " + meuFilme.obterMedia());

        Serie minhaSerie = new Serie("Agente da Noite", 2023);
        minhaSerie.setAtiva(true);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setDuracaoEmMinutos(100);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setTemporadas(3);
        System.out.println("Duracao da serie: " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(minhaSerie);
        int tempoTotal = calculadoraDeTempo.getTempoTotal();

        System.out.println("Tempo total: " + tempoTotal);

        FiltroRecomendacao filtro =new FiltroRecomendacao();
        filtro.filtra(meuFilme);

    }
}
