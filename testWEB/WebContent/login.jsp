<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
 
<f:view>
<html>
<head><title>Login Test</title></head>
<body>
<h:form>
<table>
<tr>
<td><h:outputText value="Usuario: " /></td>
<td><h:inputText id="userName"
value="#{loginBean.userName}" />
</td>
</tr>
<tr>
<td><h:outputText value="Contraseña: " /></td>
<td><h:inputSecret id="password"
value="#{loginBean.password}" />
</td>
</tr>
<tr>
<td> </td>
<td><h:commandButton value="Login"
action="#{loginBean.validar}"/>
</td>
</tr>
</table>
</h:form>
</body>
</html>
</f:view>