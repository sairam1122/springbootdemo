<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     
     <center>
     
         <h2>PRODUCT RESULT PAGE</h2>
      
     </center>
     
     <br>
     <br>
     
     <center>
         <table>
             <tr>
                <td> <b>${info.productName}</b> PRODUCT IS ADDED SUCCESFULLY </td>                                                                                                                    
             </tr>
             
             <tr>
            
              <td><a href="${pageContext.request.contextPath}/welcome">REDIRECT TO WELCOME PAGE</a></td>
           
           </tr>
           
         </table>
       
     </center>  
     
</body>
</html>