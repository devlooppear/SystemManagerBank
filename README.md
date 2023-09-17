# Sistema de Gerenciamento Bancário

## Descrição do Projeto

Este é um simples sistema de gerenciamento bancário desenvolvido em Java. Ele permite que os clientes acessem suas contas bancárias para consultar o saldo, fazer depósitos e retiradas. O projeto consiste em duas classes principais:

- `ClienteBanco`: Representa um cliente bancário com nome, sobrenome, CPF e saldo. Possui métodos para consultar saldo, depositar e retirar dinheiro.

- `GerenciaBanco`: É a classe principal que contém o programa de gerenciamento bancário. Ela permite que os usuários interajam com as contas dos clientes.

## Como Executar o Projeto

Para executar o projeto, siga estas etapas:

### Pré-requisitos

Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema. Você pode verificar a instalação executando o seguinte comando no terminal:

```
java -version
```

## Clonar o Repositório
Clone este repositório para o seu sistema local usando o seguinte comando:

```
git clone 
```
Substitua seu-usuario pelo seu nome de usuário GitHub, se aplicável.

Compilar o Código
Navegue até o diretório do projeto:

bash
Copy code
cd gerenciaBanco
Compile o código-fonte usando o Maven (certifique-se de que o Maven esteja instalado):

bash
Copy code
mvn compile
Executar o Programa
Após a compilação bem-sucedida, você pode executar o programa de gerenciamento bancário com o seguinte comando:

bash
Copy code
mvn exec:java -Dexec.mainClass="com.mycompany.gerenciabanco.GerenciaBanco"
Isso iniciará o programa e você verá um menu interativo no terminal.

Opções do Menu
O menu interativo oferece as seguintes opções:

Consultar Saldo
Realizar Depósito
Realizar Retirada
Encerrar
Escolha uma das opções digitando o número correspondente e siga as instruções.