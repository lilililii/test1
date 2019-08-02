package com.tedu.sp0.service;

import java.util.List;

import com.tedu.sp0.pojo.Item;

public interface ItemService {
		List<Item> getItems(String orderId);
		void decreaseNumbers(List<Item> list);
	}