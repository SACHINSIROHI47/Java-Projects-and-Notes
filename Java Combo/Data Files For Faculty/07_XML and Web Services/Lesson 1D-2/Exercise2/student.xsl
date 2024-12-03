<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl= "http://www.w3.org/1999/XSL/Transform" version= "1.0">
<xsl:output method="html" indent="yes"/>
<xsl:template match="/">
<html>
  <body>
  	 <xsl:apply-templates/>
  </body>
</html>
</xsl:template>
<xsl:template match="StudentInfo">
   <table border="2" width="100%" >
  	 <tr bgcolor="LIGHTBLUE">
  	 	<td>Student Name </td>
  	 	<td>Stream </td>
  	 	<td>University </td>
  	 </tr>	  
 	<xsl:for-each select="Student">
 	 	 <tr bgcolor="LIGHTYELLOW">
 		 	<td><xsl:value-of select="StudentName"/></td>
 	 		<td><xsl:value-of select="Stream"/></td>
                	<td><xsl:value-of select="University"/></td> 	      	   	</tr>
 	</xsl:for-each>
    </table>
  </xsl:template>
</xsl:stylesheet>
