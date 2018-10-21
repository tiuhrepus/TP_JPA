<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Gestion des comptes</title>
    </head>
    
    <body>
        <form method="post" action="${pageContext.request.contextPath}/accountManagement" style="margin-left: 3%; margin-top: 3%;">
            <div class="form-row">
                <div class="form-group col-md-8">
                    <label for="inputLabel">Label*</label>
                    <input type="text" class="form-control" name="inputLabel" required>
                </div>
                <div class="form-group col-md-8">
                    <label for="inputIban">Iban*</label>
                    <input type="text" class="form-control" name="inputIban" required>
                </div>
                <div class="form-group col-md-8">
                    <label for="inputNumClient1">Num Client 1*</label>
                    <select name="inputNumClient1" size="1" required>
                        <c:forEach items="${clients}" var="client">
                            <option><c:out value="${client.getNumClient()}"/></option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group col-md-8">
                    <label for="inputNumClient2">Num Client 2</label>
                    <select name="inputNumClient2" size="1" required>
                        <c:forEach items="${clients}" var="client">
                            <option><c:out value="${client.getNumClient()}"/></option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group col-md-8">
                    <label for="inputNumClient1">Num Agency*</label>
                    <select name="inputNumClient1" size="1" required>
                        <c:forEach items="${agencies}" var="client">
                            <option><c:out value="${agencie.getNumAgency()}"/></option>
                        </c:forEach>
                    </select>
                </div>                
            </div>	
            <button id="submitButton" type="submit" class="btn btn-primary mb-2">Créer un compte</button>
        </form>
            
        <div>
            <h2>Liste des comptes</h2>
            <c:forEach items="${comptes}" var="compte">
                <tr>
                    <td>Number: <c:out value="${compte.getAccountNb()}"/></td>
                    <td>Iban: <c:out value="${compte.getIban()}"/></td> 
                    <td>Label: <c:out value="${compte.getLabel()}"/></td>
                    <td>Balance: <c:out value="${compte.getBalance()}"/></td>
                    <c:forEach items="${compte.getClients()}" var="client">
                        <td>Client: <c:out value="${client.getPrenom()}"/></td>
                        <td><c:out value="${client.getNom()}"/></td> 
                    </c:forEach>
                </tr>
                <br/>
            </c:forEach>
        </div>
        <br/>
        <a href="${pageContext.request.contextPath}">Accueil</a>
    </body>
</html>
