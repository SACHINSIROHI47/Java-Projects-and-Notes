<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            * {box-sizing: border-box;}
body {font-family: Verdana, sans-serif;}
.mySlides  {display: none;}
img {vertical-align: middle;}
img{
    background-color: blueviolet;
}

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
        <title>cars</title>
    </head>
    <body>
        <div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="image//cars.jpg" style="width:100%">
  <div class="text">Caption Text</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="image//cars_1.jpg" style="width:100%">
  <div class="text">Caption Two</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="image//cars2.jpg" style="width:100%">
  <div class="text">Caption Three</div>
</div>
  <div class="mySlides fade">
  <div class="numbertext">4 / 3</div>
  <img src="image//cars3.jpg" style="width:100%">
  <div class="text">Caption four</div>
  </div>
  <div class="mySlides fade">
  <div class="numbertext">5 / 3</div>
  <img src="image//cars4.jpg" style="width:100%">
  <div class="text">Caption five</div>
  </div>
  <div class="mySlides fade">
  <div class="numbertext">6 / 3</div>
  <img src="image//cars5.jpg" style="width:100%">
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
<marquee behavior="scroll" direction="left"onMouseOver="this.stop()" onMouseOut="this.start()"> 
            <img  src="image//car.jpg" width="300" height="200">       
        <img  src="image//car1.jpg" width="300" height="200">       
        <img  src="image//car3.jpg" width="300" height="200">      
        <img  src="image//car4.jpg" width="300" height="200">
        </marquee>
    <div>
    <p style="font-size: 40px;">
        <img src="image//mahindra.jpg" width="1200" height="600">
        Rs 11.87 lakh
    </p>
    <p style="font-size: 40px;">
        <img src="image//thar.jpg" width="1200" height="600">
    Rs 11.21 lakh
    </p>
    <p style="font-size: 40px;">
        <img src="image//hyundai.jpg" width="1200" height="600">
    Rs 11.21 lakh
    </p>
    <p style="font-size: 40px;">
        <img src="image//maruti.jpg" width="1200" height="600">
    Rs 6.41 lakh
    </p>
    <p style="font-size: 40px;">
        <img src="image//verna.jpg" width="1200" height="600">
    Rs 7.34 lakh
    </p>
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
