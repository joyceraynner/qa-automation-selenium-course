# language: pt

  Funcionalidade: Receber o cupom de desconto da qazando
    eu como usuario da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

    Cenario: Vizualizar codigo de desconto
      Dado  que estou no site da qazando
      Quando quando eu preencho meu e-mail
      E clico em ganhar cupom
      Entao eu vejo o codigo de desconto