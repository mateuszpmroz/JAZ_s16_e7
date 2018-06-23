package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new index_jspHelper( 0, _jspx_page_context, _jspx_th_t_layout_0, null);
    _jspx_th_t_layout_0.setStyles(_jspx_temp0);
    javax.servlet.jsp.tagext.JspFragment _jspx_temp1 = new index_jspHelper( 1, _jspx_page_context, _jspx_th_t_layout_0, null);
    _jspx_th_t_layout_0.setScripts(_jspx_temp1);
    _jspx_th_t_layout_0.setJspBody(new index_jspHelper( 2, _jspx_page_context, _jspx_th_t_layout_0, null));
    _jspx_th_t_layout_0.doTag();
    return false;
  }

  private class index_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public index_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("            url: \"/samplerestapp/rest/service/test\",\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            data: ko.toJSON({\r\n");
      out.write("            \tmessege:\"hello\"\r\n");
      out.write("            }),\r\n");
      out.write("            contentType: \"application/json\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                alert(\"udało się\");\r\n");
      out.write("            },\r\n");
      out.write("            error: function (XMLHttpRequest, testStatus, errorThrown) {\r\n");
      out.write("               alert(\"nie udało się\")\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</script>");
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\tHello World\r\n");
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
