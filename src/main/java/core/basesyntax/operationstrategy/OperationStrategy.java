package core.basesyntax.operationstrategy;

import core.basesyntax.FruitTransaction;
import core.basesyntax.operationhandler.OperationHandler;

public interface OperationStrategy {
    OperationHandler getHandler(FruitTransaction.Operation operation);
}
