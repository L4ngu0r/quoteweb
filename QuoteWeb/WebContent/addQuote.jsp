<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add quote</title>
</head>
<body>
<form action="addQuote" method="post">
		<div>
			<label for="description">Quote : </label>
			<textarea id="description" name="description"></textarea>
		</div>
		<div>
			<label for="rating">Rating : </label>
			<input type="number" id="rating" name="rating" />
		</div>
		<div>
			<input type="submit" value="Submit" />
		</div>
	</form>
</body>
</html>