# OPEN/CLOSED PRINCIPLE
Princípio Aberto/Fechado

"Um artefato de software deve ser aberto para extensão,
mas fechado para modificação."

Devemos EXTENDER (abstrair), ou seja, fazer do uso de interfaces
para obter novos recursos. Assim, cada assunto
específico poderá implementar o método conforme sua 
regra (parâmetros).

No exemplo RUIM, temos uma classe FolhaDePagamento
responsável por definir o pagamento de acordo com 
o tipo de contrato, porém a classe sempre necessita
verificar o tipo de contrato por uma validação (IF), 
e isso não é algo proveitoso se pensarmos na evolução
na forma que está.

Já no exemplo BOM, vemos que existe uma interface com 
o metodo REMUNERAÇÃO, que é implementado pelas classes 
do tipo de contrato, dessa forma a classe FolhaDePagamento, 
não precisa ficar identificando qual o tipo do contrato.