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
<xsl:template match="BookInfo">
   <table border="2" width="100%" >
  	 <tr bgcolor="LIGHTBLUE">
  	 	<td>Book Name </td>
  	 	<td>Book Price</td>
  	 	<td>Author Name</td>
  	 </tr>	  
 	<xsl:for-each select="Book">
 	 	 <tr bgcolor="LIGHTYELLOW">
 	 		<td><i><xsl:value-of select="BookName"/></i></td>
 	 		<td><xsl:value-of select="BookPrice"/></td>
 	      		<td><xsl:value-of select="BookAuthor"/></td>
 	   	</tr>
 	</xsl:for-each>
    </table>
  </xsl:template>
</xsl:stylesheet>
