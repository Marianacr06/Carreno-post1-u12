package com.empresa.pedidos.aplicacion;

import com.empresa.pedidos.dominio.EstadoPedido;
import com.empresa.pedidos.dominio.Pedido;
import com.empresa.pedidos.dominio.TipoPedido;
import org.springframework.stereotype.Service;

// ANTES: Servicio monolitico con logica mezclada
@Service
public class ServicioPedidosLegacy {

    // Long Method + Large Class + acoplamiento directo
    public void procesarPedido(Pedido pedido) {

        // Logica mezclada: tipo, calculo, persistencia y notificacion
        if (pedido.getTipo() == TipoPedido.ESTANDAR) {
            pedido.setCosto(pedido.getSubtotal() * 1.1);
        } else if (pedido.getTipo() == TipoPedido.EXPRESS) {
            pedido.setCosto(pedido.getSubtotal() * 1.3);
        } else if (pedido.getTipo() == TipoPedido.INTERNACIONAL) {
            pedido.setCosto(pedido.getSubtotal() * 1.5 + 25.0);
        }

        pedido.setEstado(EstadoPedido.PROCESADO);

        // Notificacion acoplada directamente
        System.out.println("Enviando email para pedido: " + pedido.getId());
        System.out.println("Pedido procesado con costo: " + pedido.getCosto());
    }
}
