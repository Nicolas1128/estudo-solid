# Single Responsability Principle

Princípio da Responsabilidade Única

"Um módulo deve ser responsável por um, e apenas um, ATOR."

Em outras palavras, para cada responsabilidade do seu sistema,
você tem uma entidade que sabe apenas fazer aquilo que é
especializada e, inclusive, a melhor de todas naquele assunto.

Mas.. para quê programar desta forma?

Porque com entidades independentes e isoladas, você consegue
reaproveitar o código mais facilmente, consegue refatorar mais
facilmente, testar mais facilmente e gerar menos bugs e, mesmo 
que gere bugs, será mais fácil de isolar e consertar o problema.

No exemplo RUIM, são varios métodos com responsabilidades 
distintas em uma unica classe, essa classe viola 
completamente o SRP, alem de lidar com as informações 
dos pedidos ela tambem é responsavel pela exibição e 
manipulação dos dados.

No exemplo BOM, cada classe possui suas responsabilidades,
ou seja, a classe ORDER é responsavel pelas operações 
referentes ao pedido, a classe OrderRepository é responsável 
pelas operações de banco de dados e a classe OrderView é 
responsável pela exibição. 