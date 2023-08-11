CREATE DATABASE FINAL_ASSIGNMENT_JAVA3_DUNGNA29;
GO
USE FINAL_ASSIGNMENT_JAVA3_DUNGNA29;
GO

CREATE TABLE DongSanPham(
Id INT PRIMARY KEY IDENTITY,
Ma NVARCHAR(100)  DEFAULT NULL,
Ten NVARCHAR(100) DEFAULT NULL,
Web NVARCHAR(200) DEFAULT NULL
);

CREATE TABLE NhanVien(
Id INT PRIMARY KEY IDENTITY,
Ma NVARCHAR(100)  DEFAULT NULL,
TenHo NVARCHAR(100) DEFAULT NULL,
TenDem NVARCHAR(100) DEFAULT NULL,
Ten NVARCHAR(100) DEFAULT NULL,
GioiTinh NVARCHAR(100) DEFAULT NULL,
NgaySinh Date DEFAULT NULL,
IdCV INT NOT NULL,
IdNguoiBaoCao INT NOT NULL,
);
CREATE TABLE ChucVu(
Id  INT PRIMARY KEY IDENTITY,
Ma NVARCHAR(100) DEFAULT NULL,
Ten NVARCHAR(100) DEFAULT NULL
);
CREATE TABLE SanPham(
Id INT PRIMARY KEY IDENTITY,
Ma NVARCHAR(100) DEFAULT NULL,
Ten  NVARCHAR(100) DEFAULT NULL,
NamBaoHanh NUMERIC(4),
TrongLuongSP FLOAT DEFAULT NULL,
MoTaSP NVARCHAR(100) DEFAULT NULL,
SLSanPhamTon INT DEFAULT NULL,
GiaNhapSP DECIMAL(20,0) DEFAULT NULL,
GiaBanSP DECIMAL(20,0) DEFAULT NULL,
IdDSP INT NOT NULL
);

CREATE TABLE HoaDon(
Id INT PRIMARY KEY IDENTITY,
Ma NVARCHAR(100) DEFAULT NULL,
NgayTaoHoaDon DATE DEFAULT NULL,
TinhTrangHoaDon  INT DEFAULT NULL,
IdKH INT NOT NULL,
IdNV INT NOT NULL
);
CREATE TABLE HoaDonChiTiet(
IdHoaDon INT NOT NULL,
IdSanPham INT NOT NULL ,
SoLuong INT DEFAULT NULL,
DonGia DECIMAL(20,0) DEFAULT NULL,
STT INT DEFAULT NULL,
PRIMARY KEY(IdHoaDon,IdSanPham),
CONSTRAINT FK1 FOREIGN KEY(IdHoaDon)REFERENCES hoadon(Id),
CONSTRAINT FK2 FOREIGN KEY(IdSanPham) REFERENCES sanpham(Id)
);

ALTER TABLE NhanVien
ADD CONSTRAINT FK_NhanVienChucDanh
FOREIGN KEY(IdCV) REFERENCES chucvu(Id);

ALTER TABLE NhanVien
 ADD CONSTRAINT FK_GuiBaoCaoNhanVien
FOREIGN KEY(IdNguoiBaoCao) REFERENCES nhanvien(Id);

ALTER TABLE HoaDon
ADD CONSTRAINT FK_HoaDonNhanVien
FOREIGN KEY(IdNV) REFERENCES nhanvien(Id);

ALTER TABLE sanpham
ADD CONSTRAINT FK_SanPhamDongSanPham
FOREIGN KEY(IdDSP) REFERENCES dongsanpham(Id);