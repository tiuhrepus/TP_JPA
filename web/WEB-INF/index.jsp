<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Accueil</title>
    </head>
    
    <body>
        <div style="padding: 10px; border: 1px #0568CD solid;">
            <h1>Menu</h1>
            <a href="${pageContext.request.contextPath}/clientCreation">Création de clients</a>
            <br/>
            <a href="${pageContext.request.contextPath}/agencyCreation">Création d'agences</a>
            <br/>
            <a href="${pageContext.request.contextPath}/accountManagement">Création de comptes</a>
        </div>
    </body>
    
</html>
