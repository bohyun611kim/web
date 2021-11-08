package org.cat.danbi.purejava.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbUtils {

    private final DataSource dataSource;

    /**
     * 데이타베이스 쿼리를 실행하는 helper 클래스
     * @param dataSource
     */
    public DbUtils(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    /**
     * 목록 가져오기를 실행하는 helper 메소드
     */
    public <T> List<T> list(String sql, ResultSetHandler<T> h, Object... params)
            throws DataAccessException {

        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            setParams(ps, params);
            ResultSet rs = ps.executeQuery();

            List<T> list = new ArrayList<>();
            while (rs.next()) {
                list.add(h.handle(rs));
            }
            return list;

        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
    }


    /**
     * 한건 가져오기를 실행하는 helper 메서드
     */
    public <T> T get(String sql, ResultSetHandler<T> h, Object... params)
            throws DataAccessException {

        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            setParams(ps, params);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                T t = h.handle(rs);
                return t;
            }
            return null;
        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
    }


    /**
     * 추가, 수정, 삭제를 실행하는 helper 메서드
     */

     public int update(String sql, Object... params) throws DataAccessException {
         try (Connection con = dataSource.getConnection();
              PreparedStatement ps = con.prepareStatement(sql)) {

             setParams(ps, params);
             ResultSet rs = ps.executeQuery();
             return ps.executeUpdate();
         } catch (SQLException e) {
             throw new DataAccessException(e);
         }
     }


    /**
     * 파라미터를 셋팅해준다.
     */
    private void setParams(PreparedStatement ps, Object... params) throws SQLException {
        if (null != params) {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
        }
    }


}
