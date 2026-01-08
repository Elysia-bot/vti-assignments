package entity;

import java.util.Scanner;

public class KySu extends CanBo {

	private String nganhDaoTao;

	public KySu() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập ngành đào tạo: ");
		this.nganhDaoTao = scanner.nextLine();
	}

	public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nKySu [nganhDaoTao=" + nganhDaoTao + "]";
	}
}
