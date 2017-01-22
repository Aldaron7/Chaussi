package chaussia.shared.rohstoffe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RohstoffVorrat implements Map<Rohstofftyp, Integer>
{

    private Map<Rohstofftyp, Integer> kosten = new HashMap<>();

    public RohstoffVorrat(Map<Rohstofftyp, Integer> kosten)
    {
        this();
        this.putAll(kosten);
    }

    public RohstoffVorrat(Rohstoff... rohstoffe)
    {
        this();
        for (Rohstoff rohstoff : rohstoffe)
        {
            this.put(rohstoff);
        }
    }

    public RohstoffVorrat()
    {
        for (Rohstofftyp rohstoff : Rohstofftyp.values())
        {
            this.kosten.put(rohstoff, 0);
        }
    }

    public void putKosten(Rohstofftyp rohstoff, Integer wert)
    {
        this.kosten.put(rohstoff, wert);
    }

    public void put(Rohstoff rohstoff)
    {
        this.put(rohstoff.getTyp(), rohstoff.getMenge());
    }

    public boolean contains(RohstoffVorrat rohstoffVorrat)
    {
        return rohstoffVorrat.keySet().stream().allMatch(rohstoff -> this.get(rohstoff) >= rohstoffVorrat.get(rohstoff));
    }

    public void multiply(double skalar)
    {
        this.kosten.entrySet().forEach(entry -> entry.setValue((int) (entry.getValue() * skalar)));
    }

    public boolean subtract(RohstoffVorrat rohstoffVorrat)
    {
        if (this.contains(rohstoffVorrat))
        {
            for (Rohstofftyp rohstofftyp : rohstoffVorrat.keySet())
            {
                this.put(rohstofftyp, (this.get(rohstofftyp) - rohstoffVorrat.get(rohstofftyp)));
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.kosten == null) ? 0 : this.kosten.hashCode());
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
        RohstoffVorrat other = (RohstoffVorrat) obj;
        if (this.kosten == null)
        {
            if (other.kosten != null)
            {
                return false;
            }
        }
        else
            if (!this.kosten.equals(other.kosten))
            {
                return false;
            }
        return true;
    }

    @Override
    public void clear()
    {
        this.kosten.clear();
    }

    @Override
    public boolean containsKey(Object key)
    {
        return this.kosten.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value)
    {
        return this.kosten.containsValue(value);
    }

    @Override
    public Set<java.util.Map.Entry<Rohstofftyp, Integer>> entrySet()
    {
        return this.kosten.entrySet();
    }

    @Override
    public Integer get(Object key)
    {
        return this.kosten.get(key);
    }

    @Override
    public boolean isEmpty()
    {
        return this.kosten.isEmpty();
    }

    @Override
    public Set<Rohstofftyp> keySet()
    {
        return this.kosten.keySet();
    }

    @Override
    public Integer put(Rohstofftyp key, Integer value)
    {
        return this.kosten.put(key, value);
    }

    @Override
    public void putAll(Map<? extends Rohstofftyp, ? extends Integer> m)
    {
        this.kosten.putAll(m);
    }

    @Override
    public Integer remove(Object key)
    {
        return this.kosten.remove(key);
    }

    @Override
    public int size()
    {
        return this.kosten.size();
    }

    @Override
    public Collection<Integer> values()
    {
        return this.kosten.values();
    }

}
