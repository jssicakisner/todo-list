# To-Do List

Este é um projeto para o back-end de um gerenciador de tarefas simples em Java desenvolvido utilizando o Spring Boot. O objetivo deste aplicativo é permitir que os usuários gerenciem suas tarefas de forma eficaz, com recursos avançados de autenticação, autorização e visulização das tarefas.

O **Deploy** foi realizado com [Render](https://render.com/) e as APIs estão disponíveis para teste na seguinte url: https://to-do-list-itj5.onrender.com 

## Tecnologias Utilizadas

- Spring Boot
- Maven
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Boot DevTools
- H2 Database
- Favre.lib

## Funcionalidades do Projeto

1. O projeto inclui um sistema de autenticação e autorização de usuários. Os usuários podem se registrar, fazer login e acessar suas próprias listas de tarefas. A autorização garante que um usuário só possa acessar e modificar suas próprias tarefas.
2. Os usuários têm a capacidade de criar, atualizar e excluir tarefas. As tarefas podem ser marcadas como concluídas, atualizadas com novas descrições ou datas de vencimento e excluídas conforme necessário.
3. O projeto utiliza a biblioteca Favre.lib para verificar a data de criação das tarefas. Isso permite rastrear quando uma tarefa foi criada e fornecer informações úteis aos usuários.

## Executando o Projeto

Para executar o projeto, siga estas etapas:

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o Java JDK instalado em seu sistema.
3. Execute o aplicativo usando o Maven: `mvn spring-boot:run`.

Navegue para `http://localhost:8080/h2-console` para acessar o banco de dados local. Os testes da API foram realizados com [Postman](https://www.postman.com/).