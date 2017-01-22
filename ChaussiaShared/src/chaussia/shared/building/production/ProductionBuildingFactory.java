package chaussia.shared.building.production;

import chaussia.shared.Const;
import chaussia.shared.building.BuildingType;

public class ProductionBuildingFactory
{

    public ProductionBuildingFactory()
    {
    }

    public AbstractProductionBuilding create(BuildingType typ)
    {
        AbstractProductionBuilding produktionsgebaeude = null;
        switch (typ)
        {
            case LUMBERJACK:
                produktionsgebaeude = new Lumberjack();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_WOOD);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION1);
                break;
            case MINE:
                produktionsgebaeude = new Mine();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_ORE);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION1);
                break;
            case FARM:
                produktionsgebaeude = new Farm();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_GRAIN);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION1);
                break;
            case CLAYPIT:
                produktionsgebaeude = new Lehmgrube();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_CLAY);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION1);
                break;
            case SHEPHERD:
                produktionsgebaeude = new Shepherd();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_WOOL);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION1);
                break;
            case WEAVINGMILL:
                produktionsgebaeude = new WeavingMill();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_FABRIC);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION2);
                break;
            case LUMBERMILL:
                produktionsgebaeude = new Lumbermill();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_BOARD);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION2);
                break;
            case BAKERY:
                produktionsgebaeude = new Bakery();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_BREAD);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION2);
                break;
            case FORGE:
                produktionsgebaeude = new Forge();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_IRON);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION2);
                break;
            case BRICKWORKS:
                produktionsgebaeude = new Brickworks();
                produktionsgebaeude.setUpkeep(Const.OUTPUT_BRICK);
                produktionsgebaeude.setUpkeep(Const.UPKEEP_PRODUCTION2);
                break;
            default:
                break;
        }
        if (produktionsgebaeude != null)
        {
            produktionsgebaeude.resetConstructionPeriod();
        }
        return produktionsgebaeude;
    }
}
