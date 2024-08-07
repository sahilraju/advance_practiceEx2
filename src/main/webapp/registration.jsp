<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
     <form action="register" method="post">
     First Name: <input type="text" name="fname"> <br>
     Last Name: <input type="text" name="lname"> <br>
     Country: <select name="country">
                 <option  value="india"> INDIA </option>
                 <option value="UK"> UK </option>
                 <option value="USA"> USA </option> 
              </select> <br>
     Languages Known: <input type="checkbox" name="hindi" value="hindi"> Hindi 
                      <input type="checkbox" name="eng" value="english"> English
                      <input type="checkbox" name="br" value="british"> British <br>
     Gender: <input type="radio" name="gender" value="male"> Male 
             <input type="radio" name="gender" value="female"> Female <br>
             
             <input type="submit" name="submit" value="submit">   
             <input type="reset" value="reset">  
     </form>
     
      <!-- Error message display -->  
    <div class="error">
        <% 
            String errorMessage = (String) request.getAttribute("errorMessage");
            if (errorMessage != null) {
               out.print(errorMessage); 
            }
        %> 
    </div>
</body>
</html>