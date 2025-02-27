/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.sun.tools.javac.Main;
import model.Soma;
import model.Divisao;
import model.Subtracao;
import model.Multiplicacao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JLabel;

/**
 *
 * @author Cdranka
 */
public class App extends javax.swing.JFrame {

    private double numero = 0;
    private double numero2 = 0;
    private double resultado = 0;
    private String operacao = "";
    private double memoria = 0;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private Divisao divisao;
    private Multiplicacao multiplicacao;
    private Soma soma;
    private Subtracao subtracao;

    /**
     * Creates new form app
     */
    public App() {
        initComponents();
        divisao = new Divisao();
        multiplicacao = new Multiplicacao();
        soma = new Soma();
        subtracao = new Subtracao();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jbCancela = new javax.swing.JButton();
        jbDivisao = new javax.swing.JButton();
        jbMultiplicacao = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jbSubtracao = new javax.swing.JButton();
        jbAdicao = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();
        jbVirgula = new javax.swing.JButton();
        jbIgual = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlOperacao = new javax.swing.JLabel();
        jlValorAnterior = new javax.swing.JLabel();
        jlMensagem = new javax.swing.JLabel();
        jbRaiz = new javax.swing.JButton();
        jbMC = new javax.swing.JButton();
        jbMR = new javax.swing.JButton();
        jbMMinus = new javax.swing.JButton();
        jbMPlus = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jbCancela.setBackground(new java.awt.Color(51, 51, 51));
        jbCancela.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbCancela.setForeground(new java.awt.Color(153, 0, 0));
        jbCancela.setText("C");
        jbCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelaActionPerformed(evt);
            }
        });

        jbDivisao.setBackground(new java.awt.Color(51, 51, 51));
        jbDivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDivisao.setText("÷");
        jbDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivisaoActionPerformed(evt);
            }
        });

        jbMultiplicacao.setBackground(new java.awt.Color(51, 51, 51));
        jbMultiplicacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbMultiplicacao.setText("x");
        jbMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicacaoActionPerformed(evt);
            }
        });

        jb9.setBackground(new java.awt.Color(102, 102, 102));
        jb9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(102, 102, 102));
        jb8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb7.setBackground(new java.awt.Color(102, 102, 102));
        jb7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(102, 102, 102));
        jb4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(102, 102, 102));
        jb5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setBackground(new java.awt.Color(102, 102, 102));
        jb6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jbSubtracao.setBackground(new java.awt.Color(51, 51, 51));
        jbSubtracao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSubtracao.setText("-");
        jbSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtracaoActionPerformed(evt);
            }
        });

        jbAdicao.setBackground(new java.awt.Color(153, 255, 204));
        jbAdicao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbAdicao.setForeground(new java.awt.Color(0, 0, 0));
        jbAdicao.setText("+");
        jbAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicaoActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(102, 102, 102));
        jb3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(102, 102, 102));
        jb2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb1.setBackground(new java.awt.Color(102, 102, 102));
        jb1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb10.setBackground(new java.awt.Color(102, 102, 102));
        jb10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jb10.setText("0");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });

        jbVirgula.setBackground(new java.awt.Color(102, 102, 102));
        jbVirgula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbVirgula.setText(".");
        jbVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVirgulaActionPerformed(evt);
            }
        });

        jbIgual.setBackground(new java.awt.Color(204, 204, 204));
        jbIgual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbIgual.setForeground(new java.awt.Color(51, 51, 51));
        jbIgual.setText("=");
        jbIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIgualActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlOperacao.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jlOperacao.setForeground(new java.awt.Color(204, 204, 204));
        jlOperacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlOperacao.setText(" ");

        jlValorAnterior.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlValorAnterior.setForeground(new java.awt.Color(153, 153, 153));
        jlValorAnterior.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlValorAnterior.setText(" ");

        jlMensagem.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlMensagem.setForeground(new java.awt.Color(204, 204, 204));
        jlMensagem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMensagem.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlValorAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jlOperacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jlMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlValorAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbRaiz.setBackground(new java.awt.Color(51, 51, 51));
        jbRaiz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbRaiz.setText("√");
        jbRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRaizActionPerformed(evt);
            }
        });

        jbMC.setBackground(new java.awt.Color(102, 102, 0));
        jbMC.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jbMC.setForeground(new java.awt.Color(204, 204, 204));
        jbMC.setText("MC");
        jbMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMCActionPerformed(evt);
            }
        });

        jbMR.setBackground(new java.awt.Color(102, 102, 0));
        jbMR.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jbMR.setForeground(new java.awt.Color(204, 204, 204));
        jbMR.setText("MR");
        jbMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMRActionPerformed(evt);
            }
        });

        jbMMinus.setBackground(new java.awt.Color(102, 102, 0));
        jbMMinus.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jbMMinus.setForeground(new java.awt.Color(204, 204, 204));
        jbMMinus.setText("M-");
        jbMMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMMinusActionPerformed(evt);
            }
        });

        jbMPlus.setBackground(new java.awt.Color(102, 102, 0));
        jbMPlus.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jbMPlus.setForeground(new java.awt.Color(204, 204, 204));
        jbMPlus.setText("M+");
        jbMPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMPlusActionPerformed(evt);
            }
        });

        jbDelete.setBackground(new java.awt.Color(51, 51, 51));
        jbDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbDelete.setText("←");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbMC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jbDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jbSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jbAdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jbMPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMC)
                    .addComponent(jbMR)
                    .addComponent(jbMMinus)
                    .addComponent(jbMPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        // Botão 07
        jlOperacao.setText(jlOperacao.getText() + "7");
    }//GEN-LAST:event_jb7ActionPerformed

    private void jbDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivisaoActionPerformed
        //DIVISÃO
        operacao = "÷";
        numero = Double.parseDouble(jlOperacao.getText());
        jlOperacao.setText("");
        updatePreviousDisplay(numero);
        jlValorAnterior.setText(jlValorAnterior.getText() + " ÷");
    }//GEN-LAST:event_jbDivisaoActionPerformed

    private void jbMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicacaoActionPerformed
        //MULTIPLICAÇÃO
        operacao = "x";
        numero = Double.parseDouble(jlOperacao.getText());
        jlOperacao.setText("");
        updatePreviousDisplay(numero);
        jlValorAnterior.setText(jlValorAnterior.getText() + " x");
    }//GEN-LAST:event_jbMultiplicacaoActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // Botão 01
        jlOperacao.setText(jlOperacao.getText() + "1");
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // Botão 02
        jlOperacao.setText(jlOperacao.getText() + "2");
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // Botão 03
        jlOperacao.setText(jlOperacao.getText() + "3");
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // Botão 04
        jlOperacao.setText(jlOperacao.getText() + "4");
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        // Botão 05
        jlOperacao.setText(jlOperacao.getText() + "5");
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        // Botão 08
        jlOperacao.setText(jlOperacao.getText() + "8");
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        // Botão 09
        jlOperacao.setText(jlOperacao.getText() + "9");
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
        // Botão 00
        jlOperacao.setText(jlOperacao.getText() + "0");
    }//GEN-LAST:event_jb10ActionPerformed

    private void jbCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelaActionPerformed
        // Botão para cancelar a operação
        jlOperacao.setText("");
        jlValorAnterior.setText("");
        numero = 0;
        numero2 = 0;
        resultado = 0;
        operacao = "";
    }//GEN-LAST:event_jbCancelaActionPerformed

    private void jbAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicaoActionPerformed
        //ADIÇÃO
        operacao = "+";
        numero = Double.parseDouble(jlOperacao.getText());
        jlOperacao.setText("");
        updatePreviousDisplay(numero);
        jlValorAnterior.setText(jlValorAnterior.getText() + " +");
    }//GEN-LAST:event_jbAdicaoActionPerformed

    private void jbSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtracaoActionPerformed
        //SUBTRAÇÃO
        operacao = "-";
        numero = Double.parseDouble(jlOperacao.getText());
        jlOperacao.setText("");
        updatePreviousDisplay(numero);
        jlValorAnterior.setText(jlValorAnterior.getText() + " -");
    }//GEN-LAST:event_jbSubtracaoActionPerformed

    private void jbVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVirgulaActionPerformed
        //VIRGULA
        jlOperacao.setText(jlOperacao.getText() + ".");

    }//GEN-LAST:event_jbVirgulaActionPerformed

