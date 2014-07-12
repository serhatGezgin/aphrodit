package org.yazgel.aphrodit.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.aphrodit.Page
import org.yazgel.aphrodit.Section
import org.yazgel.aphrodit.MenuItem

class PageGenerator extends BaseGenerator {
	val sectionGenerator = new org.yazgel.aphrodit.codegenerator.template.SectionGenerator

	def void generateFile(Page p, IFileSystemAccess fsa) {

		/*Index sayfasini uret. */
		fsa.generateFile('index.php', indexContent(p))
		fsa.generateFile('css/index.css', indexCssContent())
		fsa.generateFile('js/custom.js', customJSContent())

		/*Header sayfasini uret. */
		fsa.generateFile('header.php', headerContent(p))
		fsa.generateFile('css/header.css', headerCssContent())

		/*Section sayfalarini uret. */
		p.sections.forEach[Section s|sectionGenerator.generateFile(s, fsa)]
	}

	def customJSContent() '''
		$(document).ready(function () {
			/* Scroll */
			$('.nav li').localScroll({
				duration: 1000
			});
		});
	'''

	def headerContent(Page page) '''
		<div class="navbar navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="logo" href="#" title="«page.title»"><img src="images/logo.png" /></a>
				</div>
				<div class="collapse navbar-collapse pull-right">
					<ul class="nav navbar-nav">
						«FOR i : page.menu.items»
							«val menuItem = i as MenuItem»
							<li><a href="#«menuItem.section.name»">«menuItem.title»</a></li>
						«ENDFOR»
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	'''

	def headerCssContent() '''
		@CHARSET "UTF-8";
		
		.navbar {
			background-color: #ffffff;
			border-color: #d3d3d3;
			-webkit-box-shadow: 0 2px 0 #d3d3d3;
			-moz-box-shadow: 0 2px 0 #d3d3d3;
			box-shadow: 0 2px 0 #d3d3d3;
			height: 70px;
		}
		
		.navbar .nav>li>a {
			background-color: #ffffff;
			color: #777777;
			margin: 10px 0px;
			border-radius: 5px;
			font-weight: bold;
			text-transform: uppercase;
		}
		
		.navbar .nav>li>a:hover {
			background-color: #66cccc;
			color: #ffffff;
		}
		
		.navbar .logo {
			position: relative;
			top: 20px;
			margin-left: 20px;
		}
		
		.navbar-toggle {
			background-color: #66cccc;
		}
		
		.navbar-toggle .icon-bar {
			background-color: #ffffff;
		}
	'''

	def indexContent(Page p) '''
		<!DOCTYPE html>
		<html>
		<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="">
		<meta name="author" content="">
		<title>«p.title»</title>
		<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" href="css/bootstrap/bootstrap-theme.min.css">
		<link rel="stylesheet" href="css/index.css">
		<link rel="stylesheet" href="css/header.css">
		«FOR s : p.sections»
			«val section = s as Section»
			<link rel="stylesheet" href="css/«section.cssfilename»">
		«ENDFOR»
		</head>
		<body>
			<?php include 'header.php';?>
			<div class="container">
				<div class="root">
					«FOR s : p.sections»
						«val section = s as Section»
						<?php include '«section.phpfilename»';?>
					«ENDFOR»
				</div>
			</div>
			<script src="js/jquery/jquery.min.js" type="text/javascript"></script>
			<script src="js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
			<script src="js/jquery/jquery.scrollTo-1.4.3.1-min.js" type="text/javascript"></script>
			<script src="js/jquery/jquery.localScroll-1.3.5.min.js" type="text/javascript"></script>
			<script src="js/custom.js" type="text/javascript"></script>
		</body>
		</html>
	'''

	def indexCssContent() '''
		@CHARSET "UTF-8";
		
		body {
			margin: 0;
			font-family: 'Open Sans', Helvetica, Arial, sans-serif;
			font-size: 15px;
			line-height: 24px;
			color: #393e46;
			background-color: #ffffff;
		}
			
		.root {
			padding: 60px 15px;
		}
		
		section{
			padding-top: 60px;
		}
		
		.card-container {
			list-style-type: none;
		}
		
		.card {
			-webkit-box-sizing: border-box;
			-moz-box-sizing: border-box;
			box-sizing: border-box;
			background: #66cccc;
			-webkit-border-radius: 8px;
			-moz-border-radius: 8px;
			-ms-border-radius: 8px;
			-o-border-radius: 8px;
			border-radius: 8px;
			padding: 10px;
			margin-bottom: 5px;
		}
	'''
}
