package com.student.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("http://book-service")
public interface IBookServiceFeign {
	@RequestMapping("/book")
	String getBook();
}