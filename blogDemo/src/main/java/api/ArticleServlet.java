package api;

import model.Article;
import model.ArticleDao;
import model.User;
import model.UserDao;
import view.HtmlGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/article")
public class ArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //1.验证用户是否是登录状态，如果尚未登录就提示用户要先登录
        HttpSession httpSession=req.getSession(false);
        if(httpSession==null){
            //当前是未登录状态
            String html= HtmlGenerator.getMessagePage("请先登录"
                    ,"login.html");
            resp.getWriter().write(html);
            return;
        }
        //登录成功
        User user= (User) httpSession.getAttribute("user");
        //2.判断请求中是否存在articleId参数
        String articleIdStr=req.getParameter("articleId");
        if(articleIdStr==null){
            //  a)没有这个参数就去执行获取文章列表操作
            getAllArticle(user,resp);
        }else{
            //  b)如果有参数就去执行获取文章详情操作
            getOneArticle(Integer.parseInt(articleIdStr),user,resp);
        }
    }

    private void getAllArticle(User user, HttpServletResponse resp) throws IOException {
        //1.查找数据库
        ArticleDao articleDao=new ArticleDao();
        List<Article> articles=articleDao.selectAll();
        //2.构造页面
        String html=HtmlGenerator.getArticleListPage(articles,user);
        resp.getWriter().write(html);
    }

    //文章详情
    private void getOneArticle(int articleId, User user, HttpServletResponse resp) throws IOException {
        //1.查找数据库
        ArticleDao articleDao=new ArticleDao();
        Article article=articleDao.selectById(articleId);
        if(article==null){
            //文章未找到
            String html=HtmlGenerator.getMessagePage("文章不存在",
                    "article");
            resp.getWriter().write(html);
            return;
        }
        //2.根据作者id查找作者信息
        UserDao userDao=new UserDao();
        User author=userDao.selectById(article.getUserId());
        String html=HtmlGenerator.getArticleDetailPage(article,user,author);
        resp.getWriter().write(html);
    }

    //实现新增文章列表
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //1.判定用户的登录状态
        HttpSession httpSession=req.getSession(false);
        if(httpSession==null){
            String html= HtmlGenerator.getMessagePage("您尚未登录",
                    "login.html");
            resp.getWriter().write(html);
        }
        //2.从请求数据中读取浏览器提交的数据（title,content）,并进行简单的校验
        User user= (User) httpSession.getAttribute("user");
        String title=req.getParameter("title");
        String content=req.getParameter("content");
        if(title==null||"".equals(title)
                ||content==null||"".equals(content)){
            String html=HtmlGenerator.getMessagePage("提交的标题或者正文为空",
                    "article");
            resp.getWriter().write(html);
            return;
        }
        //3.吧数据插入到数据库中
        Article article=new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setUserId(user.getUserId());
        ArticleDao articleDao=new ArticleDao();
        articleDao.add(article);
        //4.返回一个插入成功页面
        String html=HtmlGenerator.getMessagePage("发布成功",
                "article");
        resp.getWriter().write(html);
    }
}