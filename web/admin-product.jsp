<%-- 
    Document   : admin-product
    Created on : Aug 31, 2017, 8:29:07 AM
    Author     : Saurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="admin-header.jsp"/>
<jsp:include page="admin-nav.jsp"/>



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
            <form role="form" action="${pageContext.request.contextPath}/admin/product/add" method="POST">
              <div class="box-body">
                <div class="form-group">
                    
                  <label for="exampleInputEmail1">Product Name</label>
                  <input type="text" name = "pname" class="form-control" id="exampleInputEmail1" placeholder="Enter product name">
                </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Product Price</label>
                  <input type="text" name = "pprice" class="form-control" id="exampleInputEmail1" placeholder="Enter product price">
                  </div>
                
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Discount</label>
                  <input type="text" name = "pdiscount" class="form-control" id="exampleInputEmail1" placeholder="Enter product discount">
    
                </div>  
                  
                  <div class="form-group">
                  <label>Product Tags</label>
                <select name ="ptags" class="form-control select2" multiple="multiple" data-placeholder="Type to show tags" style="width: 100%;">
                  <option>Food</option>
                  <option>LifeStyle</option>
                  <option>Electronics</option>
                  <option>Computer and IT gadgets</option>
                  <option>Sports</option>
                  <option>Health</option>
                  <option>Accessories</option>
                </select>
                  </div>
                                  
            <div class="form-group">
                  <label for="exampleInputFile">Upload product image</label>
                  <input type="file" id="exampleInputFile">

                                  
              </div>
                  <div class="box-footer">
                <button type="submit" class="btn btn-primary">Submit</button>
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
                  <th>Rendering engine</th>
                  <th>Browser</th>
                  <th>Platform(s)</th>
                  <th>Engine version</th>
                  <th>CSS grade</th>
                </tr>
                </thead>
                <tbody>
                </tbody>
              </table>
            </div>
              </div>
</div>
               
<jsp:include page="admin-footer.jsp"/>

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