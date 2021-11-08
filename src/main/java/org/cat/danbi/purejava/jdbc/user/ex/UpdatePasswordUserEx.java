package org.cat.danbi.purejava.jdbc.user.ex;

import org.cat.danbi.purejava.jdbc.user.UserDao;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingDbUtils;
import org.cat.danbi.purejava.jdbc.user.UserDaoImplUsingRawJDBC;

public class UpdatePasswordUserEx {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImplUsingDbUtils();

        int result = userDao.updatePassword(3, "b1","b");
        if(result > 0) {
            System.out.println("패스워드가 수정되었습니다.");
        } else {
            System.out.println("패스워드 수정 실패.");
        }

    }
}
