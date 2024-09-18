# Projeto de Microserviços de E-commerce
Este projeto implementa uma arquitetura de microserviços para um sistema de e-commerce, utilizando Spring Boot e Spring Cloud. Ele foi desenvolvido para demonstrar a divisão de funcionalidades e a comunicação entre diferentes serviços de forma desacoplada e escalável.
<img src="https://imgs.search.brave.com/S1spvSVMR_S6rUYjv_0Az1hhx36iu7K-5JyE3OwTMz0/rs:fit:500:0:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvcHQvdGh1bWIv/My8zMC9KYXZhX3By/b2dyYW1taW5nX2xh/bmd1YWdlX2xvZ28u/c3ZnLzY0MHB4LUph/dmFfcHJvZ3JhbW1p/bmdfbGFuZ3VhZ2Vf/bG9nby5zdmcucG5n" alt="Descrição da Imagem" width="75" height="75">



## Funcionalidades Implementadas
- [x] Configuração do Eureka Server
- [x] Configuração do Config Server
- [x] Serviço de Loja básico
- [x] Serviço de Fornecedor básico
- [x] Registro dos serviços no Eureka
- [x] Comunicação entre Loja e Fornecedor via Eureka
- [x] Configuração do LoadBalancer para o RestTemplate
- [x] Modelo básico de Info para o Fornecedor
- [x] Endpoint para buscar informações do Fornecedor por estado
- [x] DTO para Compra, ItemDaCompra e Endereço na Loja
- [x] Serviço básico de Compra na Loja
## Funcionalidades Faltantes ou a Serem Melhoradas
- [ ] Implementação completa do fluxo de compra
- [ ] Persistência de dados para a Loja
- [ ] Tratamento de erros e exceções
- [ ] Implementação de testes unitários e de integração
- [ ] Segurança (autenticação e autorização)
- [ ] Logging e monitoramento
- [ ] Circuit Breaker para lidar com falhas de serviço
- [ ] Implementação de filas para processamento assíncrono
- [ ] Documentação da API (com Swagger)
- [ ] Containerização dos serviços (com Docker)
- [ ] Configuração de ambiente de produção
- [ ] Implementação de cache para melhorar o desempenho
- [ ] Versionamento da API
- [ ] Implementação de métricas e health checks
- [ ] Configuração de CI/CD
 Implementação de transações distribuídas (se necessário)
 Criptografia de dados sensíveis
 Implementação de mais funcionalidades específicas do negócio (gerenciamento de estoque, pagamentos)

## Componentes
O projeto é composto por quatro microserviços principais:

### Eureka Server: 
- Serviço de descoberta responsável por registrar e localizar outros microserviços.
### Config Server: 
- Servidor de configuração centralizada para gerenciar as configurações dos microserviços.
### Loja: 
- Serviço responsável por processar as compras dos clientes.
### Fornecedor: 
- Serviço que gerencia as informações dos fornecedores.

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.3.3
- Spring Cloud
- Netflix Eureka
- Spring Cloud Config
- MySQL
- Maven
- Lombok

## Como Executar
Siga os passos abaixo para configurar e executar o projeto localmente:

-Clone este repositório:
~~~git
git clone https://github.com/seu-repositorio.git
~~~
- Importe os projetos em sua IDE preferida (IntelliJ, Eclipse, VS Code, etc.).

- Certifique-se de que o MySQL esteja em execução e configurado corretamente para o serviço Fornecedor. Atualize as propriedades de conexão no arquivo application.yml do serviço Fornecedor conforme necessário.

## Inicie os microserviços na seguinte ordem:

- Eureka Server: Inicie o serviço de descoberta.
- Config Server: Inicie o servidor de configuração centralizada.
- Fornecedor: Inicie o serviço de gerenciamento de fornecedores.
- Loja: Inicie o serviço responsável por processar as compras.
- Certifique-se de que os serviços foram registrados corretamente no Eureka Server e estão funcionando conforme o esperado.

## Estrutura do Projeto
- Eureka Server: Permite a descoberta e registro dinâmico de microserviços.
- Config Server: Gerencia as configurações centralizadas para os microserviços.
- Fornecedor: Fornece informações sobre fornecedores, como produtos disponíveis e localização.
- Loja: Consome o serviço Fornecedor para consultar e processar as compras dos clientes.
## Banco de Dados
O projeto utiliza o MySQL como banco de dados para o serviço Fornecedor.
As configurações de conexão ao banco de dados podem ser encontradas no arquivo application.yml do serviço Fornecedor.
## Configurações
Certifique-se de configurar adequadamente as propriedades de banco de dados no arquivo application.yml do serviço Fornecedor.
As configurações globais são gerenciadas pelo Config Server e podem ser alteradas no repositório de configuração central.
Observações
Este projeto é uma demonstração e pode precisar de ajustes para um ambiente de produção.
Certifique-se de configurar adequadamente as propriedades de banco de dados, configurações de ambiente e segurança.
