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
    
    public static void signup(String usuario, String senha,String nome, String cpf, String endereco, String email, 
            String telefone){

            try{
                Connection conexao = estabelecerConexao();
                String query = "INSERT INTO funcionario(Usuario, Senha, Nome, CPF, Email, Telefone, Endereco) "
                + "VALUES(?,?,?,?,?,?,?)";

                PreparedStatement pstmt = conexao.prepareStatement(query);
                pstmt.setString(1, usuario);
                pstmt.setString(2, senha);
                pstmt.setString(3, nome);
                pstmt.setString(4, cpf);
                pstmt.setString(5, email);
                pstmt.setString(6, telefone);
                pstmt.setString(7, endereco);
                
                pstmt.executeUpdate();
            
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
    /*
    Métodos responsáveis pelo CRUD do funcionario
    */

    public static void cadastrarUsuario(String nome, String senha,String usuario, String cpf, String email, String telefone,String endereco){

        try (Connection conexao = estabelecerConexao()) {
            String query = "INSERT INTO funcionario(Usuario, Senha, Nome, CPF, Email, Telefone, Endereco) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, nome);
            pstmt.setString(4, cpf);
            pstmt.setString(5, email);
            pstmt.setString(6, telefone);
            pstmt.setString(7, endereco);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void atualizarUsuario(String nome, String senha,String usuario, 
            String cpf, String endereco, String email,String telefone){

        try (Connection conexao = estabelecerConexao()){
            String query = "UPDATE funcionario SET Usuario=?, Senha=?, Nome=?, Endereco=?, Email=?, Telefone=? WHERE CPF=?";
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, nome);
            pstmt.setString(4, endereco);
            pstmt.setString(5, email);
            pstmt.setString(6, telefone);
            pstmt.setString(7, cpf);

            pstmt.executeUpdate();
            //Essa linha foi adicionada porque minha base de dados não estava atualizando
            conexao.commit();

        } catch (SQLException e) {
            // Handle the exception
            e.printStackTrace();
        }
    }
    public static void deletarUsuario(String cpf){
        
        try(Connection conexao = estabelecerConexao()){
            String query = "DELETE FROM funcionario WHERE CPF=?";
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, cpf);
            
            pstmt.executeUpdate();
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
   public static void cadastrarReserva(String checkin, String checkout, String nome, String cpf,String funcionario, String numeroQuarto, String tipoQuarto) {
    try (Connection conexao = estabelecerConexao()) {
        String query = "INSERT INTO reserva(Checkin, Checkout, NomeCliente, CPF, NomeFuncionario,Quarto,TipoQuarto) VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conexao.prepareStatement(query);
        pstmt.setString(1, checkin);
        pstmt.setString(2, checkout);
        pstmt.setString(3, nome);
        pstmt.setString(4, cpf);
        pstmt.setString(5, funcionario);
        pstmt.setString(6, numeroQuarto);
        pstmt.setString(7, tipoQuarto);


        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
    public static void atualizarReserva(String checkin, String checkout,String nome,
        String cpf,String funcionario,String numeroQuarto,String tipoQuarto){
        try (Connection conexao = estabelecerConexao()){
            String query = "UPDATE reserva SET Checkin=?, Checkout=?, NomeCliente=?, CPF=?, "
            + "Funcionario=?, TipoQuarto=?, Quarto=? WHERE Checkin=? AND Checkout=? AND TipoQuarto=? AND Quarto=?";
            
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, checkin);
            pstmt.setString(2, checkout);
            pstmt.setString(3, nome);
            pstmt.setString(4, cpf);
            pstmt.setString(5, funcionario);
            pstmt.setString(6, tipoQuarto);
            pstmt.setString(7, numeroQuarto);
            
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
