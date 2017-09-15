/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.utilities;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author SAURAV
 */
public class FileUpload {
    public static boolean uploadImage(HttpServletRequest httpServletRequest) {
        try{
        String saveLocation = httpServletRequest.getServletContext().getRealPath("/files");
        // defining the multipartrequest class
        
        MultipartRequest  mr = new MultipartRequest(httpServletRequest, saveLocation, 1000000, new DefaultFileRenamePolicy());
        return true;
        } catch(Exception e) {
            return false;
        }
    }
}
