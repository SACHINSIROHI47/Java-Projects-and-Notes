<html>
<body bgcolor="lightyellow">
<center>
<h3>Select a product to view supplier details and generate purchase order</h3>
<br>
<form action="http://localhost:8080/projectctx/servlet/MainServlet" method="GET">
  Please select a Product
  <table>
   <tr>
   <td>
  	<select name=prod size=1>
  		<option>--</option>
  		<option>Engines</option>
  		<option>Brakes</option>
  		<option>Fuel Pump</option>
  		<option>Accelerator</option>
  	</select>
  	</td>
  	</tr>
  	<tr>
  	<td>
      <input type="submit" value="Submit">
      <input type="hidden" name="action" value="product">
    </td>
    </tr>
    </table> 
</form>
</center>
</body>
</html>
