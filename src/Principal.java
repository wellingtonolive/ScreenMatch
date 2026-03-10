import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args){

        Filme meuFilme = new Filme();
        meuFilme.setNome("Tropa de Elite");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setDuracaoEmMinutos(220);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Hulk");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);

        System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        System.out.println("Total de avaliacoes: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Media das avaliacoes: " + meuFilme.obterMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Agente da Noite");
        minhaSerie.setAtiva(true);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setDuracaoEmMinutos(100);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setTemporadas(3);
        minhaSerie.setAnoDeLancamento(2023);
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
