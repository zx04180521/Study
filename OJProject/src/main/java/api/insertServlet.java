package api;

import problem.Problem;
import problem.ProblemDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/insert")
public class insertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id=req.getParameter("id");
        String title=req.getParameter("title");
        String level=req.getParameter("level");
        String description=req.getParameter("description");
        String templateCode=req.getParameter("templateCode");
        String testCode=req.getParameter("testCode");
        Problem problem=new Problem();
        problem.setId(Integer.parseInt(id));
        problem.setTitle(title);
        problem.setLevel(level);
        problem.setTemplateCode(templateCode);
        problem.setDescription(description);
        problem.setTestCode(testCode);
        ProblemDAO problemDAO=new ProblemDAO();
        problemDAO.insert(problem);
    }
}
