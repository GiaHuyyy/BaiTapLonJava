package entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Phong {
	private int maPhong;
	private String loaiPhong, trangThai;
	private BigDecimal giaPhong;

	public Phong(int maPhong, String loaiPhong, String trangThai, BigDecimal giaPhong) {
		super();
		this.maPhong = maPhong;
		this.loaiPhong = loaiPhong;
		this.trangThai = trangThai;
		this.giaPhong = giaPhong;
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public BigDecimal getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(BigDecimal giaPhong) {
		this.giaPhong = giaPhong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phong other = (Phong) obj;
		return maPhong == other.maPhong;
	}

}
