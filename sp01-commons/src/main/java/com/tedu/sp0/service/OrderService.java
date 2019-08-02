package com.tedu.sp0.service;

import java.util.List;

import com.tedu.sp0.pojo.Item;
import com.tedu.sp0.pojo.User;

public interface OrderService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
	}