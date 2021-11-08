package org.cat.danbi.purejava.jdbc.user.ex;

import org.cat.danbi.purejava.jdbc.user.User;
import org.cat.danbi.purejava.jdbc.user.UserDao;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingDbUtils;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingRawJDBC;

public class UpdateEmailUserEx {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImplUsingDbUtils();

        int result = userDao.updateEmail(3, "bongue@cat.org");

        if(result > 0) {
            System.out.println("이메일이 수정되었습니다.");
        } else {
            System.out.println("이메일 수정 실패.");
        }
    }
}
