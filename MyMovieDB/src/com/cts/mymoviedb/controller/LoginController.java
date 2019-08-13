package com.cts.mymoviedb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mymoviedb.bean.SearchBean;
import com.cts.mymoviedb.dao.SearchDAO;

@RestController
@RequestMapping("/movie")
public class LoginController {

	@Autowired
	SearchDAO searchDao;

	@PostMapping("/login")
	public String userLogin(@RequestBody SearchBean bean) {
		searchDao.getDetails(bean);
		return null;
	}
}
