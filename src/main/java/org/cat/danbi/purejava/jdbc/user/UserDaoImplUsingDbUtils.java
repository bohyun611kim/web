package org.cat.danbi.purejava.jdbc.user;

import org.cat.danbi.purejava.jdbc.DbUtils;
import org.cat.danbi.purejava.jdbc.ResultSetHandler;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.util.List;

public class UserDaoImplUsingDbUtils implements UserDao {

    private static final String DB_URL
            = "jdbc:mariadb://localhost:3306/danbidb?user=danbi&password=danbi";

    // 유저 목록
    private static final String LIST_USERS
            = "select userId, email, name from user order by userId desc limit ?, ?";

    // 유저 등록
    private static final String ADD_USER
            = "insert user (email, password, name) values(?,sha2(?, 256),?)";

    // 로그인
    private static final String LOGIN_USER
            = "select userId, email, name from user where email=? and sha2(?, 256)";
    // 유저상세
    private static final String GET_USER
            = "select userId, email, name from user where userId=?";
    // 이메일 수정
    private static final String UPDATE_EMAIL
            = "update user set email=? where userId=?";

    // 비밀번호 수정 : OLD , NEW
    private static final String UPDATE_PASSWORD
            = "update user set password=sha2(?, 256) where userId=? and password=sha2(?,256)";

    private DbUtils dbUtils;

    public UserDaoImplUsingDbUtils() {
        DataSource dataSource = new MariaDbDataSource(DB_URL);
        dbUtils = new DbUtils(dataSource);
    }


    @Override
    public List<User> listUsers(int offset, int count) {

        // 구현체구현
        ResultSetHandler<User> h = rs -> {
            User user = new User();
            user.setUserId(rs.getInt("userId"));
            user.setEmail(rs.getString("email"));
            user.setName(rs.getString("name"));
            return user;
        };
        return dbUtils.list(LIST_USERS, h, offset, count);
    }



    @Override
    public void addUser(User user) {
        dbUtils.update(ADD_USER, user.getEmail(), user.getPassword(), user.getName());
    }

    @Override
    public User login(String email, String password) {
        return dbUtils.get(LOGIN_USER, (rs) -> {
            User user = new User();
            user.setUserId(rs.getInt("userId"));
            user.setEmail(rs.getString("email"));
            user.setName(rs.getString("name"));
            return user;
        }, email, password);

    }

    @Override
    public User getUser(int userId) {
        return dbUtils.get(GET_USER, (rs) -> {
            User user = new User();
            user.setUserId(rs.getInt("userId"));
            user.setEmail(rs.getString("email"));
            user.setName(rs.getString("name"));
            return user;
        }, userId);
    }

    @Override
    public int updateEmail(int userId, String email) {
        return dbUtils.update(UPDATE_EMAIL, email, userId);
    }

    @Override
    public int updatePassword(int userId, String oldPassword, String newPassword) {
        return dbUtils.update(UPDATE_PASSWORD, newPassword, userId, oldPassword);
    }
}
