<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

button{
border-radius: 5vw;
}


#myImg {
  border-radius: 5px;
  cursor: pointer;
  transition: 0.3s;
}

#myImg:hover {opacity: 0.7;}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.9); /* Black w/ opacity */
}

/* Modal Content (image) */
.modal-content {
  margin: auto;
  display: block;
  width: 80%;
  max-width: 700px;
}

/* Caption of Modal Image */
#caption {
  margin: auto;
  display: block;
  width: 80%;
  max-width: 700px;
  text-align: center;
  color: #ccc;
  padding: 10px 0;
  height: 150px;
}

/* Add Animation */
.modal-content, #caption {  
  -webkit-animation-name: zoom;
  -webkit-animation-duration: 0.6s;
  animation-name: zoom;
  animation-duration: 0.6s;
}

@-webkit-keyframes zoom {
  from {-webkit-transform:scale(0)} 
  to {-webkit-transform:scale(1)}
}

@keyframes zoom {
  from {transform:scale(0)} 
  to {transform:scale(1)}
}

/* The Close Button */
.close {
  position: absolute;
  top: 15px;
  right: 35px;
  color: #f1f1f1;
  font-size: 40px;
  font-weight: bold;
  transition: 0.3s;
}

.close:hover,
.close:focus {
  color: #bbb;
  text-decoration: none;
  cursor: pointer;
}

/* 100% Image Width on Smaller Screens */
@media only screen and (max-width: 700px){
  .modal-content {
    width: 100%;
  }
}
</style>

<title>STOU Mobile Shop</title>
</head>

<link rel="stylesheet" type="text/css" href="MasterStyle.css">

<body>
<div style="background-color:#adf545; margin:0; padding:0;">
<h1>Mobile Shop</h1>
</div>

<marquee>Promotion 13/13/19 !!! Powered by safem0de</marquee>


<div style="form-style-5">
<table style="width:100%; text-align:center;" >

<tr>
<td><img id="myImg" src="images/huawei.jpg" alt="Huawei" height="200vh" ></td>
<td><img id="myImg" src="images/iPhone.png" alt="iPhone" height="200vh" onclick="alert(this.id)"></td>
<td><img src="images/OnePlus7.png" height="200vh" ></td>
<td><img src="images/Oppo Reno.jpg" height="200vh" ></td>
<td><img src="images/Samsung.png" height="200vh" ></td>
</tr>

<tr>
<td>Huawei</td>
<td>iPhone</td>
<td>OnePlus</td>
<td>Oppo</td>
<td>Samsung</td>
</tr>

<tr>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
</tr>

<tr>
<td>
<br>
<br>
</td>
</tr>

<tr>
<td><img src="images/Motorola.jpg" height="200vh" ></td>
<td><img src="images/Nokia.jpg" height="200vh" ></td>
<td><img src="images/Razer.jpeg" height="200vh" ></td>
<td><img src="images/Vivo.jpg" height="200vh" ></td>
<td><img src="images/Xiaomi.jpg" height="200vh" ></td>
</tr>

<tr>
<td>Motorola</td>
<td>Nokia</td>
<td>Razer</td>
<td>Vivo</td>
<td>Xiaomi</td>
</tr>

<tr>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
<td><button>Add to Cart</button></td>
</tr>

</table>
</div>

<div id="myModal" class="modal">
  <span class="close">&times;</span>
  <img class="modal-content" id="img01">
  <div id="caption"></div>
</div>

<script>
// Get the modal
var modal = document.getElementById("myModal");

// Get the image and insert it inside the modal - use its "alt" text as a caption
var img = document.getElementById("myImg");
var modalImg = document.getElementById("img01");
var captionText = document.getElementById("caption");
img.onclick = function(){
	alert(img.id);
  modal.style.display = "block";
  modalImg.src = this.src;
  captionText.innerHTML = this.alt;
}

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks on <span> (x), close the modal
span.onclick = function() { 
  modal.style.display = "none";
}

</script>

</body>
</html>