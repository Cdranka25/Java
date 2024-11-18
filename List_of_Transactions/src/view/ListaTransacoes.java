/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import model.Conta;
import model.Despesas;
import model.Receitas;
import model.Transacao;
import model.ImportadorArquivo;
import model.ExportadorArquivo;
import view.App;

/**
 * * JDialog utilizado para exibir uma lista de transações importadas de um arquivo.
 * Permite visualizar as transações agrupadas por data e apresenta um relatório detalhado.
 * 
 * Esta classe utiliza componentes Swing para a interface gráfica.
 * Utiliza classes do pacote model para manipular os dados das transações.
 * 
 * Exemplo de uso:
 * ListaTransacoes dialog = new ListaTransacoes(new javax.swing.JFrame(), true);
 * dialog.setVisible(true);
 * 
 * @author cdran
 */
public class ListaTransacoes extends javax.swing.JDialog {

    private ArrayList<Transacao> transacoes;
    private ImportadorArquivo importador;
    private ExportadorArquivo exportador;
    private App app = new App();
    private Conta conta;

    /**
     * Construtor da classe ListaTransacoes.
     * 
     * @param parent O JFrame pai que invoca esta janela
     * @param modal Indica se a janela deve ser modal (true) ou não (false)
     */
    public ListaTransacoes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conta = new Conta();
        transacoes = new ArrayList<>();
        importador = new ImportadorArquivo();
        exportador = new ExportadorArquivo();
        initCustom();
    }
    /**
     * Método privado chamado pelo construtor para inicialização personalizada.
     * Configuração inicial da lista de transações e importação de dados de um arquivo.
     */
    private void initCustom() {
        File arquivoImportar = new File("bin/bin.csv");
        importarTransacoes(arquivoImportar);
        conta.setTransacoes(transacoes);
        taRelatorio.setText(gerarRelatorio());
    }

    /**
     * Método gerado automaticamente pelo NetBeans para inicialização dos componentes Swing.
     * Não modifique este método diretamente, pois o conteúdo é regenerado automaticamente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taRelatorio = new javax.swing.JTextArea();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Transações");

        taRelatorio.setColumns(20);
        taRelatorio.setRows(5);
        jScrollPane1.setViewportView(taRelatorio);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btFechar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método de ação do botão "Fechar".
     * Esconde a janela de lista de transações ao ser clicado.
     * 
     * @param evt O evento de clique do botão
     */
    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btFecharActionPerformed
    /**
     * Importa transações de um arquivo CSV.
     * 
     * @param arquivo O arquivo CSV contendo as transações a serem importadas
     */
    public void importarTransacoes(File arquivo) {
        try {
            importador.setArquivo(arquivo);
            importador.processarArquivo();
            transacoes = importador.getTransacoes();
        } catch (Exception ex) {
            Logger.getLogger(ListaTransacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Obtém uma transação específica da lista de transações.
     * 
     * @param index O índice da transação na lista
     * @return A transação no índice especificado, ou null se o índice estiver fora dos limites
     */
    public Transacao obterTransacao(int index) {
        if (index >= 0 && index < transacoes.size()) {
            return transacoes.get(index);
        }
        return null;
    }

    /**
     * Gera um relatório detalhado das transações agrupadas por data.
     * O relatório inclui o tipo de transação (receita ou despesa), valor e saldo acumulado.
     * 
     * @return O relatório formatado em formato de texto
     */
    public String gerarRelatorio() {

     StringBuilder relatorio = new StringBuilder();
    DecimalFormat deci = new DecimalFormat("R$ 0.00");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    relatorio.append("-----------------------------------------------\n");
    relatorio.append("********** TRANSAÇÕES **********\n");

    // Agrupar transações por data para exibição ordenada
    Map<LocalDate, List<Transacao>> transacoesPorData = new TreeMap<>();

    System.out.println("Iniciando agrupamento de transações..."); // Depuração

    for (Transacao transacao : transacoes) {
        LocalDate dataTransacao = transacao.getDate();

        // Verificação de depuração
        if (dataTransacao == null) {
            System.out.println("Data da transação nula encontrada.");
            continue; // Ignorar transações com data nula
        }

        System.out.println("Adicionando transação para a data: " + dataTransacao.format(dateFormatter)); // Depuração

        transacoesPorData.computeIfAbsent(dataTransacao, k -> new ArrayList<>()).add(transacao);
    }

    System.out.println("Agrupamento de transações concluído."); // Depuração

    double saldoAtual = 0;
    // Iterar sobre as transações agrupadas por data na ordem natural (crescente)
    for (LocalDate data : transacoesPorData.keySet()) {
        relatorio.append("-----------------------------------------------\n");
        relatorio.append("  >>> Data: ").append(data.format(dateFormatter)).append(" <<< \n");

        for (Transacao transacao : transacoesPorData.get(data)) {
            if (transacao instanceof Receitas) {
                Receitas receita = (Receitas) transacao;
                relatorio.append("  Tipo de transação: Receita\n");
                relatorio.append("  Tipo de receita: ").append(receita.getTipoReceita()).append("\n");
                relatorio.append("  Valor: R$ ").append(String.format("%.2f", receita.getValor())).append("\n");
                saldoAtual += receita.getValor();
            } else if (transacao instanceof Despesas) {
                Despesas despesa = (Despesas) transacao;
                relatorio.append("  Tipo de transação: Despesa\n");
                relatorio.append("  Tipo de despesa: ").append(despesa.getTipoDespesa()).append("\n");
                relatorio.append("  Valor: R$ -").append(String.format("%.2f", despesa.getValor())).append("\n");
                saldoAtual -= despesa.getValor();
            }
            relatorio.append("-----------------------------------------------\n");
        }
        relatorio.append(" Saldo do dia: ").append(deci.format(saldoAtual)).append("\n");
    }

    // Incluir saldo total até a data atual
    relatorio.append("-----------------------------------------------\n");
    relatorio.append(" Saldo até hoje ").append(LocalDate.now().format(dateFormatter)).append(": R$ ").append(String.format("%.2f", conta.saldoAteDataAtual())).append(" \n");
    relatorio.append(" *** Saldo Total: ").append(deci.format(saldoAtual)).append(" ***\n");
    relatorio.append("-----------------------------------------------\n");

    return relatorio.toString();
    }

/**
     * Método principal que inicia a aplicação.
     * Cria uma instância da classe ListaTransacoes (JDialog) e a torna visível.
     * 
     * @param args Os argumentos de linha de comando (não utilizados neste caso)
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
            java.util.logging.Logger.getLogger(ListaTransacoes.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaTransacoes.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaTransacoes.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaTransacoes.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaTransacoes dialog = new ListaTransacoes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taRelatorio;
    // End of variables declaration//GEN-END:variables

}
