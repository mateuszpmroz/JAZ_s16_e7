package org.apache.jsp.tag.web.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private javax.servlet.jsp.tagext.JspFragment styles;
  private javax.servlet.jsp.tagext.JspFragment header;
  private javax.servlet.jsp.tagext.JspFragment scripts;

  public javax.servlet.jsp.tagext.JspFragment getStyles() {
    return this.styles;
  }

  public void setStyles(javax.servlet.jsp.tagext.JspFragment styles) {
    this.styles = styles;
  }

  public javax.servlet.jsp.tagext.JspFragment getHeader() {
    return this.header;
  }

  public void setHeader(javax.servlet.jsp.tagext.JspFragment header) {
    this.header = header;
  }

  public javax.servlet.jsp.tagext.JspFragment getScripts() {
    return this.scripts;
  }

  public void setScripts(javax.servlet.jsp.tagext.JspFragment scripts) {
    this.scripts = scripts;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getStyles() != null ) {
      _jspx_page_context.setAttribute("styles", getStyles());
}
    if( getHeader() != null ) {
      _jspx_page_context.setAttribute("header", getHeader());
}
    if( getScripts() != null ) {
      _jspx_page_context.setAttribute("scripts", getScripts());
}

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"content/styles/styles.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"content/styles/jquery-ui.min.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"content/styles/jquery-ui.structure.min.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"content/styles/jquery-ui.theme.min.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"content/styles/bootstrap.min.css\"/>\r\n");
      out.write("\t\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getStyles() != null) {
        getStyles().invoke(_jspx_sout);
      }
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"pageheader\">\r\n");
      out.write("\t\t\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getHeader() != null) {
        getHeader().invoke(_jspx_sout);
      }
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"menu\" class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"addperson.jsp\">Add</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"people.jsp\">Show all</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"content\" class=\"container\">\r\n");
      out.write("\t\t\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"scripts/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"scripts/jquery-ui.min.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"scripts/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"scripts/knockout-3.3.0.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"scripts/knockout.mapping.js\"></script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getScripts() != null) {
        getScripts().invoke(_jspx_sout);
      }
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
