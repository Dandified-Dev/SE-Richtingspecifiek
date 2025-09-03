package nl.hva.shops;

import nl.hva.computers.Computer;
import nl.hva.computers.ComputerTypes;
import nl.hva.computers.IntelComputer;
import nl.hva.factories.IntelBasicComputerComponentFactory;
import nl.hva.factories.IntelGamingComputerComponentFactory;

public class IntelComputerShop extends ComputerShop{
    @Override
    protected Computer buildComputer(String computerType) {
        if(computerType.equals(ComputerTypes.BASIC_COMPUTER)){
            return new IntelComputer(new IntelBasicComputerComponentFactory());
        }else {
            return new IntelComputer(new IntelGamingComputerComponentFactory());
        }
    }
}
