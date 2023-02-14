# INVERSION SEGREGATION PRINCIPLE
Principio da Inversão de Dependência.

Buscamos neste principio NÃO FORÇAR que 
uma classe implemente interfaces com metodos que 
não irão utilizar. É melhor criar interfaces 
específicas ao invés de termos uma única interface 
genérica. Na solução ruim, vimos que o Pinguim é 
uma ave que não voa, portanto, não faz sentido que 
ela implemente o método setAltitude. Assim sendo, 
na solução boa, criamos uma nova interface A
vesQueVoam e extendemos a interface Aves, 
assim, a classe Pinguim utiliza apenas os métodos 
pelos quais fazem sentido para o seu contexto.