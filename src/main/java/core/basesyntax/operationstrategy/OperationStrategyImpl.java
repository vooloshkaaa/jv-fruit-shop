package core.basesyntax.operationstrategy;

import core.basesyntax.FruitTransaction;
import core.basesyntax.operationhandler.OperationHandler;
import java.util.Map;

public class OperationStrategyImpl implements OperationStrategy {
    private final Map<FruitTransaction.Operation, OperationHandler> handlers;

    public OperationStrategyImpl(Map<FruitTransaction.Operation, OperationHandler> handlers) {
        this.handlers = handlers;
    }

    @Override
    public OperationHandler getHandler(FruitTransaction.Operation operation) {
        OperationHandler handler = handlers.get(operation);
        if (handler == null) {
            throw new IllegalArgumentException("No handler found for this operation");
        }
        return handler;
    }
}
