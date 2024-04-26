# Conversor de Moedas - Challenge Back End ONE

<p align="center">
 <img src="https://d335luupugsy2.cloudfront.net/cms/files/10224/1662417840/$p28qj3ehjl" width="400" />
 <img src="https://d335luupugsy2.cloudfront.net/cms/files/10224/1662417840/$u07pzwncrr" width="400" />
</p>

## Descrição

Conversor de Moedas oferece interação textual (via console) com os usuários, proporcionando opções distintas de conversões de moedas em um menu. A taxa de conversão não é estática, mas sim dinamicamente obtida por meio de uma API([Exchange Rate API](https://www.exchangerate-api.com/)), garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz. Além disso, funcionalidades extra é histórico das conversões e logs das conversões.

## Índice

- [Conversor de Moedas - Challenge Back End ONE](#conversor-de-moedas---challenge-back-end-one)
  - [Descrição](#descrição)
  - [Índice](#índice)
  - [Tecnologias Usadas e Dependências](#tecnologias-usadas-e-dependências)
  - [Instalação](#instalação)
    - [Pré-requisitos](#pré-requisitos)
    - [Configuração](#configuração)
  - [Como Usar](#como-usar)
  - [Screenshots](#screenshots)

## Tecnologias Usadas e Dependências

- Java (JDK 21)
- Gson
- IDE: IntelliJ IDEA
- API: [Exchange Rate API](https://www.exchangerate-api.com/)

## Instalação
### Pré-requisitos

Antes de começar, verifique se tu  atendeu aos seguintes requisitos:
- Necessário Java isntalado.
- Adiconar Gson como dependencia no projeto.
- Criar variavel de ambiente com nome de `API_KEY_EXCHANGE_RATE`

### Configuração

Para instalar o Nome do Projeto, siga estes passos:


- Instale o Java JDK: Certifique-se de que o Java JDK está instalado em seu sistema. 
- Adicione Gson como dependência: Para adicionar a biblioteca Gson ao seu projeto, eu fiz o download, mas você pode usar o Maven ou Gradle. 
- Configure a variável de ambiente API_KEY_EXCHANGE_RATE: Crie uma variável de ambiente chamada API_KEY_EXCHANGE_RATE e atribua a ela a chave da API que você obteve do Exchange Rate API. Isso permitirá que o projeto acesse a API para obter taxas de câmbio em tempo real.

## Como Usar

Para executar o projeto no IntelliJ IDEA, siga os passos abaixo:

- Abra o projeto no IntelliJ IDEA: Inicie o IntelliJ IDEA e abra o projeto que você deseja executar.
- Localize a classe principal: No painel "Project" (Alt+1), navegue até a pasta src e encontre o arquivo da classe principal do seu projeto - Main.java. 
- Execute a classe principal: Abra o arquivo da classe principal no editor. No editor, selecione "Run" ou SHIFT + F10. 
- Interaja com o aplicativo: Após a execução, você poderá interagir com o aplicativo através do console, seguindo as instruções fornecidas pelo menu interativo.

## Screenshots
![alt text](./screenshots/image.png)
![alt text](./screenshots/image-2.png)
![alt text](./screenshots/image-1.png)