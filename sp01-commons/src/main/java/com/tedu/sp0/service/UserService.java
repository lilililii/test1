package com.tedu.sp0.service;

import java.util.List;

import com.tedu.sp0.pojo.Item;
import com.tedu.sp0.pojo.Order;

public interface UserService {
	Order getOrder(String orderId);
	void addOrder(Order order);
	}