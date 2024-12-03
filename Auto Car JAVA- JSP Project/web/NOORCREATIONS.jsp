<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
             .tab{
   background-color: rgb(180, 204, 208);
}
ul{
    padding: 0;
    list-style: none;
    background: #f2f2f2;
}
ul li{
    display: inline-block;
    padding: 4px 20px;
    color: #333;
    text-decoration: none;
}
ul li a:hover{
    color: #fff;
    background: #939393;
}
ul li ul.dropdown{
 min-width: 100%;
 background: #f2f2f2;
 display : none;
 position: absolute;
 z-index: 999;
 left: 0;
}
 ul li:hover ul.dropdown{
    display: block;
}
ul li ul.dropdown li{
    display: block;
}
.tab ul{
    background: transparent;
    border-color: blueviolet;
    border-style: solid;
    border-width: 1px;
    padding: 8px 8px;
    transition: all 0.2s linear;
    line-height: 20px;
    text-align: right;
}
.tab ul-highlight:hover{
    color: #ffffff;
    background: black;
    border-color: #1172c4;
}
.li-highlight:hover{
   color: #ffffff;
    background: orchid;
    border-color: #1172c4;  
}
li.menu-highlight:hover a{
    color: #ffffff;
}
.menu-highlight:active{
    border-radius: 25px;
}
.button{
	width: 50px;
	height: 50px;
  top:50%;
  position: fixed;
	left: 50%;
	margin-top: -45px;
	margin-left: -50px;
	border-radius: 5px;
	background: none;
	cursor: pointer;
	transition: background 0.5s ease;
}

 .hover12 figure {
	background: #1abc9c;
}
.hover12 figure img {
	opacity: 1;
	-webkit-transition: .3s ease-in-out;
	transition: .3s ease-in-out;
}
.hover12 figure:hover img {
	opacity: .5;
}
div.gallery {
  margin: 5px;
  border: 1px solid #ccc;
  float: left;
  width: 290px;
}
div.gallery:hover {
  border: 1px solid #777;
}

div.gallery img {
  width: 100%;
  height: 400px;
}

div.desc {
  padding: 15px;
  text-align: center;
  font-size: 25px;
}
/* Sepia */
.hover09 figure img {
	-webkit-filter: sepia(100%);
	filter: sepia(100%);
	-webkit-transition: .3s ease-in-out;
	transition: .3s ease-in-out;
}
.hover09 figure:hover img {
	-webkit-filter: sepia(0);
	filter: sepia(0);
}

h1, h2, h3, h4, h5, h6, a {
  margin:0; padding:0;
}
.login {
  margin:0 auto;
  max-width:500px;
}
.login-header {
  color:#fff;
  text-align:center;
  font-size:300%;
}

.login-form {
  border:.5px solid #fff;
  background:#4facff;
  border-radius:10px;
  box-shadow:0px 0px 10px #000;
}
.login-form h3 {
  text-align:left;
  margin-left:40px;
  color:#fff;
}
.login-form {
  box-sizing:border-box;
  padding-top:15px;
  padding-bottom:10%;
  margin:5% auto;
  text-align:center;
}
.login input[type="text"],
.login input[type="password"] {
  max-width:400px;
  width: 80%;
  line-height:3em;
  font-family: 'Ubuntu', sans-serif;
  margin:1em 2em;
  border-radius:5px;
  border:2px solid #f2f2f2;
  outline:none;
  padding-left:10px;
}
.login-form input[type="button"] {
  height:30px;
  width:100px;
  background:#fff;
  border:1px solid #f2f2f2;
  border-radius:20px;
  color: slategrey;
  text-transform:uppercase;
  font-family: 'Ubuntu', sans-serif;
  cursor:pointer;
}
.sign-up{
  color:#f2f2f2;
  margin-left:-70%;
  cursor:pointer;
  text-decoration:underline;
}
.no-access {
  color:#E86850;
  margin:20px 0px 20px -57%;
  text-decoration:underline;
  cursor:pointer;
}
.try-again {
  color:#f2f2f2;
  text-decoration:underline;
  cursor:pointer;
}

