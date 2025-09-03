package nl.hva.computers;

import nl.hva.factories.ComputerComponentFactory;

public class AMDComputer extends Computer{
    public AMDComputer(ComputerComponentFactory factory) {
        super(factory);
    }

    @Override
    public void prepare() {

    }
}
