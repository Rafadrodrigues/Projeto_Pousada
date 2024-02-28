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
import java.sql.Statement;
import java.util.Date;
import Model.Funcionario;
import Model.Reserva;
import Model.Cliente;

/**
 * Classe que representa o corpo do nosso sistema, nela está contida todas as 
 * funcionalidades/execuções do código.
 * @author rafar
 */
public class Sistema {

    /*Atributo criado para gerenciar as manusear do funcionario na classe sistema*/
    private static Funcionario idFuncioanarioAtual = new Funcionario();
    private static Reserva idReserva = new Reserva();
    
    /**
     * Construtor padrão da classe como 'private' para que não possa ser instanciada
     * @return Funcionario - Retorna informações sobre o funcionario
     */

    public Funcionario getIdFuncioanarioAtual() {
        return idFuncioanarioAtual;
    }

    public static void setIdFuncioanarioAtual(Funcionario idFuncioanarioAtual) {
        Sistema.idFuncioanarioAtual = idFuncioanarioAtual;
    }

    public static Reserva getIdReserva() {
        return idReserva;
    }

    public static void setIdReserva(Reserva idReserva) {
        Sistema.idReserva = idReserva;
    }
    


    /**
     * Método que realiza uma coleta na base de dados e compara se os dados passados como
     * parametros são compativeis, ou seja, esse método libera o acesso para o sistema.
     * @param usuario   Credenciais de usuario do funcionario
     * @param senha     Credenciais de senha do funcionário
     * @return boolean - Se o usuário passado como parâmetro é existente o acesso é l
     */
    
