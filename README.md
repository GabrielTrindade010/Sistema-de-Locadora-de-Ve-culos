# 🚗 Sistema de Locadora de Veículos

Projeto desenvolvido em **Java** com foco em **Programação Orientada a Objetos (POO)**, simulando o funcionamento de uma locadora de veículos.

O sistema permite cadastrar cliente, veículo, criar uma locação, aplicar regras de negócio como seguro, multa por atraso e conversão de moeda.

---

## 📌 Objetivo

Este projeto foi desenvolvido com o objetivo de praticar:

- Modelagem Orientada a Objetos
- Encapsulamento
- Composição entre classes
- Regras de negócio
- Cálculos financeiros
- Interação via terminal
- Organização de código

---

## 🧱 Estrutura do Projeto

O sistema é composto pelas seguintes classes:

### 🚘 Veiculo
Responsável por armazenar:
- Marca
- Modelo
- Categoria
- Valor da diária

---

### 👤 Cliente
Responsável por armazenar:
- Nome
- CPF
- Número da CNH

---

### 📄 Locacao
Responsável pelas regras de negócio:

- Cálculo do subtotal (diária × dias)
- Cálculo do seguro
- Aplicação de multa por atraso
- Cálculo do valor total da locação

---

### 🧾 Contrato
Responsável por:
- Formalizar a locação
- Conversão de moeda (Real ↔ Dólar)

---

### 🖥️ Main
Responsável pela interação com o usuário via terminal.

---

## ⚙️ Regras de Negócio

### 📌 Subtotal

### 📌 Seguro

### 📌 Multa por atraso

### 📌 Total Final


---

## 💱 Conversão de Moeda

O sistema permite:

- Converter valor de Real para Dólar
- Converter valor de Dólar para Real
- Utilizando a cotação informada pelo usuário

---

## ▶️ Como Executar

1. Clone o repositório:

2. Abra o projeto em sua IDE (IntelliJ, Eclipse ou NetBeans)

3. Execute a classe `Main`

---

## 🛠️ Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Scanner (entrada de dados)
- Estrutura de classes e métodos

---

## 📈 Conceitos Aplicados

- Encapsulamento
- Responsabilidade única
- Separação de camadas (lógica e interface)
- Organização modular
- Boas práticas de modelagem

---

## 🚀 Possíveis Melhorias Futuras

- Implementar `enum` para categoria de veículo
- Implementar `enum` para forma de pagamento
- Utilizar `BigDecimal` para cálculos financeiros
- Criar menu interativo com múltiplas locações
- Persistência de dados em arquivo
- Implementação de testes unitários

---

## 👨‍💻 Autor

_Desenvolvido por Gabriel Trindade_
