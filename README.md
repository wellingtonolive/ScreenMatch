# 🎬 ScreenMatch — Media Catalog & Recommendation Engine

> Aplicação Java orientada a objetos para gerenciamento, avaliação e recomendação de conteúdos audiovisuais (filmes e séries), com foco em boas práticas, extensibilidade e organização de domínio.

---

## 📌 Visão Geral

O **ScreenMatch** é um sistema de domínio que simula uma plataforma de catálogo de mídia, permitindo:

- Gerenciamento de títulos (filmes e séries)
- Avaliação e cálculo de média
- Cálculo de tempo total de consumo
- Filtro inteligente de recomendações
- Ordenação e manipulação avançada de coleções

O projeto foi estruturado seguindo princípios sólidos de engenharia de software, com foco em:

- baixo acoplamento
- alta coesão
- extensibilidade
- clareza de domínio

---

## 🧠 Arquitetura e Design

O projeto segue uma abordagem baseada em **Domain Modeling (DDD simplificado)**:


---

## 🏗️ Princípios Aplicados

### ✅ SOLID

- **S — Single Responsibility**  
  Cada classe tem responsabilidade única (ex: `CalculadoraDeTempo`)

- **O — Open/Closed**  
  Novos tipos podem ser adicionados sem alterar código existente

- **L — Liskov Substitution**  
  `Filme` e `Serie` podem ser usados como `Titulo`

- **I — Interface Segregation**  
  Uso de contratos simples

- **D — Dependency Inversion (conceitual)**  
  Regras desacopladas da execução

---

### ✅ Padrões Utilizados

- Herança e Polimorfismo
- Strategy-like behavior (Filtro)
- Collections + Sorting Strategies
- Pattern Matching (`instanceof`)

---

## 🚀 Funcionalidades

### 🎥 Gestão de Conteúdo
- Criação de filmes e séries
- Controle de duração
- Inclusão em plano

### ⭐ Sistema de Avaliação
- Registro de avaliações
- Cálculo automático de média
- Classificação baseada em regra

### ⏱️ Cálculo de Tempo Total
- Soma do tempo consumido
- Suporte a diferentes tipos

### 🧠 Recomendação
- Filtro baseado em classificação

### 📊 Manipulação de Dados
- Ordenação por nome e ano
- Uso de `Comparable` e `Comparator`

---

## 💻 Tecnologias

- Java 17+
- Paradigma Orientado a Objetos
- Collections Framework

---

## ▶️ Execução

### Pré-requisitos
- JDK 17+
- IDE Java (IntelliJ recomendado)

### Clonar projeto

```bash
git clone https://github.com/seu-usuario/screenmatch.git
cd screenmatch
```

### Executar
```
Principal.java → fluxo principal
PrincipalComListas.java → listas e ordenação
```

## 💻 Exemplo de Uso

Filme filme = new Filme("Tropa de Elite", 2005);
filme.avalia(10);
filme.avalia(8);

Serie serie = new Serie("Agente Noturno", 2023);

CalculadoraDeTempo calc = new CalculadoraDeTempo();
calc.inclui(filme);
calc.inclui(serie);

System.out.println(calc.getTempoTotal());

## 🧪 Casos Demonstrados
* Polimorfismo com List<Titulo>
* Ordenação customizada
* Pattern Matching moderno

## 🔍 Decisões Técnicas

### Classe Abstrata (Titulo)
* Centraliza atributos comuns e garante consistência.

### Separação de Responsabilidades
* CalculadoraDeTempo → cálculo
* FiltroRecomendacao → regra de recomendação,

###  Ordenação Flexível
* Comparable → ordenação natural
* Comparator → ordenação customizada

## 🧑‍💻 Diferenciais

* Modelagem de domínio clara
* Código organizado e extensível
* Uso moderno de Java
* Base pronta para evolução enterprise

## 🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias:

1. Fork do projeto
2. Crie uma branch (`feature/minha-feature`)
3. Commit suas alterações
4. Push para a branch
5. Abra um Pull Request

---

## 📄 Licença

Este projeto é livre para uso educacional e aprendizado.

---

## 👨‍💻 Autor

Desenvolvido para fins de estudo e prática em Java.