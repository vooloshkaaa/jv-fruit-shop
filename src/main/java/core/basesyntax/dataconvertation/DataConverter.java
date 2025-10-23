package core.basesyntax.dataconvertation;

import core.basesyntax.FruitTransaction;
import java.util.List;

public interface DataConverter {
    List<FruitTransaction> convertToTransaction(List<String> rawData);
}
