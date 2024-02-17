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
    public static int obtendoID(String cpf) {
        try {
            Connection conexao = estabelecerConexao();
            String query = "SELECT IdFuncionario FROM funcionario WHERE CPF = ?";

            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, cpf);

            ResultSet rs = pstmt.executeQuery();

            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt("IdFuncionario");
            }else{
                return 0;
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
    //Obtendo o ID na tabela de Cliente
   public static Integer obtendoIdCliente(String cpf) {
        try {
            Connection conexao = estabelecerConexao();
            String query = "SELECT IdCliente FROM cliente WHERE CPF = ?";

            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, cpf);

            ResultSet rs = pstmt.executeQuery();

            Integer generatedKey = null; // Use Integer para permitir o valor nulo
            if (rs.next()) {
                generatedKey = rs.getInt("IdCliente");
            }

            rs.close();
            pstmt.close();
            conexao.close();

            return generatedKey;
        } catch (SQLException e) {
            // Trate a exceção de SQL adequadamente, lançando ou registrando o erro
            e.printStackTrace();
            return null; // Retorne null em caso de exceção
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
                
                int idFunc = obtendoID(cpf);
                
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
                
                int idFunc = obtendoID(cpf);
                
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

            int idFunc = obtendoID(cpf);

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
            int idFunc = obtendoID(cpf);
            
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
            String query = "SELECT Nome,Usuario,CPF FROM funcionario WHERE IdFuncionario=?";
            int idFunc = obtendoID(cpf);
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setInt(1, idFunc);

            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next(); 
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    /*
    Métodos responsáveis pelo CRUD do reserva
    */
   public static void cadastrarReserva(String checkin, String checkout, String nome, String cpf, String telefone, String numeroQuarto, String tipoQuarto) {
        try {
            Connection conexao = estabelecerConexao();

            // Inserindo o cliente na tabela se ainda não existir
            Integer idCliente = obtendoIdCliente(cpf);
            if (idCliente == null) {
                String queryCliente = "INSERT INTO cliente(Nome, CPF, Telefone) VALUES (?, ?, ?)";
                PreparedStatement pstmtCliente = conexao.prepareStatement(queryCliente, Statement.RETURN_GENERATED_KEYS);
                pstmtCliente.setString(1, nome);
                pstmtCliente.setString(2, cpf);
                pstmtCliente.setString(3, telefone);
                pstmtCliente.executeUpdate();

                // Obtendo o ID do cliente recém-inserido
                ResultSet generatedKeys = pstmtCliente.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idCliente = generatedKeys.getInt(1);
                } else {
                    // Trate o caso em que o ID do cliente não pôde ser obtido
                    throw new SQLException("Não foi possível obter o ID do cliente recém-inserido.");
                }
            }

            // Inserindo a reserva na tabela
            String queryReserva = "INSERT INTO reserva(Checkin, Checkout, Quarto, TipoQuarto, FK_IdCliente) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmtReserva = conexao.prepareStatement(queryReserva);
            pstmtReserva.setString(1, checkin);
            pstmtReserva.setString(2, checkout);
            pstmtReserva.setString(3, numeroQuarto);
            pstmtReserva.setString(4, tipoQuarto);
            pstmtReserva.setInt(5, idCliente);

            pstmtReserva.executeUpdate();

            // Fechar os recursos
            pstmtReserva.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
}

        public static void atualizarReserva(String checkin, String checkout, String nome,
                                          String cpf, String telefone, String numeroQuarto, String tipoQuarto) {
          try {
              Connection conexao = estabelecerConexao();

              // Atualiza a reserva na tabela
              String query1 = "UPDATE reserva SET Checkin=?, Checkout=?, Quarto=?, TipoQuarto=? WHERE Checkin=? AND Checkout=? AND Quarto=? AND TipoQuarto=?";
              PreparedStatement pstmt1 = conexao.prepareStatement(query1);
              pstmt1.setString(1, checkin);
              pstmt1.setString(2, checkout);
              pstmt1.setString(3, numeroQuarto);
              pstmt1.setString(4, tipoQuarto);
              pstmt1.setString(5, checkin);
              pstmt1.setString(6, checkout);
              pstmt1.setString(7, numeroQuarto);
              pstmt1.setString(8, tipoQuarto);
              pstmt1.executeUpdate();

              // Atualiza o cliente na tabela (exceto CPF)
              String query2 = "UPDATE cliente SET Nome=?, Telefone=? WHERE CPF=?";
              PreparedStatement pstmt2 = conexao.prepareStatement(query2);
              pstmt2.setString(1, nome);
              pstmt2.setString(2, telefone);
              pstmt2.setString(3, cpf);
              pstmt2.executeUpdate();

              // Fechar os recursos
              pstmt1.close();
              pstmt2.close();
              conexao.close();


          } catch (SQLException e) {
              System.out.println("Error: " + e.getMessage());
          }
      }
    public static void deletarReserva(String checkin, String checkout,String numeroQuarto,String tipoQuarto,String cpf){
        try(Connection conexao = estabelecerConexao()){
            String query1 = "DELETE FROM reserva WHERE FK_IdCliente=? AND TipoQuarto=? AND Quarto=?";
            String query2 = "DELETE FROM cliente WHERE IdCliente=?";
            
            int idCliente = obtendoIdCliente(cpf);
            
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            
                pstmt1.setInt(1, idCliente);
                pstmt1.setString(2, tipoQuarto);
                pstmt1.setString(3, numeroQuarto);
                pstmt1.executeUpdate();
                
                PreparedStatement pstmt2 = conexao.prepareStatement(query2);
                pstmt2.setInt(1, idCliente);
                pstmt2.executeUpdate();
                
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static ResultSet visualizarReserva(String checkin, String checkout,String numeroQuarto,String tipoQuarto){
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
                return resultSet;
                
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return null;

    }
}
