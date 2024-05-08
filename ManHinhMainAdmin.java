/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UITParking.GUI.Admin;

import UITParking.GUI.HomepageAdmin;
import static UITParking.GUI.HomepageAdmin.kindSelectedPublic;
import UITParking.GUI.Admin.DanhMucBean;
import UITParking.GUI.Admin.ChuyenManHinhController;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import java.awt.Color;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author ADMIN
 */
public class ManHinhMainAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public ManHinhMainAdmin() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        setIconimage();
        jpnMenuSau.setVisible(false);
        jpnMenu.setVisible(false);
        controllerFirst();
    }

    public void controllerFirst() throws Exception {
        System.out.println(kindSelectedPublic);
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        switch (kindSelectedPublic) {
            case "QLKH": {
                menuTruocRender();
                controller.setView(jpnQLKH, jlbQLKH);
            }
            break;
            
            case "QLNV": {
                menuTruocRender();
                controller.setView(jpnQLNV, jlbQLNV);
            }
            
            break;
            case "QLV": {
                menuTruocRender();
                controller.setView(jpnQLV, jlbQLV);
            }
            break;

            case "QLX": {
                menuTruocRender();
                controller.setView(jpnQLX, jlbQLX);
            }
            break;

            case "QLKVL": {
                menuTruocRender();
                controller.setView(jpnQLKVL, jlbQLKVL);
            }
            break;

            case "QLHD": {
                menuTruocRender();
                controller.setView(jpnQLHD, jlbQLHD);
            }
            break;

            case "BCTK": {
                menuSauRender();
                controller.setView(jpnBCTK, jlbBCTK);
            }
            break;
            case "QLXRV": {
                menuSauRender();
                controller.setView(jpnQLXRV, jlbQLXRV);
            }
            break;

            default: {
                menuTruocRender();
                controller.setView(jpnQLKH, jlbQLKH);
            }
            break;
        }
        ArrayList<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("QLKH", jpnQLKH, jlbQLKH));
        listItem.add(new DanhMucBean("QLNV", jpnQLNV, jlbQLNV));
        listItem.add(new DanhMucBean("QLX", jpnQLX, jlbQLX));
        listItem.add(new DanhMucBean("QLKVL", jpnQLKVL, jlbQLKVL));
        listItem.add(new DanhMucBean("QLHD", jpnQLHD, jlbQLHD));
        listItem.add(new DanhMucBean("QLV", jpnQLV, jlbQLV));
        listItem.add(new DanhMucBean("QLXRV", jpnQLXRV, jlbQLXRV));
        listItem.add(new DanhMucBean("BCTK", jpnBCTK, jlbBCTK));

        controller.setEvent(listItem);
    }

    public void menuTruocRender() {
        jpnMenuSau.setVisible(false);
        jpnMenu.setVisible(true);
    }

    public void menuSauRender() {
        jpnMenuSau.setVisible(true);
        jpnMenu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnQLV = new UITParking.GUI.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jlbQLV = new javax.swing.JLabel();
        jpnQLHD = new UITParking.GUI.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jlbQLHD = new javax.swing.JLabel();
        jpnQLKH = new UITParking.GUI.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jlbQLKH = new javax.swing.JLabel();
        jpnQLX = new UITParking.GUI.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        jlbQLX = new javax.swing.JLabel();
        jpnQLKVL = new UITParking.GUI.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jlbQLKVL = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jpnQLNV = new UITParking.GUI.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jlbQLNV = new javax.swing.JLabel();
        btnSau = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();
        jpnMenuSau = new javax.swing.JPanel();
        jpnQLXRV = new UITParking.GUI.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jlbQLXRV = new javax.swing.JLabel();
        jpnBCTK = new UITParking.GUI.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jlbBCTK = new javax.swing.JLabel();
        btnBackSau = new javax.swing.JButton();
        btnTruoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UIT Parking");

        jpnRoot.setPreferredSize(new java.awt.Dimension(1200, 660));
        jpnRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnMenu.setBackground(new java.awt.Color(159, 180, 255));
        jpnMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpnQLV.setBackground(new java.awt.Color(255, 255, 255));
        jpnQLV.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnQLV.setRoundBottomLeft(25);
        jpnQLV.setRoundBottomRight(25);
        jpnQLV.setRoundTopLeft(25);
        jpnQLV.setRoundTopRight(25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/income.png"))); // NOI18N

        jlbQLV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQLV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLV.setText("Tra cứu vé");

        javax.swing.GroupLayout jpnQLVLayout = new javax.swing.GroupLayout(jpnQLV);
        jpnQLV.setLayout(jpnQLVLayout);
        jpnQLVLayout.setHorizontalGroup(
            jpnQLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbQLV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnQLVLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jpnQLVLayout.setVerticalGroup(
            jpnQLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLVLayout.createSequentialGroup()
                .addComponent(jlbQLV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnQLHD.setBackground(new java.awt.Color(255, 255, 255));
        jpnQLHD.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnQLHD.setRoundBottomLeft(25);
        jpnQLHD.setRoundBottomRight(25);
        jpnQLHD.setRoundTopLeft(25);
        jpnQLHD.setRoundTopRight(25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/billicon.png"))); // NOI18N

        jlbQLHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQLHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLHD.setText("Tra cứu hóa đơn");

        javax.swing.GroupLayout jpnQLHDLayout = new javax.swing.GroupLayout(jpnQLHD);
        jpnQLHD.setLayout(jpnQLHDLayout);
        jpnQLHDLayout.setHorizontalGroup(
            jpnQLHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLHDLayout.createSequentialGroup()
                .addComponent(jlbQLHD, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpnQLHDLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jpnQLHDLayout.setVerticalGroup(
            jpnQLHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLHDLayout.createSequentialGroup()
                .addComponent(jlbQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jpnQLKH.setBackground(new java.awt.Color(255, 255, 255));
        jpnQLKH.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnQLKH.setRoundBottomLeft(25);
        jpnQLKH.setRoundBottomRight(25);
        jpnQLKH.setRoundTopLeft(25);
        jpnQLKH.setRoundTopRight(25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer-feedback.png"))); // NOI18N

        jlbQLKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQLKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLKH.setText("Quản lý khách hàng");

        javax.swing.GroupLayout jpnQLKHLayout = new javax.swing.GroupLayout(jpnQLKH);
        jpnQLKH.setLayout(jpnQLKHLayout);
        jpnQLKHLayout.setHorizontalGroup(
            jpnQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbQLKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQLKHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(52, 52, 52))
        );
        jpnQLKHLayout.setVerticalGroup(
            jpnQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKHLayout.createSequentialGroup()
                .addComponent(jlbQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnQLX.setBackground(new java.awt.Color(255, 255, 255));
        jpnQLX.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnQLX.setRoundBottomLeft(25);
        jpnQLX.setRoundBottomRight(25);
        jpnQLX.setRoundTopLeft(25);
        jpnQLX.setRoundTopRight(25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/parkingicon.png"))); // NOI18N

        jlbQLX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQLX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLX.setText("Quản lý xe");

        javax.swing.GroupLayout jpnQLXLayout = new javax.swing.GroupLayout(jpnQLX);
        jpnQLX.setLayout(jpnQLXLayout);
        jpnQLXLayout.setHorizontalGroup(
            jpnQLXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbQLX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(jpnQLXLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQLXLayout.setVerticalGroup(
            jpnQLXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLXLayout.createSequentialGroup()
                .addComponent(jlbQLX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnQLKVL.setBackground(new java.awt.Color(255, 255, 255));
        jpnQLKVL.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnQLKVL.setRoundBottomLeft(25);
        jpnQLKVL.setRoundBottomRight(25);
        jpnQLKVL.setRoundTopLeft(25);
        jpnQLKVL.setRoundTopRight(25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/segment.png"))); // NOI18N

        jlbQLKVL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQLKVL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLKVL.setText("Quản lý khách vãng lai");

        javax.swing.GroupLayout jpnQLKVLLayout = new javax.swing.GroupLayout(jpnQLKVL);
        jpnQLKVL.setLayout(jpnQLKVLLayout);
        jpnQLKVLLayout.setHorizontalGroup(
            jpnQLKVLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKVLLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jlbQLKVL, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jpnQLKVLLayout.setVerticalGroup(
            jpnQLKVLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKVLLayout.createSequentialGroup()
                .addComponent(jlbQLKVL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Quay lại");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jpnQLNV.setBackground(new java.awt.Color(255, 255, 255));
        jpnQLNV.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnQLNV.setRoundBottomLeft(25);
        jpnQLNV.setRoundBottomRight(25);
        jpnQLNV.setRoundTopLeft(25);
        jpnQLNV.setRoundTopRight(25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/staff.png"))); // NOI18N

        jlbQLNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQLNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLNV.setText("Quản lý nhân viên");

        javax.swing.GroupLayout jpnQLNVLayout = new javax.swing.GroupLayout(jpnQLNV);
        jpnQLNV.setLayout(jpnQLNVLayout);
        jpnQLNVLayout.setHorizontalGroup(
            jpnQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(jpnQLNVLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQLNVLayout.setVerticalGroup(
            jpnQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLNVLayout.createSequentialGroup()
                .addComponent(jlbQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSau.setBackground(new java.awt.Color(159, 180, 255));
        btnSau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnSau.setBorderPainted(false);
        btnSau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSauMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jpnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jpnQLX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jpnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jpnQLKVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jpnQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jpnQLV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSau, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(334, 334, 334))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnQLKH, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(btnSau, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnQLKVL, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jpnQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jpnQLX, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jpnQLHD, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jpnQLV, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jpnRoot.add(jpnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 130));

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnView.setPreferredSize(new java.awt.Dimension(1194, 530));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1196, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        jpnRoot.add(jpnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1200, 530));

        jpnMenuSau.setBackground(new java.awt.Color(159, 180, 255));
        jpnMenuSau.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpnQLXRV.setBackground(new java.awt.Color(255, 255, 255));
        jpnQLXRV.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnQLXRV.setRoundBottomLeft(25);
        jpnQLXRV.setRoundBottomRight(25);
        jpnQLXRV.setRoundTopLeft(25);
        jpnQLXRV.setRoundTopRight(25);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N

        jlbQLXRV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQLXRV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLXRV.setText("Quản lý xe ra vào");

        javax.swing.GroupLayout jpnQLXRVLayout = new javax.swing.GroupLayout(jpnQLXRV);
        jpnQLXRV.setLayout(jpnQLXRVLayout);
        jpnQLXRVLayout.setHorizontalGroup(
            jpnQLXRVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbQLXRV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQLXRVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(44, 44, 44))
        );
        jpnQLXRVLayout.setVerticalGroup(
            jpnQLXRVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLXRVLayout.createSequentialGroup()
                .addComponent(jlbQLXRV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnBCTK.setBackground(new java.awt.Color(255, 255, 255));
        jpnBCTK.setPreferredSize(new java.awt.Dimension(160, 100));
        jpnBCTK.setRoundBottomLeft(25);
        jpnBCTK.setRoundBottomRight(25);
        jpnBCTK.setRoundTopLeft(25);
        jpnBCTK.setRoundTopRight(25);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analysis.png"))); // NOI18N

        jlbBCTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbBCTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBCTK.setText("Báo cáo thống kê");

        javax.swing.GroupLayout jpnBCTKLayout = new javax.swing.GroupLayout(jpnBCTK);
        jpnBCTK.setLayout(jpnBCTKLayout);
        jpnBCTKLayout.setHorizontalGroup(
            jpnBCTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbBCTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(jpnBCTKLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBCTKLayout.setVerticalGroup(
            jpnBCTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBCTKLayout.createSequentialGroup()
                .addComponent(jlbBCTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBackSau.setBackground(new java.awt.Color(102, 102, 255));
        btnBackSau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackSau.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSau.setText("Quay lại");
        btnBackSau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackSauMouseClicked(evt);
            }
        });
        btnBackSau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSauActionPerformed(evt);
            }
        });

        btnTruoc.setBackground(new java.awt.Color(159, 180, 255));
        btnTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous.png"))); // NOI18N
        btnTruoc.setBorderPainted(false);
        btnTruoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTruocMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuSauLayout = new javax.swing.GroupLayout(jpnMenuSau);
        jpnMenuSau.setLayout(jpnMenuSauLayout);
        jpnMenuSauLayout.setHorizontalGroup(
            jpnMenuSauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuSauLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jpnQLXRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBCTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnMenuSauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackSau))
                .addContainerGap())
        );
        jpnMenuSauLayout.setVerticalGroup(
            jpnMenuSauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuSauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuSauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnMenuSauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpnBCTK, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(jpnQLXRV, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(jpnMenuSauLayout.createSequentialGroup()
                        .addComponent(btnBackSau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnRoot.add(jpnMenuSau, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        HomepageAdmin _homepageAdmin = null;
        try {
            _homepageAdmin = new HomepageAdmin();
        } catch (Exception ex) {
            Logger.getLogger(ManHinhMainAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        _homepageAdmin.show();
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackSauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackSauMouseClicked
        // TODO add your handling code here:
        HomepageAdmin _homepageAdmin = null;
        try {
            _homepageAdmin = new HomepageAdmin();
        } catch (Exception ex) {
            Logger.getLogger(ManHinhMainAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        _homepageAdmin.show();
        dispose();
    }//GEN-LAST:event_btnBackSauMouseClicked

    private void btnBackSauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackSauActionPerformed

    /**
     *
     * @param evt Xử lý event khi bấm vào thì sẽ chuyển sang JPanelMenuSau
     * setVisable(false) cho JpanelMenu và true cho JpanelMenuSau
     */
    private void btnSauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauMouseClicked
        // TODO add your handling code here:
        menuSauRender();
    }//GEN-LAST:event_btnSauMouseClicked

    /**
     *
     * @param evt Xử lý event khi bấm vào sẽ chuyển về JpanelMenu
     * setVisavle(true) cho JPanelMenu và false cho JPanelMenuSau
     */
    private void btnTruocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTruocMouseClicked
        // TODO add your handling code here:
        menuTruocRender();
    }//GEN-LAST:event_btnTruocMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManHinhMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManHinhMainAdmin().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ManHinhMainAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackSau;
    private javax.swing.JButton btnSau;
    private javax.swing.JButton btnTruoc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlbBCTK;
    private javax.swing.JLabel jlbQLHD;
    private javax.swing.JLabel jlbQLKH;
    private javax.swing.JLabel jlbQLKVL;
    private javax.swing.JLabel jlbQLNV;
    private javax.swing.JLabel jlbQLV;
    private javax.swing.JLabel jlbQLX;
    private javax.swing.JLabel jlbQLXRV;
    private UITParking.GUI.PanelRound jpnBCTK;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnMenuSau;
    private UITParking.GUI.PanelRound jpnQLHD;
    private UITParking.GUI.PanelRound jpnQLKH;
    private UITParking.GUI.PanelRound jpnQLKVL;
    private UITParking.GUI.PanelRound jpnQLNV;
    private UITParking.GUI.PanelRound jpnQLV;
    private UITParking.GUI.PanelRound jpnQLX;
    private UITParking.GUI.PanelRound jpnQLXRV;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables

    private void setIconimage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/parking.png")));

    }
}