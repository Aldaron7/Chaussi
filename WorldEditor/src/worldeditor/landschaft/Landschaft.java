package worldeditor.landschaft;

import java.io.Serializable;

import worldeditor.Bebauung;

public class Landschaft implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int               ertrag;
    private Bebauung          bebauung;

    public Landschaft()
    {
        this(1, null);
    }

    public Landschaft(int ertrag)
    {
        this(ertrag, null);
    }

    public Landschaft(int ertrag, Bebauung bebauung)
    {
        this.ertrag = ertrag;
        this.bebauung = bebauung;
    }

    public int getErtrag()
    {
        return this.ertrag;
    }

    public void setErtrag(int ertrag)
    {
        this.ertrag = ertrag;
    }

    public Bebauung getBebauung()
    {
        return this.bebauung;
    }

    public void setBebauung(Bebauung bebauung)
    {
        this.bebauung = bebauung;
    }

    @Override
    public String toString()
    {
        return String.format("|%s|", this.getClass().getSimpleName().substring(0, 3));
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.bebauung == null) ? 0 : this.bebauung.hashCode());
        result = prime * result + this.ertrag;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        Landschaft other = (Landschaft) obj;
        if (this.bebauung == null)
        {
            if (other.bebauung != null)
            {
                return false;
            }
        }
        else
            if (!this.bebauung.equals(other.bebauung))
            {
                return false;
            }
        if (this.ertrag != other.ertrag)
        {
            return false;
        }
        return true;
    }

}
