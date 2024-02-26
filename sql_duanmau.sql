CREATE DATABASE DuAnMau_SQL_PC07859
go

--use test
--drop database DuAnMau_SQL_PC07859
--GO

USE DuAnMau_SQL_PC07859

CREATE TABLE NhanVien(
	MaNV int PRIMARY KEY identity,
	MatKhau NVARCHAR(50) NOT NULL,
	HoTen NVARCHAR(50) NOT NULL,
	VaiTro BIT DEFAULT 0,
	Hinh VARCHAR(50),
	deleted bit default 0,
	Email NVARCHAR(50),
	KichHoat bit default 0,
	MaKichHoat nvarchar(10),
	QuenMatKhau nvarchar(10)
	)
GO
CREATE TABLE ChuyenDe(
	MaCD INT PRIMARY KEY IDENTITY(1,1),
	TenCD NVARCHAR(50) NOT NULL,
	HocPhi FLOAT NOT NULL,
	ThoiLuong INT NOT NULL,
	Hinh NVARCHAR(50) NOT NULL,
	MoTa NVARCHAR(255) NOT NULL,
	deleted bit default 0
	) 
GO
CREATE TABLE KhoaHoc(
	MaKH INT IDENTITY(1,1) NOT NULL,
	MaCD int NOT NULL,
	HocPhi FLOAT NOT NULL,
	ThoiLuong INT NOT NULL,
	NgayKG DATE NOT NULL,
	GhiChu NVARCHAR(50) NULL,
	MaNV int NOT NULL,
	NgayTao DATE NOT NULL,
	deleted bit default 0
	PRIMARY KEY(MaKH),
	FOREIGN KEY (MaCD) REFERENCES ChuyenDe(MaCD) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
	)
GO
CREATE TABLE NguoiHoc(
	MaNH INT PRIMARY KEY IDENTITY(1,1),
	HoTen NVARCHAR(50) NOT NULL,
	GioiTinh BIT DEFAULT 1,
	NgaySinh DATE NOT NULL,
	DienThoai NVARCHAR(24) NOT NULL,
	Email NVARCHAR(20) NOT NULL,
	GhiChu NVARCHAR(255) NULL,
	deleted bit default 0,
	Hinh NVARCHAR(50) NOT NULL,
	MaNV int NOT NULL,
	FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE,
	NgayDK DATE DEFAULT getdate()
	)
GO
CREATE TABLE HocVien(
	MaHV INT IDENTITY(1,1) NOT NULL,
	PRIMARY KEY (MaHV),
	MaKH INT NOT NULL,
	MaNH int NOT NULL,
	Diem FLOAT DEFAULT -1,
	deleted bit default 0,
	FOREIGN KEY (MaNH) REFERENCES NguoiHoc(MaNH) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY (MaKH) REFERENCES KhoaHoc(MaKH)  ON DELETE CASCADE ON UPDATE NO ACTION
)
GO
select *
from nhanvien



-- NHÂN VIÊN
INSERT INTO NhanVien(MatKhau, HoTen, VaiTro, Hinh) 
VALUES
	('12345678a', N'Đinh Quốc Huy', 'true', 'ong140.png'),
	('12345678b', N'Bùi Thị Thẩm Thúy', 'false', 'ong140.png'),
	('12345678c', N'Phạm Thanh Thanh', 'true', 'ong140.png'),
	('12345678d', N'Thúy Kiều', 'false', 'ong140.png'),
	('12345678e', N'Thúy Văn', 'true', 'ong140.png')


	

--UPDATE NhanVien SET MatKhau='555', HoTen='Nguyen Van Be', VaiTro='false' WHERE MaNV='NamNV'
--DELETE FROM NhanVien WHERE MaNV='NamNV'
--SELECT * FROM NhanVien
--SELECT * FROM NhanVien WHERE MaNV=?

-- CHUYÊN ĐỀ
INSERT INTO ChuyenDe(TenCD, HocPhi, ThoiLuong, Hinh, Mota) 
VALUES 
	('Java', 200000, 15, 'ong140.png', N'Học về ngôn ngữ Java và tạo ra phần mềm quản lý'),
	('C#', 220000, 20, 'ong140.png', N'Học về ngôn ngữ lập trình C# và phát triển ứng dụng desktop'),
	('Python', 180000, 12, 'ong140.png', N'Khám phá ngôn ngữ Python và ứng dụng trong data science'),
	('Web Development', 250000, 18, 'ong140.png', N'Xây dựng các trang web đẹp và tương tác sử dụng HTML, CSS, và JavaScript'),
	('SQL Database', 190000, 14, 'ong140.png', N'Học cách quản lý cơ sở dữ liệu sử dụng SQL và MySQL')
	select * from chuyende
--UPDATE ChuyenDe SET TenCD='def', HocPhi=3000, ThoiLuong=16, Hinh ='a1a1a1', Mota = 'dê e ép' WHERE MaCD='Ma1'
--DELETE FROM ChuyenDe WHERE MaCD='Ma1'
--SELECT * FROM ChuyenDe
--SELECT * FROM ChuyenDe WHERE MaCD='Ma1'  

-- KHÓA HỌC
--INSERT INTO KhoaHoc(MaCD, HocPHi, NgayKG, GhiChu, MaNV, NgayTao) VALUES (?,?,?,?,?,?,?);

