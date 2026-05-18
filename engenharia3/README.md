# Engenharia 3

Esta pasta reúne exemplos simples de padrões de projeto e antipadrões em Java. A ideia principal do repositório é comparar códigos mais repetitivos com soluções mais limpas, organizadas e fáceis de manter.

## Estrutura

- `strategy/antipadrao`: exemplos em que a herança acaba gerando repetição ou deixando algumas classes muito parecidas.
- `strategy/padrao`: exemplo usando uma estrutura mais organizada para separar regras de comportamento.
- `observer/antipadrao`: exemplo em que `Produto` conhece diretamente os usuários que precisam ser avisados.
- `observer/padrao`: exemplo usando o padrão Observer, separando quem emite a notificação de quem recebe.

## Repetição de código

Nos exemplos de antipadrão, a solução funciona, mas fica menos flexível. Quando uma regra muda, normalmente é preciso alterar várias classes ou repetir o mesmo método em lugares diferentes.

No `observer/antipadrao`, por exemplo, o produto guarda usuários específicos:

- se entrar um terceiro usuário, a classe `Produto` precisa mudar;
- se sair um usuário, a classe também precisa mudar;
- o produto fica muito dependente das classes que recebem a notificação.

Esse tipo de código é mais difícil de expandir porque cada nova necessidade puxa alterações em partes que já estavam prontas.

## Código mais limpo

Nos exemplos com padrão de projeto, o comportamento fica mais separado. Cada classe tem uma responsabilidade mais clara, e novas mudanças tendem a exigir menos alterações.

No `observer/padrao`, o `Produto` trabalha com uma lista de observadores. Ele não precisa saber exatamente quantos usuários existem nem quem são eles. Basta adicionar ou remover observadores pela interface `Subject`.

Com isso:

- o código fica menos repetido;
- novas classes podem receber notificações sem alterar `Produto`;
- a manutenção fica mais simples;
- a relação entre as classes fica mais organizada.

## Objetivo dos exemplos

O objetivo não é criar um sistema completo, mas mostrar a diferença entre dois jeitos de resolver o mesmo problema:

- código repetitivo: resolve o problema inicial, mas cresce mal;
- código mais limpo: organiza responsabilidades e facilita futuras mudanças.

Esses exemplos ajudam a entender por que padrões de projeto são úteis quando o código precisa crescer sem virar uma estrutura confusa.
