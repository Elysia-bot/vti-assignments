package BaiTapNgay11.Exercise4;

import java.sql.Connection;

public class a {
    public void deleteDepartmentTransaction() throws Exception {
        Connection conn = jdbcUtils.connect();
        conn.setAutoCommit(false);

        try {
            conn.createStatement()
                    .executeUpdate("DELETE FROM Account WHERE department_id = 3");
            conn.createStatement()
                    .executeUpdate("DELETE FROM Department WHERE id = 3");

            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        }
    }

}
