package nl.hva.factories;

import nl.hva.components.*;

public class IntelBasicComputerComponentFactory implements ComputerComponentFactory {
    @Override
    public ComputerCase selectCase() {
        return new BasicComputerCase();
    }

    @Override
    public PowerSupply selectPowerSupply() {
        return new BasicPowerSupply();
    }

    @Override
    public Processor selectProcessor() {
        return new IntelProcessor();
    }

    @Override
    public MotherBoard selectMotherBoard() {
        return new IntelMotherBoard();
    }

    @Override
    public Memory[] selectMemory() {
        return new Memory[0];
    }

    @Override
    public GraphicsCard selectGraphicsCard() {
        return new NVidiaGraphicsCard();
    }

    @Override
    public Storage[] selectStorage(StorageType... type) {
        return new Storage[0];
    }
}
