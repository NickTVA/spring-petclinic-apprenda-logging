package com.apprenda.demo.logging;

import org.apache.log4j.PropertyConfigurator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ntalbot on 6/4/2015.
 */
public class LogConfig extends HttpServlet {

    public
    void init() {
//        String prefix =  getServletContext().getRealPath("/");
//        String file = getInitParameter("log4j-init-file");
//        if(file != null) {
//            PropertyConfigurator.configure(prefix + file);
//        }
    }

    public
    void doGet(HttpServletRequest req, HttpServletResponse res) {
    }

}
