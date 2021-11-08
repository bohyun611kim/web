package org.cat.danbi.purejava.jdbc.user.ex;

import org.cat.danbi.purejava.jdbc.user.User;
import org.cat.danbi.purejava.jdbc.user.UserDao;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingDbUtils;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingRawJDBC;

import java.util.List;

public class ListUserEx {

    public static void main(String[] args) {

        // 구현체를 변경해본다
        UserDao userDao = new UserDaoImplUsingDbUtils();

        List<User> users = userDao.listUsers(0, 10);
        for (User user : users) {
            System.out.println(user);
        }

    }
}
