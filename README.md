# Spring Cloud Microservices

###### Soluções monolíticos são sistemas compostos por módulos ou funcionalidades agrupadas em uma única solução que acessa um banco de dados e que compõe o software.

###### Soluções baseadas em microserviços são desenvolvidas como um conjunto de pequenos serviços, cada um acessando seu banco de dados e executando seu próprio processo.

###### O framework Spring oferece diversos módulos que facilitam o desenvolvimento baseado na arquitetura de microserviços, e nesta solução são utilizados alguns deles.

---



### Spring Cloud Config (config-server)

Possibilita manter centralizada as configurações dos diversos microserviços de uma aplicação. Essas configurações podem ser acessadas remotamente, a partir de arquivos disponbilizados em um repositório do GitHub, por exemplo.


### Spring Cloud Netflix Eureka (service-discovery)

Mantém o registro de cada microserviço da solução. É como se fosse um catálogo de todos os microserviços disponíveis, podendo também atuar como um load balancer.



### Spring Cloud Gateway (gateway)

Fornece uma maneira simples de encaminhar as solicitações recebidas para o microserviço correspondente.
