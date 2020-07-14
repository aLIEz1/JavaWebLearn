package com.lm;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * @author super
 */
public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "C:\\Users\\super\\IdeaProjects\\" +
                "JavaWebLearn\\ServletTest\\src\\main\\resources\\java.pdf";

        fileDownloader(resp,path);
    }

    private void fileDownloader(HttpServletResponse resp, String path) throws IOException {
        System.out.println("下载文件的路径"+path);
        String fileName = path.substring(path.lastIndexOf("\\") + 1);
        //中文文件名让URLEncoder.encode编码
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8"));
        FileInputStream fileInputStream = new FileInputStream(path);
        int len =0;
        byte[] bytes = new byte[1024];
        ServletOutputStream outputStream = resp.getOutputStream();
        while ((len=fileInputStream.read(bytes))>0){
            outputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        outputStream.close();
    }
}
