---

# **Comparação de Abordagens para Comparator no Java**

Este projeto demonstra diferentes formas de usar o `Comparator` para ordenar uma lista de produtos pelo nome em Java. Cada abordagem tem suas vantagens e aplicações dependendo da situação.

---

## **Abordagens Demonstradas**

1. **Classe Separada**  
   - Cria uma classe que implementa `Comparator`.
   - Útil para lógicas de ordenação complexas e reutilizáveis.  
   **Exemplo**:  
   ```java
   public class ProductNameComparator implements Comparator<Product> {
       @Override
       public int compare(Product p1, Product p2) {
           return p1.getName().compareTo(p2.getName());
       }
   }
   ```

2. **Classe Anônima**  
   - Declaração direta no código usando uma classe temporária.  
   - Ideal para lógicas simples e de uso único.  
   **Exemplo**:  
   ```java
   Collections.sort(list, new Comparator<Product>() {
       @Override
       public int compare(Product p1, Product p2) {
           return p1.getName().compareTo(p2.getName());
       }
   });
   ```

3. **Expressão Lambda (com chaves)**  
   - Simples e conciso, mas permite múltiplas linhas.  
   **Exemplo**:  
   ```java
   Collections.sort(list, (p1, p2) -> {
       return p1.getName().compareTo(p2.getName());
   });
   ```

4. **Expressão Lambda (sem chaves)**  
   - Usado para lógicas simples em uma única linha.  
   **Exemplo**:  
   ```java
   Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
   ```

5. **Lambda Direto no Argumento**  
   - Forma mais compacta, usada diretamente no método `sort`.  
   **Exemplo**:  
   ```java
   list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
   ```

---

## **Resumo das Abordagens**

| Abordagem                  | Reutilizável? | Verbosidade    | Ideal para                                    |
|----------------------------|---------------|----------------|-----------------------------------------------|
| **Classe Separada**         | Sim           | Alta           | Comparações complexas e reutilizáveis         |
| **Classe Anônima**          | Não           | Moderada       | Comparações simples usadas localmente         |
| **Lambda com Chaves**       | Não           | Moderada       | Lógicas simples com múltiplas linhas          |
| **Lambda sem Chaves**       | Não           | Baixa          | Lógicas de uma única linha                    |
| **Lambda no Argumento**     | Não           | Baixa          | Comparações extremamente simples e locais     |

---

Escolha a abordagem que melhor atende à necessidade do seu projeto. 😊🚀

--- 
