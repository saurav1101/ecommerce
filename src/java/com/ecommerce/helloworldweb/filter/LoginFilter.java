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
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAURAV
 */
@WebFilter({"/admin/*"})
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest httpServletRequest=(HttpServletRequest)request;
    HttpServletResponse httpServletResponse=(HttpServletResponse) response;
    
    //checking the session
    //false = checks existing session and assigns to httpsession object
    //true or blank = check existing session and assigns to httpsession object
    //if session is found, if not found it creates a new session
    
    //restriction session
        HttpSession session = httpServletRequest.getSession(false);
        if(session!=null && session.getAttribute("user")!=null) {
            chain.doFilter(request, response);
        }
        else {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/login");
        }
    }

    @Override
    public void destroy() {
    }

    
}
