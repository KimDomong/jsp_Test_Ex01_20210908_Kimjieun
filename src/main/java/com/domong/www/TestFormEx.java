package com.domong.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestFormEx
 */
@WebServlet(urlPatterns={"/TestFormEx"},initParams= {@WebInitParam(name="job",value="�л�")})
public class TestFormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestFormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost ������� �Ѿ���ϴ�.");
		
		request.setCharacterEncoding("EUC-KR"); 
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String email1 = request.getParameter("email1"); 
		String email2= request.getParameter("email2");
		String job1 = request.getParameter("job");
		String job2 = getInitParameter("job");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>"+"<br/>");
		writer.println("�ȳ��ϼ���."+ name + "�� �ݰ����ϴ�." + "<br/>");
						
		writer.println("�Է��Ͻ� �Ʒ� ���� ������ Ȯ���Ͻñ� �ٶ��ϴ�.<br/>");
		writer.println("���̵� : " + id + "<br/>");
		writer.println("��й�ȣ : " + pw + "<br/>");
		writer.println("�̸� : " + name + "<br/>");
		writer.println("�̸��� : " + email1 + "@" + email2 +"<br/>");
		
		writer.println("���� : " + job1 + "<br/>");
		if(job1=="")
		writer.println("���� : " + job2 + "<br/>");
		
		writer.println("</body></thml>");
		
		writer.close();
		
	}	
}
