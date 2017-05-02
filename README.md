# Softexpert - Programa de estágio

Repositório dos exercícios e desafios de programação do programa de estágio SoftExpert

Cada exercício/desafio estará em um diretório dentro deste repositório, com as especificações e os detalhes no arquivo README.md dentro de cada um.

## Como devo proceder?

Cada um deverá _forkear_ este repositório e fazer as modificações (push) em sua própria cópia. Estando logado em sua conta, no canto superior direito do github vai aparecer o botão conforme imagem:

![fork.png](https://pichoster.net/images/2017/04/28/2031862c63ec135aa4d4a2fd1af2c6f2.png)

Após isso, você será redirecionado para sua conta, com a cópia do repositório pronta para você usar. Feito isso, clique no botão "Clone or download" e copie o link:

![clone.png](https://pichoster.net/images/2017/04/28/18fce3b38623bf01fe1cb091c26d21d9.png)

Lembrando que a url deverá neste ponto estar apontando para a sua conta (Ex `https://github.com/SEU-USUARIO/softexpert-programa-estagio.git`).

Abra o terminal do git (Git Bash), navegue até o diretório local onde você quer deixar o repositório e digite o seguinte comando (não esquecendo de alterar o link do repositório):

```sh
git clone https://github.com/SEU-USUARIO/softexpert-programa-estagio.git
```

Após executar este comando, uma pasta `softexpert-programa-estagio` será criada, entre dentro dela

```sh
cd softexpert-programa-estagio
```

Adicione o repositório original na lista de repositórios remotos. Aqui deixe a url exatamente como está, e **não a url do seu repositório**:

```sh
git remote add softexpert https://github.com/klutzer/softexpert-programa-estagio.git
```

Agora confira os repositórios:

```sh
git remote -v
```

Você deve ver isso:

```sh
origin      https://github.com/SEU-USUARIO/softexpert-programa-estagio.git (fetch)
origin      https://github.com/SEU-USUARIO/softexpert-programa-estagio.git (push)
softexpert  https://github.com/klutzer/softexpert-programa-estagio.git (fetch)
softexpert  https://github.com/klutzer/softexpert-programa-estagio.git (push)
```

Pronto, agora para deixar o seu repositório sempre atualizado conforme vamos inserindo novas atividades/desafios basta executar:

```sh
git pull softexpert master
```