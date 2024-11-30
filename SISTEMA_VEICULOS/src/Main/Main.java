package Main; // Esta classe pertence ao pacote main
import java.util.HashSet; //Importação de Classes e Bibliotecas necessárias para funcionalidade do código
import java.nio.file.spi.FileSystemProvider;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.aula.conexao.*;
	

// Criação da Classe Main da interface
public class Main {
    
		public static void main(String[] args) {
			Connection conexao = ConexaoDB.conectar(); // Puxa o método Conectar para estabelecer a conexão com o Banco de Dados
				
			Scanner scanner = new Scanner (System.in); // Cria o Objeto scanner para receber os números digitado
			Set<String> veiculos = new HashSet<>(); // Cria um Set para armazenar nomes de frutas
			
			while(true) {
				try {
			
			// Exibição das opções do Usuário
			System.out.println("\n===== Menu Principal ======\n"); 
			System.out.println("Deseja adicionar algum Veículo?\n");
			System.out.println("1. Sim, desejo.");
			System.out.println("2. Não desejo.");
			
			System.out.println("------------------------");
			System.out.println("Escolha uma opção: ");
			
			int opcao0 = scanner.nextInt(); // Váriavel que armazenará o número digitado pelo Usuário
			scanner.nextLine(); // Limpa o buffer
			
			// Inicialização do Switch de escolhas do Usuário	
			switch(opcao0) {
			case 1: // Caso o Usuário escolha a Opção 1 (Gereciamento de Alimentos)
			
			
			// Enquanto o usuário digitar os números dentre as opções, a operação continua
			while(true) {
				try {
					
					System.out.println("\n------- Veículos -------"); 
					System.out.println("1. Inserir Veículo Doméstico");
					System.out.println("2. Inserir Moto");
					System.out.println("3. Inserir Caminhão");
					System.out.println("4. Inserir Bicicleta");
					System.out.println("5. Inserir Skate");
					System.out.println("0. Sair");
					System.out.println("------------------------");
					System.out.println("\nEscolha uma opção: ");
					
					int opcao = scanner.nextInt(); // Váriavel que armazenará o número digitado pelo Usuário
					scanner.nextLine(); // Limpa o buffer
					
					// Inicialização do Switch de escolhas do Usuário
					switch(opcao) {
					case 1: // Caso o Usuário escolha a Opção 1 (Inserir Veículo Doméstico)
					
					// Verifica se a conexão foi feita
					if(conexao != null) {
						// Define a instrução sql para inserir os dados na tabela veiculo_domestico
						String sql = "INSERT INTO veiculo_domestico (modelo, montadora, cor, km, qtd_passageiros, tipo_freio, airbag, ano_fabri) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
						
						System.out.println("Digite o Modelo do Veículo: "); // Solicita a inserção do modelo
						String modelo = scanner.nextLine(); // Armazena o modelo
						
						System.out.println("Digite a Montadora do Veículo: "); // Solicita a inserção da montadora
						String montadora = scanner.nextLine(); // Armazena a montadora
						
						System.out.println("Digite a Cor do Veículo: "); // Solicita a inserção da cor
						String cor = scanner.nextLine(); // Armazena a cor
						
						System.out.println("Digite a Kilometragem do Veículo: "); // Solicita a inserção da Kilometragem
						float km = scanner.nextFloat(); // Armazena a Kilometragem
						scanner.nextLine(); // Limpa o Buffer
						
						System.out.println("Digite a Qtd de Passageiros do Veículo: "); // Solicita a inserção da quantidade de passageiros
						int qtd_passageiros = scanner.nextInt(); // Armazena a quantidade de passageiros
						scanner.nextLine(); // Limpa o Buffer
						
						System.out.println("Digite o Tipo de Freio do Veículo: "); // Solicita a inserção do tipo de freio
						String tipo_freio = scanner.nextLine(); // Armazena o tipo de freio
						
						System.out.println("Digite o Tipo Airbag do Veículo: "); // Solicita a inserção da airbag
						String airbag = scanner.nextLine(); // Armazena o airbag
						
						System.out.println("Digite a Data de Fabricação do Veículo: "); // Solicita a inserção do ano de fabricação
						String ano_fabri = scanner.nextLine(); // Armazena o ano de fabricação
						
						
						try { // Realização da inserção dos dados no banco de dados
							
							PreparedStatement stmt = conexao.prepareStatement(sql); // Cria um objeto PreparedStatement para executar a instrução
							stmt.setString(1, modelo); // Substitui o primeiro (?) pelo novo modelo informado
							stmt.setString(2, montadora); // Substitui o segundo (?) pela montadora informada
							stmt.setString(3, cor); // Substitui o terceiro (?) pela cor informada
							stmt.setFloat(4, km); // Substitui o quarto (?) pela klometragem infomada
							stmt.setInt(5, qtd_passageiros); // Substitui o quinto (?) pelo quantidade de passegiros infomada
							stmt.setString(6, tipo_freio); // Substitui o sexto (?) pela tipo de freio informado
							stmt.setString(7, airbag); // Substitui o sétimo (?) pelo airbag
							stmt.setString(8, ano_fabri); // Substitui o sétimo (?) pelo ano de fabricação

							
							int rowsUpdated = stmt.executeUpdate(); // Executa a instrução
							
							System.out.println("\nDados inseridos com sucesso!"); // Informa que os dados foram inseridos com sucesso
						} catch (SQLException e ) {
							System.err.println("Erro ao inserir dados: " + e.getMessage()); // Informa que houve um erro na inserção de dados
						}						
					} 	break;

					case 2: // Caso o Usuário escolha a Opção 2 (Inserir Moto)
						// Verifica se a conexão foi feita
						if(conexao != null) {
							// Define a instrução sql para inserir os dados na tabela moto
							String sql = "INSERT INTO moto (modelo, montadora, cor, km, cilindrada, torque, ano_fabri) VALUES (?, ?, ?, ?, ?, ?, ?)";
							
							System.out.println("Digite o Modelo da Moto: "); // Solicita a inserção do modelo
							String modelo = scanner.nextLine(); // Armazena o modelo
							
							System.out.println("Digite a Montadora da Moto: "); // Solicita a inserção da montadora
							String montadora = scanner.nextLine(); // Armazena a montadora
							
							System.out.println("Digite a Cor da Moto: "); // Solicita a inserção da cor
							String cor = scanner.nextLine(); // Armazena a cor
							
							System.out.println("Digite a Kilometragem da Moto: "); // Solicita a inserção da Kilometragem
							float km = scanner.nextFloat(); // Armazena a Kilometragem
							scanner.nextLine(); // Limpa o buffer
							
							System.out.println("Digite as Cilindradas da Moto: "); // Solicita a inserção das cilindradas
							int cilindrada = scanner.nextInt(); // Armazena as cilindradas
							scanner.nextLine(); // Limpa o buffer
							
							System.out.println("Digite o Torque da Moto: "); // Solicita a inserção do torque
							float torque = scanner.nextFloat(); // Armazena a torque
							scanner.nextLine(); // Limpa o buffer
							
							System.out.println("Digite o Ano de Fabricação da Moto: "); // Solicita a inserção do ano de fabricação 
							String ano_fabri = scanner.nextLine(); // Armazena o ano de fabricação
							
							
							try { // Realização da inserção dos dados no banco de dados
								
								PreparedStatement stmt = conexao.prepareStatement(sql); // Cria um objeto PreparedStatement para executar a instrução
								stmt.setString(1, modelo); // Substitui o primeiro (?) pelo modelo informado
								stmt.setString(2, montadora); // Substitui o segundo (?) pela montadora informada
								stmt.setString(3, cor); // Substitui o terceiro (?) pela cor informada
								stmt.setFloat(4, km); // Substitui o quarto (?) pela klometragem infomada
								stmt.setInt(5, cilindrada); // Substitui o quinto (?) pelas cilindradas infomadas
								stmt.setFloat(6, torque); // Substitui o sexto (?) pelo torque informado
								stmt.setString(7, ano_fabri); // Substitui o sétimo (?) pelo ano de fabricação informado

								
								int rowsUpdated = stmt.executeUpdate(); // Executa a instrução
								
								System.out.println("\nDados inseridos com sucesso!"); // Informa que os dados foram inseridos com sucesso
							} catch (SQLException e ) {
								System.err.println("Erro ao inserir dados: " + e.getMessage()); // Informa que houve um erro na inserção de dados
							}						
						} 	break;
						
						
					case 3: // Caso o Usuário escolha a Opção 3 (Inserir Caminhão)
						// Verifica se a conexão foi feita
						if(conexao != null) {
							// Define a instrução sql para inserir os dados na tabela caminhao
							String sql = "INSERT INTO caminhao (modelo, montadora, cor, km, tipo_eixo, peso, ano_fabri) VALUES (?, ?, ?, ?, ?, ?, ?)";
							
							System.out.println("Digite o Modelo do Caminhão: "); // Solicita a inserção do modelo
							String modelo = scanner.nextLine(); // Armazena o modelo
							
							System.out.println("Digite a Montadora do Caminhão: "); // Solicita a inserção da montadora
							String montadora = scanner.nextLine(); // Armazena a montadora
							
							System.out.println("Digite a Cor do Caminhão: "); // Solicita a inserção da cor
							String cor = scanner.nextLine(); // Armazena a cor
							
							System.out.println("Digite a Kilometragem do Caminhão: "); // Solicita a inserção da Kilometragem
							float km = scanner.nextFloat(); // Armazena a Kilometragem
							scanner.nextLine(); // Limpa o buffer
							
							System.out.println("Digite o tipo de Eixo do Caminhão: "); // Solicita a inserção da quantidade de eixos
							String tipo_eixo = scanner.nextLine(); // Armazena a quantidade de eixos
							
							System.out.println("Digite o Peso do Caminhão: "); // Solicita a inserção do peso
							float peso = scanner.nextFloat(); // Armazena o peso
							scanner.nextLine(); // Limpa o buffer
							
							System.out.println("Digite a Data de Fabricação do Veículo: "); // Solicita a inserção da ano_fabri 
							String ano_fabri = scanner.nextLine(); // Armazena o ano_fabri 
							
							
							try { // Realização da inserção dos dados no banco de dados
								
								PreparedStatement stmt = conexao.prepareStatement(sql); // Cria um objeto PreparedStatement para executar a instrução
								stmt.setString(1, modelo); // Substitui o primeiro (?) pelo novo modelo informado
								stmt.setString(2, montadora); // Substitui o segundo (?) pela montadora informada
								stmt.setString(3, cor); // Substitui o terceiro (?) pela cor informada
								stmt.setFloat(4, km); // Substitui o quarto (?) pela klometragem infomada
								stmt.setString(5, tipo_eixo); // Substitui o quinto (?) pelo quantidade de eixos infomada
								stmt.setFloat(6, peso); // Substitui o sexto (?) pelo peso informado
								stmt.setString(7, ano_fabri); // Substitui o sétimo (?) pelo ano de fabricação
								
								int rowsUpdated = stmt.executeUpdate(); // Executa a instrução
								
								System.out.println("\nDados inseridos com sucesso!"); // Informa que os dados foram inseridos com sucesso
							} catch (SQLException e ) {
								System.err.println("Erro ao inserir dados: " + e.getMessage()); // Informa que houve um erro na inserção de dados
							}						
						} 	break;
						
					case 4: // Caso o Usuário escolha a Opção 4 (Inserir Bicicleta)
						// Verifica se a conexão foi feita
						if(conexao != null) {
							// Define a instrução sql para inserir os dados na tabela veiculo_domestico
							String sql = "INSERT INTO bicicleta (modelo, marca, cor, material, qtd_marchas, amortecedor, ano_fabri) VALUES (?, ?, ?, ?, ?, ?, ?)";
							
							System.out.println("Digite o Modelo da Bicicleta: "); // Solicita a inserção do modelo
							String modelo = scanner.nextLine(); // Armazena o modelo
							
							System.out.println("Digite a Marca da Bicicleta: "); // Solicita a inserção da marca
							String marca = scanner.nextLine(); // Armazena a marca
							
							System.out.println("Digite a Cor da Bicicleta: "); // Solicita a inserção da cor
							String cor = scanner.nextLine(); // Armazena a cor
							
							System.out.println("Digite o Material da Bicicleta: "); // Solicita a inserção do material
							String material = scanner.nextLine(); // Armazena a material
							
							System.out.println("Digite a Qtd de Marchas da Bicicleta: "); // Solicita a inserção da quantidade de marchas
							int qtd_marchas= scanner.nextInt(); // Armazena a quantidade de marchas
							scanner.nextLine(); // Limpa o buffer
							
							System.out.println("Digite o Tipo de Amortecedor da Bicicleta: "); // Solicita a inserção do tipo de amortecedor
							String amortecedor = scanner.nextLine(); // Armazena o tipo de amortecedor
							
							System.out.println("Digite a Data de Fabricação do Veículo: "); // Solicita a inserção do ano de fabricação
							String ano_fabri = scanner.nextLine(); // Armazena o ano de fabricação
							
							
							try { // Realização da inserção dos dados no banco de dados
								
								PreparedStatement stmt = conexao.prepareStatement(sql); // Cria um objeto PreparedStatement para executar a instrução
								stmt.setString(1, modelo); // Substitui o primeiro (?) pelo novo modelo informado
								stmt.setString(2, marca); // Substitui o segundo (?) pela marca informada
								stmt.setString(3, cor); // Substitui o terceiro (?) pela cor informada
								stmt.setString(4, material); // Substitui o quarto (?) pelo material informado
								stmt.setInt(5, qtd_marchas); // Substitui o quinto (?) pelo quantidade de passegiros infomada
								stmt.setString(6, amortecedor); // Substitui o sexto (?) pela tipo de amortecedor informado
								stmt.setString(7, ano_fabri); // Substitui o sétimo (?) pelo ano de fabricação

								
								int rowsUpdated = stmt.executeUpdate(); // Executa a instrução
								
								System.out.println("\nDados inseridos com sucesso!"); // Informa que os dados foram inseridos com sucesso
							} catch (SQLException e ) {
								System.err.println("Erro ao inserir dados: " + e.getMessage()); // Informa que houve um erro na inserção de dados
							}						
						} 	break;
						
					case 5: /// Caso o Usuário escolha a Opção 5 (Inserir Skate)
						// Verifica se a conexão foi feita
						if(conexao != null) {
							// Define a instrução sql para inserir os dados na tabela veiculo_domestico
							String sql = "INSERT INTO skate (modelo, marca, cor, tipo_rodas, ano_fabri) VALUES (?, ?, ?, ?, ?)";
							
							System.out.println("Digite o Modelo do Skate: "); // Solicita a inserção do modelo
							String modelo = scanner.nextLine(); // Armazena o modelo
							
							System.out.println("Digite a Marca do Skate: "); // Solicita a inserção da marca
							String marca = scanner.nextLine(); // Armazena a marca
							
							System.out.println("Digite a Cor do Skate: "); // Solicita a inserção da cor
							String cor = scanner.nextLine(); // Armazena a montadora
							
							System.out.println("Digite o Tipo de Rodas do Skate: "); // Solicita a inserção do tipo de rodas
							String tipo_rodas = scanner.nextLine(); // Armazena o tipo de rodas
						
							System.out.println("Digite a Data de Fabricação do Veículo: "); // Solicita a inserção doano de fabricação
							String ano_fabri = scanner.nextLine(); // Armazena o ano de fabricação
							
							
							try { // Realização da inserção dos dados no banco de dados
								
								PreparedStatement stmt = conexao.prepareStatement(sql); // Cria um objeto PreparedStatement para executar a instrução
								stmt.setString(1, modelo); // Substitui o primeiro (?) pelo novo modelo informado
								stmt.setString(2, marca); // Substitui o segundo (?) pela montadora informada
								stmt.setString(3, cor); // Substitui o terceiro (?) pela cor informada
								stmt.setString(4, tipo_rodas); // Substitui o quinto (?) pelo quantidade de passegiros infomada
								stmt.setString(5, ano_fabri); // Substitui o sétimo (?) pelo ano de fabricação

								
								int rowsUpdated = stmt.executeUpdate(); // Executa a instrução
								
								System.out.println("\nDados inseridos com sucesso!"); // Informa que os dados foram inseridos com sucesso
							} catch (SQLException e ) {
								System.err.println("Erro ao inserir dados: " + e.getMessage()); // Informa que houve um erro na inserção de dados
							}						
						} 	break;
					
					case 0: // Caso o Usuário queira sair do sistema (Sair)
						System.out.println("Saindo..."); // Mensagem que informa a saída
						scanner.close();
						return; // Encerra o programa
						
					default:
                       System.out.println("Opção inválida. Tente novamente."); // Informa que a opção digitada não existe e solicita uma nova
					}
				} catch (InputMismatchException e) {
	                // Caso o Usuário insira algum tipo de dado incorreto no lugar dos dígitos designidados
					System.out.println("Entrada inválida. Por favor, digite um número.");
					scanner.nextLine();
					}
			}
			
			case 2: // Caso o Usuário escolha a Opção 2 (Gereciamento de Vestuário)
				
				System.out.println("\nSaindo..."); // Mensagem que informa a saída
				scanner.close();
				return; // Encerra o programa
				
				
				default:
                    System.out.println("Opção inválida. Tente novamente."); // Informa que a opção digitada não existe e solicita uma nova
					}
				} catch (InputMismatchException e) {
	                // Caso o Usuário insira algum tipo de dado incorreto no lugar dos dígitos designidados
					System.out.println("Entrada inválida. Por favor, digite um número.");
					scanner.nextLine();
					}
				
				
				}
			}	
		}
		
