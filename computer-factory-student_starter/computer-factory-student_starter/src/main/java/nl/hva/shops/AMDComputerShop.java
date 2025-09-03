package nl.hva.shops;

import nl.hva.computers.AMDComputer;
import nl.hva.computers.Computer;
import nl.hva.computers.ComputerTypes;
import nl.hva.computers.IntelComputer;
import nl.hva.factories.AMDBasicComputerComponentFactory;
import nl.hva.factories.AMDGamingComputerComponentFactory;
import nl.hva.factories.IntelBasicComputerComponentFactory;
import nl.hva.factories.IntelGamingComputerComponentFactory;

public class AMDComputerShop extends ComputerShop{
    @Override
    protected Computer buildComputer(String computerType) {
        Computer computer;
        if(computerType.equals(ComputerTypes.BASIC_COMPUTER)){
            computer = new AMDComputer(new AMDBasicComputerComponentFactory());
            computer.setName("AMD Basic PC");
        }else {
            computer = new AMDComputer(new AMDGamingComputerComponentFactory());
            computer.setName("AMD Gaming PC");
        }
        return computer;
    }
}
