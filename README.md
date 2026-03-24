# Projeto Navigation Compose

## Descrição do Projeto

Este projeto é um aplicativo Android desenvolvido em **Kotlin** utilizando **Jetpack Compose**. O objetivo do aplicativo é demonstrar a navegação entre diferentes telas utilizando a biblioteca **Navigation Compose**.

O aplicativo possui quatro telas principais:

* Login
* Menu Principal
* Perfil
* Pedidos

O fluxo começa na tela de **Login**. Após isso, o usuário é direcionado para o **Menu Principal**, onde pode escolher acessar a tela de **Perfil** ou a tela de **Pedidos**.

A navegação entre as telas foi implementada utilizando **NavHost** e **NavController**, que são responsáveis por controlar as rotas e o fluxo de navegação do aplicativo.

---

## Configuração da Navegação

A navegação foi configurada através do **NavHost**, onde são definidas todas as rotas do aplicativo.

As rotas utilizadas são:

```
login
menu
perfil/{nome}/{idade}
pedidos?cliente={cliente}
```

Cada tela recebe o **NavController** como parâmetro, permitindo realizar a navegação utilizando o método `navController.navigate()`.

---

## Passagem de Parâmetros Obrigatórios

A tela de **Perfil** foi configurada para receber dois parâmetros obrigatórios:

* `nome` (String)
* `idade` (Int)

Esses parâmetros são definidos diretamente na rota da navegação.

Exemplo da rota:

```
perfil/{nome}/{idade}
```

Exemplo de navegação:

```
navController.navigate("perfil/Joao/25")
```

Na tela de perfil esses valores são recuperados através dos argumentos da navegação.

---

## Parâmetro Opcional na Tela de Pedidos

A tela de **Pedidos** foi configurada para receber um parâmetro opcional chamado `cliente`.

A rota foi definida utilizando query string:

```
pedidos?cliente={cliente}
```

Caso nenhum valor seja enviado, o parâmetro utiliza um valor padrão definido na configuração da navegação.

---

## Envio de Valor para Parâmetro Opcional

No **Menu Principal**, o botão que leva para a tela de pedidos foi modificado para enviar um valor para o parâmetro opcional.

Exemplo:

```
navController.navigate("pedidos?cliente=Cliente XPTO")
```

Assim a tela de pedidos recebe o nome do cliente e pode utilizar essa informação.

---

## Passagem de Múltiplos Parâmetros

Também foi implementada a passagem de múltiplos parâmetros na navegação para a tela de **Perfil**.

Nesse caso são enviados dois valores ao mesmo tempo:

* nome
* idade

Exemplo:

```
navController.navigate("perfil/Ana/30")
```

Esses valores são recebidos na tela de perfil e utilizados dentro da interface.

---

## Tecnologias Utilizadas

* Kotlin
* Android Studio
* Jetpack Compose
* Navigation Compose
