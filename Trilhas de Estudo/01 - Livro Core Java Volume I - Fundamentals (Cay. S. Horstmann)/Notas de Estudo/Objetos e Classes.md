## Objetos e Classes  
  
> N-01  
  
Programação orientada a objetos requer uma maneira de pensar diferente da necessária para programação procedural.  
  
> N-02  
  
Java é um linguagem de programação fortemente orientada a objetos. Isso quer dizer que tudo que eu buscar desenvolver, será desenvolvido emcima/utilizando objetos oferecidos pela linguagem cuja funcionalidade estará apresentada, mas de implementação "escondida". Ainda que eu possa implementar funcionalidades novas, terei que fazer na forma de classes e objetos.  
  
> N-03
  
A orientação a objetos inverte a lógica procedural ao mudar o foco: ao invés de criar algoritmos que operam em dados soltos, ela foca em modelar as coisas do sistema. Ao proteger os atributos a programação orientada a objetos resolve o problema dos dados soltos, pois eles não podem mais ser alterados diretamente por código externo, tornando obrigatório chamar um método em um objeto daquela classe para interagir com seus dados.  
  
> N-04  
  
Classes estão para as formas como objetos estão para os bolos.  
  
> N-05  
  
`Encapsulamento:` é a prática de agrupar dados (atributos) e comportamentos (métodos) em uma única unidade (classe), ocultando os detalhes internos (atributos) do mundo exterior e expondo uma interface pública (métodos) para controlar o acesso.  
`Campos de Instância:` são as variáveis (atributos) declaradas dentro de uma classe que armazenam os dados que definem o estado de cada objeto individual (instância).  
`Métodos:` são os comportamentos (blocos de código, ou algoritmos) que definem o que uma classe ou objeto pode fazer. Eles são a forma como o estado (campos de instância) é acessado e modificado, ou como outras ações e cálculos são executados.  
`Estado:` conjunto de valores nos campos de instância em determinado momento.  
  
> N-06
  
Para iniciar um programa orientado a objetos, onde não há um "topo" como a função main(), use a regra dos substantivos e verbos para identificar suas classes e métodos. Ao analisar a descrição do problema, os substantivos (as "coisas", como Pedido ou Item) são seus principais candidatos a Classes. Em seguida, identifique os verbos (as "ações", como adicionarItem ou cancelarPedido) para descobrir seus Métodos. O passo crucial é então atribuir a responsabilidade: o verbo (método) deve ser colocado dentro da classe (substantivo) que é a principal responsável por executar aquela ação; por exemplo, a classe Pedido é responsável pelo método adicionarItem, pois é o pedido que gerencia sua própria lista de itens.  
  
> N-07  
  
As classes relacionam-se, descando-se as seguintes maneiras:  
  
`Dependência:` é relacionamento mais fraco, ocorrendo quando uma classe usa temporariamente um objeto de outra classe para realizar uma tarefa, mas não o armazena. Isso acontece tipicamente quando um objeto é passado como parâmetro de um método. A classe ProcessadorPagamento, por exemplo, usa-um CarrinhoDeCompras no método realizarPagamento(), mas não o guarda como um atributo.  
`Agregação:` é um relacionamento mais forte onde uma classe contém um ou mais objetos de outra classe como um campo de instância (atributo). Isso representa uma relação "tem-um" ou "tem-vários".  
`Herança:` é um relacionamento de especialização onde uma classe (filha) herda os campos e métodos de outra classe (mãe), permitindo o reúso de código. A classe filha é-um tipo da classe mãe (um Cachorro é-um Animal) e pode usar suas funcionalidades sem precisar reprogramá-las, podendo também adicionar ou modificar comportamentos.  