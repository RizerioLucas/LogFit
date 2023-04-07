package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
//comunicação com o Banco 
import java.sql.Statement;
//Para guardar a conexão com o Banco de dados
import java.sql.Connection;
//Paraindicar o banco de dados ao qual vamos nos conectar
import java.sql.DriverManager;
//Para tratar qualquer exceção de comando SQL digitado errado
import java.sql.SQLException;
//Para executar os comandos SQL INSERT, UPDATE, DELETE, SELECT
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Cadastro  extends JFrame implements ActionListener{
    
//variaveis de String 
     JLabel lblNome;
     JTextField txtNome;

     // NÃO MEXE NISSO É O BOX DE FEMININO E MASCULINO
     String[] sexo = new String[] {"F", "M"};
     JComboBox<String> genero = new JComboBox<>(sexo);

    //variaveis de inteiros alterar depois
     JLabel lblIdade, lblAnoMatricula, lblMatricula, lblCodigo;
     JTextField txtIdade, txtAnoMatricula, txtMatricula, txtCodigo;

     // Variaveis reais alterar depois
     JLabel lblPesoAtual;
     JTextField txtPesoAtual;

     JLabel lblPesoIdeal; // essa aqui seria legal fazer o calculo no objeto e só mostrar na tela quando o cara entrar na conta dele

     JLabel lblAltura;
     JTextField txtAltura;
     
     JButton btnVotlar;

     public Cadastro(){
         // Tamanho do formulario principal
        setSize(500, 600); 
        setLocationRelativeTo(null); // Centraliza o formulario
        setTitle("Cadastro de funcionários");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(null);

        
        // NOME
        lblNome = new JLabel("Nome");
        lblNome.setSize(100,30);
        lblNome.setLocation(30, 50);
        add(lblNome); 
        txtNome = new JTextField();
        txtNome.setSize(200,30);
        txtNome.setLocation(100, 50);
        add(txtNome);

        // IDADE
        lblIdade = new JLabel("Idade");
        lblIdade.setSize(100, 30);
        lblIdade.setLocation(30, 100);
        add(lblIdade);
        txtIdade = new JTextField();
        txtIdade.setSize(200,30);
        txtIdade.setLocation(100, 100);
        add(txtIdade);

        // Peso Atual
        lblPesoAtual = new JLabel("Entre com seu Peso");
        lblPesoAtual.setSize(100, 30);
        lblPesoAtual.setLocation(30, 150);
        add(lblPesoAtual);
        txtPesoAtual = new JTextField();
        txtPesoAtual.setSize(200,30);
        txtPesoAtual.setLocation(100, 150);
        add(txtPesoAtual);
                
        // Isso é a caixa de sexo 
        genero.setSize(100,30);
        genero.setLocation(350,50);
        add(genero);
        //String selectedSexo = (String) genero.getSelectedItem();
        
        // Botão voltar 
        btnVotlar = new JButton("Voltar");
        btnVotlar.setSize(100, 30);
        btnVotlar.setLocation(140, 300);
        btnVotlar.addActionListener(this);
        add(btnVotlar);
    }
    public static void main(String[] args) {
        new Cadastro().setVisible(true);
    }
    
        @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVotlar) {
            new Intro().setVisible(true);
            dispose();
        }
    }
}
