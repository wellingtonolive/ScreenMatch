package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.integrations.FindTitulos;
import br.com.alura.screenmatch.models.Titulo;
import br.com.alura.screenmatch.utils.FilesUtils;
import br.com.alura.screenmatch.utils.ParserUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException{

        Scanner leitura = new Scanner(System.in);
        String filmeParaBuscar = "";

        List<Titulo> titulos = new ArrayList<>();

        while (!filmeParaBuscar.equalsIgnoreCase("sair")) {

            System.out.printf("\nDigite o filme para busca:");
            filmeParaBuscar = leitura.nextLine();

            if (filmeParaBuscar.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "http://www.omdbapi.com/?apikey=********" + "&t=" + filmeParaBuscar;

            FindTitulos findTitulos = new FindTitulos(endereco);
            String tituloEmString = findTitulos.getTitulo();

            Titulo titulo = ParserUtils.parseTituloOmbdToTitulo(tituloEmString);
            titulos.add(titulo);

        }

        FilesUtils.buildFile(titulos);
    }
}
