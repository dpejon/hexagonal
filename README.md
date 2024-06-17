# Hexagonal Architecture

Projeto de estudo com arquitetura hexagonal e Kafka usando Spring Boot e Gradle com Java 17.

Na arquitetura hexagonal, separamos a regra de negócio de todo o resto. No pacote `application`, colocamos a regra de negócio sem usar frameworks ou outras tecnologias, isolando toda a regra e tornando-a independente das demais tecnologias.

## Estrutura do Projeto

### `application`
- **`application.core.domain`**: Contém os objetos da regra de negócio (entidades, objetos de valor).
- **`application.core.usecase`**: Contém as classes com as regras de negócio. Cada classe representa um caso de uso (por exemplo, `InserCustomerUseCase`).
- **`application.ports`**:
    - **`application.ports.in`**: Interfaces para os adaptadores de entrada.
    - **`application.ports.out`**: Interfaces para os adaptadores de saída.

### `adapters`
Dentro do pacote `adapters`, podemos usar os frameworks que preferirmos. Nessa parte também ficará efetivamente toda a conexão com a parte externa da app, consumindo URLs, bancos de dados e expondo endpoints.

## Benefícios da Arquitetura Hexagonal

- **Testabilidade**: Como a lógica de negócio é independente dos frameworks, é mais fácil criar testes unitários sem a necessidade de mockar tecnologias externas.
- **Manutenibilidade**: A separação clara entre a lógica de negócio e as tecnologias facilita a manutenção e a evolução da aplicação.
- **Flexibilidade**: A possibilidade de trocar componentes externos (como bancos de dados ou bibliotecas) sem alterar a lógica de negócio.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Gradle**
- **Kafka**

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```
3. Execute o projeto usando Gradle:
    ```bash
    ./gradlew bootRun
    ```

---

Esse README fornece uma visão geral clara da arquitetura e estrutura do seu projeto, ajudando novos desenvolvedores a entenderem rapidamente como ele está organizado e como podem começar a trabalhar com ele.
