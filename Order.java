package entities.enumeracoes;

import java.util.Date; // Importação necessária para utilizar a classe Date.

import entities.enums.OrderStatus; // Importação da enumeração OrderStatus.

// Declaração da classe Order.
public class Order {
	
    // Atributos da classe Order.
    private Integer id; // Identificador único do pedido.
    private Date moment; // Momento em que o pedido foi realizado.
    private OrderStatus status; // Status atual do pedido.
		
    // Construtor padrão da classe Order.
    public Order() {
    }

    // Construtor com parâmetros para inicializar um pedido com valores específicos.
    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id; // Define o ID do pedido com o valor do parâmetro id.
        this.moment = moment; // Define o momento do pedido com o valor do parâmetro moment.
        this.status = status; // Define o status do pedido com o valor do parâmetro status.
    }

    // Método getter para obter o ID do pedido.
    public Integer getId() {
        return id; // Retorna o ID do pedido.
    }

    // Método setter para definir o ID do pedido.
    public void setId(Integer id) {
        this.id = id; // Define o ID do pedido com o valor do parâmetro id.
    }

    // Método getter para obter o momento do pedido.
    public Date getMoment() {
        return moment; // Retorna o momento do pedido.
    }

    // Método setter para definir o momento do pedido.
    public void setMoment(Date moment) {
        this.moment = moment; // Define o momento do pedido com o valor do parâmetro moment.
    }

    // Método getter para obter o status do pedido.
    public OrderStatus getStatus() {
        return status; // Retorna o status do pedido.
    }

    // Método setter para definir o status do pedido.
    public void setStatus(OrderStatus status) {
        this.status = status; // Define o status do pedido com o valor do parâmetro status.
    }

    // Sobrescrita do método toString para exibir informações do pedido de forma personalizada.
    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]"; // Retorna uma representação do pedido como string.
    }
}