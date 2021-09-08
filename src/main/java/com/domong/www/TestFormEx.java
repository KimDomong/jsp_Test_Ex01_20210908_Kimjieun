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
@WebServlet(urlPatterns={"/TestFormEx"},initParams= {@WebInitParam(name="job",value="학생")})
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
		System.out.println("doPost 방식으로 넘어갔습니다.");
		
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
		writer.println("안녕하세요."+ name + "님 반갑습니다." + "<br/>");
						
		writer.println("입력하신 아래 가입 정보를 확인하시기 바랍니다.<br/>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + pw + "<br/>");
		writer.println("이름 : " + name + "<br/>");
		writer.println("이메일 : " + email1 + "@" + email2 +"<br/>");
		
	
		if(job1=="")
		writer.println("직업 : " + job2 + "<br/>");
		else writer.println("직업 : " + job1 + "<br/>");
		
		writer.println("</body></thml>");
		
		writer.close();
		
	}	
}

