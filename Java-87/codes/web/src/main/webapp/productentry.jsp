<jsp:useBean class="co.edureka.web.Product" id="product"></jsp:useBean>

<jsp:setProperty name="product" property="*"/>

<h2>
Product ID: <jsp:getProperty property="productId" name="product"/> <br><br>

Product Name: <jsp:getProperty name="product" property="productName"/> <br><br>

Product Price: <jsp:getProperty property="productPrice" name="product"/>
</h2>