INSERT INTO KhoaHoc(MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao)
VALUES 
 (1,200000, 40, '2023-09-20', N'Khoá học Java căn bản', 1, '2023-09-16'),
 (2,220000, 45, '2023-10-05', N'Khoá học C# nâng cao', 2, '2023-09-16'),
 (3,180000, 35, '2023-09-25', N'Khoá học Python cơ bản', 3, '2023-09-16'),
 (4,250000, 50, '2023-10-10', N'Khoá học phát triển web', 4, '2023-09-16'),
 (5,190000, 30, '2023-09-30', N'Khoá học quản lý cơ sở dữ liệu', 5, '2023-09-16')
--UPDATE KhoaHoc SET MaCD=?, HocPhi=?, NgayKG=?, GhiChu=?, MaNV=?, NgayTao=? WHERE MaKH=?;


--UPDATE KhoaHoc SET MaCD=?, HocPhi=?, NgayKG=?, GhiChu=?, MaNV=?, NgayTao=? WHERE MaKH=?;
--DELETE FROM ChuyenDe WHERE MaKH=?
--SELECT * FROM KhoaHoc
--SELECT * FROM KhoaHoc WHERE MaKH=?'

-- NGUOI HOC
--INSERT INTO NguoiHoc(MaNH, HoTen, GioiTinh, NgaySinh, DienThoai, Email, GhiChu, MaNV, NgayDK) VALUES (?,?,?,?,?,?,?,?,?);

INSERT INTO NguoiHoc(HoTen, GioiTinh, NgaySinh, DienThoai, Email, GhiChu, MaNV, NgayDK, Hinh)
VALUES 
	 (N'Nguyễn Văn Hậu', 'true', '2000-05-15', '0987654321', 'nguyen@gmail.com', N'Học giỏi', 1, '2023-09-16', 'ong140.png'),
	 ( N'Ngô Thị Kim Chi', 'false', '1999-08-20', '0912345678', 'trany@gmail.com', N'Học khá', 2, '2023-09-16', 'ong140.png'),
	 (N'Võ Minh Trọng', 'true', '2002-02-10', '0965432109', 'le@gmail.com', N'Học xuất sắc', 3, '2023-09-16', 'ong140.png'),
	 (N'Phạm Thị Bích Trang', 'false', '2001-11-05', '0932109876', 'thi.m@gmail.com', N'Học giỏi', 4, '2023-09-16', 'ong140.png'),
	 (N'Hoàng Văn Thịnh', 'true', '2003-07-25', '0945678901', 'vanl@gmail.com', N'Học khá', 5, '2023-09-16', 'ong140.png')

--UPDATE NguoiHoc SET HoTen=?, GioiTinh=?, NgaySinh=?, DienThoai=?, Email=?, GhiChu=?, MaNV=?, NgayDK=? WHERE MaNH=?;
--DELETE FROM NguoiHoc WHERE MaNH=?
--SELECT * FROM NguoiHoc
--SELECT * FROM NguoiHoc WHERE MaNH=?'

-- HỌC VIÊN
--INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES (?,?,?);

INSERT INTO HocVien(MaKH, MaNH, Diem) 
VALUES (3,1,9),
	(4,2,8),
	(3,3,7),
	(3,4,5),
	(3,5,4)


--UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?
--DELETE FROM HocVien WHERE MaHV=?
--SELECT * FROM HocVien
--SELECT * FROM HocVien WHERE MaHV=?

GO

CREATE PROC sp_LuongNguoiHoc
AS BEGIN 
	SELECT
		YEAR(NgayDK) Nam,
		COUNT(*) SoLuong,
		MIN(NgayDK) DauTien,
		MAX(NgayDK) CuoiCung
	FROM NguoiHoc
	GROUP BY YEAR(NgayDK)
END
GO

CREATE PROC sp_BangDiem(@MaKH INT)
AS BEGIN 
	SELECT
		nh.MaNH,
		nh.HoTen,
		hv.Diem
	FROM HocVien hv
		JOIN NguoiHoc nh ON nh.MaNH = hv.MaNH
	WHERE hv.MaKH = @MaKH
	ORDER BY hv.Diem DESC
END
GO

CREATE PROC sp_DiemChuyenDe
AS BEGIN 
	SELECT
		TenCD ChuyenDe,
		COUNT(MaHV) SoHV,
		MIN(Diem) ThapNhat,
		MAX(Diem) CaoNhat,
		AVG(Diem) TrungBinh
	FROM KhoaHoc kh
		JOIN HocVien hv ON kh.MaKH=hv.MaKH
		JOIN ChuyenDe cd ON cd.MaCD = kh.MaCD
	GROUP BY TenCD
END
GO

CREATE PROC sp_DoanhThu(@Year INT)
AS BEGIN 
	SELECT
		TenCD ChuyenDe,
		COUNT(DISTINCT kh.MaKH) SoKH,
		COUNT(hv.MaHV) SoHV,
		SUM(kh.HocPhi) DoanhThu,
		MIN(kh.HocPhi) ThapNhat,
		MAX(kh.HocPhi) CaoNhat,
		AVG(kh.HocPhi) TrungBinh
	FROM KhoaHoc kh
		JOIN HocVien hv ON kh.MaKH=hv.MaKH
		JOIN ChuyenDe cd ON cd.MaCD = kh.MaCD
	WHERE YEAR(NgayKG) = @Year
	GROUP BY TenCD
END
GO
use DuAnMau_SQL_PC07859

exec sp_DoanhThu 2023




--select *
--from nguoihoc


select *
	FROM KhoaHoc kh
		JOIN HocVien hv ON kh.MaKH=hv.MaKH
		JOIN ChuyenDe cd ON cd.MaCD = kh.MaCD
		where year(ngaykg) = 2023


		select *
		from khoahoc
