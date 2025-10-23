package core.basesyntax.operationhandler;

import core.basesyntax.FruitTransaction;

public interface OperationHandler {
    void handle(FruitTransaction transaction);
}
