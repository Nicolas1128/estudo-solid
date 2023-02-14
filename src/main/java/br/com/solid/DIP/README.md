# DEPENDENCY INVERSION PRINCIPLE
Princípio da Inversão de Dependência

Devemos depender de abstrações e não de implementações.

Na solução ruim, vemos que existe um acoplamento
na conexão com o banco de dados, dessa forma
se houvesse uma mudança o tipo de banco, por exemplo,
teriamos problemas. A solução para este problema foi
delegar uma interface para a classe PasswordReminder, 
que não faz ideia de qual banco irá conectar, 
pois dependerá de uma abstração e não uma implementação.  
