package com.smoner.aop.example.advice.introduceadvice;

import com.smoner.aop.proxy.nativeExample.ForumService;

/**
 * Created by fengjqc on 16-12-23.
 */
public class ForumServiceIntroduceImpl implements ForumService {

    @Override
    public void removeTopic(int topicid) {
        System.out.println("模拟删除Topic记录："+topicid);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removeForum(int forumid) {
        System.out.println("模拟删除forum记录："+forumid);
        try {
            Thread.currentThread().sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
