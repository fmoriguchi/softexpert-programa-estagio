# Desafio 06 - Biblioteca com testes

Chegou a hora de pensarmos um pouco na qualidade do nosso código. Vamos implementar testes unitários automatizados para o nosso sistema de bibliotecas.

### Observações

- Você deverá criar testes unitários automatizados para as diversas operações possíveis com os livros/autores/categorias.
- Tente fazer com que cada método de teste valide apenas um comportamento de uma funcionalidade específica.
- É interessante que cada teste seja independente.
- Utilize a combinação Eclipse + [JUnit](http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar) para criar e executar seus testes.

### Exemplo de teste

O exemplo abaixo mostra como poderia ser implementado o teste para validar que o livro está sendo gravado (ou não) com autor.

```java
public class RepositorioDeLivrosEmMemoriaTest {
    
    @Test
    public void deveGravarLivroSeExistirPeloMenosUmAutor() throws Exception {
        RepositorioDeLivros repositorio = new RepositorioDeLivrosEmMemoria();
        Livro livro = new Livro();
        //livro.setXXX(...);
        Autor autor = new Autor();
        //autor.setXXX(...);
        livro.getAutores().add(autor);
        repositorio.salvar(livro);
        Livro livroNoRepositorio = repositorio.consultarLivroPeloCodigo(livro.getCodigo());
        Assert.assertNotNull(livroNoRepositorio);
    }

    @Test(expected = LivroSemAutorException.class)
    public void deveLancarExceptionAoGravarLivroSemAutor() throws Exception {
        RepositorioDeLivros repositorio = new RepositorioDeLivrosEmMemoria();
        Livro livro = new Livro();
        //livro.setXXX(...);
        livro.setAutor(null);
        repositorio.salvar(livro);
    }

    //...
}
```

Perceba que no primeiro caso estamos esperando que ao informar um autor, o livro seja gravado sem erros e esteja no repositório. E no segundo teste esperamos que uma exceção seja lançada ao tentar salvar um livro sem nenhum autor.

Este é apenas um exemplo, isso não quer dizer que seu código tenha que ser assim ou ser testado da mesma forma.

Podemos dizer que quanto mais fácil for implementar testes para um código, melhor ele está. E a recíproca também é verdadeira, portanto se você perceber que está difícil separar as funcionalidades do seu sistema para então testá-las, provavelmente seu código está muito acoplado e deveria estar mais separado.

_Let's do it!_

---

> _Any fool can write code that a computer can understand. Good programmers write code that humans can understand. (Martin Fowler, 2008)_