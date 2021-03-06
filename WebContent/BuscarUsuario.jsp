<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" media="screen"
	href="css/estilo.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" media="screen"
	href="css/FormularioRegistro.css" />
<title>Buscar por Cedula</title>
</head>
<body>

	<nav class="navbar">

		<div class="container-fluid">

			<div class="navbar-header">
				<h2 style="color: white">Buscar Personas por cedula</h2>
				<form class="example" action="/Agenda/BuscarPersonaController"
					style="margin: auto; max-width: 300px">
					<input type="text" placeholder="Ingrese Cedula" name="cedula">
					<button type="submit">
						<i class="fa fa-search"></i>
					</button>
					
					<c:set var="p" scope="request" value="${usuario}" />
							<h1>Persona encontrada</h1>	
								<p>Id: ${p.id}</p>
								<p>Cedula: ${p.cedula}</p>
								<p>Nombre: ${p.nombre}</p>
								<p>Apellido: ${p.apellido}</p>
								<p>Email: ${p.email}</p>
								<p>Apellido: ${p.contrasenia}</p>
					<a href="/Agenda/index.html">Regresar al index</a>
	
				</form>
			</div>
		</div>
	</nav>


	<div class="jumbotron text-center">
		<h1> Agenda Telefonica</h1> 
	</div>


</body>
</html>