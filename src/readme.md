# Challenge Conversor de Moedas - ONE

Este projeto faz parte do programa ONE, da Oracle com Alura,
para a trilha de backend.

## Como funciona
O projeto foi feito para que o usuário possa selecionar entre 06 distintas
opções de moedas, utilizando a [ExchangeRate-API](https://www.exchangerate-api.com//).
As taxas de conversão são captadas da aplicação e usadas localmente na conversão
para o valor indicado pelo usuário neste aplicativo.

## Funcionalidades do projeto
O projeto converte o valor determinado pelo usuário dado em uma moeda base 
selecionada pelo mesmo.

## Como adicionar mais moedas para a conversão
Caso deseje converter o valor de mais/diferentes moedas, pode-se fazer isso ao acrescentar 
ou alterar no próprio menu (na estrutura switch) mais um caso para a conversão.

É importante se lembrar de que as moedas inseridas precisam estar de acordo com a
ISO 4217 - formato ao qual aplicação repassa a moeda desejada para a API a fim
de se usar a taxa de conversão desejada.


## Tecnologias usadas
<table>
    <tr>
        <td>Technology</td>
        <td>Version</td>
    </tr>
    <tr>
        <td>Java</td>
        <td> 17</td>
    </tr>
    <tr>
        <td>Gson</td>
        <td>2.10.1</td>
    </tr>
</table>