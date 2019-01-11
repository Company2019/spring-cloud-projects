package com.student.service;

import org.springframework.cloud.openfeign.FeignClient;
public interface IBookService {
	
	String getBook();

}