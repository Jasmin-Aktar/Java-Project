
package TrainTicket;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class TrainsTickets extends javax.swing.JFrame {

    /**
     * Creates new form TrainsTickets
     */
    public TrainsTickets() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        STD = new javax.swing.JRadioButton();
        FirstClass = new javax.swing.JRadioButton();
        Economy = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Single = new javax.swing.JRadioButton();
        Return = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ChildYes = new javax.swing.JRadioButton();
        AdultYes = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        CB = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Class = new javax.swing.JTextField();
        TicketType = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        C = new javax.swing.JTextField();
        From = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        To = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Time = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        TicketNo = new javax.swing.JTextField();
        Route = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SubTotal = new javax.swing.JTextField();
        Tax = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(141, 119, 242), 6, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 96)); // NOI18N
        jLabel1.setText("Train Ticketing System Bd");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 229, 14), 6, true));

        STD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        STD.setText("Standard");

        FirstClass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FirstClass.setText("First Class");

        Economy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Economy.setText("Economy");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Class");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Ticket type");

        Single.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Single.setText("Single");

        Return.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Return.setText("Return");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Adult");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Child");

        ChildYes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ChildYes.setText("Yes");

        AdultYes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AdultYes.setText("Yes");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Destination");

        CB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rajshahi", "Dhaka", "Chittagong" }));
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstClass)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(STD)
                                .addComponent(Economy)))))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AdultYes)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(88, 88, 88)
                                    .addComponent(jLabel5)))
                            .addComponent(Single))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ChildYes)))
                    .addComponent(Return)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(STD)
                            .addComponent(Single))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChildYes)
                            .addComponent(AdultYes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Economy)
                        .addGap(18, 18, 18)
                        .addComponent(FirstClass))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Return)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 229, 14), 6, true));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Class");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Ticket Type");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Adult");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Child");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Price");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("To");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Date");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Time");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("From");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Route");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Ticket No.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Class, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(86, 86, 86))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(TicketType)
                            .addGap(23, 23, 23)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(TicketNo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jLabel15)
                            .addComponent(Price)
                            .addComponent(Route))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(552, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TicketType, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Class, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Route, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(jLabel19)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 229, 14), 6, true));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Sub Total");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Tax");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Total");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Total ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(Tax)
                            .addComponent(Total, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(btnReset)
                        .addGap(44, 44, 44)
                        .addComponent(btnExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(SubTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Tax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnReset)
                    .addComponent(btnExit))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       this.getContentPane().setBackground(Color.green);
       
    }//GEN-LAST:event_formWindowActivated

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      
       
       Tax.setText(null); 
       SubTotal.setText(null);
       Tax.setText(null);
       Total.setText(null);
       A.setText(null);
       C.setText(null);
       TicketType.setText(null);
       TicketNo.setText(null);
       From.setText(null);
       To.setText(null);
       Route.setText(null);
       Price.setText(null);
       Class.setText(null);
       Date.setText(null);
       Time.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//................. time............
        
        Calendar timer=Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
        Time.setText(tTime.format(timer.getTime()));
        
        //...................date........
        
        SimpleDateFormat tDate=new SimpleDateFormat("dd-MMM-yyyy");
        Date.setText(tDate.format(timer.getTime()));
        
        From.setText("Kushtia");
        To.setText((String)CB.getSelectedItem()+"  ");
        int num1;
        String q1="";
        num1=1325+(int)(Math.random()*4238);
        q1+=num1+1325;
        TicketNo.setText(q1);
        Route.setText("ANY");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        double tax=19.50;
        double MilesK8=25.78;
        double MilesK12=25.10;
        double MilesK20=45.23;
        double MilesK30=55.98;
        double totalCost,eco=8.85,fclass=5.60;
      
        //Adult and child to rajshahi
        
        if((STD.isSelected())&&(Single.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK8+totalCost);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8*2)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",(MilesK8+totalCost)*2);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
        
        //child......rajshahi
       else if((STD.isSelected())&&(Single.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK8+totalCost-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8*2)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",((MilesK8+totalCost)*2)-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       //...............DHAKA..............
  else if((STD.isSelected())&&(Single.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK12+totalCost);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12*2)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",(MilesK12+totalCost)*2);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
        
        //child......dhaka
       else if((STD.isSelected())&&(Single.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK12+totalCost-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12*2)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",((MilesK12+totalCost)*2)-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("NIL");
            C.setText("ONE");
             
        }      
 // .............. CHITTAGONG............
         else if((STD.isSelected())&&(Single.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*MilesK30)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK30+totalCost);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*MilesK30*2)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",(MilesK30+totalCost)*2);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
        
        //child......rajshahi
       else if((STD.isSelected())&&(Single.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*MilesK30)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK30+totalCost-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*MilesK30*2)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",((MilesK30+totalCost)*2)-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
        
        //............ECONOMY............
          if((STD.isSelected())&&(Single.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK8+totalCost);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8*2)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",(MilesK8+totalCost)*2);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
        
        //child......rajshahi
       else if((STD.isSelected())&&(Single.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK8+totalCost-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Rajshahi")){
            totalCost=(tax*MilesK8*2)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK8*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",((MilesK8+totalCost)*2)-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       //...............DHAKA..............
  else if((STD.isSelected())&&(Single.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK12+totalCost);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12*2)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",(MilesK12+totalCost)*2);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
        
        //child......dhaka
       else if((STD.isSelected())&&(Single.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK12+totalCost-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Dhaka")){
            totalCost=(tax*MilesK12*2)/100;
            String sTax=String.format("$%.2f",totalCost-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK12*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",((MilesK12+totalCost)*2)-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("NIL");
            C.setText("ONE");
             
        }      
 // .............. CHITTAGONG............
         else if((STD.isSelected())&&(Single.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*MilesK30)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK30+totalCost);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("ONE WAY");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
       else if((STD.isSelected())&&(Return.isSelected())&&(AdultYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*MilesK30*2)/100;
            String sTax=String.format("$%.2f",totalCost);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",(MilesK30+totalCost)*2);
            Total.setText(total);
            Price.setText(total);
            Class.setText("STANDARD");
            TicketType.setText("RETURN");
            A.setText("ONE");
            C.setText("NIL");
            
            
        }
        
        //child......rajshahi
       else if((Economy.isSelected())&&(Single.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*(MilesK30+eco))/100;
            String sTax=String.format("$%.2f",totalCost+eco-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",MilesK30+totalCost+eco-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("Economy");
            TicketType.setText("ONE WAY");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
       else if((Economy.isSelected())&&(Return.isSelected())&&(ChildYes.isSelected())&&CB.getSelectedItem().equals("Chittagong")){
            totalCost=(tax*MilesK30*2)/100;
            String sTax=String.format("$%.2f",totalCost+eco-18);
            Tax.setText(sTax);
            String subTotal=String.format("$%.2f",MilesK30*2);
            SubTotal.setText(subTotal);
            String total=String.format("$%.2f",((MilesK30+totalCost+eco)*2)-18);
            Total.setText(total);
            Price.setText(total);
            Class.setText("Economy");
            TicketType.setText("RETURN");
            A.setText("NIL");
            C.setText("ONE");
            
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainsTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JRadioButton AdultYes;
    private javax.swing.JTextField C;
    private javax.swing.JComboBox CB;
    private javax.swing.JRadioButton ChildYes;
    private javax.swing.JTextField Class;
    private javax.swing.JTextField Date;
    private javax.swing.JRadioButton Economy;
    private javax.swing.JRadioButton FirstClass;
    private javax.swing.JTextField From;
    private javax.swing.JTextField Price;
    private javax.swing.JRadioButton Return;
    private javax.swing.JTextField Route;
    private javax.swing.JRadioButton STD;
    private javax.swing.JRadioButton Single;
    private javax.swing.JTextField SubTotal;
    private javax.swing.JTextField Tax;
    private javax.swing.JTextField TicketNo;
    private javax.swing.JTextField TicketType;
    private javax.swing.JTextField Time;
    private javax.swing.JTextField To;
    private javax.swing.JTextField Total;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
