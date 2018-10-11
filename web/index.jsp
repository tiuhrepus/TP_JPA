<%-- 
    Document   : index
    Created on : 10 oct. 2018, 15:43:10
    Author     : tim-b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <form style="margin-left: 3%; margin-top: 3%;">
  <div class="form-row">
      <div class="form-group col-md-4">
      <label for="inputNom">Nom</label>
      <input type="text" class="form-control" id="inputNom" placeholder="" required>
    </div>
    <div class="form-group col-md-4">
      <label for="inputPrenom">Prénom</label>
      <input type="text" class="form-control" id="inputPrenom" placeholder="" required>
    </div>
  </div>
  <div class="form-row">
  	<div class="form-group col-md-8">
    	<label for="inputDateNaiss">Date de naissance</label>
    	<input type="text" class="form-control" id="inputDateNaiss" placeholder="" required>
  	</div>
  </div>	
        <button id="submitButton" type="submit" class="btn btn-primary mb-2">Créer compte client</button>
    </form>
    </body>
</html>
