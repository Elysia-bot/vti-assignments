package BaiTapNgay11.Exercise3;

public class a {
    public void deleteDepartmentUsingProcedure(int id) throws Exception {
        if (!isDepartmentIdExists(id)) {
            throw new Exception("Cannot find department which has id = " + id);
        }

        CallableStatement cs = jdbcUtils.connect()
                .prepareCall("{CALL sp_delete_department(?)}");
        cs.setInt(1, id);
        cs.execute();
    }

}
