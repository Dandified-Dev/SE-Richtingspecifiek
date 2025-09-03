package nl.hva.computers;

import nl.hva.factories.ComputerComponentFactory;

public class IntelComputer extends Computer {


    public IntelComputer(ComputerComponentFactory factory) {
        super(factory);
    }

    @Override
    public void prepare() {
        name = "Intel";
        computerCase = computerComponentFactory.selectCase();
        motherBoard = computerComponentFactory.selectMotherBoard();
        processor = computerComponentFactory.selectProcessor();
        powerSupply = computerComponentFactory.selectPowerSupply();
        memory = computerComponentFactory.selectMemory();
        storage = computerComponentFactory.selectStorage();
        graphicsCard = computerComponentFactory.selectGraphicsCard();
        powerSupply = computerComponentFactory.selectPowerSupply();
    }
}
