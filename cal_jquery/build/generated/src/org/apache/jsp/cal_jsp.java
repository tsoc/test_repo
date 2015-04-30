package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- jquery ���̺귯��, �ʿ�� ���� �ٿ�ε��ؼ� ��� -->\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var action = new Array();\n");
      out.write("            action[0] = \"Talk\";\n");
      out.write("            action[1] = \"Play\";\n");
      out.write("            action[2] = \"Love\";\n");
      out.write("            action[3] = \"Work\";\n");
      out.write("            action[4] = \"Rest\";\n");
      out.write("\n");
      out.write("            // ��ư Ŭ���� �� ��ȯ �ڵ�\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#prev\").click(function() {\n");
      out.write("                    $(\"#month\").text(function(i, origMonth) {\n");
      out.write("                        month = Number(origMonth) - 1;\n");
      out.write("                        //���� ���� ����\n");
      out.write("                        $(\"#sche\").text(function() {\n");
      out.write("                            var randomAction = Math.floor(Math.random() * 5);\n");
      out.write("                            return action[randomAction];\n");
      out.write("                        });\n");
      out.write("                        //���� ���� ��\n");
      out.write("                        return monthCheck(month);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\"#next\").click(function() {\n");
      out.write("                    $(\"#month\").html(function(i, origMonth) {\n");
      out.write("                        month = Number(origMonth) + 1;\n");
      out.write("                        //���� ���� ����\n");
      out.write("                        $(\"#sche\").text(function() {\n");
      out.write("                            var randomAction = Math.floor(Math.random() * 5);\n");
      out.write("                            return action[randomAction];\n");
      out.write("                        });\n");
      out.write("                        //���� ���� ��\n");
      out.write("                        return monthCheck(month);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //��(month) üũ. 1 �Ʒ�, 12 ���� �ö��� �ʰ���.\n");
      out.write("            function monthCheck(month) {\n");
      out.write("                if (month <= 1) {\n");
      out.write("                    return 1;\n");
      out.write("                } else if (month >= 12) {\n");
      out.write("                    return 12;\n");
      out.write("                } else {\n");
      out.write("                    return month;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            // ���ε� Ȯ�ο� ī��Ʈ �ڵ�\n");
      out.write("            // ���� ���ص� ī��Ʈ�� ������ ����(���ε� ���� ����)\n");
      out.write("            function count_start() {\n");
      out.write("                time = setTimeout(\"count()\", 1000);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function count() {\n");
      out.write("                var ti = document.all.count.value;\n");
      out.write("                ti = ti - 1;\n");
      out.write("\n");
      out.write("                if (ti < 1) {\n");
      out.write("                    document.all.count.value = \"end count\";\n");
      out.write("                } else {\n");
      out.write("                    document.all.count.value = ti;\n");
      out.write("                    time = setTimeout(\"count()\", 1000);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function cleartime() {\n");
      out.write("                clearTimeout(time);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            count_start();\n");
      out.write("            //���ε� Ȯ�ο� �ڵ� ��\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type =\"text\" name = \"count\" value = \"6000\"><br>\n");
      out.write("\n");
      out.write("        <p><button id=\"prev\">prev</button> <label id=\"month\">6</label>�� <button id=\"next\">next</button></p>\n");
      out.write("        <p>���� : <label id=\"sche\"></label></p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
}
