package chaussia.shared.material;

public class Material
{
    private MaterialType type;
    private int         amount;

    public Material(MaterialType type, int amount)
    {
        this.type = type;
        this.amount = amount;
        this.floor();
    }

    public MaterialType getType()
    {
        return this.type;
    }

    public void setType(MaterialType type)
    {
        this.type = type;
    }

    public int getAmount()
    {
        return this.amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
        this.floor();
    }

    private void floor()
    {
        if (this.amount < 0)
        {
            this.amount = 0;
        }
    }

}
