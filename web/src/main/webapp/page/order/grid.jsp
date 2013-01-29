<!DOCTYPE html>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
<head>
	<title>Basic TreeGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/bootstrap/easyui.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/icon.css">

	<script type="text/javascript" src="${ctx}/public/javascripts/jquery-easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/javascripts/jquery-easyui/datagrid-detailview.js"></script>
    <script type="text/javascript" src="${ctx}/public/javascripts/app/order-grid.js"></script>
    
	<script type="text/javascript">
		$(function(){
			//list-data
			//orderHeaderUrl:'${ctx}/public/temp/datagrid_data.json',
		    var orderGrid = {
		    	lineItemHeader:${lineItem},
		    	deliveryHeader:${delivery},
		    	orderHeaderUrl:'${ctx}/order/list.json',
		    	lineItemUrl: '${ctx}/public/temp/treegrid_data2.json',
		    	shipUrl: '${ctx}/public/temp/treegrid_data2.json'
		    };
		    esayGird(orderGrid);
		});
	</script>

</head>
<body>
    <div class="row-fluid">
       <div class="span8 offset2">
       		<h2>Orders</h2>
       		<form class="form-horizontal">
       		   <div class="controls">
	       		   	<label class="radio">
					  <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
					   Hiearchy Style
					</label>
					<label class="radio">
					  <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
					   Flat Style
					</label>
       		   </div>
       		   
     
       		</form>
       		
       		
			<table id="orders-table" title="orders">
			</table>
       </div>
    </div>
</body>
</html>