/*Media Querie*/
@media only screen and (min-width : 150px) and (max-width : 530px){
  .login-form h3 {
    text-align:center;
    margin:0;
  }
  .sign-up, .no-access {
    margin:10px 0;
  }
  .login-button {
    margin-bottom:10px;
  }
}


        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NOOR CREATIONS</title>
    </head>
    <body>
        <ul>
            <li>
                <a href="#" style="font-size:20px;">
                    Cotact-7906868390
                </a>
            </li>
            <li>
                <a href="#" style="font-size:20px;">
                    Email-Shaheenkhan657@gmail.com
                </a>
                <a href="https://www.facebook.com/Manyavar/"><i class="fa-fa-facebook"><img src="image/fb.jpg" width="30px"></i></a>
                <a href="https://twitter.com/Manyavar_"><i class="fa-fa-facebook"><img src="image/tw.jpg" width="30px"></i></a>
                <a href="https://www.instagram.com/manyavar/"><i class="fa-fa-facebook"><img src="image/in.jpg" width="30px"></i></a>
                <a href="https://www.youtube.com/channel/UCLFcNhsW8b2lfggndqNN3jA"><i class="fa-fa-facebook"><img src="image/yu.jpg" width="30px"></i></a>
                <a href="https://www.linkedin.com/company/vedant-fashions-private-limited"><i class="fa-fa-facebook"><img src="image/linked.jpg" width="30px"></i></a>
            </li>
        </ul>
     <div class="tab">
            <ul>
                <div style="text-align:left;">
                <li>
    <img src="image//ashish.jpg" style="width:800px; height: 120px;"> 
                </li>
                
                </div>
                <li>
                     <a href="#">HOME</a>
                </li>
                <li>
                     <a href="#">ABOUT US</a>           
                </li>
                <li>
                     <a href="#">COLLECTION<span>&#9662;</span></a>
                     <ul class="dropdown">
                         
                     </ul>
                </li>
                <li>
                     <a href="#">GALLERY<span>&#9662;</span></a>
                     <ul class="dropdown">
                         
                     </ul>
                </li>
                <li>
                     <a href="#">CONTACT<span>&#9662;</span></a>
                     <ul class="dropdown">
                         
                     </ul>
                </li>
                </ul>
                     </div>
        <img src="image//woman.jpg" style="width: 100%; height: 100%;"><br/><br/>
        <h1 style='text-align: center; font-family: brush script mt; font-size:60px; color: orchid;'>Bridal Lehengas</h1>
    <marquee behavior="scroll" height="200" direction = "up" scrollamount="5" onmouseover="this.stop();" onmouseout="this.start();">
        <a href="#">
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src="image//fasion.jpg" style="width: 300px;height: 500px;">
        </a>
         <a href="#">
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src="image//fasion1.jpg" style="width: 300px;height: 500px;">
        </a>
        <a href="#">
      &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <img src="image//fasion2.jpg" style="width: 300px;height: 500px;">
        </a>
        <a href="#">
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src="image//fasion3.jpg" style="width: 300px;height: 500px;">
        </a><br/><br/>
        <a href="#">
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src="image//fasion4.jpg" style="width: 300px;height: 500px;">
        </a>
        <a href="#">
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src="image//fasion5.jpg" style="width: 300px;height: 500px;">
        </a>
        <a href="#">
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src="image//fasion6.jpg" style="width: 300px;height: 500px;">
        </a>
        <a href="#">
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src="image//fasion7.jpg" style="width: 300px;height: 500px;">
        </a>
    </marquee>
    <ul>
        <div style="text-align: center;">
        <li> 
            <h1 style="color: blueviolet; font-size: 60px;">ABOUT</h1>
        </li>
        <li>
            <h1 style="font-size: 60px;">US</h1>     
        </li>
        </div>
    </ul>
    <div style="text-align: center;">
        <img src="image//abouts.jpg" style="width:800px;">
    </div>
    <ul>
        <div style="text-align:center;">
        <li>
            <h1 style="font-size: 60px; color: orchid;">GALLERY</h1>
        </li>
        </div>
    </ul>
    <div class="hover09 column">
    <div class="gallery">
        <figure> <img src="image//gallery1.jpg" width="322" height="530"></figure>
      <div class="desc"> R.S 50,000</div>
    </div>  
    
     <div class="gallery">   
         <figure> <img src="image/gallery3.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 80,000</div>
        
     </div>
    <div class="gallery">   
        <figure><img src="image/gallery4.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 89,000</div>
        
     </div>
    <div class="gallery">   
        <figure> <img src="image/gallery5.jpg" width="322" height="530"></figure>
        <div class="desc"> R.S 85,000</div>
     </div>
    <div class="gallery">   
        <figure><img src="image/gallery6.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 1,20,000</div>
    </div><br/>
    <div class="gallery">   
        <figure><img src="image/g7.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 90,000</div> 
     </div>
    <div class="gallery">   
        <figure><img src="image/g2.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 55,0000</div>
        
     </div>
    <div class="gallery">   
        <figure><img src="image/g6.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 95,000</div>
        
     </div>
    <div class="gallery">   
        <figure><img src="image/g4.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 10,20,000</div>
        
     </div>
    <div class="gallery"> 
       <figure> <img src="image/g5.jpg" width="322" height="530"></figure>
       <div class="desc"> R.S 5,20,000</div>
     </div>
    </div>
          <form>  
  
           <div class="login">
  <div class="login-header">
    <h1>Login</h1>
  </div>
  <div class="login-form">
    <h3>Username:</h3>
    <input type="text" placeholder="Username" name="username"/><br>
    <h3>Password:</h3>
    <input type="password" placeholder="Password" name="psw"/>
    <br>
    <input type="submit" value="Login" class="login-button"/>
    <br>
    <a class="sign-up">Sign Up!</a>
    <br>
    <h6 class="no-access">Can't access your account?</h6>
  </div>
</div>

             
              
        <%
        try
        {
        String str1,str2;
        str1=request.getParameter("username");
        str2=request.getParameter("psw");
        
      //  out.println(str1+""+str2+""+str3+""+str4+""+str5+""+str6+""+str7+""+str8+""+str9+""+str10);
        String url="jdbc:mysql://localhost:3306/registion";
        String user="root";
        String pass="12345";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="insert into sigin(username,psw)values(?,?);";
         PreparedStatement prep = con.prepareStatement(sql);
         prep.setString(1,str1);
         prep.setString(2,str2);
         
         prep.executeUpdate();
         prep.close();
        // out.println("record has been save successfully");
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    %>
    
          </form>
    </body>
</html>
