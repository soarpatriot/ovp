/**
* easy Grid for hiearchy display
* dependency: jquery 1.8 and underscore 1.4
*
**/
(function(){
	var root = this;
	// Save the previous value of the `_` variable.
  	var previousUnderscore = root.OvpGrid;
  	
  	var OvpGrid;
	if (typeof exports !== 'undefined') {
	    OvpGrid = exports;
	}else{
	    OvpGrid = root.OvpGrid = {};
	}
	
	var init = OvpGrid.init = function(initTableId,gridContainerId){
		var tableTemplate = _.template("<table id='<%= initTableId %>' title='orders'></table>");
		var tableString = tableTemplate({initTableId : initTableId});
		$('#'+gridContainerId).html(tableString);
	};
	
	
	var hiearchyGrid = OvpGrid.hiearchyGrid = function(orderGrid){
		var tableTemplate = _.template("<div class='gird-div' id='<%= id %>' title='orders'></div>");
		$('#orders-table').datagrid({
			title:'Order - Grid',
			columns:[orderGrid.lineItemHeader],
			striped:true,
			height:'400',    
			remoteSort:false,
			singleSelect:true,
			rownumbers: true,
			pagination: true,
			nowrap:true,
			fitColumns:true,
			url:orderGrid.orderHeaderUrl,
			autoRowHeight:true,
			
			//delivery View
			view: detailview,
			detailFormatter:function(index,row){  
			    var id = "line-"+index
		        return tableTemplate({id : id});;    
		    }, 
		    onExpandRow: function(index,row){ 
		        //var lineId = _.uniqueId('lineId-');  
		        //alert(row.productid);
		        
		        $('#line-'+index).datagrid({    
		          
		            fitColumns:true,    
		            singleSelect:true,    
		            rownumbers:true,    
		            loadMsg:'Load ...',    
		            data:row.deliveries,
					columns:[orderGrid.deliveryHeader],
					autoRowHeight:true,
					    
		            onResize:function(){    
		                $('#orders-table').datagrid('fixDetailRowHeight',index);    
		            },    
		            onLoadSuccess:function(){  
		                //alert("onLoadSuccess parent "+ index);
		                setTimeout(function(){    
		                    $('#orders-table').datagrid('fixDetailRowHeight',index);    
		                },0);    
		            },
		            
		            /**
		            *shipping hiearchy grid
		            **/
		            view: detailview,
					detailFormatter:function(deliveryIndex,deliveryRow){ 
					    var id = "delivery-"+index + deliveryIndex;
				      
		        		return tableTemplate({id : id}); 
				    },     
				    onExpandRow: function(deliveryIndex,deliveryRow){  
				        var componentIndex = index + deliveryIndex;
				    	$('#delivery-'+componentIndex).datagrid({    
							
							url:orderGrid.shipUrl,    
				            fitColumns:true,    
				            singleSelect:true,    
				            rownumbers:true,    
				            loadMsg:'Load ...',    
				            autoRowHeight:true,
				            
							columns:[[
				                {title:'Task Name',field:'name',width:180},
								{field:'persons',title:'Persons',width:60,align:'right'},
								{field:'begin',title:'Begin Date',width:80},
								{field:'end',title:'End Date',width:80},
								{field:'progress',title:'Progress',width:120,
								    formatter:function(value){
								    	if (value){
									    	var s = '<div style="width:100%;border:1px solid #ccc">' +
									    			'<div style="width:' + value + '%;background:#cc0000;color:#fff">' + value + '%' + '</div>'
									    			'</div>';
									    	return s;
								    	} else {
									    	return '';
								    	}
							    	}
								}
							]],      
							
				            onResize:function(){   
				                $('#line-'+index).datagrid('fixDetailRowHeight', deliveryIndex);    
				            },    
				            onLoadSuccess:function(){
				            
				                	$('#line-'+index).datagrid('fixDetailRowHeight', deliveryIndex);
			                	
				            },
				            /**
				            * serial view
				            **/
				            view: detailview,
				            detailFormatter:function(shipIndex,shipRow){ 
							    var id = "ship-"+index + deliveryIndex + shipIndex;
							    return tableTemplate({id : id}); 
						    }, 
						    onExpandRow: function(shipIndex,shipRow){  
						        var componentIndex = index + deliveryIndex + shipIndex ;
						    	$('#ship-'+componentIndex).datagrid({    
									
									url:orderGrid.shipUrl,    
						            fitColumns:true,    
						            singleSelect:true,    
						            rownumbers:true,    
						            loadMsg:'Load ...',    
						            autoRowHeight:true,
						            
									columns:[[
						                {title:'Task Name',field:'name',width:180},
										{field:'persons',title:'Persons',width:60,align:'right'},
										{field:'begin',title:'Begin Date',width:80},
										{field:'end',title:'End Date',width:80},
										{field:'progress',title:'Progress',width:120,
										    formatter:function(value){
										    	if (value){
											    	var s = '<div style="width:100%;border:1px solid #ccc">' +
											    			'<div style="width:' + value + '%;background:#cc0000;color:#fff">' + value + '%' + '</div>'
											    			'</div>';
											    	return s;
										    	} else {
											    	return '';
										    	}
									    	}
										}
									]],      
									
						            onResize:function(){   
						                $('#delivery-'+deliveryIndex).datagrid('fixDetailRowHeight', shipIndex);    
						            },    
						            onLoadSuccess:function(){
						            
						            	
						                	$('#delivery-'+deliveryIndex).datagrid('fixDetailRowHeight', shipIndex);  
						              
						                  
						            },
						            view: detailview,
						            detailFormatter:function(serialIndex,serialRow){ 
								     	var id = "serial-"+index + deliveryIndex +shipIndex + serialIndex;
							    		return tableTemplate({id : id});    
								    }, 
						            onExpandRow: function(serialIndex,serialRow){  
							        var componentIndex = index + deliveryIndex +shipIndex + serialIndex;
							    	$('#serial-'+componentIndex).datagrid({    
										
										url:orderGrid.shipUrl,    
							            fitColumns:true,    
							            singleSelect:true,    
							            rownumbers:true,    
							            loadMsg:'Load ...',    
							            autoRowHeight:true,
							            
										columns:[[
							                {title:'Task Name',field:'name',width:180},
											{field:'persons',title:'Persons',width:60,align:'right'},
											{field:'begin',title:'Begin Date',width:80},
											{field:'end',title:'End Date',width:80},
											{field:'progress',title:'Progress',width:120,
											    formatter:function(value){
											    	if (value){
												    	var s = '<div style="width:100%;border:1px solid #ccc">' +
												    			'<div style="width:' + value + '%;background:#cc0000;color:#fff">' + value + '%' + '</div>'
												    			'</div>';
												    	return s;
											    	} else {
												    	return '';
											    	}
										    	}
											}
										]],      
										
							            onResize:function(){   
							                $('#ship-'+shipIndex).datagrid('fixDetailRowHeight', serialIndex);    
							            },    
							            onLoadSuccess:function(){
							            	
						                	$('#ship-'+shipIndex).datagrid('fixDetailRowHeight', serialIndex);  
						                	
							            }
						            });/**end of serial--low table**/   
						            $('#ship-'+shipIndex).datagrid('fixDetailRowHeight',serialIndex);   
						            
						           }
					            });/**end of serial table**/   
					            $('#delivery-'+deliveryIndex).datagrid('fixDetailRowHeight',shipIndex);    
					        }   
						    
				       });/**end of ship table**/
				       $('#line-'+index).datagrid('fixDetailRowHeight',deliveryIndex);     
				    }
		        });/**end of line table**/   
		        $('#orders-table').datagrid('fixDetailRowHeight',index);    
		    }      
		});
	};
	
	var flatGrid = OvpGrid.flatGrid = function(orderGrid){
		$('#orders-table').datagrid({
			title:'Order - Grid',
			columns:[orderGrid.allHearder],
			striped:true,
			height:'400',    
			remoteSort:false,
			singleSelect:true,
			rownumbers: true,
			pagination: true,
			nowrap:true,
			fitColumns:true,
			data:orderGrid.flatData
		});
	}; 
}).call(this);

