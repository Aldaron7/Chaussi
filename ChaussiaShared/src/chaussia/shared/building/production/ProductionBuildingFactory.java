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
                produktionsgebaeude.setErtrag(Const.OUTPUT_WOOD);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION1);
                break;
            case MINE:
                produktionsgebaeude = new Mine();
                produktionsgebaeude.setErtrag(Const.OUTPUT_ORE);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION1);
                break;
            case FARM:
                produktionsgebaeude = new Farm();
                produktionsgebaeude.setErtrag(Const.OUTPUT_GRAIN);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION1);
                break;
            case CLAYPIT:
                produktionsgebaeude = new Lehmgrube();
                produktionsgebaeude.setErtrag(Const.OUTPUT_CLAY);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION1);
                break;
            case SHEPHERD:
                produktionsgebaeude = new Shepherd();
                produktionsgebaeude.setErtrag(Const.OUTPUT_WOOL);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION1);
                break;
            case WEAVINGMILL:
                produktionsgebaeude = new WeavingMill();
                produktionsgebaeude.setErtrag(Const.OUTPUT_FABRIC);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION2);
                break;
            case LUMBERMILL:
                produktionsgebaeude = new Lumbermill();
                produktionsgebaeude.setErtrag(Const.OUTPUT_BOARD);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION2);
                break;
            case BAKERY:
                produktionsgebaeude = new Bakery();
                produktionsgebaeude.setErtrag(Const.OUTPUT_BREAD);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION2);
                break;
            case FORGE:
                produktionsgebaeude = new Forge();
                produktionsgebaeude.setErtrag(Const.OUTPUT_IRON);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION2);
                break;
            case BRICKWORKS:
                produktionsgebaeude = new Brickworks();
                produktionsgebaeude.setErtrag(Const.OUTPUT_BRICK);
                produktionsgebaeude.setUnterhaltskosten(Const.UPKEEP_PRODUCTION2);
                break;
            default:
                break;
        }
        if (produktionsgebaeude != null)
        {
            produktionsgebaeude.resetBauzeit();
        }
        return produktionsgebaeude;
    }
}
