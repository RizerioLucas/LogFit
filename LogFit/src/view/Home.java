package view;

import data.Usuario;

public class Home extends javax.swing.JFrame {

    public Home(Usuario usuario) {
        initComponents();
    }

    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogFit");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));
        getContentPane().add(lblLogo);
        lblLogo.setBounds(-40, 0, 280, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tabela.png")));
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 220, 360, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png")));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 500, 40, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMC.png")));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 0, 420, 230);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisa.png")));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 590, 50, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png")));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 590, 50, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frequencia.png")));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, -40, 570, 290);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafico.png")));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 590, 360);

        btnVoltar.setText("jButton1");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(440, 590, 30, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpeg")));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 970, 640);

        setSize(new java.awt.Dimension(982, 646));
        setLocationRelativeTo(null);
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnVoltar) {
            new Login().setVisible(true);
            dispose();
        }
    }

    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogo;
}
