package chaussia.shared.building;

import java.io.Serializable;
import java.util.List;

import chaussia.shared.Locatable;
import chaussia.shared.material.Stock;

public interface Building extends Serializable, Locatable
{
    int getUpkeep();

    void reduceUpgrdePeriod();

    int getUpgradePeriod();

    void resetUpgradePeriod();

    void reduceConstructionPeriod();

    int getConstructionPeriod();

    void resetConstructionPeriod();

    int getTier();

    Building upgrade();

    List<BuildingType> getRequiredBuildings();

    Stock getConstructionCost();

    BuildingType getType();
}