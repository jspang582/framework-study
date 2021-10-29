package com.github.jspang582.mybatis.core;

import java.sql.*;

/**
 * jdbc传统查询
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/29 15:58
 */
public class Jdbc {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // 1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 2.创建连接
            conn = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "root");


            // SQL语句
            String sql = "select id,user_name,create_time from t_user where id=?";

            // 获得sql执行者
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);

            // 执行查询
            pstmt.execute();
            ResultSet rs = pstmt.getResultSet();

            rs.next();
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setUserName(rs.getString("user_name"));
            user.setCreateTime(rs.getDate("create_time"));
            System.out.println(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (conn != null) {
                    conn.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



class User {
    private Long id;
    private String userName;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
