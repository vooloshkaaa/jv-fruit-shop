package core.basesyntax.service;

import core.basesyntax.FruitTransaction;
import core.basesyntax.operationhandler.OperationHandler;
import core.basesyntax.operationstrategy.OperationStrategy;
import java.util.List;

public class ShopServiceImpl implements ShopService {
    private final OperationStrategy operationStrategy;

    public ShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;

    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        for (FruitTransaction transaction: transactions) {
            OperationHandler handler = operationStrategy.getHandler(transaction.getOperation());
            handler.handle(transaction);
        }
    }
}
