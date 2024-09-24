# Desafio de Programação - Cálculo da Soma, Fibonacci, Faturamento e Manipulação de Strings

Este repositório contém a solução para um desafio técnico, composto por diferentes questões relacionadas à sequência de Fibonacci, cálculo de faturamento, percentuais de distribuição, e manipulação de strings, todos desenvolvidos em **Java**. As soluções foram implementadas seguindo boas práticas de programação, com foco em clareza, eficiência e legibilidade.

## Descrição das Questões

### 1. Cálculo da Soma
**Descrição**: Dado o código fornecido abaixo:

```java
int INDICE = 13, SOMA = 0, K = 0;
while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
```
**Ao final da execução, o valor da variável SOMA será 91.**

### 2. Sequência de Fibonacci

**Objetivo**: Dado um número, o programa calcula a sequência de Fibonacci e verifica se o número informado pertence à sequência.

- **Linguagem utilizada**: Java
- **Entrada**: Um número inteiro fornecido pelo usuário.
- **Saída**: Uma mensagem indicando se o número pertence ou não à sequência de Fibonacci.

A sequência de Fibonacci começa com 0 e 1, e cada número subsequente é a soma dos dois anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...

#### Exemplo 1:
- **Entrada**: `8`
- **Saída**: `"O número 8 pertence à sequência de Fibonacci."`

#### Exemplo 2:
- **Entrada**: `7`
- **Saída**: `"O número 7 não pertence à sequência de Fibonacci."`

### 3. Cálculo de Faturamento Diário

**Objetivo**: Dado um conjunto de dados de faturamento diário em formato JSON, o programa calcula:
- O menor valor de faturamento diário.
- O maior valor de faturamento diário.
- O número de dias com faturamento acima da média mensal.

#### Considerações:
- Dias sem faturamento (valor igual a 0) são ignorados no cálculo da média.
- A entrada de dados é fornecida via arquivo JSON.

#### Exemplo de Faturamento em JSON:
```java
String json = "["
    + "{\"dia\": 1, \"valor\": 22174.1664},"
    + "{\"dia\": 2, \"valor\": 24537.6698},"
    + "{\"dia\": 3, \"valor\": 26139.6134},"
    + "{\"dia\": 4, \"valor\": 0.0},"
    + "{\"dia\": 5, \"valor\": 0.0},"
    + "{\"dia\": 6, \"valor\": 26742.6612},"
    + "{\"dia\": 7, \"valor\": 0.0},"
    + "{\"dia\": 8, \"valor\": 42889.2258},"
    + "{\"dia\": 9, \"valor\": 46251.174},"
    + "{\"dia\": 10, \"valor\": 11191.4722},"
    + "{\"dia\": 11, \"valor\": 0.0},"
    + "{\"dia\": 12, \"valor\": 0.0},"
    + "{\"dia\": 13, \"valor\": 3847.4823},"
    + "{\"dia\": 14, \"valor\": 373.7838},"
    + "{\"dia\": 15, \"valor\": 2659.7563},"
    + "{\"dia\": 16, \"valor\": 48924.2448},"
    + "{\"dia\": 17, \"valor\": 18419.2614},"
    + "{\"dia\": 18, \"valor\": 0.0},"
    + "{\"dia\": 19, \"valor\": 0.0},"
    + "{\"dia\": 20, \"valor\": 35240.1826},"
    + "{\"dia\": 21, \"valor\": 43829.1667},"
    + "{\"dia\": 22, \"valor\": 18235.6852},"
    + "{\"dia\": 23, \"valor\": 4355.0662},"
    + "{\"dia\": 24, \"valor\": 13327.1025},"
    + "{\"dia\": 25, \"valor\": 0.0},"
    + "{\"dia\": 26, \"valor\": 0.0},"
    + "{\"dia\": 27, \"valor\": 25681.8318},"
    + "{\"dia\": 28, \"valor\": 1718.1221},"
    + "{\"dia\": 29, \"valor\": 13220.495},"
    + "{\"dia\": 30, \"valor\": 8414.61}"
    + "]";
```

### 4. Cálculo de Percentual de Faturamento por Estado

**Objetivo**: Com base no faturamento mensal detalhado por estado, o programa calcula o percentual de participação de cada estado no faturamento total da distribuidora.

#### Faturamento por Estado:
- **SP**: R$ 67.836,43
- **RJ**: R$ 36.678,66
- **MG**: R$ 29.229,88
- **ES**: R$ 27.165,48
- **Outros**: R$ 19.849,53

#### Fórmula:
```java
Percentual = (Faturamento do Estado / Faturamento Total) * 100
```


### 5. Inversão de String

**Objetivo:**
Escrever um programa que inverte os caracteres de uma string **sem utilizar funções prontas como `reverse()`**, demonstrando um entendimento profundo de manipulação de strings em Java.

**Entrada:**
Uma string qualquer fornecida pelo usuário.

**Saída:**
A string com os caracteres invertidos.

**Exemplo:**

- **Entrada**:  `"exemplo"`
- **Saída**:  `"olpmexe"`


## Como Executar

**Pré-requisitos:**
* **Git:** Para clonar o repositório.
* **Java Development Kit (JDK - 17) :** Para compilar e executar o código Java.
* **Um editor de texto ou IDE:** Recomendo o uso de uma IDE como IntelliJ IDEA ou Eclipse para facilitar o desenvolvimento.

**Passos:**
1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuário/Dasafio-de-c-digo-para-vaga-em-an-lise-e-desenvolvimento.git
```
**Importante**: Substitua `seu-usuario` pelo seu nome de usuário no GitHub.

2. **Acesse o diretório do projeto:**
```bash
cd desafio-programacao
```
3. **Compile o código:**
```bash
javac NomeDaClasse.java
```
**Atenção**: Substitua `NomeDaClasse.java` pelo nome exato do arquivo .java que contém a classe principal do seu programa.

4. **Execute o programa:**
```bash
java NomeDaClasse
```
**Lembre-se**: Substitua `NomeDaClasse` pelo nome da classe (sem a extensão .java) que você deseja executar.

**Exemplo:**
Se o arquivo principal for `Fibonacci.java`, os comandos seriam:
```bash
javac Fibonacci.java
java Fibonacci
```   
