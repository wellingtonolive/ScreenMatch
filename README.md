# 🎬 ScreenMatch - Busca de Filmes com OMDb API

Projeto Java desenvolvido para buscar informações de filmes através da **OMDb API**, permitindo ao usuário pesquisar títulos via terminal e salvar os resultados em arquivo.

---

## 📌 Sobre o projeto

O **ScreenMatch** é uma aplicação Java de linha de comando que permite ao usuário:

- Buscar filmes digitando o nome no terminal;
- Consumir dados da API pública **OMDb API**;
- Converter o JSON retornado em objetos Java;
- Armazenar os títulos buscados em uma lista;
- Gerar um arquivo com os filmes pesquisados.

Este projeto é ideal para praticar conceitos como:

- Consumo de API REST
- Manipulação de JSON
- Programação orientada a objetos
- Organização em camadas
- Utilitários e integração externa
- Entrada de dados com `Scanner`
- Escrita em arquivos

---

## 🛠️ Tecnologias utilizadas

- **Java**
- **POO (Programação Orientada a Objetos)**
- **OMDb API**
- **Scanner**
- **Collections (List / ArrayList)**
- **Manipulação de arquivos**
- **Parser de dados JSON**

---

## 📂 Estrutura principal do projeto

```bash
src/
└── br/
    └── com/
        └── alura/
            └── screenmatch/
                ├── integrations/
                │   └── FindTitulos.java
                ├── models/
                │   └── Titulo.java
                ├── principal/
                │   └── PrincipalComBusca.java
                └── utils/
                    ├── FilesUtils.java
                    └── ParserUtils.java
```

## 🚀 Funcionalidades
✅ Busca de filmes

O usuário digita o nome de um filme e a aplicação faz a consulta na OMDb API.

✅ Conversão dos dados

O retorno da API é transformado em um objeto da classe Titulo.

✅ Armazenamento em lista

Todos os filmes buscados durante a execução ficam armazenados em uma lista.

✅ Geração de arquivo

Ao finalizar o programa, os títulos pesquisados são salvos automaticamente em arquivo.

✅ Encerramento por comando

O usuário pode digitar:
```bash
sair
```
para encerrar a aplicação.

## 🧠 Fluxo da aplicação
1. O sistema solicita o nome de um filme;
2. A aplicação monta a URL da API;
3. Faz a requisição para a OMDb API;
4. Recebe os dados do filme em formato String/JSON;
5. Converte esses dados em um objeto Titulo;
6. Adiciona o filme em uma lista;
7. Quando o usuário digita sair, o sistema gera um arquivo com os títulos buscados.


## 📄 Classe principal

A aplicação é iniciada pela classe:
**PrincipalComBusca.java**

```java
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

  public static void main(String[] args) throws IOException {

    Scanner leitura = new Scanner(System.in);
    String filmeParaBuscar = "";

    List<Titulo> titulos = new ArrayList<>();

    while (!filmeParaBuscar.equalsIgnoreCase("sair")) {

      System.out.printf("\nDigite o filme para busca:");
      filmeParaBuscar = leitura.nextLine();

      if (filmeParaBuscar.equalsIgnoreCase("sair")) {
        break;
      }

      String endereco = "http://www.omdbapi.com/?apikey=94399dfc" + "&t=" + filmeParaBuscar;

      FindTitulos findTitulos = new FindTitulos(endereco);
      String tituloEmString = findTitulos.getTitulo();

      Titulo titulo = ParserUtils.parseTituloOmbdToTitulo(tituloEmString);
      titulos.add(titulo);
    }

    FilesUtils.buildFile(titulos);
  }
}
```

## 🧩 Explicação dos principais componentes
### PrincipalComBusca
Responsável por controlar o fluxo principal da aplicação:

- leitura do nome do filme;
- chamada da API;
- conversão dos dados;
- armazenamento dos títulos;
- geração do arquivo final.

### FindTitulos
Classe responsável por fazer a integração com a OMDb API.

Responsabilidade:

- receber a URL da consulta;
- realizar a requisição HTTP;
- retornar os dados do filme.

### Titulo

Classe de modelo que representa um filme dentro da aplicação.

Exemplo de possíveis atributos:

- nome
- ano
- duração
- gênero
- avaliação
- descrição

### ParserUtils

Classe utilitária responsável por transformar o retorno da API em um objeto Java.

Responsabilidade:

- converter JSON/String em Titulo.

### FilesUtils

Classe utilitária responsável por gerar o arquivo final com os títulos buscados.

Responsabilidade:

- receber a lista de filmes;
- criar e escrever os dados em arquivo.


## ▶️ Como executar o projeto

1. Clone o repositório
```bash
   git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
```

2. Abra o projeto na sua IDE

Você pode utilizar:

- IntelliJ IDEA
- Eclipse
- VS Code com extensão Java


3. Execute a classe principal

Execute a classe:
```bash
PrincipalComBusca.java
```

## 💻 Exemplo de uso no terminal

```bash
Digite o filme para busca: interestelar
Digite o filme para busca: avatar
Digite o filme para busca: coringa
Digite o filme para busca: sair
```

Após isso, a aplicação irá gerar um arquivo com os filmes pesquisados.

## 🌐 API utilizada

Este projeto utiliza a:

OMDb API

API pública para consulta de informações sobre filmes, séries e episódios.

🔗 Site oficial:
https://www.omdbapi.com/


## ⚠️ Observações importantes
- O projeto utiliza uma chave de API para acessar os dados da OMDb;
- É importante tratar possíveis erros como:
  - filme não encontrado;
  - falha de conexão;
  - resposta inválida da API;
  - problema ao gerar arquivo.

## 🧪 Aprendizados praticados

Este projeto ajuda a praticar:

- Estruturação de projetos Java
- Consumo de APIs externas
- Conversão de dados
- Utilização de listas
- Manipulação de entrada e saída
- Separação de responsabilidades entre classes

## 👨‍💻 Autor

Desenvolvido por **Wellington de Oliveira Carvalho**

- GitHub: [Wellington](https://github.com/wellingtonolive)
- LinkedIn: [Wellington de Oliveira](https://www.linkedin.com/in/wellington-oliveira-9bbb64174/)

## 📜 Licença

Este projeto está sob a licença MIT.
Sinta-se livre para estudar, modificar e utilizar como base para aprendizado.