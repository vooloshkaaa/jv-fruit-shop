package core.basesyntax.strategy;

import core.basesyntax.FruitTransaction;
import core.basesyntax.Storage;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction) {
        if (transaction.getQuantity() < 0) {
            throw new IllegalArgumentException("Purchase quantity cannot be negative for fruits");
        }
        int currentQuantity = Storage.getInventory().getOrDefault(transaction.getFruit(), 0);
        if (currentQuantity < transaction.getQuantity()) {
            throw new IllegalArgumentException("Not enough " + transaction.getFruit()
                    + " in stock. Available: " + currentQuantity);
        }
        Storage.updateInventory(transaction.getFruit(), -transaction.getQuantity());
    }
}
