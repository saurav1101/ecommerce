<%-- 
    Document   : admin-product
    Created on : Aug 31, 2017, 8:29:07 AM
    Author     : Saurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="admin-header.jsp"/>
<jsp:include page="admin-nav.jsp"/>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Product
        <small>Product tables</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Product</a></li>
        <li class="active">Product tables</li>
      </ol>
    </section>
    
    
    
    
    <!-- Main content -->
    <section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Product Form</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form" action="${pageContext.request.contextPath}/admin/product/add" method="POST" enctype ="multipart/form-data">
                <input type ="hidden" name="id" value="${editproductval.get(0).product_id}"/>
              <div class="box-body">
                
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Name</label>
                  <input type="text" value = "${editproductval.get(0).product_name}" name = "pname" class="form-control" id="exampleInputEmail1" placeholder="Enter product name">
                </div>
                  
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Price</label>
                  <input type="text" value = "${editproductval.get(0).product_price}" name = "pprice" class="form-control" id="exampleInputEmail1" placeholder="Enter product price">
                </div>
                
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Discount</label>
                  <input type="text" value = "${editproductval.get(0).product_discount}" name = "pdiscount" class="form-control" id="exampleInputEmail1" placeholder="Enter product discount">
                </div>  
    
                      
                  
                <div class="form-group">
                <label>Product Tags</label>
                <select name ="ptags" class="form-control select2" multiple="multiple" data-placeholder="Type to show tags" style="width: 100%;">
                  <option <c:if test="${editproductval.get(0).product_tag.contains('Food')}">selected</c:if>>Food</option>
                  <option <c:if test="${editproductval.get(0).product_tag.contains('LifeStyle')}">selected</c:if>>LifeStyle</option>
                  <option <c:if test="${editproductval.get(0).product_tag.contains('Sports')}">selected</c:if>>Sports</option>
                  <option <c:if test="${editproductval.get(0).product_tag.contains('Electronics')}">selected</c:if>>Electronics</option>
                  <option <c:if test="${editproductval.get(0).product_tag.contains('Health')}">selected</c:if>>Health</option>
                  <option <c:if test="${editproductval.get(0).product_tag.contains('Accessories')}">selected</c:if>>Accessories</option>
                  <option <c:if test="${editproductval.get(0).product_tag.contains('Computer and IT gadgets')}">selected</c:if>>Computer and IT gadgets</option>
                  
                  
                  
                </select>
                  </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Product Ratings</label>
                  <!--<input type="text" name = "prating" class="form-control" id="exampleInputEmail1" placeholder="Enter product rating using ' * ' sign without single quotation">-->
                <select name ="prating" class="form-control" style="width: 100%;">
                  <option <c:if test="${editproductval.get(0).product_rating.contains('-')}">selected</c:if>>-</option>
                  <option <c:if test="${editproductval.get(0).product_rating.contains('*')}">selected</c:if>>*</option>
                  <option <c:if test="${editproductval.get(0).product_rating.contains('**')}">selected</c:if>>**</option>
                  <option <c:if test="${editproductval.get(0).product_rating.contains('***')}">selected</c:if>>***</option>
                  <option <c:if test="${editproductval.get(0).product_rating.contains('****')}">selected</c:if>>****</option>
                  <option <c:if test="${editproductval.get(0).product_rating.contains('*****')}">selected</c:if>>*****</option>
                </select>
                </div>  
                                  
                <div class="form-group">
                  <label for="exampleInputFile">Upload product image</label>
                  <input type="file" id="exampleInputFile" name="files">
                </div>
                  
                  
              <div class="box-footer">
                <button type="submit" class="btn btn-primary">
                    <span class="glyphicon glyphicon-plus">
                         Add Product
<%--                    <c:if test="${editproductval.get(0).product_name.equals(null)}">Add Product</c:if>
                    <c:if test="${not editproductval.get(0).product_name!=(null)}">Update Product</c:if> --%>
 
                    </span>
                </button>
              </div>
                  
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>
        
                                  
              <!-- /.box-body -->

          <!-- /.box -->
    
 
 
              <div class="box">
            <div class="box-header">
              <h3 class="box-title">Product Table</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>Product ID</th>
                  <th>Product Name</th>
                  <th>Product Price</th>
                  <th>Product Tags</th>
                  <th>Product Rating</th>
                  <th>Product Discount</th>
                  <th>Product Image</th>
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                    
                    <c:forEach items = "${productvalue}" var ="products">
                        <tr>
                            <td>${products.product_id}</td>
                            <td>${products.product_name}</td>
                            <td>${products.product_price}</td>
                            <td>${products.product_tag}</td>
                            <td>${products.product_rating}</td>
                            <td>${products.product_discount}</td>
                            <td>
                                <a href = "${pageContext.request.contextPath}/files/${products.product_image}" target ="_blank">
                                <img height ="30" width ="30" src="${pageContext.request.contextPath}/files/${products.product_image}" alt="${products.product_image}"/>
                                </a>
                            </td>
                            
                            <td>
                                <a href="${pageContext.request.contextPath}/admin/product/edit/?id=${products.product_id}"> <!-- not secure injection -->
                                    <span class ="glyphicon glyphicon-edit"> </span>
                                </a>
                            </td>
                            
                            <td>
                                <a href="${pageContext.request.contextPath}/admin/product/delete/?id=${products.product_id}&file=${products.product_image}"> <!-- not secure injection -->
                                    <span class ="glyphicon glyphicon-remove"> </span>
                                </a>
                            </td>
                            
                            
                            
                        </tr>
                    </c:forEach>
                </tbody>
              </table>
            </div>
              </div>
</div>
               
<jsp:include page="admin-footer.jsp"/>

<%-- these are features that we choose to include or declude from the webpage--%>
<script>
//                $('#example1').DataTable({
//                "paging": true,
//                "lengthChange": false,
//                "searching": true,
//                "ordering": true,
//                "info": true,
//                "autoWidth": false
//                });
$('#example1').DataTable();
</script>
