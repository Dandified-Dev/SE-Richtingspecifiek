package nl.hva.shops;

import nl.hva.computers.Computer;
import nl.hva.computers.ComputerTypes;
import nl.hva.computers.IntelComputer;
import nl.hva.factories.IntelBasicComputerComponentFactory;
import nl.hva.factories.IntelGamingComputerComponentFactory;

public class IntelComputerShop extends ComputerShop{
    @Override
    protected Computer buildComputer(String computerType) {
        Computer computer;
        if(computerType.equals(ComputerTypes.BASIC_COMPUTER)){
            computer = new IntelComputer(new IntelBasicComputerComponentFactory());
            computer.setName("Intel Basic PC");
        }else {
            computer = new IntelComputer(new IntelGamingComputerComponentFactory());
            computer.setName("Intel Gaming PC");
        }
        return computer;
    }
}
