<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC File Upload </title>
	<style type="text/css">
		.uploadbtn{
			background-color: black;
			color: yellow;
		}
		.loadfile{
			color: red;
		}
		body{
			background-color: antiquewhite;
			text-align: center;		}

	</style>
</head>
<body>
		<h1>Spring MVC File Upload </h1>
		<form method="post" action="uploadFile.do" enctype="multipart/form-data">

					Upload file1:
					<input class="loadfile" type="file" name="fileUpload" size="50" /><br/>
					Upload file2:
					<input class="loadfile" type="file" name="fileUpload" size="50" /><br/><br/>
					<input class="uploadbtn" type="submit" value="Upload" />
		</form>
</body>
</html>