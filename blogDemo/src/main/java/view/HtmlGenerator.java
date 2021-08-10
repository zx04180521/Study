package view;

import model.Article;
import model.User;

import java.util.List;

public class HtmlGenerator {
    //通过字符串拼接的方式，构造出一个html格式的内容
    public static String getMessagePage(String message, String nextUrl) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<meta charset=\"utf-8\">");
        stringBuffer.append("<title>提示页面</title>");
        stringBuffer.append("</head>");
        stringBuffer.append("<body>");

        stringBuffer.append("<h3>");
        stringBuffer.append(message);
        stringBuffer.append("</h3>");

        stringBuffer.append(String.format("<a href=\"%s\">点击这里跳转</a>",nextUrl));

        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }

    //文章标题页面
    public static String getArticleListPage(List<Article> articles, User user) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<meta charset=\"utf-8\">");
        stringBuffer.append("<title>提示页面</title>");

        stringBuffer.append("<style>");
        // style 标签内部就是写 CSS 的逻辑
        stringBuffer.append(".article{" +
                "color: #333;" +
                "text-decoration: none;" +
                "width: 200px;" +
                "height: 50px;" +
                "}");
        stringBuffer.append(".article:hover {" +
                "color: white;" +
                "background-color: orange;" +
                "}");
        stringBuffer.append("body {" +
                "background-image: url(\"https://th.bing.com/th/id/R64ef38a3814eb6ffa5a5c1a0298c3f2e?rik=cGEEtBmK6ZVO8A&riu=http%3a%2f%2fimg.netbian.com%2ffile%2f20110328%2fc499e3cfbc6665820da702b1344647b6.jpg&ehk=tR8G77wqaz%2b0%2bMAERRwrK8xoV75WBjoMvOtB8RKHzDw%3d&risl=&pid=ImgRaw\");"+
                "background-repeat: none;" +
                "background-position: 0 center;" +
                "}");
        stringBuffer.append("</style>");

        stringBuffer.append("</head>");
        stringBuffer.append("<body>");

        stringBuffer.append("<div> 欢迎您！"+user.getName()+"</div>");
        stringBuffer.append("<hr>");
        //要有一个文章列表，显示每个文章的标题
        for(Article article:articles){
            stringBuffer.append(String.format("<div style=\"width: 200px; height: 50px; line-height: 50px \"><a class=\".article\" href=\"article?articleId=%d\">%s</a>" +
                    "<a href=\"deleteArticle?articleId=%d\"> 删除 </a></div>",article.getArticleId(),article.getTitle(),article.getArticleId()));
        }
        stringBuffer.append("<hr>");
        stringBuffer.append(String.format("<div>当前共有博客%d篇</div>",articles.size()));


        //在这里新增发布文章的区域
        stringBuffer.append("<div> 发布文章 </div>");
        stringBuffer.append("<div>");
        stringBuffer.append("<form method=\"post\" action=\"article\">");
        stringBuffer.append("<input type=\"text\" style=\"width: 500px; margin-bottom: 5px;\" name=\"title\" placeholder=\"请输入标题\">");
        stringBuffer.append("<br>");
        stringBuffer.append("<textarea name=\"content\" style=\"width: 500px; height: 300px;\"></textarea>");
        stringBuffer.append("<br>");
        stringBuffer.append("<input type=\"submit\" value=\"发布文章\">");
        stringBuffer.append("</form>");
        stringBuffer.append("</div>");

        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }

    //文章详情页面
    public static String getArticleDetailPage(Article article, User user, User author) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<meta charset=\"utf-8\">");
        stringBuffer.append("<title>提示页面</title>");

        stringBuffer.append("<style>");
        // style 标签内部就是写 CSS 的逻辑
//        stringBuffer.append("a{" +
//                "color: #333;" +
//                "text-decoration: none;" +
//                "display: inline-block;"+
//                "width: 200px;" +
//                "height: 50px;" +
//                "}");
        stringBuffer.append("a:hover {" +
                "color: white;" +
                "background-color: orange;" +
                "}");
        stringBuffer.append("body {" +
                "background-image: url(\"https://th.bing.com/th/id/R64ef38a3814eb6ffa5a5c1a0298c3f2e?rik=cGEEtBmK6ZVO8A&riu=http%3a%2f%2fimg.netbian.com%2ffile%2f20110328%2fc499e3cfbc6665820da702b1344647b6.jpg&ehk=tR8G77wqaz%2b0%2bMAERRwrK8xoV75WBjoMvOtB8RKHzDw%3d&risl=&pid=ImgRaw\");"+
                "background-repeat: none;" +
                "background-position: 0 center;" +
                "}");
        stringBuffer.append("</style>");

        stringBuffer.append("</head>");
        stringBuffer.append("<body>");

        stringBuffer.append("<div> 欢迎您！"+user.getName()+"</div>");
        stringBuffer.append("<hr>");

        stringBuffer.append(String.format("<h1>%s</h1>",article.getTitle()));
        stringBuffer.append(String.format("<h4>作者：%s</h4>",author.getName()));
        stringBuffer.append(String.format("<div>%s</div>",article.getContent().replace("\n","<br>")));
        stringBuffer.append(String.format("<a href=\"%s\">返回</a>","article"));

        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }
}
