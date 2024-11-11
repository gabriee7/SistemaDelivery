package org.example.interfaces;

import org.example.models.CupomDescontoEntrega;
import org.example.models.Pedido;

public interface IFormaDescontoTaxaEntrega {
    void calcularDescontoPedido(Pedido pedido);
    Boolean seAplica(Pedido pedido);
}
