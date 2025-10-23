package core.basesyntax.reportgenerator;

import core.basesyntax.Storage;
import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {

    @Override
    public String getReport() {
        StringBuilder report = new StringBuilder("fruit,quantity\n");
        Map<String, Integer> inventory = Storage.getInventory();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            report.append(entry.getKey()).append(",").append(entry.getValue()).append("\n");
        }
        return report.toString();
    }
}
