/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAURAV
 */
@WebFilter({"/*"})
public class FilterAdmin implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        String url = request.getRequestURI(); // you cannot write because it's ServletRequest method so we need httpServletRequest

    //TypeCasting to HttpServlet
    HttpServletRequest httpServletRequest=(HttpServletRequest)request;
    HttpServletResponse httpServletResponse=(HttpServletResponse) response;
    
    // getting the requested url
    String url = httpServletRequest.getRequestURI();
    if(url.endsWith(".jsp")) {
        httpServletResponse.sendError(404);
    }
    else {
        chain.doFilter(request, response);
    }
    }

    @Override
    public void destroy() {
    }
    
}
