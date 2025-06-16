# Sistema de Gerenciamento de Veículos com JDBC

### 📋 Descrição do Projeto

Aplicação de linha de comando para cadastro e gerenciamento de diversos tipos de veículos, utilizando Java com JDBC para persistência em banco de dados MySQL. O sistema permite o cadastro de veículos domésticos, motos, caminhões, bicicletas e skates, cada um com seus atributos específicos.

#### Componentes principais

- ConexaoDB: responsável por estabelecer a conexão com o banco.
- Main: realiza uma consulta simples ao banco e imprime os dados no console.

#### Funcionalidades principais

- Cadastro de 5 tipos de veículos (Carros, Motos, Caminhões, Bicicletas e Skates)
- Validação de entrada de dados
- Interface intuitiva com menus hierárquicos

### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- Banco de dados relacional (ex: MySQL, PostgreSQL, SQLite)
- Driver JDBC do MySQL (mysql-connector-java.jar)
- IDE Java (Eclipse, IntelliJ, etc.)

### 🚀 Instalação e execução

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/CONEXAODB
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Adicione o driver JDBC ao classpath do projeto.

Configure a URL, usuário e senha de conexão no arquivo ConexaoDB.java:

```
private static final String URL = "jdbc:mysql://localhost:3306/sistema_veiculos";
private static final String USUARIO = "root"; // Usuário Root
private static final String SENHA = ""; 
```

5. Execute a classe Main.java para testar a conexão e visualizar os dados retornados da consulta.

### 🛠️ Funcionalidades Implementadas

Sistema de menus hierárquico
- Menu principal para escolha de ação (cadastrar/sair)
- Submenu com opções para cada tipo de veículo

Persistência com JDBC
- Conexão gerenciada centralmente
- Prepared Statements para segurança contra SQL injection
- Operações de inserção para cada tipo de veículo

Validações:
- Tratamento de tipos de dados incorretos
- Limpeza de buffer após leitura de números

### 📝 Exemplo de saída

#### Interface Principal

![image](https://github.com/user-attachments/assets/b3bb2591-b83f-4645-96be-cac77fdae6ee)
![image](https://github.com/user-attachments/assets/0c4537c8-47ff-431d-97c7-0288be09600f)


#### Inserção de Veículo Doméstico

![image](https://github.com/user-attachments/assets/ce1d4c9a-153e-4e17-99c9-2c84916fff51)
![image](https://github.com/user-attachments/assets/50ef9f23-7e43-4ba4-b045-b9beb2b43ecc)


#### Inserção de Moto

![image](https://github.com/user-attachments/assets/abcf054c-3840-4956-858b-a4317efb2feb)
![image](https://github.com/user-attachments/assets/b540c832-7bbb-44b4-b723-0d485972e0c2)


#### Inserção de Caminhão

![image](https://github.com/user-attachments/assets/e471a2c5-3e88-4cc5-9220-56cad07fd678)
![image](https://github.com/user-attachments/assets/37644c70-d1ca-400a-bc38-3379e8c4854d)


#### Inserção de Bicicleta

![image](https://github.com/user-attachments/assets/7fc54228-c8d4-42bb-b987-0357848a6191)
![image](https://github.com/user-attachments/assets/618c3bd7-8048-4996-b8c4-e50bfddcc114)


#### Inserção de Skate

![image](https://github.com/user-attachments/assets/1af3edca-2535-49f3-bac5-ac4241eed3c8)
![image](https://github.com/user-attachments/assets/7d34b124-ce07-4711-bddf-d178fe8262a8)


#### Sair

![image](https://github.com/user-attachments/assets/72686336-7652-45a6-bcd8-52c447006330)
![image](https://github.com/user-attachments/assets/f0cfd28d-52be-49fe-a853-65883e02dfd6)


## ✒️ Autores

* **Mateus Franco Bezerra** - *Trabalho Inicial* - SISTEMA_VEICULOS
