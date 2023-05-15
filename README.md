# DSList - Intensivão Java Spring
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/neliocursos/exemplo-readme/blob/main/LICENSE) 

# Sobre o projeto
DSList é uma aplicação back-end desenvolvida em Java SpringBoot. Foi realizada durante o Intensivão Java Spring do professor @[DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma API que realiza a listagem de jogos e seus atributos. A grande diferença dessa API é a funcionalidade de mudar a posição dos jogos no banco de dados sem afetar o funcionamento da lista.

## Modelo de domínio

![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Tecnologias utilizadas
- Java 17
- Spring Boot 3
- JPA / Web / H2 
- PostgreSQL

# Softwares utilizados
- IntelliJ
- Postman
- Git / GitHub
- Docker 

# Como executar
https://dslist-production-ce97.up.railway.app

## Como fazer requisições
### GET Games

```bash
https://dslist-production-ce97.up.railway.app/games
```
![image](https://github.com/guilhermemoraessiqueira/dslist/assets/112905369/44d383d7-a3bf-491d-b615-ade01d0e4e60)


### GET Games By Id

```bash
https://dslist-production-ce97.up.railway.app/games/1
```
![image](https://github.com/guilhermemoraessiqueira/dslist/assets/112905369/0354b967-a916-4582-bb8c-024a2b87e4a9)


### GET Games List

```bash
https://dslist-production-ce97.up.railway.app/lists
```
![image](https://github.com/guilhermemoraessiqueira/dslist/assets/112905369/79ec8270-a3f6-4419-8ddb-fa6c2fe4b796)


### GET Games By List

```bash
https://dslist-production-ce97.up.railway.app/lists/2/games
```
![image](https://github.com/guilhermemoraessiqueira/dslist/assets/112905369/c8b75e4c-ebc1-48a1-afcc-66bbcda370f7)


### POST List replacement

```bash
https://dslist-production-ce97.up.railway.app/lists/2/replacement
```

No body

```bash
{
    "sourceIndex": 3,
    "destinationIndex": 1
}
```
![image](https://github.com/guilhermemoraessiqueira/dslist/assets/112905369/f59c8906-c092-4bc7-b082-1fd623d378e8)

# Autor

Guilherme Moraes Siqueira

https://www.linkedin.com/in/guilherme-moraes-siqueira/





