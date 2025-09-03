package nl.hva.factories;

import nl.hva.components.*;
import nl.hva.components.AMDFastProcessor;
import nl.hva.components.AMDGraphicsCard;
import nl.hva.components.AMDMotherBoard;

public class AMDGamingComputerComponentFactory implements ComputerComponentFactory{
    @Override
    public ComputerCase selectCase() {
        return new GamingComputerCase();
    }

    @Override
    public PowerSupply selectPowerSupply() {
        return new GamingPowerSupply();
    }

    @Override
    public Processor selectProcessor() {
        return new AMDFastProcessor();
    }

    @Override
    public MotherBoard selectMotherBoard() {
        return new AMDMotherBoard();
    }

    @Override
    public Memory[] selectMemory() {
        return new Memory[]{new EightGBRam(), new EightGBRam(), new EightGBRam(), new EightGBRam()};
    }

    @Override
    public GraphicsCard selectGraphicsCard() {
        return new AMDGraphicsCard();
    }

    @Override
    public Storage[] selectStorage(StorageType... type) {
        return new Storage[]{new SSD(), new HardDrive()};
    }
}
