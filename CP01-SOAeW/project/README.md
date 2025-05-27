# Checkpoint 1 - API Spring Boot de Pedidos

Esta API permite o gerenciamento de pedidos de clientes.

## Configuração para Windows

- O banco de dados H2 será armazenado em `C:/data/pedidosdb`
- Os logs serão gravados em `C:/logs/pedidos.log`
- Certifique-se de que estas pastas existam ou o aplicativo tenha permissão para criá-las

## Endpoints

### Listar todos os pedidos
- **GET** `/pedidos`
- Retorna a lista de todos os pedidos cadastrados

### Buscar pedido por ID
- **GET** `/pedidos/{id}`
- Retorna um pedido específico pelo ID

### Criar novo pedido
- **POST** `/pedidos`
- Cria um novo pedido
- Corpo da requisição:
```json
{
    "clienteName": "Nome do Cliente",
    "valorTotal": 100.00
}
```

### Atualizar pedido
- **PUT** `/pedidos/{id}`
- Atualiza um pedido existente
- Corpo da requisição igual ao POST

### Deletar pedido
- **DELETE** `/pedidos/{id}`
- Remove um pedido pelo ID

## Regras de Validação
- O nome do cliente é obrigatório
- O valor total do pedido não pode ser negativo
- A data do pedido é gerada automaticamente

## Banco de Dados
- Utiliza H2 Database (arquivo em C:/data/pedidosdb)
- Console H2 disponível em: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:file:C:/data/pedidosdb
- Username: sa
- Password: (vazio)

## Logs
- Os logs da aplicação são armazenados em C:/logs/pedidos.log
- Nível de log DEBUG para o pacote br.com.fiap
- Nível de log INFO para os demais pacotes