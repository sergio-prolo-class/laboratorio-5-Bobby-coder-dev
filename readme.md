# Laboratório 5: Polimorfismo

## Estrutura do Projeto

O projeto está organizado em pacotes para respeitar o encapsulamento e os modificadores de acesso, especialmente o `protected`. As classes principais são:

- `NaveEspacial` (abstrata)
- `NaveExploradora`
- `NaveMineradora`
- `NaveCargueira`
- Interfaces: `Tripulada`, `Blindada`, `Autonoma`
- Classe de aplicação: `App`

## Estrutura de Pacotes

- `ifsc.poo.naves.interfaces`
  - `Autonoma.java`
  - `Blindada.java`
  - `Tripulada.java`
- `ifsc.poo.naves.veiculos`
  - `NaveCargueira.java`
  - `NaveEspacial.java`
  - `NaveExploradora.java`
  - `NaveMineradora.java`
- `App.java`

## Regras de Negócio

1. Toda nave possui um identificador único gerado automaticamente, uma velocidade atual e uma velocidade máxima.
2. O limite máximo de velocidade para naves sem blindagem é de 20 Mm/h. Para naves blindadas, é de 14 Mm/h.
3. Ações de controle (manual ou automático) só podem ser realizadas quando a nave estiver parada.
4. Naves tripuladas têm no máximo 10 tripulantes. Naves autônomas não permitem tripulantes.
5. A `NaveCargueira` ativa a blindagem automaticamente quando a carga atual ultrapassa 70% da carga máxima e só pode desativar a blindagem se estiver pousada.

## Implementação

- O projeto utiliza Gradle.
- As ações das naves são simuladas com mensagens no console.
- Apenas a classe `App` contém comandos de entrada e saída.
- No `main`, um atributo do tipo `LinkedHashSet<NaveEspacial>` armazena instâncias das classes concretas.
- Polimorfismo é utilizado para chamar métodos das naves instanciadas, com comentários indicando cada chamada polimórfica.
- Todos os métodos relevantes são invocados para cada objeto instanciado.

## Como Executar

1. Clone o repositório.
2. Execute `./gradlew run` para rodar a aplicação.
3. Observe no console as ações das naves e o uso de polimorfismo.
