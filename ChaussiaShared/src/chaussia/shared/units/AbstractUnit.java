package chaussia.shared.units;

public abstract class AbstractUnit implements Unit
{
    private int trainingPeriod, upkeep = 0;

    @Override
    public int getTrainingPeriod()
    {
        return this.trainingPeriod;
    }

    public void setTrainingPeriod(int trainingPeriod)
    {
        this.trainingPeriod = trainingPeriod;
    }

    @Override
    public int getUpkeep()
    {
        return this.upkeep;
    }

    public void setUpkeep(int upkeep)
    {
        this.upkeep = upkeep;
    }

}
