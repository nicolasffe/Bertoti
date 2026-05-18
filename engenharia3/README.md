# Engenharia 3

Esta pasta reune exemplos simples de padroes de projeto e antipadroes em Java. A ideia principal do repositorio e comparar codigos mais repetitivos com solucoes mais limpas, organizadas e faceis de manter.

## Estrutura

- `strategy/antipadrao`: exemplos em que a heranca acaba gerando repeticao ou deixando algumas classes muito parecidas.
- `strategy/padrao`: exemplo usando uma estrutura mais organizada para separar regras de comportamento.
- `observer/antipadrao`: exemplo em que `Produto` conhece diretamente os usuarios que precisam ser avisados.
- `observer/padrao`: exemplo usando o padrao Observer, separando quem emite a notificacao de quem recebe.

## Repeticao de codigo

Nos exemplos de antipadrao, a solucao funciona, mas fica menos flexivel. Quando uma regra muda, normalmente e preciso alterar varias classes ou repetir o mesmo metodo em lugares diferentes.

No `observer/antipadrao`, por exemplo, o produto guarda usuarios especificos:

- se entrar um terceiro usuario, a classe `Produto` precisa mudar;
- se sair um usuario, a classe tambem precisa mudar;
- o produto fica muito dependente das classes que recebem a notificacao.

Esse tipo de codigo e mais dificil de expandir porque cada nova necessidade puxa alteracoes em partes que ja estavam prontas.

## Codigo mais limpo

Nos exemplos com padrao de projeto, o comportamento fica mais separado. Cada classe tem uma responsabilidade mais clara, e novas mudancas tendem a exigir menos alteracoes.

No `observer/padrao`, o `Produto` trabalha com uma lista de observadores. Ele nao precisa saber exatamente quantos usuarios existem nem quem sao eles. Basta adicionar ou remover observadores pela interface `Subject`.

Com isso:

- o codigo fica menos repetido;
- novas classes podem receber notificacoes sem alterar `Produto`;
- a manutencao fica mais simples;
- a relacao entre as classes fica mais organizada.

## Objetivo dos exemplos

O objetivo nao e criar um sistema completo, mas mostrar a diferenca entre dois jeitos de resolver o mesmo problema:

- codigo repetitivo: resolve o problema inicial, mas cresce mal;
- codigo mais limpo: organiza responsabilidades e facilita futuras mudancas.

Esses exemplos ajudam a entender por que padroes de projeto sao uteis quando o codigo precisa crescer sem virar uma estrutura confusa.
