## Desafio 04 - Calculadora escalável

Sua tarefa aqui é desenvolver uma calculadora que realize as 4 operações básicas: O usuário entra com os dois números que quer calcular, informa a operação, e o sistema mostra o resultado.

A tarefa é simples, porém a forma com que você irá desenvolvê-la é desafiadora: **você deve implementá-la com o menor número de `if/switch` possível.**

### Por quê?

"Impedir" o uso destas operações binárias, de certa forma, força um pensamento mais orientado a objetos. Isso não significa que um programa orientado a objetos não possa conter `if`s, porém o seu uso reduzido, ou até mesmo nulo, faz com que outros mecanismos de controle sejam utilizados. 

O grande objetivo disso é permitir uma escalabilidade para o código da calculadora. Quando quisermos implementar mais operações, temos que mudar o mínimo de código possível, e fazer com que o código já existente se adapte à nova implementação. Se para cada operação tivermos um `if` no código, para 20 operações, existiriam 20 `if`s, e isto claramente impede a evolução natural do código.

Se preocupe com o código, implemente-o pensando em sua evolução, questione-se a todo momento (_Se eu implementar uma operação nova, quanto código vou precisar modificar?_). 

A interação com o usuário fica a seu critério, desde que ele consiga escolher a operação e informar os dois números que deseja calcular.

**Dica:** Dê uma olhada sobre **enumerações** (enums) do Java.

**Curiosidade:** Sim, é possível implementar a calculadora sem utilizar **nenhuma** instrução `if` ou `switch`.

_Let's do it!_