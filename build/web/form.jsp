<!DOCTYPE html>
<html>
<head>
	<title> TRY </title>

<link rel="stylesheet" href="formbootstrap\bootstrap.css">

</head>

<body>

<h1> HELLO WORLD! </h1>

<form class="form-horizontal">

<div class="form-group">
<label class="control-label col-sm-2" for="Name"> Name </label> 

<div class="col-sm-4">
<input type = "text" class="form-control" id="name" name = "fullname" placeholder = "Enter your Full Name">
</div>
</div>


<div class="form-group">
<label class="control-label col-sm-2" for="email"> Email </label> 
 <div class="col-sm-4">
<input type="email" class="form-control" id="email" placeholder = "Enter your Email"> 
</div>
</div>



<div class="form-group">
      <label class="control-label col-sm-2" for="pwd" >Password</label>
      <div class="col-sm-4">
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div>
    </div>

<div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Re-Enter Password</label>
      <div class="col-sm-4">
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div>
    </div>



<div class="col-md-6">
  <label>Gender</label> &#160; <!-- &nbsp; &ensp; &emsp --> 
  
  <br/>

    <label class="radio-inline">
        <input type="radio" name="x_Gender" value="M" class="required" title="*">
        Male &emsp;
    </label>
    <label class="radio-inline">
        <input type="radio" name="x_Gender" value="F" class="required" title="*">
      Female
    </label>
  
</div>

&emsp;
<button type="submit" class="btn btn-default">Submit</button> 

</form>

<br/>

<table border="1px" style="margin-left: 10px; text-align: center;"> 
	<tr> 
	<td> Yo </td>
	<td> Tyo </td>
	<td> Kale </td>
	</tr>

	<tr>
	<td> HI </td>
	<td> BYE </td>
	<td> GUY </td>
	</tr>

	<tr>
	<td> NOOB </td>
	<td> SOOB </td>
	<td> LOOT </td>
	</tr>

</table>

</body>
</html>