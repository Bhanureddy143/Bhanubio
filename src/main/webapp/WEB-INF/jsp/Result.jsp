<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style >

#y{
color:blue;
}

#A{
height: 200px;
width: 200px;
position: relative;

}
 #B
{
height:30px;
width:100px;
margin-top:210px;
position:absolute;
margin-left:-200px;
background: linear-gradient(to right, #fec76f 0%, #7eadcb 100%);

}
#B:hover
{
	cursor: pointer;
	box-shadow: 0 0 10px black;

}

</style>
<title>Bhanu Bio</title>
</head>
<body>
<h1>Hi All.! This is<span id="y"> ${name} </span></h1>
<a href="https://ibb.co/2yww3GT"><img src="https://i.ibb.co/f2bbdjs/B.jpg" alt="B" border="0" id="A"></a>
<button id="B"><a href="https://bhanuprakash-resume.tiiny.site/">Resume</a>
</button>
</body>
<br>
</html>
