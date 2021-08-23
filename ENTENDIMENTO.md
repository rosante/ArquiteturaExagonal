# Entendimentos do Projeto

- Utilização do undertow (e exclusão do tomcat) no pom.xml para aumentar as requisições simultâneas. O tomcat possui em torno de 30k enquanto o undertow atinge em torno de 90k
- Packages web.request e web.response tem data class identicos, porém apenas porque neste projeto a request e a response será igual. Em vários casos a request pode ser uma enquanto a response seja outra.
- Existem os data class de request e response para que as Classes de Borda não tem na Classe de Domain
- Utilizando os decoradores do javax.validation.constraints para validar os requests