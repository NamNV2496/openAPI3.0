//package com.openapi3.filter;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///** created by @author suraj on 23/05/20 */
//@Component
//@Slf4j
//public class RequestFilter implements Filter {
//
//    @Override
//    public void doFilter(
//            ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
//            throws IOException, ServletException {
//        log.info(
//                "Value of AUTH-TOKEN  -> {}",
//                ((HttpServletRequest) servletRequest).getHeader("AUTH-TOKEN"));
//
//        log.info("Value of User-Name -> {}", servletRequest.getParameter("user-name"));
//
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//}
