# 📂 Padrões de Projeto 2

Este repositório contém exemplos práticos dos seguintes padrões de projeto:
**Bridge** e **Decorator**.

---

## 🟣 Bridge — Exemplo: *Controle Remoto e Dispositivo*

O padrão **Bridge** serve para **separar uma abstração da sua implementação**, permitindo que ambas evoluam de forma independente.

No exemplo:

Temos a abstração **Veículo** (Carro, Moto).
E a implementação **Combustível** (Gasolina, Etanol).

Com o **Bridge**, podemos **combinar qualquer veículo com qualquer combustível**, sem precisar criar classes específicas para cada caso (ex: CarroGasolina, MotoEtanol etc.).

Isso reduz o número de classes e facilita a manutenção e expansão do código.

---

## 🟠 Decorator — Exemplo: *Pizza*

O padrão **Decorator** permite **adicionar responsabilidades a um objeto dinamicamente**, sem alterar sua estrutura original.

Pense em uma **pizza pequena** como a base.
Você pode adicionar **queijo**, **presunto** ou **calabresa** como “camadas extras”.
Cada ingrediente acrescenta algo a mais (custo e descrição), mas a pizza continua sendo uma pizza.

Com o **Decorator**, você pode criar combinações diferentes sem precisar criar classes novas para cada tipo de pizza.

---
