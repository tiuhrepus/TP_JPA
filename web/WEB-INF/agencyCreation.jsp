<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Création d'agence</title>
    </head>
    
    <body>
        <form method="post" action="${pageContext.request.contextPath}/agencyCreation" style="margin-left: 3%; margin-top: 3%;">
            <div class="form-row">
                <div class="form-group col-md-8">
                    <label for="inputAddress">Adresse</label>
                    <input type="text" class="form-control" name="inputAddress" required>
                </div>
                <div class="form-group col-md-8">
                    <label for="inputNumAgency">Numéro d'agence</label>
                    <input type="number" class="form-control" name="inputNumAgency" required>
                </div>
            </div>	
            <button id="submitButton" type="submit" class="btn btn-primary mb-2">Créer agence</button>
        </form>
            
        <div>
            <h2>Liste des agences</h2>
            <c:forEach items="${agences}" var="agence">
                <tr>
                    <td>Agency number: <c:out value="${agence.getNumAgency()}"/></td>
                    <td>Agency address: <c:out value="${agence.getAddress()}"/></td> 
                </tr>
                <br/>
            </c:forEach>
        </div>
        <br/>
        <a href="${pageContext.request.contextPath}">Accueil</a>
    </body>
</html>