    public static boolean login(String usuario, String senha){
        /*Realizando a autenticação dos usuários no sistemas*/
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try{
            ResultSet resultSet;
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
                /*Query que vai ser executada na no MySQL*/
                String query = "SELECT idFuncionario, Usuario, Senha FROM funcionario WHERE Usuario = ? AND Senha = ?";
                /*Preparação da Query*/
                PreparedStatement  pstmt = conexao.prepareStatement(query);

                /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
                interrograções*/
                pstmt.setString(1, usuario);
                pstmt.setString(2, senha);
                /*Execução da Query*/
                resultSet = pstmt.executeQuery();
                
                /*Condicional que move o cursor para a primeira linha da tabela*/
                if (resultSet.next()) {
                    /*Preenchendo atributos do funcionários com informações*/
                    idFuncioanarioAtual.setUsuario(usuario);
                    idFuncioanarioAtual.setSenha(senha);
                    idFuncioanarioAtual.setIdFuncionario(resultSet.getInt("idFuncionario"));
                    /*Retorna True caso o login tenha sido efetuado corretamente*/
                    return true; 
                } else {
                    /*Retorna False caso o login não tenha sido efetuado corretamente*/
                    return false; 
                } 

            /*Quaisquer erro que venha ocorrer no código vai ser dito aqui*/
        } catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Método que realizar uma consulta na base de dados e coleta o id de um funcionário específico
     * @param cpf - CPF do funcionário desejado
     * @return Integer - Valor do ID do funcionario
     */
    public static Integer obtendoIdFuncionario(String cpf) {
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL*/
            String query = "SELECT IdFuncionario FROM funcionario WHERE CPF = ?";
            
            /*Preparação da Query*/
            PreparedStatement pstmt = conexao.prepareStatement(query);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt.setString(1, cpf);
            /*Execução da Query*/
            ResultSet resultSet = pstmt.executeQuery();
            /*Variável que vai receber o ID do funcionario*/
            Integer generatedKey = 0;
            /*Condicional que move o cursor para a primeira linha da tabela*/
            if (resultSet.next()) {
                /*Atribuindo a variavel o valor encontrado de acordo com o CPF.*/
                generatedKey = resultSet.getInt("IdFuncionario");
            }

            return generatedKey;
            /*Tratando possíveis erros que podem ocorrer*/
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            return 0;
            }
    }
    /**
     * Método que realizar uma consulta na base de dados e coleta o id de um cliente específico
     * @param cpf - CPF do cliente desejado
     * @return Integer - Valor do ID do cliente
     */
   public static Integer obtendoIdCliente(String cpf) {
       /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL*/
            String query = "SELECT IdCliente FROM cliente WHERE CPF = ?";
            
            /*Preparação da Query*/
            PreparedStatement pstmt = conexao.prepareStatement(query);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt.setString(1, cpf);
            /*Execução da Query*/
            ResultSet resultSet = pstmt.executeQuery();
            /*Condicional que move o cursor para a primeira linha da tabela*/
            Integer generatedKey = 0; // Use Integer para permitir o valor nulo
            if (resultSet.next()) {
                /*Atribuindo a variavel o valor encontrado de acordo com o CPF.*/
                generatedKey = resultSet.getInt("IdCliente");
            }
            
            return generatedKey;
            /*Tratando possíveis erros que podem ocorrer*/
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            return 0; 
        }
    }
    /**
     * Método que realizar uma consulta na base de dados e coleta o id de um reserva específico
     * @param cpf - CPF do reserva desejado
     * @return Integer - Valor do ID da reserva
     */ 
   public static Integer obtendoIdReserva(String cpf) {
       /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Pegando id do cliente desejado de acordo o CPF*/
            int idCliente = obtendoIdCliente(cpf);
            /*Query que vai ser executada na no MySQL*/
            String query = "SELECT IdReserva FROM reserva WHERE FK_IdCliente = ?";
            
            /*Preparação da Query*/
            PreparedStatement pstmt = conexao.prepareStatement(query);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt.setInt(1, idCliente);
            /*Execução da Query*/
            ResultSet resultSet = pstmt.executeQuery();
            /*Condicional que move o cursor para a primeira linha da tabela*/
            Integer generatedKey = 0; // Use Integer para permitir o valor nulo
            if (resultSet.next()) {
                /*Atribuindo a variavel o valor encontrado de acordo com o CPF.*/
                generatedKey = resultSet.getInt("IdCliente");
            }

            return generatedKey;
            /*Tratando possíveis erros que podem ocorrer*/
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            return 0; 
        }
    }
    /**
     * Método responsável por cadastrar um novo usuário no sistema. Essencial para 
     * realizar o primeiro login. Nesse método está utilizando a tabela funcionario e endereco
     * @param usuario - Usuario do funcionario  
     * @param senha - Senha do Funcionario
     * @param nome  - Nome do funcionario
     * @param cpf  - CPF do funcionario
     * @param email - Email do funcionario
     * @param telefone  - Telefone do funcionario   
     * @param rua  - Rua que o funcionario morar
     * @param numeroCasa - Numero da casa que o funcionario mora
     * @param bairro - Bairro que o funcionario mora
     * @param cidade  Cidade em que o funcionario mora
     */
    public static void signup(String usuario, String senha, String nome,String cpf,String email, 
                    String telefone, String rua, int numeroCasa, String bairro, String cidade) {
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL*/
            String query1 = "INSERT INTO funcionario(Usuario, Senha, Nome, CPF, Email, Telefone) "
                          + "VALUES (?, ?, ?, ?, ?, ?)";
            /*Query que vai ser executada na no MySQL*/
            String query2 = "INSERT INTO endereco(Rua, Numero, Bairro, Cidade,FK_IdFuncionario) "
                          + "VALUES (?, ?, ?, ?, ?)";

            /*Preparação da Query do funcionario*/
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt1.setString(1, usuario);
            pstmt1.setString(2, senha);
            pstmt1.setString(3, nome);
            pstmt1.setString(4, cpf);
            pstmt1.setString(5, email);
            pstmt1.setString(6, telefone);
            /*Execução da Query do funcionario*/
            pstmt1.executeUpdate();

            /*Obtendo id do funcionario*/
            int idFunc = obtendoIdFuncionario(cpf);

            /*Preparação da Query do endereco*/
            PreparedStatement pstmt2 = conexao.prepareStatement(query2);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt2.setString(1, rua);
            pstmt2.setInt(2, numeroCasa);
            pstmt2.setString(3, bairro);
            pstmt2.setString(4, cidade);
            pstmt2.setInt(5, idFunc);
            /*Execução da Query de endereco*/
            pstmt2.executeUpdate();
            
            /*Tratando possíveis erros que podem ocorrer*/
            } catch(SQLException e) {
                System.out.println("Error " + e.getMessage());
            }
    }

    /**
     * Método responsável por cadastrar um novo usuário no sistema. Nesse método 
     * está utilizando a tabela funcionario e endereco
     * @param usuario - Usuario do funcionario  
     * @param senha - Senha do Funcionario
     * @param nome  - Nome do funcionario
     * @param cpf  - CPF do funcionario
     * @param email - Email do funcionario
     * @param telefone  - Telefone do funcionario   
     * @param rua  - Rua que o funcionario morar
     * @param numeroCasa - Numero da casa que o funcionario mora
     * @param bairro - Bairro que o funcionario mora
     * @param cidade  Cidade em que o funcionario mora
     */
    public static void cadastrarUsuario(String usuario, String senha, String nome,String cpf,String email, 
                    String telefone, String rua, int numeroCasa, String bairro, String cidade){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL*/
            String query1 = "INSERT INTO funcionario(Usuario, Senha, Nome, CPF, Email, Telefone) "
                          + "VALUES (?, ?, ?, ?, ?, ?)";
            /*Query que vai ser executada na no MySQL*/
            String query2 = "INSERT INTO endereco(Rua, Numero, Bairro, Cidade,FK_IdFuncionario) "
                          + "VALUES (?, ?, ?, ?, ?)";
            /*Preparação da Query do funcionario*/
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt1.setString(1, usuario);
            pstmt1.setString(2, senha);
            pstmt1.setString(3, nome);
            pstmt1.setString(4, cpf);
            pstmt1.setString(5, email);
            pstmt1.setString(6, telefone);
            /*Execução da Query do funcionario*/
            pstmt1.executeUpdate();
            
            /*Obtendo id do funcionario*/
            int idFunc = obtendoIdFuncionario(cpf);
            
            /*Preparação da Query do endereco*/
            PreparedStatement pstmt2 = conexao.prepareStatement(query2);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt2.setString(1, rua);
            pstmt2.setInt(2, numeroCasa);
            pstmt2.setString(3, bairro);
            pstmt2.setString(4, cidade);
            pstmt2.setInt(5, idFunc);
            /*Execução da Query de endereco*/
            pstmt2.executeUpdate();
            
        /*Tratando possíveis erros que podem ocorrer*/
        } catch(SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    //Tem a possibilidade de ter algum erro nesse trecho de código REVISAR
    public static void atualizarUsuario(String usuario, String senha, String nome,String cpf, String email, 
                String telefone, String rua, int numeroCasa, String bairro, String cidade){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Obtendo id do funcionario*/
            int idFunc = obtendoIdFuncionario(cpf);
            /*Query que vai ser executada na no MySQL*/
            String query1 = "UPDATE funcionario SET Senha=?, Nome=?, Email=?, Telefone=? WHERE CPF=?";
            /*Preparação da Query do funcionario*/
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt1.setString(1, senha);
            pstmt1.setString(2, nome);
            pstmt1.setString(3, email);
            pstmt1.setString(4, telefone);
            pstmt1.setString(5, cpf);
            /*Execução da Query de endereco*/
            pstmt1.executeUpdate();
            
            /*Query que vai ser executada na no MySQL*/
            String query2 = "UPDATE endereco SET Rua=?, Numero=?, Bairro=?, Cidade=? WHERE Fk_IdFuncionario=?";
            /*Preparação da Query do endereco*/
            PreparedStatement pstmt2 = conexao.prepareStatement(query2);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt2.setString(1, rua);
            pstmt2.setInt(2, numeroCasa);
            pstmt2.setString(3, bairro);
            pstmt2.setString(4, cidade);
            pstmt2.setInt(5, idFunc);
            /*Execução da Query de endereco*/
            pstmt2.executeUpdate();
            
        /*Tratando possíveis erros que podem ocorrer*/
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    /**
     * Método que vai deletar o usuário da base de dados.
     * @param cpf - CPF do cliente usado para identificar o usuario
     */
    public static void deletarUsuario(String cpf){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        /*Estabelecendo a conexão com a base de dados*/
        try(Connection conexao = estabelecerConexao()){
            
            /*Na criação das tabelas, foram criadas 
            relações DELETE ON CASCADE, isso significa quando um registro for apagado
            da tabela pai(funcionario) logo o registrado que tiver estiver ligado a ele em 
            tabelas filhas(endereco) serão apagados.*/
            
            /*Query que vai ser executada na no MySQL.*/ 
            String query1 = "DELETE FROM funcionario WHERE CPF=?";
            
            /*Preparação da Query*/
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt1.setString(1, cpf);
            /*Execução da Query de endereco*/
            pstmt1.executeUpdate();
            
        /*Tratando possíveis erros que podem ocorrer*/
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

//    /**
//     * Método criado para verificar o usuário quando for atualizar ou deletar na 
//     * base de dados
//     * @param cpf - CPF utilizado para auxiliar na identificação de determinado usuario
//     * @return booelean - Verifica os usuarios presentes na base de dados
//     */
//    public static boolean verificarUsuario(String cpf) {
//        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
//        e comparações com a base de dados.*/
//        /*Estabelecendo a conexão com a base de dados*/
//        try (Connection conexao = estabelecerConexao()) {
//            
//            /*Query que vai ser executada na no MySQL.*/
//            String query = "SELECT Nome,Usuario,CPF FROM funcionario WHERE IdFuncionario=?";
//            /*Obtendo id do funcionario*/
//            int idFunc = obtendoIdFuncionario(cpf);
//            /*Preparação da Query */
//            PreparedStatement pstmt = conexao.prepareStatement(query);
//            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
//            interrograções*/
//            pstmt.setInt(1, idFunc);
//            
//            /*Execução da Query*/
//            ResultSet resultSet = pstmt.executeQuery();
//            
//            /*Fechando conexões*/
//            resultSet.close();
//            pstmt.close();
//            
//            return resultSet.next();
//            /*Tratando possíveis erros que podem ocorrer*/
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//            return false;
//        }
//    }
   /**
    * Método responsável por cadastrar uma no sistema.Nesse método está utilizando 
    * a tabela reserva, cliente e financeiro
    * @param checkin - Data de entrada da reserva
    * @param checkout - Data de saida da reserva
    * @param nome - Nome do cliente da reserva
    * @param cpf - CPF do cliente da reserva
    * @param telefone - Telefone do cliente da reserva
    * @param numeroQuarto - Numero do quarto da reserva
    * @param tipoQuarto - Tipo do quarto da reserva(luxo,comum)
    * @param email - Email do cliente da reserva
    * @param formaPagamento - Forma de pagamento da reserva
    * @param parcela - Parcelas se for a crédito
    * @param valorTotal - Valor total da da reserva
    */
    public static void cadastrarReserva(Date checkin, Date checkout, String nome, 
            String cpf, String telefone, String numeroQuarto, String tipoQuarto, 
            String email, String formaPagamento,String parcela, float valorTotal) throws SQLException {
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();

            /*Pegando id do cliente desejado de acordo o CPF*/
            Integer idCliente = obtendoIdCliente(cpf);
            /*Utilizando o atributo preenchido no login para coletar o ID do usuario
            que estar realizando reservas*/
            int idFuncionario = idFuncioanarioAtual.getIdFuncionario();
            /*Condicional que verifica se ID do cliente é existente, caso não seja
            o código não vai executar. É preciso realizar a inserção primeiro na tabela
            de cliente para que não tenha erros de relacionamentos.*/
            if (idCliente == null) {
                /*Query que vai ser executada na no MySQL.*/
                String queryCliente = "INSERT INTO cliente(Nome, CPF, Telefone,Email) VALUES (?, ?, ?, ?)";
                /*Preparação da Query */
                PreparedStatement pstmtCliente = conexao.prepareStatement(queryCliente, Statement.RETURN_GENERATED_KEYS);
                /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
                interrograções*/
                pstmtCliente.setString(1, nome);
                pstmtCliente.setString(2, cpf);
                pstmtCliente.setString(3, telefone);
                pstmtCliente.setString(4, email);
                /*Execução da Query*/
                pstmtCliente.executeUpdate();

                /* Obtendo o ID do cliente recém-inserido que vai ser inserido na tabela de reserva*/
                ResultSet generatedKeys = pstmtCliente.getGeneratedKeys();
                /*Condicional que move o cursor para a primeira linha da tabela*/
                if (generatedKeys.next()) {
                    /*Atribuindo a variavel o valor encontrado de acordo com o CPF.*/
                    idCliente = generatedKeys.getInt(1);
                } else {
                    // Tratando o caso em que o ID do cliente não pôde ser obtido
                    throw new SQLException("Não foi possível obter o ID do cliente recém-inserido.");
                }
                /*Fechando as conexôes*/
                pstmtCliente.close();
            }
//            // Inserindo a reserva na tabela
//            String queryReserva = "INSERT INTO reserva(Checkin, Checkout, Quarto, TipoQuarto, FK_IdCliente,fk_id_funcionario) VALUES (?, ?, ?, ?, ?, ?)";
//            
//            /*Preparação da Query */
//            PreparedStatement pstmtReserva = conexao.prepareStatement(queryReserva,Statement.RETURN_GENERATED_KEYS);
//            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
//            interrograções*/
//            pstmtReserva.setDate(1, new java.sql.Date(checkin.getTime()));
//            pstmtReserva.setDate(2, new java.sql.Date(checkout.getTime()));
//            pstmtReserva.setString(3, numeroQuarto);
//            pstmtReserva.setString(4, tipoQuarto);
//            pstmtReserva.setInt(5, idCliente);
//            pstmtReserva.setInt(6, idFuncionario);
//            /*Execução da Query*/
//            pstmtReserva.executeUpdate();
//            
//            // Inserindo a reserva na tabela
//            String queryFinanceiro = "INSERT INTO financeiro(forma_pagamento, parcelas, valor_total, fk_id_reserva) VALUES (?, ?, ?, ?)";
//            
//            /*Preparação da Query */
//            PreparedStatement pstmtFinanceiro = conexao.prepareStatement(queryFinanceiro, Statement.RETURN_GENERATED_KEYS);
//
//            /*Pegando id da reserva desejado*/
//            ResultSet generatedKeys = pstmtFinanceiro.getGeneratedKeys();
//            if (generatedKeys.next()) {
//                int idReserva1 = generatedKeys.getInt(1); // Assuming the generated key is in the first column
//                idReserva.setIdReserva(idReserva1);
//            }
//            
//            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
//            interrograções*/
//            pstmtFinanceiro.setString(1, formaPagamento);
//            pstmtFinanceiro.setString(2, parcela);
//            pstmtFinanceiro.setFloat(3, valorTotal);
//            pstmtFinanceiro.setInt(4, idReserva.getIdReserva());
//            /*Execução da Query*/
//            pstmtFinanceiro.executeUpdate();
//            
//            /*Tratando possíveis erros que podem ocorrer*/
//        } catch (SQLException e) {
//            System.out.println("Error " + e.getMessage());
//        }
// Inserindo a reserva na tabela
            String queryReserva = "INSERT INTO reserva(Checkin, Checkout, Quarto, TipoQuarto, FK_IdCliente,fk_id_funcionario) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmtReserva = conexao.prepareStatement(queryReserva, Statement.RETURN_GENERATED_KEYS);
            // Execução da Query
            pstmtReserva.executeUpdate();

            // Obtendo o ID da reserva recém-inserida
            ResultSet generatedKeys = pstmtReserva.getGeneratedKeys();
            int idReserva1;
            if (generatedKeys.next()) {
                idReserva1 = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Não foi possível obter o ID da reserva recém-inserida.");
            }
            // Fechando o PreparedStatement
            pstmtReserva.close();

            // Inserindo a reserva na tabela financeiro
            String queryFinanceiro = "INSERT INTO financeiro(forma_pagamento, parcelas, valor_total, fk_id_reserva) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmtFinanceiro = conexao.prepareStatement(queryFinanceiro);
            pstmtFinanceiro.setString(1, formaPagamento);
            pstmtFinanceiro.setString(2, parcela);
            pstmtFinanceiro.setFloat(3, valorTotal);
            // Usando o ID da reserva obtido anteriormente
            pstmtFinanceiro.setInt(4, idReserva1);
            // Execução da Query
            pstmtFinanceiro.executeUpdate();
            // Fechando o PreparedStatement
            pstmtFinanceiro.close();

        }catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    /**
    * Método responsável por atualizar as reservas. Nesse método são atualizado as tabelas
    * reserva, cliente e financeiro.
    * @param checkin - Data de entrada da reserva
    * @param checkout - Data de saida da reserva
    * @param nome - Nome do cliente da reserva
    * @param cpf - CPF do cliente da reserva
    * @param telefone - Telefone do cliente da reserva
    * @param numeroQuarto - Numero do quarto da reserva
    * @param tipoQuarto - Tipo do quarto da reserva(luxo,comum)
    * @param email - Email do cliente da reserva
     */
    /**
    * Método responsável por atualizar as reservas. Nesse método são atualizado as tabelas
    * reserva, cliente e financeiro.
    * @param checkin - Data de entrada da reserva
    * @param checkout - Data de saida da reserva
    * @param nome - Nome do cliente da reserva
    * @param cpf - CPF do cliente da reserva
    * @param telefone - Telefone do cliente da reserva
    * @param numeroQuarto - Numero do quarto da reserva
    * @param tipoQuarto - Tipo do quarto da reserva(luxo,comum)
    * @param email - Email do cliente da reserva
     */
    public static void atualizarReserva(Date checkin, Date checkout, String nome,
            String cpf, String telefone, String numeroQuarto, String tipoQuarto, String email) {
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
        /*Estabelecendo a conexão com a base de dados*/
        Connection conexao = estabelecerConexao();
        /*Pegando id do cliente desejado de acordo o CPF*/
        Integer idCliente = obtendoIdCliente(cpf);

        /*Query que vai ser executada na no MySQL.*/
        String query1 = "UPDATE reserva SET Checkin=?, Checkout=?, Quarto=?, TipoQuarto=?, Email=? WHERE FK_IdCliente = ?";
        /*Preparação da Query */
        PreparedStatement pstmt1 = conexao.prepareStatement(query1);
        /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
        interrograções*/
        pstmt1.setDate(1, new java.sql.Date(checkin.getTime()));
        pstmt1.setDate(2, new java.sql.Date(checkout.getTime()));
        pstmt1.setString(3, numeroQuarto);
        pstmt1.setString(4, tipoQuarto);   
        pstmt1.setInt(5, idCliente);
        pstmt1.executeUpdate();

        /* Atualiza o cliente na tabela (exceto CPF)*/
        String query2 = "UPDATE cliente SET Nome=?, Telefone=?, Email=? WHERE CPF=?";
        /*Preparação da Query */
        PreparedStatement pstmt2 = conexao.prepareStatement(query2);
        /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
        interrograções*/
        pstmt2.setString(1, nome);
        pstmt2.setString(2, telefone);
        pstmt2.setString(3, email);
        pstmt2.setString(4, cpf);
        /*Execução da Query*/
        pstmt2.executeUpdate();
        
        /*Tratando possíveis erros que podem ocorrer*/
      } catch (SQLException e) {
          System.out.println("Error: " + e.getMessage());
      }
    }
    
    /**
    * Método que apaga reservas.
    * @param checkin - Data de entrada da reserva
    * @param checkout - Data de saida da reserva
    * @param numeroQuarto - Numero do quarto da reserva
    * @param tipoQuarto - Tipo do quarto da reserva(luxo,comum)
    * @param cpf - CPF do cliente da reserva
    */
    public static void deletarReserva(Date checkin, Date checkout,String numeroQuarto,String tipoQuarto,String cpf){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        /*Estabelecendo a conexão com a base de dados*/
        try(Connection conexao = estabelecerConexao()){
            /*Query que vai ser executada na no MySQL.*/
            String query1 = "DELETE FROM reserva WHERE FK_IdCliente=? AND TipoQuarto=? AND Quarto=?";
            /*Query que vai ser executada na no MySQL.*/
            String query2 = "DELETE FROM cliente WHERE IdCliente=?";
            
            /*Pegando id do cliente desejado de acordo o CPF*/
            int idCliente = obtendoIdCliente(cpf);
            /*Preparação da Query */
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt1.setInt(1, idCliente);
            pstmt1.setString(2, tipoQuarto);
            pstmt1.setString(3, numeroQuarto);
            /*Execução da Query*/
            pstmt1.executeUpdate();
            
            /*Preparação da Query */
            PreparedStatement pstmt2 = conexao.prepareStatement(query2);
            /*Na Query foram passado "?" e esses comandos abaixo substituem essas 
            interrograções*/
            pstmt2.setInt(1, idCliente);
            /*Execução da Query*/
            pstmt2.executeUpdate();

            /*Tratando possíveis erros que podem ocorrer*/
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    /**
     * Método utilizado na tela de reserva, e visualiza todos as reservas presentes na
     * base de dados. 
     * @return ResultSet - Elementos presentes na base de dados.
     */
    public static ResultSet visualizarReserva(){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try{
            ResultSet resultSet;
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL.*/
            String query = "SELECT Checkin, Checkout, TipoQuarto, Quarto FROM reserva;";
            /*Preparação da Query */
            PreparedStatement  pstmt = conexao.prepareStatement(query);
            /*Execução da Query*/
            resultSet = pstmt.executeQuery(); 
            
            return resultSet;
            
            /*Tratando possíveis erros que podem ocorrer*/
        } catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }
    /**
     * Método utilizado na tela do cliente, e visualiza todos os clientes presentes na
     * base de dados. 
     * @return ResultSet - Elementos presentes na base de dados.
     */
    public static ResultSet visualizarCliente(){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try {
            /* Estabelecendo a conexão com a base de dados */
            Connection conexao = estabelecerConexao();
            /* Query que vai ser executada no MySQL */
            String query = "SELECT * FROM cliente;";
            /* Preparação da Query */
            PreparedStatement pstmt = conexao.prepareStatement(query);
            /* Execução da Query */
            ResultSet resultSet = pstmt.executeQuery();

            return resultSet;

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return null;
    }

     /**
     * Método utilizado na tela do funcionario, e visualiza todos os funcionários presentes na
     * base de dados. 
     * @return ResultSet - Elementos presentes na base de dados.
     */
     public static ResultSet visualizarFuncionario(){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try{
            ResultSet resultSet;
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL.*/
            String query = "SELECT * FROM funcionario;";
            /*Preparação da Query *//*Execução da Query*/
            PreparedStatement  pstmt = conexao.prepareStatement(query);
            /*Execução da Query*/
            resultSet = pstmt.executeQuery(); 

            return resultSet;
            
            /*Tratando possíveis erros que podem ocorrer*/
        } catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }
     /**
     * Método utilizado na tela do financeiro, e visualiza todos
     * @return ResultSet - Elementos presentes na base de dados. 
     */
    public static ResultSet visualizarFinanceiro(){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try{
            ResultSet resultSet;
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL.*/
            String query = "SELECT * FROM financeiro;";
            /*Preparação da Query *//*Execução da Query*/
            PreparedStatement  pstmt = conexao.prepareStatement(query);
            /*Execução da Query*/
            resultSet = pstmt.executeQuery();
            
            return resultSet;
            
            /*Tratando possíveis erros que podem ocorrer*/
        } catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }
    /**
     * Método utilizado na tela do endereco, e visualiza todos
     * @return ResultSet - Elementos presentes na base de dados.
     */
    public static ResultSet visualizarEndereco(){
        /*Tratando possíveis excessões que podem ocorrer durante a execução, consultas
        e comparações com a base de dados.*/
        try{
            ResultSet resultSet;
            /*Estabelecendo a conexão com a base de dados*/
            Connection conexao = estabelecerConexao();
            /*Query que vai ser executada na no MySQL.*/
            String query = "SELECT * FROM endereco;";
            /*Preparação da Query *//*Execução da Query*/
            PreparedStatement  pstmt = conexao.prepareStatement(query);
            /*Execução da Query*/
            resultSet = pstmt.executeQuery(); 
            
            return resultSet;
            
            /*Tratando possíveis erros que podem ocorrer*/
        } catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }
    
        //Para esse código vai ser preciso criar mais consultas SQL
     public static void atualizarFinanceiro(String cpf, String parcelas, String pagamento,int valortotal) {
          try {
            Connection conexao = estabelecerConexao();
//            Integer idCliente = obtendoIdCliente(cpf);
              
             // Atualiza a reserva na tabela
            String query1 = "UPDATE financeiro SET forma_pagamento=?, parcelas=?, valor_total=?";
            PreparedStatement pstmt1 = conexao.prepareStatement(query1);
            pstmt1.setString(1, pagamento);
            pstmt1.setString(2, parcelas);
            pstmt1.setInt(3, valortotal);

            pstmt1.executeUpdate();

          } catch (SQLException e) {
              System.out.println("Error: " + e.getMessage());
          }
      }
     
//     public static void cadastrarFinanceiro(String formaPagamento,String parcelas,float valorTotal){
//         
//        try {
//           Connection conexao = estabelecerConexao();
//
//           // Inserindo o cliente na tabela se ainda não existir
//           Integer idCliente = obtendoIdCliente(cpf);
//           if (idCliente == null) {
//               String queryCliente = "INSERT INTO financeiro(forma_pagamento, parcelas, valor_total,fk_id_reserva) VALUES (?, ?, ?, ?)";
//               PreparedStatement pstmt = conexao.prepareStatement(queryCliente, Statement.RETURN_GENERATED_KEYS);
//               pstmt.setString(1, formaPagamento);
//               pstmt.setString(2, parcelas);
//               pstmt.setFloat(3, valorTotal);
////               pstmt.setString(4, email);
//               pstmt.executeUpdate();
//
//               // Obtendo o ID do cliente recém-inserido
//               ResultSet generatedKeys = pstmt.getGeneratedKeys();
//               if (generatedKeys.next()) {
//                   idCliente = generatedKeys.getInt(1);
//               } else {
//                   // Trate o caso em que o ID do cliente não pôde ser obtido
//                   throw new SQLException("Não foi possível obter o ID do cliente recém-inserido.");
//               }
//                }
//        } catch (SQLException e){
//
//        }
//     }
}