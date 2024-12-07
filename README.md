# Projeto de Sistema de Vendas em Java

## Descrição
Este projeto foi desenvolvido como parte da disciplina **Imersão Profissional: Aplicando Orientação a Objetos** da faculdade.

Este projeto consiste em um sistema simples de vendas implementado em Java, composto por três classes principais:

1. **Carro**: Responsável por gerenciar as informações de veículos.
2. **Cliente**: Responsável por gerenciar os dados de clientes.
3. **Venda**: Realiza a validação e o processamento das vendas.

O sistema utiliza interação com o usuário através de caixas de diálogo (JOptionPane) para cadastrar dados, realizar operações e exibir resultados.

## Funcionalidades


### Classe `Carro`
- Cadastro de veículo com as informações:
  - ID
  - Modelo
  - Quilometragem
  - Valor de venda
- Atualização do valor de venda com aplicação de um desconto percentual.
- Exibição de um resumo dos dados do veículo.
![carro](https://github.com/user-attachments/assets/af0bec2b-eae5-4f25-bf65-bb1c12850844)



### Classe `Cliente`
- Cadastro de cliente com validação de idade (deve ser maior que 18 anos).
- Exibição de um resumo dos dados do cliente.
![cliente](https://github.com/user-attachments/assets/5765f248-e7f7-4150-b79d-561272e2e23b)

### Classe `Venda`
- Realiza a venda de um veículo para um cliente.
- Calcula o valor da parcela para financiamento em 36 meses.
- Valida se o cliente pode realizar a compra com base na regra:
  - O valor da parcela não pode exceder 30% da renda mensal do cliente.
![venda](https://github.com/user-attachments/assets/b1c244c5-bf14-4fad-addb-68caac332465)

### Classe `Main`
- Executa o fluxo principal:
  - Cria instâncias de `Carro` e `Cliente`.
  - Realiza o cadastro dos dados.
  - Aplica desconto no veículo e contabiliza o valor de venda atualizado.
![main](https://github.com/user-attachments/assets/175efcb0-d450-496c-8e10-fef46e824855)

## Como Executar o Projeto

Adicione uma imagem ilustrando o projeto carregado no IDE, como IntelliJ IDEA ou Eclipse, para ajudar os usuários a visualizar a configuração.

1. Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/javase-jdk-downloads.html) instalado no seu ambiente.
2. Importe as classes no seu IDE de preferência (por exemplo, IntelliJ IDEA ou Eclipse).
3. Certifique-se de que o código está organizado em pacotes correspondentes:
   - `Carro` para a classe `Carro`
   - `Cliente` para a classe `Cliente`
   - `Venda` para a classe `Venda`
4. Compile e execute o método `main` da classe `Main`.

## Estrutura do Projeto
```
src/
|-- Main.java
|-- Carro/
|   |-- Carro.java
|-- Cliente/
|   |-- Cliente.java
|-- Venda/
    |-- Venda.java
```

## Exemplo de Uso
Considere adicionar capturas de tela ou imagens das caixas de diálogo (JOptionPane) para ilustrar como o sistema interage com o usuário.

1. O sistema solicita os dados do carro, como modelo, quilometragem e valor de venda.
2. Em seguida, solicita os dados do cliente, como nome, idade e renda mensal.
3. Calcula o valor da parcela com base no valor do veículo e verifica se é viável realizar a venda.
4. Exibe uma mensagem indicando se a venda foi realizada com sucesso ou não.

## Melhorias Futuras
- Persistência de dados em um banco de dados.
- Interface gráfica para interação mais amigável.
- Implementação de testes unitários para validação do sistema.
- Opção de simulação de financiamentos com diferentes taxas de juros.

## Requisitos do Sistema
- Java 8 ou superior
- Ambiente de desenvolvimento Java (IDE ou linha de comando)

## Autor
Desenvolvido como um projeto didático para aprendizado de conceitos básicos de POO (Programação Orientada a Objetos) e interação com usuários em Java.

