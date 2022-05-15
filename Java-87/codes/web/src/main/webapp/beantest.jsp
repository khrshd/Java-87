<h2>
<jsp:useBean class="co.edureka.web.Product" id="prod"></jsp:useBean>

Product ID: <jsp:getProperty property="productId" name="prod"/> <br>

Product Name: <jsp:getProperty name="prod" property="productName"/> <br>

Product Price: <jsp:getProperty property="productPrice" name="prod"/>

<hr>

<jsp:setProperty name="prod" property="productName" value="Mouse"/>

Product Name: <jsp:getProperty name="prod" property="productName"/> <br>
</h2>