private void updateDisplay(double value) {
    // Cria um símbolo de formato com ponto como separador decimal
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    DecimalFormat format = new DecimalFormat("#.##", symbols);
    
    String formattedValue = format.format(value);
    jlOperacao.setText(formattedValue);
}

private void updatePreviousDisplay(double value) {
    // Cria um símbolo de formato com ponto como separador decimal
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    DecimalFormat format = new DecimalFormat("#.##", symbols);
    
    String formattedValue = format.format(value);
    jlValorAnterior.setText(formattedValue);
}

    private void jbIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIgualActionPerformed
        // igualdade
        numero2 = Double.parseDouble(jlOperacao.getText());

        switch (operacao) {

            case "÷":
                divisao.setNum1Div(numero);
                divisao.setNum2Div(numero2);
                try {
                    resultado = divisao.getResultadoDiv();  // Tenta obter o resultado
                } catch (ArithmeticException e) {
                    jlValorAnterior.setText("ERRO:");
                    jlOperacao.setText(" ");
                    jlMensagem.setText(e.getMessage());
                    return;  // Sai do método para não continuar
                }
                break;

            case "x":
                multiplicacao.setNum1Mult(numero);
                multiplicacao.setNum2Mult(numero2);
                resultado = multiplicacao.getResultadoMult();
                break;

            case "+":
                soma.setNum1Soma(numero);
                soma.setNum2Soma(numero2);
                resultado = soma.getResultadoSoma();
                break;

            case "-":
                subtracao.setNum1Sub(numero);
                subtracao.setNum2Sub(numero2);
                resultado = subtracao.getResultadoSub();
                break;
        }
        updateDisplay(resultado);
        jlValorAnterior.setText("");

    }//GEN-LAST:event_jbIgualActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        // Botão 06
        jlOperacao.setText(jlOperacao.getText() + "6");
    }//GEN-LAST:event_jb6ActionPerformed

    private void jbMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMCActionPerformed
        // TODO add your handling code here:
        memoria = 0;
    }//GEN-LAST:event_jbMCActionPerformed

    private void jbRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRaizActionPerformed
        // RAIZ
        String operacaoAtual = jlOperacao.getText();
        if (!operacaoAtual.isEmpty()) {
            try {
                double numero = Double.parseDouble(operacaoAtual);
                if (numero < 0) {
                    jlOperacao.setText("Erro");
                } else {
                    double resultado = Math.sqrt(numero);
                    updateDisplay(resultado);
                }
            } catch (NumberFormatException e) {
                jlOperacao.setText("Erro");
            }
        }
    }//GEN-LAST:event_jbRaizActionPerformed

    private void jbMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMRActionPerformed
        jlOperacao.setText(Double.toString(memoria));
    }//GEN-LAST:event_jbMRActionPerformed

    private void jbMPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMPlusActionPerformed
        memoria += Double.parseDouble(jlOperacao.getText());
    }//GEN-LAST:event_jbMPlusActionPerformed

    private void jbMMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMMinusActionPerformed
        memoria -= Double.parseDouble(jlOperacao.getText());
    }//GEN-LAST:event_jbMMinusActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
        String operacaoAtual = jlOperacao.getText();

        // Verifica se há algo para deletar
        if (!operacaoAtual.isEmpty()) {
            // Remove o último caractere da string
            operacaoAtual = operacaoAtual.substring(0, operacaoAtual.length() - 1);

            // Atualiza o campo de texto com a string modificada
            jlOperacao.setText(operacaoAtual);
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbAdicao;
    private javax.swing.JButton jbCancela;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbDivisao;
    private javax.swing.JButton jbIgual;
    private javax.swing.JButton jbMC;
    private javax.swing.JButton jbMMinus;
    private javax.swing.JButton jbMPlus;
    private javax.swing.JButton jbMR;
    private javax.swing.JButton jbMultiplicacao;
    private javax.swing.JButton jbRaiz;
    private javax.swing.JButton jbSubtracao;
    private javax.swing.JButton jbVirgula;
    private javax.swing.JLabel jlMensagem;
    private javax.swing.JLabel jlOperacao;
    private javax.swing.JLabel jlValorAnterior;
    // End of variables declaration//GEN-END:variables
}
