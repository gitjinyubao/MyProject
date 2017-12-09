package userservlect;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import entitty.Page;
import entitty.User;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import doentitty.*;

public class UserServlect1 extends HttpServlet {
	public UserServlect1() {
		super();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    this.doPost(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html");//让out输出以html格式输出
		
//		response.setContentType("text/html;charset=utf-8");//响应的编码格式
//		//保证out输出的为：UTF-8编码格式
//		request.setCharacterEncoding("UTF-8");//请求的编码格式
		
		//url到服务器是request;服务器到url客户端是response
		String method = request.getParameter("method");
	 if("Luogin".equals(method))
  {
	  this.doLuogin(request, response);
  }
else if("delete".equals(method))
	{
			this.dodelete(request, response);
	}
		else if("update1".equals(method)){
			this.dofind(request, response);
	}
		else if("update2".equals(method)){
			this.doUpdate(request, response);
	}
		else if("insert1".equals(method))
	{
			this.doInsert(request, response);
	}
		else if("select".equals(method))
	{
				this.doBlurFinder(request, response);
	}
	else if("select1".equals(method))
	{
			this.doBlurFinder(request, response);
	}
	else if("updown".equals(method))
	{
			this.doList1(request, response);
			
	}
	else if("go".equals(method))
	{
			this.doList1(request, response);	
	}
	 
	 
	 
	 
	 
	
	}
	public void doInsert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			User user = user(request, response);
			Doentitty.insert(user);
	        doList1(request, response);
	}
	
	
	public void dodelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
			Doentitty.deleteUser(id);
			doList1(request, response);
	}
	
	
	public void dogo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int currentpage=Integer.parseInt(request.getParameter("number"));
	    List<User>  list=Doentitty.ListUser1(currentpage, 3);
		request.setAttribute("list", list);
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}
	
	
	public void dofind(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    int id=Integer.parseInt(request.getParameter("id"));
		    Doentitty   d=new Doentitty();
		    User  user=d.FindUser(id);
		    request.setAttribute("user", user);
		    request.getRequestDispatcher("update1.jsp").forward(request, response);
	}
	
	
	public void doUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   User user =user1(request, response);
		   Doentitty.updateUser(user);
		   doList1(request, response);
	}
	
	
	public User user(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   String   age=request.getParameter("age");
		   String   username=request.getParameter("username");
		   String   password=request.getParameter("password");
		   User user=new User(username,password,age);
		   return user;
	}
	
	
	public User user1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		   int id=Integer.parseInt(request.getParameter("id"));
		   String   age=request.getParameter("age");
		   String   username=request.getParameter("username");
		   String   password=request.getParameter("password");
		   User user=new User(username,password,age,id);
		   return user;
	}
	
	public void doBlurFinder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		    String method = request.getParameter("method");
		    String   username=request.getParameter("username");
			Page  page=new Page();
			String currentPage=null;
			currentPage=(String)request.getParameter("CurrentPage");
			String pagekind=(String)request.getParameter("pagekind");
			if(currentPage==null)
			{
				page.setCurrentPage(1);
			}
			else if(currentPage!=null&pagekind.equals("down"))
			{
				int currentPage1=Integer.parseInt(currentPage);
				++currentPage1;
				page.setCurrentPage(currentPage1);
			}
			else if(currentPage!=null&pagekind.equals("up"))
			{
				int currentPage1=Integer.parseInt(currentPage);
				--currentPage1;
				page.setCurrentPage(currentPage1);
			}
			page.setPageSize(3);
			 List<User>  list= Doentitty.blurFind1(username,page.getCurrentPage(),page.getPageSize());
				request.setAttribute("list", list);
				if("select".equals(method))
				{
					page.setSumObject(Doentitty.sumUser());
				}
				else
				{
					page.setSumObject(list.size());
				}
				request.setAttribute("page", page);
				request.getRequestDispatcher("show.jsp").forward(request, response);		
	}
	
	public void doLuogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		PrintWriter  out =response.getWriter();
		String   username=request.getParameter("username");
		String   password=request.getParameter("password");
		User  user=new User();
			user=Doentitty.Luogin(username, password);
			//HttpSession session=request.getSession();
			if(user!=null)
			{
				request.getSession().setAttribute("Textuser", user);
				doList1(request, response);
		     }	
			else
			{
				//out.print("<a  href=Luogin.jsp>return  to</a>");
				out.print("<script>alert('用户名或密码错误!');location.href='Luogin.jsp';</script>");
				out.close();
			}
			
		
	}
	
	
	
	//分页
	public void doList1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Page  page=new Page();
		String currentPage;
		String currentpage2=request.getParameter("number");
		currentPage=(String)request.getParameter("CurrentPage");
		String pagekind=(String)request.getParameter("pagekind");
		if(currentPage==null)
		{
			page.setCurrentPage(1);
		}
		else if(currentPage!=null)
		{
			if(pagekind.equals("down"))
			{
				int currentPage1=Integer.parseInt(currentPage);
				++currentPage1;
				page.setCurrentPage(currentPage1);	
			}
			
			else if(pagekind.equals("up"))
			{ 
				int currentPage1=Integer.parseInt(currentPage);
				--currentPage1;
				page.setCurrentPage(currentPage1);
			}
			else if(pagekind.equals("stop"))
			{
				page.setCurrentPage(Integer.parseInt(currentPage));
			}
			else if(pagekind.equals("tiao"))
			{
				String i=(String)request.getParameter("number");
				if(i!=null)
				{
					page.setCurrentPage(Integer.parseInt(request.getParameter("number")));
				}
			}
		}
		page.setPageSize(3);
		page.setSumObject(Doentitty.sumUser());
		request.setAttribute("page", page);
		
		List<User>  list=Doentitty.ListUser1(page.getCurrentPage(),page.getPageSize());
		request.setAttribute("list", list);
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
		
	}
	public void init() throws ServletException {
		// Put your code here
	}
}