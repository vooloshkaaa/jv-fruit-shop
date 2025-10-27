package core.basesyntax.strategy;

import core.basesyntax.FruitTransaction;
import core.basesyntax.Storage;
import core.basesyntax.strategy.OperationHandler;

public class ReturnOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction) {
        if (transaction.getQuantity() < 0) {
            throw new IllegalArgumentException("Return quantity cannot be negative for fruits");
        }
        Storage.updateInventory(transaction.getFruit(), transaction.getQuantity());
    }
}
