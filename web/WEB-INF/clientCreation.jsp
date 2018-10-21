<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Création de clients</title>
    </head>
    
    <body>
        <form method="post" action="${pageContext.request.contextPath}/clientCreation" style="margin-left: 3%; margin-top: 3%;">
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputNom">Nom</label>
                    <input type="text" class="form-control" name="inputNom" required>
                </div>
                <div class="form-group col-md-4">
                    <label for="inputPrenom">Prénom</label>
                    <input type="text" class="form-control" name="inputPrenom" required>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-8">
                    <label for="inputDateNaiss">Date de naissance</label>
                    <input type="text" class="form-control" name="inputDateNaiss" required>
                </div>
            </div>	
            <button id="submitButton" type="submit" class="btn btn-primary mb-2">Créer compte client</button>
        </form>
            
        <div>
            <h2>Liste des clients</h2>
            <c:forEach items="${clients}" var="client">
                <tr>
                    <td>Client ID: <c:out value="${client.getNumClient()}"/></td>
                    <td>Client Name: <c:out value="${client.getNom()}"/></td> 
                    <td>Client Firstname: <c:out value="${client.getPrenom()}"/></td>
                </tr>
                <br/>
            </c:forEach>
        </div>
            
        <br/>
        <a href="${pageContext.request.contextPath}">Accueil</a>
    </body>
</html>
