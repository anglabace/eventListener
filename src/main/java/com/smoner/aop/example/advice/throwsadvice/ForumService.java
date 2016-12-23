package com.smoner.aop.example.advice.throwsadvice;

import java.sql.SQLException;

/**
 * Created by fengjqc on 16-12-10.
 */
public class ForumService {
    public void removeForum(int forumid) throws RuntimeException {
        throw new RuntimeException("运行异常。");
    }
    public void updateForum(int num) throws Exception{
        throw new SQLException("数据更新操作异常。");
    }
}
