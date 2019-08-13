package com.cts.mymoviedb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.mymoviedb.bean.SearchBean;

import com.cts.mymoviedb.util.Mymoviedbapiconnection;
/**
 * Servlet implementation class SearchController
 */
public class SearchController{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SearchBean bean=new SearchBean();
		bean.setSearch(request.getParameter("searchterm"));
		System.out.println(bean);
		String api_key="______";
		String query;
		search_multi(api_key = api_key, query = bean.getSearch());
		
	}

}
