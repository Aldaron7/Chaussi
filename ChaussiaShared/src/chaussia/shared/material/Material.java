package chaussia.shared.material;

public class Material
{
    private MaterialType typ;
    private int         menge;

    public Material(MaterialType typ, int menge)
    {
        this.typ = typ;
        this.menge = menge;
        this.floor();
    }

    public MaterialType getTyp()
    {
        return this.typ;
    }

    public void setTyp(MaterialType typ)
    {
        this.typ = typ;
    }

    public int getMenge()
    {
        return this.menge;
    }

    public void setMenge(int menge)
    {
        this.menge = menge;
        this.floor();
    }

    private void floor()
    {
        if (this.menge < 0)
        {
            this.menge = 0;
        }
    }

}
