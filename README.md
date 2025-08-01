# Biblioteca Digital - Sistema de Empréstimos

## 🚀 Visão Geral
Sistema orientado a objetos para gerenciamento de acervo bibliotecário com:
- Controle de empréstimos
- Cálculo de multas
- Gestão de diferentes tipos de mídia

## 🛠️ Tecnologias
- Java 11+
- Paradigma OO (Herança, Polimorfismo, Classes Abstratas)
- Princípios SOLID


## ✨ Funcionalidades

### 🧩 Classes Principais
| Classe               | Descrição                                  |
|----------------------|-------------------------------------------|
| `ItemBiblioteca`     | Classe abstrata com lógica comum          |
| `Livros`             | Especialização para livros                |
| `Emprestavel`        | Interface para itens emprestáveis         |

### 🔢 Métodos Chave
```java
// Padrão de métodos implementados
public abstract void calcularMulta(int dias);
public boolean podeSerEmprestado();
public void emprestarItem(); 
