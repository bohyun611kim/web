package org.cat.danbi.purejava.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ResultSet을 처리하는  인터페이스
 * @param <T>
 */
@FunctionalInterface
public interface ResultSetHandler<T> {
    T handle(ResultSet rs) throws SQLException;
}
