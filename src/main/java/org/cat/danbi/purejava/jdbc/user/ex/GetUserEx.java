package org.cat.danbi.purejava.jdbc.user.ex;

import org.cat.danbi.purejava.jdbc.user.User;
import org.cat.danbi.purejava.jdbc.user.UserDao;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingRawJDBC;

import java.util.List;
import java.util.Optional;

public class GetUserEx {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImplUsingRawJDBC();
        User user = userDao.getUser(3);



    }
}
