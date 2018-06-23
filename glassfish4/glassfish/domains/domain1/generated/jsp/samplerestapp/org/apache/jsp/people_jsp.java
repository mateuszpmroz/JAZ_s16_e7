package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class people_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/templates/layout.tag");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("    \r\n");
      if (_jspx_meth_t_layout_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_layout_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:layout
    org.apache.jsp.tag.web.templates.layout_tag _jspx_th_t_layout_0 = new org.apache.jsp.tag.web.templates.layout_tag();
    _jspx_th_t_layout_0.setJspContext(_jspx_page_context);
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new people_jspHelper( 0, _jspx_page_context, _jspx_th_t_layout_0, null);
    _jspx_th_t_layout_0.setStyles(_jspx_temp0);
    javax.servlet.jsp.tagext.JspFragment _jspx_temp1 = new people_jspHelper( 1, _jspx_page_context, _jspx_th_t_layout_0, null);
    _jspx_th_t_layout_0.setScripts(_jspx_temp1);
    _jspx_th_t_layout_0.setJspBody(new people_jspHelper( 2, _jspx_page_context, _jspx_th_t_layout_0, null));
    _jspx_th_t_layout_0.doTag();
    return false;
  }

  private class people_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public people_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("<!-- put your styles here -->");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("<script type=\"text/javascript\" src=\"scripts/person/PersonViewModel.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"scripts/person/PersonListViewModel.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t                var viewModel = new PersonListViewModel();\r\n");
      out.write("\t                ko.applyBindings(viewModel);\r\n");
      out.write("\t                $('.js-bday').datepicker();\r\n");
      out.write("\t            \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t</script>");
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t<button class=\"btn\" data-bind=\"click:getData\">Get Data</button><br/>\r\n");
      out.write("\t\t<table class=\"table table-bordered table-striped table-hover\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>id</th>\r\n");
      out.write("                            <th>First Name</th>\r\n");
      out.write("                            <th>Last Name</th>\r\n");
      out.write("                            <th>Gender</th>\r\n");
      out.write("                            <th>Email</th>\r\n");
      out.write("                            <th>Birthday</th>\r\n");
      out.write("                            <th>Age</th>\r\n");
      out.write("                            <th></th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody data-bind=\"foreach: people\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td><span data-bind=\"text: id\"></span></td>\r\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" data-bind=\"value: firstName\"/></td>\r\n");
      out.write("                            <td><input type=\"text\"  class=\"form-control\"  data-bind=\"value: lastName\"/></td>\r\n");
      out.write("                            <td><select class=\"form-control\" type=\"text\" data-bind=\"value: gender\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Male\">Male</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Female\">Female</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("                            <td><input type=\"text\"  class=\"form-control\"  data-bind=\"value: email\"/></td>\r\n");
      out.write("                            <td><input type=\"text\"  class=\"form-control js-bday\"  data-bind=\"value: birthday\"/></td>\r\n");
      out.write("                            <td><input type=\"text\"  class=\"form-control\"  data-bind=\"value: age\"/></td>\r\n");
      out.write("                            <td><button class=\"btn btn-danger btn-xs\" data-bind=\"click:deleteMe\">delete</button>\r\n");
      out.write("                            <button class=\"btn btn-warning btn-xs\" data-bind=\"click:updateMe\">update</button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("                    <div class=\"col-sm-1\">\r\n");
      out.write("                        <button class=\"btn btn-success\" data-bind=\"click:prev\" > PREV</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-1\">\r\n");
      out.write("                        <input class=\"form-control\" data-bind=\"value:page\" /> \r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-1\">\r\n");
      out.write("                        <button class=\"btn btn-success pull-right\" data-bind=\"click:next\">NEXT</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
