package com.sample.config;

import org.apache.catalina.User;
import org.springframework.batch.item.ItemProcessor;


public class UserItemProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {

        return user;
    }
}
