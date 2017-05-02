# Iniciando com git

Antes de prosseguir com esta atividade, você deverá previamente ter seguido os passos indicados na raiz do repositório. Caso ainda não tenha feito isso, please do it.

## Já fiz os passos iniciais, e agora?

Neste tópico serão abordados os principais comandos do git que você irá praticar. Os comandos apresentados a seguir são utilizados diariamente e é importante que todo desenvolvedor os conheça e esteja familiarizado.

## Criando e commitando no repositório

Supondo que você esteja com o terminal do git aberto e já tenha seguido os passos descritos anteriormente, neste ponto você tem um repositório pronto para fazer o que quiser. Primeiro, se você ainda não está na pasta específica desta atividade, entre nela:

```sh
cd 01-iniciando-com-git
```

Crie um arquivo chamado `teste.txt`:

```sh
> teste.txt
```

Abra este arquivo com um editor de sua preferência e insira o seguinte conteúdo dentro dele:

```
Minha
primeira
alteração
```

Salve o arquivo e execute o seguinte comando (o '.' no final significa que você está listando as mudanças apenas do diretório atual):

```sh
git status .
```

Você deve ver algo como:

```sh
$ git status .
On branch master
Your branch is up-to-date with 'origin/master'.
Untracked files:
  (use "git add <file>..." to include in what will be committed)

        teste.txt

nothing added to commit but untracked files present (use "git add" to track)

```

Isso significa que o arquivo que foi criado ainda não está na lista de arquivos que poderão ser commitados (versionados) pelo git. Para isso faça o seguinte:

```sh
git add teste.txt
```

Agora, se você olhar as mudanças, vai ver que a saída do comando `git status` mudou. Isso quer dizer que suas mudanças já podem ser commitadas. No comando abaixo estamos fazendo o commit de tudo o que adicionamos no _stage_ (pelo comando `git add`) - neste caso apenas o arquivo teste.txt - e também estamos dando uma descrição para o commit. Esta descrição é muito importante pois ela descreve o que foi alterado/corrigido e será útil para a história do repositório/projeto. Na SoftExpert, você seguirá um padrão e todo commit deverá obrigatoriamente ter uma descrição, e ela deverá iniciar com o código da tarefa, mas isso é coisa pra mais tarde. Por enquanto vamos seguir no nosso repositório, fazendo o commit:

```sh
git commit -m "Criação do arquivo teste.txt"
```

Feito isso, podemos dar um `git status` novamente para conferir que não temos nenhuma mudança para commitarmos.

## Fazendo modificações

Agora, vamos alterar o arquivo recém criado, mudando a segunda linha:

```
Minha
segunda
alteração
```

Podemos ver o que está diferente da última alteração, digitando o comando:

```sh
git diff
```

Após ver a saída do comando `diff` executado, vamos efetivar a alteração:

```sh
git add teste.txt
git commit -m "Alteração do arquivo teste.txt"
```

Agora temos dois commits próprios no nosso repositório, podemos ver o log dos commits com o comando:

```sh
git log
```

## E agora?

Até este momento, todas as alterações que fizemos estão somente no **repositório local**, e não no repositório remoto. Para que as nossas alterações estejam no repositório remoto (neste caso, o github), precisamos enviar (push) tudo o que fizemos. O seguinte comando faz isso:

```sh
git push origin
```

**Explicando:** No tutorial inicial, logo que forkeamos o repositório, vimos os repositórios remotos configurados através do comando `git remote -v`. A saída deste comando mostra dois locais configurados: O `origin` e o `softexpert`.

O repositório nomeado como `origin` se refere ao repositório do SEU-USUÁRIO, que é o repositório do github no qual você enviará as mudanças. Resumindo: é o **seu repositório remoto**.

O repositório nomeado como `softexpert` se refere ao repositório no qual se deu origem o fork. Neste caso nomeamos como `softexpert` pois ele será controlado por nós (SoftExpert) sendo que não será possível realizar commits diretamente neste repositório, apenas no `origin` (por isso informamos este nome no `push`).

## Fim! (ou quase)

Agora você já sabe o básico do básico para lidarmos com git. O próximo exercício consiste em criarmos algum código realmente, portanto sempre que necessário volte neste tutorial para relembrar.

Ah, dê uma olhada no seu repositório pelo github, suas modificações estão lá e podem ser acessadas de qualquer lugar!