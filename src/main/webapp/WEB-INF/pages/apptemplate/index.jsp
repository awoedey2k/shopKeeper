<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<div class="container">
		<tiles:insertAttribute name="menu" />
		<h1>
			<tiles:getAsString name="title"></tiles:getAsString>
		</h1>
		<tiles:insertAttribute name="body" />
	</div>
	<tiles:insertAttribute name="footer" />
</body>
</html>