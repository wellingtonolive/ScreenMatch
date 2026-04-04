package br.com.alura.screenmatch.utils;

import br.com.alura.screenmatch.models.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilesUtils {

    public static void buildFile(List<Titulo> listTitulos) throws IOException {

        System.out.printf("Lista de Titulos\n");
        System.out.printf(listTitulos.toString());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("titulos.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileWriter.write(gson.toJson(listTitulos));
        fileWriter.close();
    }
}
