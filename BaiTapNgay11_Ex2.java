package BaiTapNgay11.Exercise2;

import DTN2508.com.vti.entity.Department;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class bai1 {
    public List<Department> getDepartments() throws Exception {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT id, name FROM Department";

        ResultSet rs = jdbcUtils.connect()
                .createStatement()
                .executeQuery(sql);

        while (rs.next()) {
            departments.add(new Department(
                    rs.getInt("id"),
                    rs.getString("name")
            ));
        }
        return departments;
    }
        public Department getDepartmentById5() throws Exception {
            String sql = "SELECT id, name FROM Department WHERE id = 5";
            ResultSet rs = jdbcUtils.connect()
                    .createStatement()
                    .executeQuery(sql);

            if (!rs.next()) {
                System.out.println("Cannot find department which has id = 5");
                return null;
            }

            return new Department(rs.getInt("id"), rs.getString("name"));
        }

        public Department getDepartmentById(int id) throws Exception {
            String sql = "SELECT id, name FROM Department WHERE id = ?";
            PreparedStatement ps = jdbcUtils.connect().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Cannot find department which has id = " + id);
            }

            return new Department(rs.getInt("id"), rs.getString("name"));
        }

        public boolean isDepartmentNameExists(String name) throws Exception {
            String sql = "SELECT 1 FROM Department WHERE name = ?";
            PreparedStatement ps = jdbcUtils.connect().prepareStatement(sql);
            ps.setString(1, name);

            return ps.executeQuery().next();
        }

        public void createDepartment(String name) throws Exception {
            if (isDepartmentNameExists(name)) {
                throw new Exception("Department Name is Exists!");
            }

            String sql = "INSERT INTO Department(name) VALUES (?)";
            PreparedStatement ps = jdbcUtils.connect().prepareStatement(sql);
            ps.setString(1, name);
            ps.executeUpdate();
        }

        public boolean isDepartmentIdExists(int id) throws Exception {
            String sql = "SELECT 1 FROM Department WHERE id = ?";
            PreparedStatement ps = jdbcUtils.connect().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeQuery().next();
        }
        public void updateDepartmentName(int id, String newName) throws Exception {
            if (!isDepartmentIdExists(id)) {
                throw new Exception("Cannot find department which has id = " + id);
            }
            if (isDepartmentNameExists(newName)) {
                throw new Exception("Department Name is Exists!");
            }

            String sql = "UPDATE Department SET name = ? WHERE id = ?";
            PreparedStatement ps = jdbcUtils.connect().prepareStatement(sql);
            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();
        }

        public void deleteDepartment(int id) throws Exception {
            if (!isDepartmentIdExists(id)) {
                throw new Exception("Cannot find department which has id = " + id);
            }

            String sql = "DELETE FROM Department WHERE id = ?";
            PreparedStatement ps = jdbcUtils.connect().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
}



