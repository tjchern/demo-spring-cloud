package com.chenqingjie.demo.springzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class AuthFilter extends ZuulFilter {

  @Override
  public Object run() throws ZuulException {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
    Object accessToken = request.getParameter("token");
    if (accessToken == null) {
      ctx.setSendZuulResponse(false);
      ctx.setResponseStatusCode(401);
      try {
        ctx.getResponse().getWriter().write("token is empty");
      } catch (Exception e) {
      }
    }
    return null;
  }

  // 过滤器类型
  // pre:前置过滤器、route:负责转发请求到微服务、error:处理请求错误是被调用、post:在route和error过滤器之后调用
  @Override
  public String filterType() {
    return "pre";
  }

  /**
   * 优先级为0，数字越大，优先级越低
   */
  @Override
  public int filterOrder() {
    return 0;
  }

  //是否执行该过滤器 false为不执行
  @Override
  public boolean shouldFilter() {
    return true;
  }

}
