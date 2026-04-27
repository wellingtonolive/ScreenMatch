package br.com.alura.screenmatch.integrations;

import br.com.alura.screenmatch.excecao.ErroDeConversaodeAnoException;
import br.com.alura.screenmatch.models.Titulo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FindTitulos {

    private Titulo titulo;
    private String urlToFind;

    public FindTitulos(String urlToFind) {
        this.urlToFind = urlToFind;
    }

    public String getTitulo() {

        String tituloEmString = "";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(this.urlToFind))
                    .build();

            HttpResponse<String> response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());

            System.out.printf(response.body());

            tituloEmString = response.body();

        } catch (NumberFormatException e) {
            System.out.printf("Aconteceu um erro: ");
            System.out.printf(e.getMessage());
        } catch (IllegalArgumentException | IOException | InterruptedException e) {
            System.out.printf("Aconteceu algum erro na busca: ");
            System.out.printf(e.getMessage());
        } catch (ErroDeConversaodeAnoException e) {
            System.out.printf("Aconteceu algum erro na conversao do ano: ");
            System.out.printf(e.getMessage());
        }
        return tituloEmString;
    }
}
