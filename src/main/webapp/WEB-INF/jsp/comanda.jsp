<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
</head>
<body>
<ul>
	<c:forEach items="${comandaBean.getCantidades().keySet()}" var="item">
		<li>${item} - ${comandaBean.getCantidades().get(item)}</li>
	</c:forEach>
	
	
	<form method="POST" action="anadirItem">
		<label>Plato</label>
		<input type="text" name="platoNuevo" />
		<input type="submit" value="+">
		<br>
	</form>
	
	<form method="POST" action="enviarComanda">
		<input type="submit" value="Enviar comanda">
	</form>
</ul>

</body>
</html>