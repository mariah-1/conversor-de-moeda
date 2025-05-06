# 💱 Conversor de Moedas em Java

Este é um projeto simples de **conversor de moedas** utilizando Java, com **programação orientada a objetos** e consumo de **API externa** para obter as taxas de câmbio em tempo real.

---

## 🚀 Funcionalidades

- Menu interativo no terminal.
- 6 opções de conversão:
  1. Dólar (USD) → Real (BRL)  
  2. Real (BRL) → Dólar (USD)  
  3. Dólar (USD) → Euro (EUR)  
  4. Euro (EUR) → Dólar (USD)  
  5. Dólar (USD) → Iene (JPY)  
  6. Iene (JPY) → Dólar (USD)  
- Consulta de taxas em tempo real via [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 💻 Tecnologias Utilizadas

- Java 21
- `HttpClient` (pacote `java.net.http`) para chamadas HTTP
- `org.json` (biblioteca externa) para tratar JSON

---


## ✅ Como Executar

1. **Clone ou baixe o projeto.**

2. **Adicione a biblioteca JSON**:
   - Baixe [json-20210307.jar](https://repo1.maven.org/maven2/org/json/json/20210307/json-20210307.jar).
   - No IntelliJ:
     - `File > Project Structure > Modules > Dependencies > + > JARs or directories`.
     - Adicione o arquivo `.jar`.

3. **Compile e execute o programa** (`Principal.java`).

---

## 🛠️ Exemplo de Uso

```
=== CONVERSOR DE MOEDAS ===
1. USD → BRL
2. BRL → USD
3. USD → EUR
4. EUR → USD
5. USD → JPY
6. JPY → USD
0. Sair
Escolha uma opção: 1
Digite o valor a converter: 100
100.00 USD = 507.80 BRL
```

---

## 📌 Observações

- O programa utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/). Você pode usar sua própria **API KEY** gratuita criando uma conta no site.
- Certifique-se de estar conectado à internet para que as taxas sejam carregadas corretamente.

---

## 📚 Aprendizados

Este projeto foi criado para praticar:

- Programação orientada a objetos
- Manipulação de APIs REST com Java
- Leitura e uso de JSON
- Estrutura de menus com `Scanner`
