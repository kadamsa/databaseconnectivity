<html>
<head>
<script type="text/javascript">
	function check() {
		var id = document.getElementById("uid").value;
		if (id == 0 || id == null) {
			return false;
		}
	}
</script>

</head>
<body>
	<h2>Hello World!</h2>
	<form action="getUser" method="get" onsubmit="return check()">
		<input type="text" name="uid" id="uid"> <input type="submit"
			value="submit">
	</form>
</body>
</html>
