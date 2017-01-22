package chaussia.shared.test;

import java.io.IOException;

import chaussia.shared.building.Building;
import chaussia.shared.building.BuildingType;
import chaussia.shared.building.production.Lumberjack;
import chaussia.shared.building.production.ProductionBuilding;
import chaussia.shared.building.production.ProductionBuildingFactory;
import chaussia.shared.units.UnitType;
import chaussia.shared.units.production.LaborerFactory;

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
        ((ProductionBuilding) building).setActive(true);
        ((ProductionBuilding) building).addLaborer(new LaborerFactory().create(UnitType.WORKER));

        for (int i = 0; i < 5; i++)
        {
            System.out.println("bauzeit:" + building.getConstructionPeriod());
            System.out.println(((ProductionBuilding) building).getUpkeep());
            building.reduceConstructionPeriod();
        }
        building.upgrade();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("upgradedauer:" + building.getUpgradePeriod());
            System.out.println(((ProductionBuilding) building).getUpkeep());
            building.reduceUpgrdePeriod();
        }
    }

}
