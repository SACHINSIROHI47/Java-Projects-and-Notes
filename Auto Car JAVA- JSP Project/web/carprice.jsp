<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>car price</title>
    </head>
    <body>
        <h1>Select Brand</h1>
        <select style="width:280px; height: 40px;">
            <option>Audi</option>
            <option>Bmw</option>
            <option>Datsun</option>
            <option>Dc</option>
            <option>Force</option>
            <option>Kia</option>
        </select>
        <h1>Select Model</h1>
        <select style="width:280px; height: 40px;">
            <option>Q2</option>
            <option>A8</option>
            <option>Q8</option>
            <option>A7</option>
            <option>A4</option>
            <option>A6</option>
        </select><br/><br/>
        <div>
            <img src="image//bmwcar.jpg" width="900" height="700">
        </div>
        <label style="font-size: 35px;">Select City:</label>
        <input type="text" name="Select City" placeholder="Type your Area" size="40" style="font-size: 25px;"/><br/><br/>
        <a href="http://localhost:8080/WebApplication2/Registration.jsp">
        <input type="submit" value="Enquire Now" style="font-size: 30px;"/>
        </a>
    </body>
</html>
