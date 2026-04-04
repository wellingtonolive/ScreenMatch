package br.com.alura.screenmatch.utils;

import br.com.alura.screenmatch.models.Titulo;
import br.com.alura.screenmatch.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ParserUtils {

    public static Titulo parseTituloOmbdToTitulo(String tituloEmStringJson) {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        TituloOmdb meuTituloOmdb = gson.fromJson(tituloEmStringJson, TituloOmdb.class);

        Titulo titulo = new Titulo(meuTituloOmdb);

        return titulo;
    }
}
