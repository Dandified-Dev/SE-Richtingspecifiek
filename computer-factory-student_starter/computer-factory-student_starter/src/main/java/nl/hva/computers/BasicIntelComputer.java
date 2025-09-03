package nl.hva.computers;

import nl.hva.components.BasicComputerCase;
import nl.hva.factories.ComputerComponentFactory;

public class BasicIntelComputer extends Computer{

    public BasicIntelComputer(ComputerComponentFactory factory) {
        super(factory);
    }

    @Override
    public void prepare() {
        computerCase = new BasicComputerCase();
    }
}
