package org.cat.danbi.purejava.jdbc.user.ex;

import org.cat.danbi.purejava.jdbc.DataAccessException;
import org.cat.danbi.purejava.jdbc.user.User;
import org.cat.danbi.purejava.jdbc.user.UserDao;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingDbUtils;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingRawJDBC;

import java.util.List;

public class AddUserEx {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImplUsingDbUtils();

        User user = new User();
        user.setEmail("fire@gmai.com");
        user.setPassword("f");
        user.setName("파이어");

        try {
            userDao.addUser(user);
            System.out.format("사용자를 추가했습니다 : %s\n", user);

        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }

        List<User> users = userDao.listUsers(0, 10);
        for (User theUser : users) {
            System.out.println(theUser);
        }


    }
}
