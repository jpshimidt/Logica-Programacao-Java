package exercicio2;

public class Pedido {
    String codigo;
    Double subtotal;
    Double desconto;
    Double total;

    String getCodigo(){
        return codigo;
    }

    void setCodigo(String codigo){
        this.codigo = codigo;
    }

    Double getSubtotal(){
        return subtotal;
    }

    void setSubtotal(Double subtotal){
        this.subtotal = subtotal;
    }

    Double getDesconto(){
        return desconto;
    }

    void setDesconto(Double desconto){
        this.desconto = desconto;
    }

    Double getTotal(){
        total = this.subtotal - this.desconto;
        return total;
    }

    void setTotal(Double total){
    }
}
