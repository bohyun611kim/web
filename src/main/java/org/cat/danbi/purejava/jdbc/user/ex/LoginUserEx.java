package org.cat.danbi.purejava.jdbc.user.ex;

import org.cat.danbi.purejava.jdbc.user.User;
import org.cat.danbi.purejava.jdbc.user.UserDao;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingDbUtils;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingRawJDBC;

import java.util.List;

public class LoginUserEx {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImplUsingDbUtils();

        // email, password
        User theUser = userDao.login("bongue@cat.org", "b1");

        if(null != theUser) {
            System.out.format("%s님 로그인 하셨습니다.", theUser.getName());
        } else {
            System.out.println("이메일 또는 비빌번호가 틀립니다.");
        }

    }
}
