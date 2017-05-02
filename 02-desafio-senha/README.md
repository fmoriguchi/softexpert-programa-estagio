# Desafio - Qual é a senha?

## Parte I

Você deverá escrever uma classe que irá gerar 5 números aleatórios (diferentes entre si), e então cada usuário que utilizar esse programa, deverá adivinhá-los.

#### Como vai funcionar?

O usuário terá 5 tentativas a cada geração dos números. A cada tentativa o programa deverá informar quais números foram encontrados, imprimindo o algarismo correto. Caso não tenha encontrado, o programa deverá retornar um asterisco no lugar do número.

Exemplo:

> Sistema gerou o número: **53298**.
>
> O usuário digitou: **13245**.
>
> Você deverá imprimir: **\*32\*\***.

#### Exemplo do fluxo completo do jogo:

```
Sistema gerou:     19687
O usuário digitou: 13245 (tentativa 1)
Sistema imprime:   1****
O usuário digitou: 18639 (tentativa 2)
Sistema imprime:   1*6**
O usuário digitou: 19650 (tentativa 3)
Sistema imprime:   196**
O usuário digitou: 19678 (tentativa 4)
Sistema imprime:   196**
O usuário digitou: 19687 (tentativa 5)
Sistema imprime:   19687 Você adivinhou a senha!
```

Se após a 5 tentativas, o usuário não conseguir acertar a combinação, você deverá imprimir na tela/console a mensagem de “game over” com a senha gerada.

#### Importante!

O diretório deste desafio (`02-desafio-senha`) deverá conter uma pasta chamada `src` com os arquivos fonte (.java) dentro. Fique à vontade para organizar a estrutura de pacotes que achar melhor.