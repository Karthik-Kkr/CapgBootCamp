/***************************************************************
 -Author                : Karthikeswar Rao
 -Created/Modified Date : 22/09/2020
 -Description           : IOrderService interface for Order ms
****************************************************************/


package com.capgemini.go.order.service;

import com.capgemini.go.order.model.OrderDto;
import com.capgemini.go.order.model.OrderDtoList;

public interface IOrderService {

	OrderDto addOrder(OrderDto orderDto);
	OrderDto viewOrder(String orderId);
	OrderDtoList viewAll();
	String cancelOrder(String orderId);
	String dispatchDate(String orderId);
}
