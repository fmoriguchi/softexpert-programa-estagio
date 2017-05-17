# Desafio 05 - Biblioteca

Agora é hora de juntar todo o conhecimento adquirido com os 16 capítulos iniciais da apostila da Caelum e fazer uma aplicação mais parecida com o dia-a-dia de um desenvolvedor de software: vamos simular um pequeno sistema para cadastro/consulta de livros em uma biblioteca.

### Proposta

Criar um pequeno sistema de controle de biblioteca, incluindo um [CRUD](https://pt.wikipedia.org/wiki/CRUD) completo de livros. Inicialmente, este cadastro será salvo de duas formas diferentes, usando as classes/interfaces da API Collections:

- Em memória
- Em arquivo de chave-valor (propriedades)

### Domínio

O sistema conterá 3 tipos de registros para cadastro (o que mais tarde se tornarão tabelas de banco de dados):

1. Livro
2. Categoria
3. Autor

Lista de atributos:

- **Livro**
    - Código sequencial (gerado automaticamente)
    - Título
    - Resumo
    - Código de barras (gerado automaticamente)
    - Quantidade de páginas
    - Local (na biblioteca. Ex: Prateleira B3)
    - Data de aquisição
    - **Categoria**
        - Código sequencial (gerado automaticamente)
        - Descrição
        - **Autores** (um ou mais)
            - Código sequencial (gerado automaticamente)
            - Nome
            - Data de nascimento
            - Nacionalidade

### Critérios de aceitação

- **Você deverá criar testes unitários automatizados para as diversas operações possíveis com os livros/autores/categorias**
- Um livro deve ser salvo com pelo menos um autor, categoria, título e sua localização - lembrando que o código sequencial e o código de barras devem ser gerados pelo sistema e não podem se repetir entre os livros
- A data de aquisição do livro não pode ser retroativa (antes do dia de atual)
- A consulta de livros deverá vir sempre ordenada em ordem alfabética pelo título do livro, e poderá ser pesquisado por código, título, categoria ou nome do autor.
    - Sempre que buscar um livro, mostrar todos os seus atibutos, incluindo a categoria e o(s) autor(es)

### Observações

- Assim como todos os outros desafios, crie o código dentro deste diretório (`05-biblioteca`). Utilize o Eclipse e coloque todos os fontes dentro do subdiretório `src`. Defina a estrutura de pacotes do seu sistema da forma que achar conveniente.
- Fica a seu critério pensar na interação com o usuário, podendo esta ser feita via console (`System.in/System.out`).
- Fica também a seu critério definir como e quando os testes serão implementados (se antes ou após o desenvolvimento de cada funcionalidade) - Utilize o _framework_ JUnit.
- Faça o uso de interfaces para definir as diferentes formas de armazenar um livro/autor/categoria. Lembre-se sempre que a evolução do sistema deve ocorrer de forma natural. Queremos poder futuramente salvar estas informações em um banco de dados sem modificar a lógica já implementada. Ou seja, seu código deve ser facilmente **adaptável**.
- Organize seu código de forma com que cada classe tenha uma responsabilidade bem definida. Por exemplo, não misture interação com o usuário na classe responsável por armazenar o livro em memória. _Mantenha as coisas desacopladas_.

_Let's do it!_