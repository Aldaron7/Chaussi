package chaussia.shared.test;

import java.io.IOException;

import chaussia.shared.building.Building;
import chaussia.shared.building.BuildingType;
import chaussia.shared.building.production.Lumberjack;
import chaussia.shared.building.production.ProductionBuilding;
import chaussia.shared.building.production.ProductionBuildingFactory;

public class Test
{

    public static void main(String[] args) throws IOException
    {
        // Test.testGebaude();
        Messages.put("holzfaeller", new Lumberjack());
        System.out.println(Messages.getString("holzfaeller"));
    }

    public static void testGebaude()
    {
        Building building = new ProductionBuildingFactory().create(BuildingType.LUMBERJACK);
        System.out.println(building.getClass().getSimpleName());
        ((ProductionBuilding) building).setArbeitet(true);
        ((ProductionBuilding) building).addArbeiter();

        for (int i = 0; i < 5; i++)
        {
            System.out.println("bauzeit:" + building.getBauzeit());
            System.out.println(((ProductionBuilding) building).getErtrag());
            building.reduziereBauzeit();
        }
        building.upgrade();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("upgradedauer:" + building.getUpgradedauer());
            System.out.println(((ProductionBuilding) building).getErtrag());
            building.reduziereUpgradeDauer();
        }
    }

}
