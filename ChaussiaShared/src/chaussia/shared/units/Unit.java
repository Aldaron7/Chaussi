package chaussia.shared.units;

import chaussia.shared.material.Stock;

public interface Unit
{
    int getTrainingPeriod();

    void resetTrainigPeriod();

    int getUpkeep();

    Stock getTrainingCost();

    Stock getUpkeepMaterials();

    UnitType getType();
}