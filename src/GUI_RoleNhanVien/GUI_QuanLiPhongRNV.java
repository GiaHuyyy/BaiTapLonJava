package GUI_RoleNhanVien;

import java.awt.EventQueue;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import GUI_RoleQuanLy.GUI_KhachHang;
import connectDB.Database;
import dao.KhachHang_DAO;
import dao.Phong_DAO;
import entity.KhachHang;
import entity.Phong;

import java.awt.SystemColor;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;

public class GUI_QuanLiPhongRNV extends JFrame implements ActionListener {

	private JPanel contentPane;

	private JTextField txtMaNV, txtTenNV, txtEmailNV, txtSDTNV, txtCMND, txtDiaChiNV;
	private JButton btnLogout, btnQLKH, btnQLDV, btnTCHD, btnTimKiem, btnPhong_1, btnPhong_2, btnPhong_3, btnPhong_4,
			btnPhong_5, btnPhong_6, btnPhong_7, btnPhong_8, btnPhong_9, btnPhong_10, btnPhong_11, btnPhong_12,
			btnPhong_13, btnPhong_14, btnPhong_15, btnPhong_16, btnPhong_17, btnPhong_18;
	private JRadioButton rdbtnNam, rdbtnNu;
	private JComboBox comboBoxMaNV, comboBoxMaPhong;
	private JTable table;
	private DefaultTableModel model;
	public JTextField txtTongSoPhong, txtTim, txtDay;
	private JTextField txtTimPhong;
	public static GUI_ChiTietPhong ct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_QuanLiPhongRNV frame = new GUI_QuanLiPhongRNV();
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
	public GUI_QuanLiPhongRNV() {
		setTitle("Quản Lí Khách Sạn");
		setBackground(new Color(244, 247, 254));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1400, 690);
		setLocationRelativeTo(null);
		setSize(new Dimension(1522, 688));
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 247, 254));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(0, 0, 247, 813);
		leftPanel.setBackground(new Color(25, 118, 211));
		contentPane.add(leftPanel);
		leftPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("QUẢN LÝ KHÁCH SẠN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(-10, 20, 275, 40);
		leftPanel.add(lblNewLabel);

		JLabel avt = new JLabel("");
		avt.setBounds(90, 80, 64, 64);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/icon/admin_avt_64.png"));
		avt.setIcon(img);
		leftPanel.add(avt);

		btnQLKH = new JButton("Quản Lý Khách Hàng");
		btnQLKH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_KhachHangRNV().setVisible(true);
				dispose();
			}
		});
		btnQLKH.setForeground(Color.BLACK);
		btnQLKH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnQLKH.setBounds(20, 220, 200, 30);

		btnQLDV = new JButton("Quản Lý Dịch Vụ");
		btnQLDV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new GUI_QuanLiDichVu().setVisible(true);
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnQLDV.setForeground(Color.BLACK);
		btnQLDV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnQLDV.setBounds(20, 270, 200, 30);

		btnTCHD = new JButton("Tra Cứu Hóa Đơn");
		btnTCHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_DSHoaDonRoleNV().setVisible(true);
				dispose();
			}
		});
		btnTCHD.setForeground(Color.BLACK);
		btnTCHD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTCHD.setBounds(20, 320, 200, 30);

		btnLogout = new JButton("Đăng Xuất");
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogout.setBounds(20, 370, 200, 30);

		btnLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				System.exit(0);
			}
		});
		leftPanel.add(btnLogout);
		leftPanel.add(btnQLKH);
		leftPanel.add(btnQLDV);
		leftPanel.add(btnTCHD);

		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(null);
		pnCenter.setBackground(new Color(33, 80, 123));
		pnCenter.setBounds(246, 0, 1280, 474);
		contentPane.add(pnCenter);

		JPanel pn_Container_Phong_status = new JPanel();
		pn_Container_Phong_status.setLayout(null);
		pn_Container_Phong_status
				.setBorder(new CompoundBorder(null, new LineBorder(new Color(255, 255, 255), 20, true)));
		pn_Container_Phong_status.setBackground(new Color(28, 112, 172));
		pn_Container_Phong_status.setBounds(-13, 10, 1260, 446);
		pnCenter.add(pn_Container_Phong_status);

		JPanel pn_Container_Phong_insideContainer = new JPanel();
		pn_Container_Phong_insideContainer.setLayout(null);
		pn_Container_Phong_insideContainer.setBackground(new Color(33, 80, 123));
		pn_Container_Phong_insideContainer.setBounds(34, 34, 1186, 375);
		pn_Container_Phong_status.add(pn_Container_Phong_insideContainer);

		btnPhong_1 = new JButton("1");
		btnPhong_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_1.setBackground(new Color(2, 255, 64));
		btnPhong_1.setBounds(34, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_1);

		btnPhong_2 = new JButton("2");
		btnPhong_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_2.setBackground(Color.LIGHT_GRAY);
		btnPhong_2.setBounds(135, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_2);

		btnPhong_3 = new JButton("3");
		btnPhong_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_3.setBackground(new Color(255, 0, 0));
		btnPhong_3.setBounds(237, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_3);

		btnPhong_4 = new JButton("4");
		btnPhong_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_4.setBackground(Color.LIGHT_GRAY);
		btnPhong_4.setBounds(341, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_4);

		btnPhong_5 = new JButton("5");
		btnPhong_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_5.setBackground(new Color(2, 255, 64));
		btnPhong_5.setBounds(443, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_5);

		btnPhong_6 = new JButton("6");
		btnPhong_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_6.setBackground(Color.LIGHT_GRAY);
		btnPhong_6.setBounds(551, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_6);

		btnPhong_7 = new JButton("7");
		btnPhong_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_7.setBackground(Color.LIGHT_GRAY);
		btnPhong_7.setBounds(655, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_7);

		btnPhong_8 = new JButton("8");
		btnPhong_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_8.setBackground(Color.LIGHT_GRAY);
		btnPhong_8.setBounds(758, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_8);

		btnPhong_9 = new JButton("9");
		btnPhong_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_9.setBackground(new Color(2, 255, 64));
		btnPhong_9.setBounds(861, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_9);

		btnPhong_10 = new JButton("10");
		btnPhong_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_10.setBackground(new Color(2, 255, 64));
		btnPhong_10.setBounds(969, 39, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_10);

		btnPhong_11 = new JButton("11");
		btnPhong_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_11.setBackground(Color.LIGHT_GRAY);
		btnPhong_11.setBounds(34, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_11);

		btnPhong_12 = new JButton("12");
		btnPhong_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_12.setBackground(new Color(128, 255, 255));
		btnPhong_12.setBounds(135, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_12);

		btnPhong_13 = new JButton("13");
		btnPhong_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_13.setBackground(new Color(2, 255, 64));
		btnPhong_13.setBounds(237, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_13);

		btnPhong_14 = new JButton("14");
		btnPhong_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_14.setBackground(new Color(128, 255, 255));
		btnPhong_14.setBounds(341, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_14);

		btnPhong_15 = new JButton("15");
		btnPhong_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_15.setBackground(Color.LIGHT_GRAY);
		btnPhong_15.setBounds(443, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_15);

		btnPhong_16 = new JButton("16");
		btnPhong_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_16.setBackground(new Color(2, 255, 64));
		btnPhong_16.setBounds(551, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_16);

		btnPhong_17 = new JButton("17");
		btnPhong_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_17.setBackground(Color.LIGHT_GRAY);
		btnPhong_17.setBounds(655, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_17);

		btnPhong_18 = new JButton("18");
		btnPhong_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPhong_18.setBackground(new Color(255, 0, 0));
		btnPhong_18.setBounds(758, 140, 80, 80);
		pn_Container_Phong_insideContainer.add(btnPhong_18);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(33, 80, 123));
		panel_1.setBounds(246, 470, 1262, 330);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 0, 1252, 320);
		panel_1.add(panel_1_1);

		JPanel pn_btn_DangSuDung = new JPanel();
		pn_btn_DangSuDung.setLayout(null);
		pn_btn_DangSuDung.setBackground(new Color(2, 255, 64));
		pn_btn_DangSuDung.setBounds(680, 97, 50, 50);
		panel_1_1.add(pn_btn_DangSuDung);

		JPanel pn_btn_PhongTrong = new JPanel();
		pn_btn_PhongTrong.setLayout(null);
		pn_btn_PhongTrong.setBorder(new CompoundBorder(new LineBorder(new Color(217, 217, 217), 20, true), null));
		pn_btn_PhongTrong.setBackground(new Color(217, 217, 217));
		pn_btn_PhongTrong.setBounds(133, 97, 50, 50);
		panel_1_1.add(pn_btn_PhongTrong);

		JLabel lbl_Phong_Status_Unable_1 = new JLabel("Đang sử dụng");
		lbl_Phong_Status_Unable_1.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_Phong_Status_Unable_1.setBounds(770, 107, 151, 33);
		panel_1_1.add(lbl_Phong_Status_Unable_1);

		JPanel pn_btn_DonDep = new JPanel();
		pn_btn_DonDep.setLayout(null);
		pn_btn_DonDep.setBackground(new Color(128, 255, 255));
		pn_btn_DonDep.setBounds(448, 97, 50, 50);
		panel_1_1.add(pn_btn_DonDep);

		JPanel pn_btn_BaoTri = new JPanel();
		pn_btn_BaoTri.setLayout(null);
		pn_btn_BaoTri.setBackground(Color.RED);
		pn_btn_BaoTri.setBounds(992, 97, 50, 50);
		panel_1_1.add(pn_btn_BaoTri);

		JLabel lbl_Phong_Status_Unable_1_1 = new JLabel("Phòng trống");
		lbl_Phong_Status_Unable_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_Phong_Status_Unable_1_1.setBounds(226, 109, 151, 33);
		panel_1_1.add(lbl_Phong_Status_Unable_1_1);

		JLabel lbl_Phong_Status_Unable_1_1_1 = new JLabel("Dọn dẹp");
		lbl_Phong_Status_Unable_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_Phong_Status_Unable_1_1_1.setBounds(527, 109, 87, 33);
		panel_1_1.add(lbl_Phong_Status_Unable_1_1_1);

		JLabel lbl_Phong_Status_Unable_1_1_1_1 = new JLabel("Bảo trì");
		lbl_Phong_Status_Unable_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_Phong_Status_Unable_1_1_1_1.setBounds(1425, 105, 87, 33);
		panel_1_1.add(lbl_Phong_Status_Unable_1_1_1_1);

		comboBoxMaPhong = new JComboBox();
		comboBoxMaPhong.setBounds(209, 12, 238, 26);
		panel_1_1.add(comboBoxMaPhong);
		comboBoxMaPhong.addItem("Số Phòng");
		comboBoxMaPhong.addItem("Loại Phòng");

		txtTimPhong = new JTextField();
		txtTimPhong.setColumns(10);
		txtTimPhong.setBounds(483, 13, 316, 24);
		panel_1_1.add(txtTimPhong);

		btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setForeground(new Color(0, 127, 255));
		btnTimKiem.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTimKiem.setBackground(Color.WHITE);
		btnTimKiem.setBounds(825, 12, 126, 26);
		panel_1_1.add(btnTimKiem);

		JLabel lbl_Phong_Status_Unable_1_1_2 = new JLabel("Bảo Trì");
		lbl_Phong_Status_Unable_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_Phong_Status_Unable_1_1_2.setBounds(1052, 107, 151, 33);
		panel_1_1.add(lbl_Phong_Status_Unable_1_1_2);

		/*
		 * ==== EVENT ====
		 */
		/*
		 * Sự Kiện Nhấn Xem Thông Tin Phòng
		 */
		ActionListener buttonActionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				String buttonText = ((JButton) e.getSource()).getText();
				ct = new GUI_ChiTietPhong();
				ct.txtSoPhong.setText(buttonText);
				Phong_DAO ds = new Phong_DAO();
				String maPhong = buttonText;
				int idPhong = Integer.parseInt(maPhong);
				List<Phong> list = ds.getPhongTheoMaPhong(idPhong);
				for (Phong p : list) {
					ct.txtLoaiPhong.setText(p.getLoaiPhong());
					ct.txtTrangThaiPhong.setText(p.getTrangThai());
//					BigDecimal gia = new BigDecimal(p.getGiaPhong().toString());
					ct.txtGiaPhong.setText(p.getGiaPhong().toString());
				}
				ct.setVisible(true);
			}
		};

		btnPhong_1.addActionListener(buttonActionListener);
		btnPhong_2.addActionListener(buttonActionListener);
		btnPhong_3.addActionListener(buttonActionListener);
		btnPhong_4.addActionListener(buttonActionListener);
		btnPhong_5.addActionListener(buttonActionListener);
		btnPhong_6.addActionListener(buttonActionListener);
		btnPhong_7.addActionListener(buttonActionListener);
		btnPhong_8.addActionListener(buttonActionListener);
		btnPhong_9.addActionListener(buttonActionListener);
		btnPhong_10.addActionListener(buttonActionListener);
		btnPhong_11.addActionListener(buttonActionListener);
		btnPhong_12.addActionListener(buttonActionListener);
		btnPhong_13.addActionListener(buttonActionListener);
		btnPhong_14.addActionListener(buttonActionListener);
		btnPhong_15.addActionListener(buttonActionListener);
		btnPhong_16.addActionListener(buttonActionListener);
		btnPhong_17.addActionListener(buttonActionListener);
		btnPhong_18.addActionListener(buttonActionListener);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
