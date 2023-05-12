package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import connectDB.Database;
import entity.KhachHang;
import entity.NhanVien;
import entity.Phong;

public class Phong_DAO {
	ArrayList<Phong> dsp;
	Phong p;

	public Phong_DAO() {
		dsp = new ArrayList<Phong>();
	}

	public ArrayList<Phong> getPhongTheoMaPhong(int mp) {

		Connection con = Database.getInstance().getcoConnection();
		PreparedStatement stmt = null;
		try {
			String sql = "SELECT LoaiPhong, TrangThaiPhong, GiaPhong FROM Phong where ID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, mp);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String loaiPhong = rs.getString(1);
				String trangThai = rs.getString(2);
				BigDecimal gia = rs.getBigDecimal(3);
				Phong p = new Phong(0, loaiPhong, trangThai, gia);
				dsp.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsp;
	}
}
