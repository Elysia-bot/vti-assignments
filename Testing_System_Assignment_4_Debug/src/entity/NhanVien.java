package entity;

import java.util.Scanner;

public class NhanVien extends CanBo {

	private String congViec;

	public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public NhanVien() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập công việc: ");
		this.congViec = scanner.nextLine();
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNhanVien [congViec=" + congViec + "]";
	}
}
