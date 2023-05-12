create database DataKhachSan

use DataKhachSan


CREATE TABLE SanPham(
   maSP  NVARCHAR (255) primary key,
   tenSP NVARCHAR (255)  NULL,
   soLuong int  NULL,
   gia money NULL,
   loai NVARCHAR (255)  NULL,
   maLoaiSP  NVARCHAR (255) NULL,
   maNV NVARCHAR (255),
);

CREATE TABLE LoaiSanPham(
   maLoaiSP  NVARCHAR (255) primary key,
   loai NVARCHAR (255),
);


CREATE TABLE HoaDon(
	maHD NVARCHAR (255) primary key,
	maNV NVARCHAR (255),
	maSP NVARCHAR (255),
	maPhong NVARCHAR (255),
	total money,
	ngayVao date, ngayRa date,
	gioVao date, gioRa date,
	maKH NVARCHAR (255),
	ngayLapHD date,
);

CREATE Table ChiTietHD(
	maHD NVARCHAR (255) primary key,
	maSP NVARCHAR (255),
	soLuong int NUll,
);

create table NhanVien(
	maNV NVARCHAR (255) primary key,
	tenNV NVARCHAR (255),
	namSinh int,
	email NVARCHAR (255),
	CMND NVARCHAR (255),
	sex NVARCHAR (255),
	sdt NVARCHAR (255),
	diachi NVARCHAR (255),
	matKhau NVARCHAR (255),
);

create table QuanLy(
	maQL NVARCHAR (255) primary key,
	tenQL NVARCHAR (255),
	namSinh int,
	email NVARCHAR (255),
	CMND NVARCHAR (255),
	sex NVARCHAR (255),
	sdt NVARCHAR (255),
	diachi NVARCHAR (255),
	matKhau NVARCHAR (255),
);

create table Phong(
	maPhong NVARCHAR (255) primary key,
	loaiPhong NVARCHAR (255),
	gia money,
	maLoaiPhong NVARCHAR (255),
	maTTP NVARCHAR (255),
);


create table KhachHang(
	maKH NVARCHAR (255) primary key,
	tenKH NVARCHAR (255),
	email NVARCHAR (255),
	sex NVARCHAR (255),
	CMND NVARCHAR (255),
	sdt NVARCHAR (255),
	namSinh int,
);

create table LoaiPhong(
	maLoaiPhong NVARCHAR (255) primary key,
	donGia money,
	maPhong NVARCHAR (255),
);