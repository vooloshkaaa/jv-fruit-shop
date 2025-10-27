package core.basesyntax.strategy;

import core.basesyntax.FruitTransaction;
import core.basesyntax.Storage;

public class BalanceOperation implements OperationHandler {

    @Override
    public void handle(FruitTransaction transaction) {
        if (transaction.getQuantity() < 0) {
            throw new IllegalArgumentException("Balance quantity cannot be negative for fruit");
        }
        Storage.setInventory(transaction.getFruit(), transaction.getQuantity());
    }
}
