package nl.hva.factories;

import nl.hva.components.*;
import nl.hva.components.AMDMotherBoard;
import nl.hva.components.AMDProcessor;

public class AMDBasicComputerComponentFactory implements ComputerComponentFactory{
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
        return new AMDProcessor();
    }

    @Override
    public MotherBoard selectMotherBoard() {
        return new AMDMotherBoard();
    }

    @Override
    public Memory[] selectMemory() {
        return new Memory[]{new FourGBRam(), new FourGBRam()};
    }

    @Override
    public GraphicsCard selectGraphicsCard() {
        return null;
    }

    @Override
    public Storage[] selectStorage(StorageType... type) {
        return new Storage[]{new HardDrive()};
    }
}