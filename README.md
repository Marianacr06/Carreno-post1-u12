# Patrones de Diseno de Software - U12 Post 1

## Objetivo
Integrar Factory, Strategy, Observer y Facade en un sistema de pedidos, verificar desacoplamiento con pruebas y comparar metricas en SonarQube.

## Estructura
- src/main/java/com/empresa/pedidos/
- src/test/java/com/empresa/pedidos/
- img/ (capturas)

## Patrones aplicados
- Strategy: `ProcesadorPedido` y sus implementaciones por tipo.
- Factory: `ProcesadorPedidoFactory` selecciona el procesador por tipo.
- Observer: `PedidoProcesadoEvent` y listeners de notificacion.
- Facade: `FachadaPedidos` expone un flujo simple para el controlador.

## Ejecucion
```bash
mvn clean verify
mvn clean verify sonar:sonar -Dsonar.projectKey=pedidos-integrado -Dsonar.host.url=http://localhost:9000 -Dsonar.login=TU_TOKEN
```

## Pruebas
- Unitarias: Strategy, Factory, Observer, Facade.
- Integracion: flujo completo con evento publicado.

## Tabla comparativa (completar)
| Metrica | Antes | Despues |
| --- | --- | --- |
| Cyclomatic Complexity | | |
| Cognitive Complexity | | |
| Coverage | | |

## Evidencias
- img/sonarqube-antes.png
- img/sonarqube-despues.png
- img/quality-gate.png
