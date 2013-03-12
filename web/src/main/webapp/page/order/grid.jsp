<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
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
		        allHearder:${reportColumns},
		    	lineItemHeader:${lineItem},
		    	deliveryHeader:${delivery},
		    	orderHeaderUrl:'${ctx}/order/list.json',
		    	lineItemUrl: '${ctx}/public/temp/treegrid_data2.json',
		    	shipUrl: '${ctx}/public/temp/treegrid_data2.json'
		    };
		    
		    OvpGrid.hiearchyGrid(orderGrid);
		    
		    var flatGirdSetting = {
		    	allHearder:${reportColumns},
		    	lineItemHeader:${lineItem},
		    	deliveryHeader:${delivery},
		    	orderHeaderUrl:'${ctx}/order/list.json',
		    	lineItemUrl: '${ctx}/public/temp/treegrid_data2.json',
		    	shipUrl: '${ctx}/public/temp/treegrid_data2.json'
		    };
		   
		     
		    $("#flat-radio").click(function(){
		    	$.ajax({
				    type: "POST",
				    url: "${ctx}/order/list.json",
				    success: success
				});
				function success(allTreeData){
					var records = flatData(allTreeData);
					//distinct the json records
					records = _.uniq(records);
					console.log("total flat:"+ JSON.stringify(records));
					$("#data-grid").empty();
		    		OvpGrid.init("orders-table","data-grid");
		    		flatGirdSetting.flatData = records;
		    		OvpGrid.flatGrid(flatGirdSetting);
				};
		    });
		    
		    /**convert hiearchy data to flat data**/
		    var flatData = function(allTreeData){
		        var n = 0;
		        var data = _.clone(allTreeData.rows);
		        var rows = new Array();　
		    	
		    	_.each(data,function(lineItem,i){
		    	
		    		if(!_.isNull(lineItem.deliveries)){
		    			var deliveries = _.clone(lineItem.deliveries);
		    			delete lineItem.deliveries;
		    			
		    			_.each(deliveries,function(delivery,i){
		    				var records = _.extend(lineItem,delivery);
		    				rows.push(records);
		    			});
		    			
		    		}else{
		    		
		    			delete lineItem.deliveries;
		    			rows.push(lineItem);
		    		}
		    		
		    	});
		    	return rows
		    };
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
					  <input type="radio" name="optionsRadios" id="hiearchy-radio" value="option2">
					   Hiearchy Style
					</label>
					<label class="radio">
					  <input type="radio" name="optionsRadios" id="flat-radio" value="option2">
					   Flat Style
					</label>
       		   </div>
       		</form>
  			
       </div>
    </div>
    <div class="row-fluid">
    	<div id="data-grid" class="span8 offset2">
    		<div id="orders-table" class="span8 offset2" title="orders">
			</div>
        </div>
    </div>
</body>
</html>