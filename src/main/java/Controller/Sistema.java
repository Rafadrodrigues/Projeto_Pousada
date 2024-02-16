/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Model.DataBase.estabelecerConexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafar
 */
public class Sistema {
    /*
    Métodos de acesso,cadastro e saída do sistema.
    */
    public static boolean login(String usuario, String senha){
        /*Realizando a autenticação dos usuários no sistemas*/
        try{
            ResultSet resultSet;
            Connection conexao = estabelecerConexao();
                String query = "SELECT Usuario, Senha FROM funcionario WHERE Usuario = ? AND Senha = ?";
                PreparedStatement  pstmt = conexao.prepareStatement(query);
                pstmt.setString(1, usuario);
                pstmt.setString(2, senha);
                resultSet = pstmt.executeQuery();
                return resultSet.next();
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

        return false;
    }
    public static int obtendoID(String usuario) {
    try {
        Connection conexao = estabelecerConexao();
        String query = "SELECT IdFuncionario FROM funcionario WHERE Usuario = ?";
        
        PreparedStatement pstmt = conexao.prepareStatement(query);
        pstmt.setString(1, usuario);
        
        ResultSet rs = pstmt.executeQuery();
        
        int generatedKey = 0;
        if (rs.next()) {
            generatedKey = rs.getInt("IdFuncionario");
        }
        
        rs.close();
        pstmt.close();
        conexao.close();
        
        return generatedKey;
    } catch (SQLException e) {
        System.out.println("Error " + e.getMessage());
        return 0;
        }
    }

    public static void signup(String usuario, String senha, String nome,String cpf,String email, 
                    String telefone, String rua, int numeroCasa, String bairro, String cidade) {
            try {
                Connection conexao = estabelecerConexao();
                String query1 = "INSERT INTO funcionario(Usuario, Senha, Nome, CPF, Email, Telefone) "
                              + "VALUES (?, ?, ?, ?, ?, ?)";
                
                String query2 = "INSERT INTO endereco(Rua, Numero, Bairro, Cidade,FK_IdFuncionario) "
                              + "VALUES (?, ?, ?, ?, ?)";

                PreparedStatement pstmt1 = conexao.prepareStatement(query1);
                pstmt1.setString(1, usuario);
                pstmt1.setString(2, senha);
                pstmt1.setString(3, nome);
                pstmt1.setString(4, cpf);
                pstmt1.setString(5, email);
                pstmt1.setString(6, telefone);

                pstmt1.executeUpdate();
                
                int idFunc = obtendoID(usuario);
                
                PreparedStatement pstmt2 = conexao.prepareStatement(query2);
                pstmt2.setString(1, rua);
                pstmt2.setInt(2, numeroCasa);
                pstmt2.setString(3, bairro);
                pstmt2.setString(4, cidade);
                pstmt2.setInt(5, idFunc);
                pstmt2.executeUpdate();

            } catch(Exception e) {
                System.out.println("Error " + e.getMessage());
            }
    }

    /*
    Métodos responsáveis pelo CRUD do funcionario
    */

    public static void cadastrarUsuario(String usuario, String senha, String nome,String cpf,String email, 
                    String telefone, String rua, int numeroCasa, String bairro, String cidade){
            try {
                Connection conexao = estabelecerConexao();
                String query1 = "INSERT INTO funcionario(Usuario, Senha, Nome, CPF, Email, Telefone) "
                              + "VALUES (?, ?, ?, ?, ?, ?)";
                
                String query2 = "INSERT INTO endereco(Rua, Numero, Bairro, Cidade,FK_IdFuncionario) "
                              + "VALUES (?, ?, ?, ?, ?)";

                PreparedStatement pstmt1 = conexao.prepareStatement(query1);
                pstmt1.setString(1, usuario);
                pstmt1.setString(2, senha);
                pstmt1.setString(3, nome);
                pstmt1.setString(4, cpf);
                pstmt1.setString(5, email);
                pstmt1.setString(6, telefone);

                pstmt1.executeUpdate();
                
                int idFunc = obtendoID(usuario);
                
                PreparedStatement pstmt2 = conexao.prepareStatement(query2);
                pstmt2.setString(1, rua);
                pstmt2.setInt(2, numeroCasa);
                pstmt2.setString(3, bairro);
                pstmt2.setString(4, cidade);
                pstmt2.setInt(5, idFunc);
                pstmt2.executeUpdate();

            } catch(Exception e) {
                System.out.println("Error " + e.getMessage());
            }
    }
    
    public static void atualizarUsuario(String usuario, String senha, String nome,String cpf, String email, 
                String telefone, String rua, int numeroCasa, String bairro, String cidade){

        try {
            Connection conexao = estabelecerConexao();
            String query1 = "UPDATE funcionario SET Senha=?, Nome=?, Email=?, Telefone=? WHERE Usuario=? AND CPF=?";
            String query2 = "UPDATE endereco SET Rua=?, Numero=?, Bairro=?, Cidade=? WHERE Fk_IdFuncionario=?";

            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            pstmt1.setString(1, senha);
            pstmt1.setString(2, nome);
            pstmt1.setString(3, email);
            pstmt1.setString(4, telefone);
            pstmt1.setString(5, usuario);
            pstmt1.setString(6, cpf);


            pstmt1.executeUpdate();

            int idFunc = obtendoID(usuario);

            PreparedStatement pstmt2 = conexao.prepareStatement(query2);
            pstmt2.setString(1, rua);
            pstmt2.setInt(2, numeroCasa);
            pstmt2.setString(3, bairro);
            pstmt2.setString(4, cidade);
            pstmt2.setInt(5, idFunc);
            pstmt2.executeUpdate();

        } catch(Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void deletarUsuario(String usuario,String cpf){
        
        try(Connection conexao = estabelecerConexao()){
            String query1 = "DELETE FROM funcionario WHERE Usuario=? AND CPF=?";
            String query2 = "DELETE FROM endereco WHERE Fk_IdFuncionario=?";
            int idFunc = obtendoID(usuario);
            
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            pstmt1.setString(1, usuario);
            pstmt1.setString(2, cpf);
            pstmt1.executeUpdate();
            
            PreparedStatement pstmt2 = conexao.prepareStatement(query2);
            pstmt2.setInt(1, idFunc);
            
            pstmt2.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    /*Esse método foi criado para verificar o usuário quando for atualizar ou deletar*/
    public static boolean verificarUsuario(String cpf) {
        try (Connection conexao = estabelecerConexao()) {
            String query = "SELECT CPF FROM funcionario WHERE CPF=?";
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, cpf);

            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next(); 
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /*
    Métodos responsáveis pelo CRUD do cliente
    */
    public static void cadastrarCliente(String nome,String cpf,String telefone){
        try (Connection conexao = estabelecerConexao()) {
            String query = "INSERT INTO cliente(Nome, CPF, Telefone) "
                + "VALUES(?, ?, ?)";

            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, nome);
            pstmt.setString(2, cpf);
            pstmt.setString(3, telefone);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /*
    Métodos responsáveis pelo CRUD do reserva
    */
   public static void cadastrarReserva(String checkin, String checkout, String nome, String cpf, String numeroQuarto, String tipoQuarto) {
    try (Connection conexao = estabelecerConexao()) {
        String query = "INSERT INTO reserva(Checkin, Checkout, NomeCliente, CPF, Quarto, TipoQuarto,FK_ClienteReserva,FK_FuncionarioReserva) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conexao.prepareStatement(query);
        pstmt.setString(1, checkin);
        pstmt.setString(2, checkout);
        pstmt.setString(3, nome);
        pstmt.setString(4, cpf);
        pstmt.setString(5, numeroQuarto);
        pstmt.setString(6, tipoQuarto);

        //Preciso criar um método que colete o ID dos usuários
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
    public static void atualizarReserva(String checkin, String checkout,String nome,
        String cpf,String numeroQuarto,String tipoQuarto){
        try (Connection conexao = estabelecerConexao()){
            String query = "UPDATE reserva SET Checkin=?, Checkout=?, NomeCliente=?, CPF=?, TipoQuarto=?, Quarto=? WHERE Checkin=? AND Checkout=? AND TipoQuarto=? AND Quarto=?";
            
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, checkin);
            pstmt.setString(2, checkout);
            pstmt.setString(3, nome);
            pstmt.setString(4, cpf);
            pstmt.setString(5, tipoQuarto);
            pstmt.setString(6, numeroQuarto);
            pstmt.setString(7, checkin); 
            pstmt.setString(8, checkout);
            pstmt.setString(9, tipoQuarto);
            pstmt.setString(10, numeroQuarto);

            
            pstmt.executeUpdate();
            //Essa linha foi adicionada porque minha base de dados não estava atualizando
            conexao.commit();

        } catch (SQLException e) {
            // Handle the exception
            e.printStackTrace();
        }
    }
    public static void deletarReserva(String checkin, String checkout,String numeroQuarto,String tipoQuarto,String cpf){
        try(Connection conexao = estabelecerConexao()){
            String query = "DELETE FROM reserva WHERE Checkin=? AND Checkout=? AND TipoQuarto=? AND Quarto=? AND CPF=?";
            PreparedStatement pstmt = conexao.prepareStatement(query);
                pstmt.setString(1, checkin);
                pstmt.setString(2, checkout);
                pstmt.setString(3, numeroQuarto);
                pstmt.setString(4, tipoQuarto);
                pstmt.setString(5, cpf);
                pstmt.executeQuery();
 
                pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static boolean visualizarReserva(String checkin, String checkout,String numeroQuarto,String tipoQuarto){
        /*Realizando a autenticação dos usuários no sistemas*/
        try{
            ResultSet resultSet;
            Connection conexao = estabelecerConexao();
                String query = "SELECT * FROM reserva WHERE Checkin=? AND Checkout=? AND TipoQuarto=? AND Quarto=?";
                PreparedStatement  pstmt = conexao.prepareStatement(query);
                pstmt.setString(1, checkin);
                pstmt.setString(2, checkout);
                pstmt.setString(3, numeroQuarto);
                pstmt.setString(4, tipoQuarto);
                resultSet = pstmt.executeQuery(); 
                return true;
                
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return false;
    }
}
