import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sina.sae.util.SaeUserInfo;

/**
 * Servlet implementation class test1
 */
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public test1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String appName = SaeUserInfo.getAppName();
		String appAccessKey =	SaeUserInfo.getAccessKey();
		String appSecretKey =	SaeUserInfo.getSecretKey();
		String appAppVersion =	SaeUserInfo.getAppVersion();
		String appSaeTmpPath =	SaeUserInfo.getSaeTmpPath();
		
		String strOP = "Name" + appName + ";AccessKey" + appAccessKey;
		// 设置响应内容类型
		response.setContentType("text/html");
		// 实际的逻辑是在这里
		PrintWriter out = response.getWriter();
		out.println("<h1>" + strOP + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String appName = SaeUserInfo.getAppName();
		String appAccessKey =	SaeUserInfo.getAccessKey();
		String appSecretKey =	SaeUserInfo.getSecretKey();
		String appAppVersion =	SaeUserInfo.getAppVersion();
		String appSaeTmpPath =	SaeUserInfo.getSaeTmpPath();
		
		String strOP = "Name" + appName + ";AccessKey" + appAccessKey;
		// 设置响应内容类型
		response.setContentType("text/html");
		// 实际的逻辑是在这里
		PrintWriter out = response.getWriter();
		out.println("<h1>" + strOP + "</h1>");
	}

}
