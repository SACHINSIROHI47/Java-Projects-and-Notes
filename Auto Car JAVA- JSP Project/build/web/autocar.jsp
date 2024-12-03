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
    border-color: #1172c4;
    border-style: solid;
    border-width: 1px;
    padding: 10px 10px;
    transition: all 0.2s linear;
    line-height: 30px;
}
.tab ul-highlight:hover{
    color: #ffffff;
    background: black;
    border-color: #1172c4;
}
.li-highlight:hover{
   color: #ffffff;
    background: black;
    border-color: #1172c4;  
}
li.menu-highlight:hover a{
    color: #ffffff;
}
.menu-highlight:active{
    border-radius: 30px;
}
* {box-sizing: border-box;}
body {font-family: Verdana, sans-serif;}
.mySlides  {display: none;}
img {vertical-align: middle;}

/* Slideshow container */
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
 </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autocar</title>
    </head>
    <body>
        <a href="#">
            <img src="image//web_1.jpg" width="1450">
        </a>
        <div class="tab">
            <ul>
                <li>
                     <a href="#">Home</a>
                </li>
                <li>
                     <a href="#">Find a car<span>&#9662;</span></a>
                     <ul class="dropdown">
                <li>
                    <a href="http://localhost:8080/WebApplication2/cars.jsp">car</a>
                </li>
                <li>
                    <a href="http://localhost:8080/WebApplication2/carprice.jsp">car price</a>
                </li>
                <li>
                    <a href="http://localhost:8080/WebApplication2/carloan.jsp">car Loan Calculator</a>
                </li>
                </ul>
                     <li>
                    <a href="#">News<span>&#9662;</span></a>
                    <ul class="dropdown">
                        <li>
                            <a href="http://localhost:8080/WebApplication2/autocarindia.jsp">Cars</a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/WebApplication2/bikenews.jsp">bike</a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/WebApplication2/motorsport.jsp">Motorsports</a>
                        </li>
                </ul>
                     </li>
                <li>
                    <a href="#">Reviews<span>&#9662;</span></a>
                     <ul class="dropdown">
                         <li>
                             <p>Car</p>
                <a href="http://localhost:8080/WebApplication2/carreviews.jsp">First driver/reviews</a><br/>
                <a href="http://localhost:8080/WebApplication2/COMPARISON.jsp">Comparisons</a>
                             
                         </li>
                         <li>
                             <p>Bike</p>
                             <a href="http://localhost:8080/WebApplication2/ride.jsp">FIRST RIDE / REVIEWS</a><br/>
                <a href="http://localhost:8080/WebApplication2/COMPARISONbike.jsp">Comparisons</a>
                             
                         </li>
                         
                     
                </ul>
                <li>
                     <a href="#">Features<span>&#9662;</span></a>
                     <ul class="dropdown">
                <li>
                    <a href="http://localhost:8080/WebApplication2/FEATURES.jsp">Features</a>
                </li>
                <li>
                    <a href="http://localhost:8080/WebApplication2/TRAVELOGUES.jsp">Travelogues</a>
                </li>
                <li>
                    <a href="http://localhost:8080/WebApplication2/RENAULT.jsp">Renault</a>
                </li>
                
                </ul>
                <li>
                     <a href="#">Advice</a>
                </li>
                 <li>
                      <a href="#">Forums</a>
                </li>
                
            </ul>
        
        </div>
       <div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="image//s.jpg" style="width:100%">
  <div class="text">Caption Text</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="image//bullet.jpg" style="width:100%">
  <div class="text">2</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="image//autocar3.jpg" style="width:100%">
  <div class="text">3</div>
</div>
  <div class="mySlides fade">
  <div class="numbertext">4 / 3</div>
  <img src="image//autocar4.jpg" style="width:100%">
  <div class="text">Caption four</div>
  </div>
  <div class="mySlides fade">
  <div class="numbertext">5 / 3</div>
  <img src="image//autocar5.jpg" style="width:100%">
  <div class="text">Caption five</div>
  </div>
  <div class="mySlides fade">
  <div class="numbertext">6 / 3</div>
  <img src="image//tvs.jpg" style="width:100%; background-color: orchid;">
  <div class="text">Caption six</div>
</div>
  </div>
<br>
<!-- Next and previous buttons -->
<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div><br/> 
 <div class="row">
<a href="https://www.amazon.in/Castrol-Edge-5W-40-Synthetic-Engine/dp/B07TV8N65N"> 
 <img alt="alt text" style="float: right" src="image//castrol.jpg" width="600" height="200"><br/>
 <p style="color:black;">DiD you know modern car engines come with modern challenges-smaller and yet pushed harder for</p><br/>  
 <p style="color:black;">Performance.this leads to increased pressures that pose challenges for engine oils,causing friction and</p><br/>
 <p style="color:black;">loss of engine power.advanced full synthetic engine oils help unlock the true performance of your engine</p>
</a><br/><br/><br/>
     </div>
<ul>
    <li>
        <h1>Top News</h1>
    </li>
<a style="font-size: 30px;" href="http://localhost:8080/WebApplication2/carbikenews.jsp">view all</a>
</ul>
<a href="#">
<img src="image//topnews.jpg" width="1400" height="700">
</a>
<ul>
    <li>
    <p>Bike Reviews</p>
    </li>
    <a href="#">Car Reviews</a>
</ul>
<ul>
    <li>
        <p>Latest Reviews</p>
    </li>
    <a href="#">First Driver/Road</a>&nbsp; &nbsp;
    <a href="#">Comparisons</a>&nbsp; &nbsp;
    <a href="#">Long-team Reviews</a>&nbsp; &nbsp;
    <a href="#">Vido Reviews</a>&nbsp; &nbsp;
</ul>
<a href="https://www.autocarindia.com/car-reviews/2021-ford-figo-12-at-review-test-drive-421473">
    <img src="image//figo.jpg" width="350" height="350">
</a>
<a href="https://www.autocarindia.com/car-reviews/2021-jaguar-f-pace-facelift-review-test-drive-421508">
    <img src="image//JAGUAR1.jpg" width="350" height="350">
</a>
<a href="https://www.autocarindia.com/car-reviews/aston-martin-dbx-india-review-test-drive-421407">
    <img src="image//am.jpg" width="350" height="350">
</a>
<a href="https://www.autocarindia.com/car-reviews/skoda-kushaq-review-test-drive-421182">
    <img src="image//skoda.jpg" width="350" height="350">
</a><br/><br/>
<p style="font-size: 19px; background-color: blueviolet;">
    <img src="image//india.jpg" width="800" height="400">
Will it be the small
mid-sizer or the big
small car?
<a href="http://localhost:8080/WebApplication2/Registration.jsp">
<input style="font-size: 28px;text-align: center;" type="submit" value="ask now">
</a>
</p> 
<div style="background-color: black;">
<ul>
    <li>
        <a href="https://www.facebook.com/autocarindiamag" target="blank">
            <img src="image//fb.jpg" width="50">   
        </a>
        <a href="https://twitter.com/autocarindiamag" target="blank">
            <img src="image//tw.jpg" width="50">   
        </a>
        <a href="https://www.instagram.com/autocar_india/" target="blank">
            <img src="image//in.jpg" width="50">   
        </a>
         <a href="https://www.youtube.com/user/autocarindia1" target="blank">
            <img src="image//yu.jpg" width="50"> 
         </a>&nbsp; &nbsp; &nbsp;
        Copyright@ashish tyagi
    </li>
</ul>
</div>
<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>
</body>
</html>
