# Trabalhando com Funções em Java 

Programa em Java com menu interativo (via `JOptionPane`) que reúne
diversas funções matemáticas e lógicas simples, cada uma isolada em
seu próprio método estático.

## Funcionalidades

| Opção | Função | Descrição |
|-------|--------|-----------|
| 1 | `Dobro(int)` | Calcula o dobro de um número |
| 2 | `fatorial(int)` | Calcula o fatorial de um número |
| 3 | `media(float, float, float, float)` | Calcula a média de 4 notas |
| 4 | `primo(int)` | Verifica se um número é primo |
| 5 | `produto(int, int)` | Calcula o produto entre dois números |
| 6 | `tamanho(int, int)` | Compara dois números e aponta o maior |
| 7 | `radianos(float)` | Converte graus em radianos |
| 8 | — | Encerra o programa |

## Sobre a organização do código

O projeto foi estruturado priorizando **separação de responsabilidades**:
cada operação matemática vive em sua própria função, independente da
interface. Isso significa que:

- O `main` cuida só do fluxo (menu, loop, tratamento de erros).
- Cada função faz **uma coisa só** e pode ser testada/reaproveitada
  isoladamente, sem depender do menu.
- Funções que retornam valor (`fatorial`, `produto`, `radianos`) são
  separadas das que já exibem o resultado (`Dobro`, `media`, `primo`,
  `tamanho`) — uma decisão de design pensada desde a implementação.

##  Tratamento de erros

O programa usa `try/catch` com `NumberFormatException` para lidar com
entradas inválidas (texto onde deveria ter número), evitando que o
programa quebre com um crash.

## Aprendizados aplicados

- Uso de `switch-case` com `String` (Java 7+)
- Modularização de código em métodos com responsabilidade única
- Manipulação de tipos (`int`, `float`) e conversões (`parseInt`,
  `parseFloat`)
- Loop controlado por flag (`while(func)`) para menus interativos
- Tratamento de exceções para entrada de dados mais robusta
