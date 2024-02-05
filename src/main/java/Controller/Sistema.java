/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Model.DataBase.estabelecerConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                String query = "SELECT usuario, senha FROM funcionario WHERE usuario = ? AND senha = ?";
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
                String query = "INSERT INTO funcionario(usuario, senha, nome, cpf, email, telefone, endereco) "
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
        String query = "INSERT INTO funcionario(usuario, senha, nome, cpf, email, telefone, endereco) "
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
    
    public static void atualizarUsuario(String nome, String senha,String usuario, String cpf, String email, String telefone,String endereco){
        
        try (Connection conexao = estabelecerConexao()){
            String query = "UPDATE funcionario SET usuario=?, senha=?, nome=?, endereco=?, email=?, telefone=? WHERE cpf=? AND usuario=?";
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, senha);
            preparedStatement.setString(3, nome);
            preparedStatement.setString(4, endereco);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, telefone);
            preparedStatement.setString(7, cpf);
            preparedStatement.setString(8, usuario);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // Handle the exception
            e.printStackTrace();
        }
    }
    public static void deletarUsuario(String usuario,String cpf){
        
        try(Connection conexao = estabelecerConexao()){
            String query = "DELETE FROM funcionario WHERE usuario=? AND cpf=?";
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, cpf);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    /*Esse método foi criado para verificar o usuário quando for atualizar ou deletar*/
    public static void verificarUsuario(String cpf){
        try(Connection conexao = estabelecerConexao()){
            String query = "SELECT cpf FROM funcionario cpf=?";
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, cpf);
            
            preparedStatement.executeUpdate();
        }catch(SQLException ex){
          ex.printStackTrace();  
        }
    }
    public static void visualizarUsuario(){
        
    }
    /*
    Métodos responsáveis pelo CRUD do cliente
    */
    public static void cadastrarCliente(){
        
    }
    public static void atualizarCliente(){
        
    }
    public static void deletarCliente(){
        
    }
    public static void visualizarCliente(){
        
    }
     /*
    Métodos responsáveis pelo CRUD do reserva
    */
    public static void cadastrarReserva(){
        
    }
    public static void atualizarReserva(){
        
    }
    public static void deletarReserva(){
        
    }
    public static void visualizarReserva(){
        
    }
}
