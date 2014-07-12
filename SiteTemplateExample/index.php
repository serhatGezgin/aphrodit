<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>My Site Template</title>
<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap/bootstrap-theme.min.css">
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/about.css">
<link rel="stylesheet" href="css/contact.css">
</head>
<body>
	<?php include 'header.php';?>
	<div class="container">
		<div class="root">
			<?php include 'about.php';?>
			<?php include 'contact.php';?>
		</div>
	</div>
	<script src="js/jquery/jquery.min.js" type="text/javascript"></script>
	<script src="js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>