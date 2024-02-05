/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por estabelecer a conexão entre o Java e o Banco de Dados
 * @author rafar
 */
public class DataBase {
    
    /*Realizando a conexao com o banco de dados MySQL*/
    private static Connection conexao = null;

   //Construtor criado para impedir a criação de instâncias
    private DataBase() throws SQLException {
        
    }
    
    public static Connection estabelecerConexao() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/milhoverde", "root", "88554663");
            return conexao;
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do Banco de Dados não foi encontrado");
        } catch (SQLException ex) {
            System.out.println("Erro ao acesso o banco de dados" + ex.getMessage());
        }
        return conexao;
    }
}
