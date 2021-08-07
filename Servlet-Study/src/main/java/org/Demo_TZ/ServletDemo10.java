package org.Demo_TZ;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
@MultipartConfig
@WebServlet("/uploadServlet")
public class ServletDemo10 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //收到图片，直接把图片保存到
        //images目录中
        String basePath="e:/java41/images/";
        Part image = req.getPart("image");
        //得到上传的文件名
        String path=basePath+image.getSubmittedFileName();
        image.write(path);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("图片上传成功");
    }
}
