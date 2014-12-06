<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div align="left">
	<div>
		<c:out value="${mein_text}" />
		<form method="post" action="<c:url value="/" />">
			Dein Name: <input type="text" name="name" value="" />
			<br />
			<input type="submit" value="Senden" />
		</form>
	</div>
</div>