<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    
      <center>
        
          <h2>WELCOME TO PRODUCTS INFO</h2>
      
      </center>
     <center> 
      <table border="1" cellspacing="5" cellpadding="7" >
      <b>
          <tr>
            
             <td> <a href="${pageContext.request.contextPath}/addProduct">ADD THE PRODUCT </a> </td>
           </tr>
          <tr>
            
            <td> <a href="${pageContext.request.contextPath}/editProduct">EDIT THE PRODUCT</a> </td>
          </tr>
         
       </b>     
         
      </table>
     
     </center>
      
</body>
</html>