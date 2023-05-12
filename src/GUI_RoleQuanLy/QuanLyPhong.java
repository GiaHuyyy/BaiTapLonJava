package GUI_RoleQuanLy;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import GUI_RoleQuanLy.GUI_DSHoaDonRoleAdmin;
import GUI_RoleQuanLy.GUI_KhachHang;
import GUI_RoleQuanLy.GUI_QuanLiSanPHam;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;

public class QuanLyPhong extends JFrame {

	private JPanel contentPane;
	private JButton btnPhong_1_4;
	private JTextField txtfChiTiet_controller;
	private JTextField txtfTenPhong_controller;
	private JTextField txtfMaPhong_controller;
	private JTextField txtfSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyPhong frame = new QuanLyPhong();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLyPhong() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnLeftSide = new JPanel();
		pnLeftSide.setBackground(new Color(28, 112, 172));
		pnLeftSide.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		pnLeftSide.setBounds(0, 0, 284, 683);
		contentPane.add(pnLeftSide);
		pnLeftSide.setLayout(null);
		
		JButton btnQLSP = new JButton("Quản Lý Sản Phẩm");
		btnQLSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_QuanLiSanPHam().setVisible(true);
				dispose();
			}
		});
		btnQLSP.setFont(new Font("Arial", Font.BOLD, 15));
		btnQLSP.setBackground(new Color(255, 255, 255));
		btnQLSP.setBounds(30, 353, 208, 52);
		pnLeftSide.add(btnQLSP);
		
		JButton btnQLNV = new JButton("Quản Lý Nhân Viên");
		btnQLNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQLNV.setFont(new Font("Arial", Font.BOLD, 15));
		btnQLNV.setBackground(new Color(255, 255, 255));
		btnQLNV.setBounds(30, 229, 208, 52);
		pnLeftSide.add(btnQLNV);
		
		JButton btnTCHD = new JButton("Tra Cứu Hóa Đơn");
		btnTCHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_DSHoaDonRoleAdmin().setVisible(true);
				dispose();
			}
		});
		btnTCHD.setFont(new Font("Arial", Font.BOLD, 15));
		btnTCHD.setBackground(new Color(255, 255, 255));
		btnTCHD.setBounds(30, 415, 208, 52);
		pnLeftSide.add(btnTCHD);
		
		JButton btnDangXuat = new JButton("Đăng Xuất");
		btnDangXuat.setForeground(new Color(255, 255, 255));
		btnDangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDangXuat.setFont(new Font("Arial", Font.BOLD, 18));
		btnDangXuat.setBackground(new Color(227, 52, 15));
		btnDangXuat.setBounds(30, 597, 208, 52);
		pnLeftSide.add(btnDangXuat);
		
		JButton btnQLKH = new JButton("Quản Lý Khách Hàng");
		btnQLKH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_KhachHang().setVisible(true);
				dispose();
			}
		});
		btnQLKH.setFont(new Font("Arial", Font.BOLD, 15));
		btnQLKH.setBackground(new Color(255, 255, 255));
		btnQLKH.setBounds(30, 167, 208, 52);
		pnLeftSide.add(btnQLKH);
		
		JLabel lblNewLabel = new JLabel("Quản Lý Khách Sạn");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(30, 21, 208, 67);
		pnLeftSide.add(lblNewLabel);
		
		JButton btnQLP = new JButton("Quản Lý Phòng");
		btnQLP.setFont(new Font("Arial", Font.BOLD, 15));
		btnQLP.setBackground(new Color(255, 255, 255));
		btnQLP.setBounds(30, 291, 208, 52);
		pnLeftSide.add(btnQLP);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(30, 477, 208, 52);
		pnLeftSide.add(btnBack);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(new Color(33, 80, 123));
		pnCenter.setBounds(283, 0, 983, 683);
		contentPane.add(pnCenter);
		pnCenter.setLayout(null);
		
		JPanel pn_Container_Phong_status = new JPanel();
		pn_Container_Phong_status.setBackground(new Color(28, 112, 172));
		pn_Container_Phong_status.setBorder(new CompoundBorder(null, new LineBorder(new Color(255, 255, 255), 20, true)));
		pn_Container_Phong_status.setBounds(10, 10, 963, 459);
		pnCenter.add(pn_Container_Phong_status);
		pn_Container_Phong_status.setLayout(null);
		
		JPanel pn_Container_Phong_insideContainer = new JPanel();
		pn_Container_Phong_insideContainer.setBackground(new Color(33, 80, 123));
		pn_Container_Phong_insideContainer.setBounds(43, 45, 880, 369);
		pn_Container_Phong_status.add(pn_Container_Phong_insideContainer);
		pn_Container_Phong_insideContainer.setLayout(null);
		
		JButton btnPhong_1_1 = new JButton("1.1");
		btnPhong_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_1_1.setBackground(new Color(192, 192, 192));
		btnPhong_1_1.setBounds(34, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_1_1);
		
		JButton btnPhong_1_2 = new JButton("1.2");
		btnPhong_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_1_2.setBackground(new Color(192, 192, 192));
		btnPhong_1_2.setBounds(135, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_1_2);
		
		JButton btnPhong_2_2 = new JButton("2.2");
		btnPhong_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_2_2.setBackground(new Color(192, 192, 192));
		btnPhong_2_2.setBounds(135, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_2_2);
		
		JButton btnPhong_2_1 = new JButton("2.1");
		btnPhong_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_2_1.setBackground(new Color(192, 192, 192));
		btnPhong_2_1.setBounds(34, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_2_1);
		
		JButton btnPhong_1_3 = new JButton("1.3");
		btnPhong_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_1_3.setBackground(new Color(192, 192, 192));
		btnPhong_1_3.setBounds(237, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_1_3);
		
		JButton btnPhong_2_3 = new JButton("2.3");
		btnPhong_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_2_3.setBackground(new Color(192, 192, 192));
		btnPhong_2_3.setBounds(237, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_2_3);
		
		btnPhong_1_4 = new JButton("1.4");
		btnPhong_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_1_4.setBackground(new Color(192, 192, 192));
		btnPhong_1_4.setBounds(341, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_1_4);
		
		JButton btnPhong_1_5 = new JButton("1.5");
		btnPhong_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_1_5.setBackground(new Color(192, 192, 192));
		btnPhong_1_5.setBounds(443, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_1_5);
		
		JButton btnPhong_1_6 = new JButton("1.6");
		btnPhong_1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_1_6.setBackground(new Color(192, 192, 192));
		btnPhong_1_6.setBounds(551, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_1_6);
		
		JPanel pn_members = new JPanel();
		pn_members.setBounds(10, 641, 963, 29);
		pnCenter.add(pn_members);
		
		JPanel pn_Status_Phong_inSide_1 = new JPanel();
		pn_Status_Phong_inSide_1.setLayout(null);
		pn_Status_Phong_inSide_1.setBounds(10, 479, 484, 152);
		pnCenter.add(pn_Status_Phong_inSide_1);
		
		JLabel lblMaPhong = new JLabel("Mã Phòng");
		lblMaPhong.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaPhong.setBounds(75, 11, 112, 13);
		pn_Status_Phong_inSide_1.add(lblMaPhong);
		
		JLabel lblTenPhong = new JLabel("Tên Phòng");
		lblTenPhong.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTenPhong.setBounds(75, 34, 112, 13);
		pn_Status_Phong_inSide_1.add(lblTenPhong);
		
		JLabel lblLoaiPhong = new JLabel("Loại Phòng");
		lblLoaiPhong.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoaiPhong.setBounds(75, 57, 112, 18);
		pn_Status_Phong_inSide_1.add(lblLoaiPhong);
		
		JLabel lblChiTit = new JLabel("Chi Tiết");
		lblChiTit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChiTit.setBounds(75, 85, 67, 20);
		pn_Status_Phong_inSide_1.add(lblChiTit);
		
		txtfChiTiet_controller = new JTextField();
		txtfChiTiet_controller.setColumns(10);
		txtfChiTiet_controller.setBounds(161, 85, 252, 19);
		pn_Status_Phong_inSide_1.add(txtfChiTiet_controller);
		
		JLabel lblTrngThi = new JLabel("Trạng Thái");
		lblTrngThi.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTrngThi.setBounds(250, 57, 85, 18);
		pn_Status_Phong_inSide_1.add(lblTrngThi);
		
		JComboBox comboboxTrangThai_controller = new JComboBox();
		comboboxTrangThai_controller.setBackground(new Color(192, 192, 192));
		comboboxTrangThai_controller.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboboxTrangThai_controller.setBounds(334, 58, 79, 21);
		pn_Status_Phong_inSide_1.add(comboboxTrangThai_controller);
		
		txtfTenPhong_controller = new JTextField();
		txtfTenPhong_controller.setColumns(10);
		txtfTenPhong_controller.setBounds(161, 34, 252, 19);
		pn_Status_Phong_inSide_1.add(txtfTenPhong_controller);
		
		txtfMaPhong_controller = new JTextField();
		txtfMaPhong_controller.setColumns(10);
		txtfMaPhong_controller.setBounds(161, 10, 252, 19);
		pn_Status_Phong_inSide_1.add(txtfMaPhong_controller);
		
		JButton btnThemPhong = new JButton("Thêm");
		btnThemPhong.setBounds(58, 115, 87, 23);
		pn_Status_Phong_inSide_1.add(btnThemPhong);
		btnThemPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThemPhong.setBackground(new Color(217, 217, 217));
		btnThemPhong.setFont(new Font("Arial", Font.BOLD, 18));
		
		JButton btnThemDichVu = new JButton("Xem ");
		btnThemDichVu.setBounds(154, 114, 85, 23);
		pn_Status_Phong_inSide_1.add(btnThemDichVu);
		btnThemDichVu.setFont(new Font("Arial", Font.BOLD, 20));
		btnThemDichVu.setBackground(new Color(217, 217, 217));
		
		JButton btnSuaPhong = new JButton("Sửa");
		btnSuaPhong.setBounds(250, 114, 85, 23);
		pn_Status_Phong_inSide_1.add(btnSuaPhong);
		btnSuaPhong.setFont(new Font("Arial", Font.BOLD, 20));
		btnSuaPhong.setBackground(new Color(217, 217, 217));
		
		JButton btnXoaPhong = new JButton("Xóa");
		btnXoaPhong.setBounds(345, 114, 85, 23);
		pn_Status_Phong_inSide_1.add(btnXoaPhong);
		btnXoaPhong.setForeground(new Color(255, 255, 255));
		btnXoaPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoaPhong.setFont(new Font("Arial", Font.BOLD, 20));
		btnXoaPhong.setBackground(new Color(227, 52, 15));
		
		JComboBox comboboxMaPhong_controller = new JComboBox();
		comboboxMaPhong_controller.setBackground(new Color(192, 192, 192));
		comboboxMaPhong_controller.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboboxMaPhong_controller.setBounds(161, 58, 79, 21);
		pn_Status_Phong_inSide_1.add(comboboxMaPhong_controller);
		
		JPanel pn_Status_Phong_inSide = new JPanel();
		pn_Status_Phong_inSide.setBounds(504, 479, 469, 152);
		pnCenter.add(pn_Status_Phong_inSide);
		pn_Status_Phong_inSide.setLayout(null);
		
		txtfSearch = new JTextField();
		txtfSearch.setColumns(10);
		txtfSearch.setBounds(124, 12, 218, 22);
		pn_Status_Phong_inSide.add(txtfSearch);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setForeground(new Color(0, 127, 255));
		btnTimKiem.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTimKiem.setBackground(Color.WHITE);
		btnTimKiem.setBounds(352, 10, 107, 24);
		pn_Status_Phong_inSide.add(btnTimKiem);
		
		JComboBox comboBoxSearch = new JComboBox();
		comboBoxSearch.setBackground(new Color(192, 192, 192));
		comboBoxSearch.setBounds(10, 13, 104, 21);
		comboBoxSearch.addItem("Tìm Theo Loại");
		pn_Status_Phong_inSide.add(comboBoxSearch);
		comboBoxSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lbl_Phong_Status_Disable = new JLabel("Phòng Trống");
		lbl_Phong_Status_Disable.setBounds(90, 107, 110, 31);
		pn_Status_Phong_inSide.add(lbl_Phong_Status_Disable);
		lbl_Phong_Status_Disable.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel lbl_Phong_Status_Unable = new JLabel("Đang Sử Dụng");
		lbl_Phong_Status_Unable.setBounds(90, 66, 110, 31);
		pn_Status_Phong_inSide.add(lbl_Phong_Status_Unable);
		lbl_Phong_Status_Unable.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel lbl_Phong_Status_DonDep = new JLabel("Đang Dọn Dẹp");
		lbl_Phong_Status_DonDep.setFont(new Font("Arial", Font.BOLD, 15));
		lbl_Phong_Status_DonDep.setBounds(315, 66, 110, 31);
		pn_Status_Phong_inSide.add(lbl_Phong_Status_DonDep);
		
		JLabel lbl_Phong_Status_BaoTri = new JLabel("Đang Bảo Trì");
		lbl_Phong_Status_BaoTri.setFont(new Font("Arial", Font.BOLD, 15));
		lbl_Phong_Status_BaoTri.setBounds(315, 107, 110, 31);
		pn_Status_Phong_inSide.add(lbl_Phong_Status_BaoTri);
		
		JButton btn_Phong_Status_DonDep = new JButton("");
		btn_Phong_Status_DonDep.setBackground(new Color(128, 255, 255));
		btn_Phong_Status_DonDep.setBounds(268, 66, 40, 31);
		pn_Status_Phong_inSide.add(btn_Phong_Status_DonDep);
		
		JButton btn_Phong_Status_BaoTri = new JButton("");
		btn_Phong_Status_BaoTri.setBackground(new Color(255, 0, 0));
		btn_Phong_Status_BaoTri.setBounds(268, 107, 40, 31);
		pn_Status_Phong_inSide.add(btn_Phong_Status_BaoTri);
		
		JButton btn_Phong_Status_Disable = new JButton("");
		btn_Phong_Status_Disable.setBackground(new Color(192, 192, 192));
		btn_Phong_Status_Disable.setBounds(40, 107, 40, 31);
		pn_Status_Phong_inSide.add(btn_Phong_Status_Disable);
		
		JButton btn_Phong_Status_Unable = new JButton("");
		btn_Phong_Status_Unable.setBackground(new Color(0, 255, 64));
		btn_Phong_Status_Unable.setBounds(40, 66, 40, 31);
		pn_Status_Phong_inSide.add(btn_Phong_Status_Unable);
	}
}

