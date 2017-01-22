package chaussia.shared.einheiten;

public abstract class AbstractEinheit implements Einheit
{
    private int ausbildungszeit, unterhaltskosten = 0;

    @Override
    public int getAusbildungszeit()
    {
        return this.ausbildungszeit;
    }

    public void setAusbildungszeit(int ausbildungszeit)
    {
        this.ausbildungszeit = ausbildungszeit;
    }

    @Override
    public int getUnterhaltskosten()
    {
        return this.unterhaltskosten;
    }

    public void setUnterhaltskosten(int unterhaltskosten)
    {
        this.unterhaltskosten = unterhaltskosten;
    }

}
