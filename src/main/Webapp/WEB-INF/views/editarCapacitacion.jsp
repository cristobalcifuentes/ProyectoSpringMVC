<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form action="editarcapacitacion" method="post">





		<form:input path="capacitacion" />
		<br>
		<form:hidden path="id" />
		<input type="submit" value="Editar capacitacion" />
	</form:form>

</body>
</html>