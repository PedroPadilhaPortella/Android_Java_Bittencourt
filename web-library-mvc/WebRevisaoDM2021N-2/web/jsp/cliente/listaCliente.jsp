<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>LISTA</h1>
        <FORM name="validaListaCliente" action="validaListaCliente.jsp" method="post">
            NOME : <input type="text" name ="NOME" value=""> <br>
            <input type="submit" name ="ENTRAR" value="ENTRAR">
        </FORM>
    </div>
    </body>
</html>
