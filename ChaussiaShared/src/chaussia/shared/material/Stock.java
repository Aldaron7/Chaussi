package chaussia.shared.material;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stock implements Map<MaterialType, Integer>
{

    private Map<MaterialType, Integer> kosten = new HashMap<>();

    public Stock(Map<MaterialType, Integer> kosten)
    {
        this();
        this.putAll(kosten);
    }

    public Stock(Material... rohstoffe)
    {
        this();
        for (Material material : rohstoffe)
        {
            this.put(material);
        }
    }

    public Stock()
    {
        for (MaterialType rohstoff : MaterialType.values())
        {
            this.kosten.put(rohstoff, 0);
        }
    }

    public void putKosten(MaterialType rohstoff, Integer wert)
    {
        this.kosten.put(rohstoff, wert);
    }

    public void put(Material material)
    {
        this.put(material.getTyp(), material.getMenge());
    }

    public boolean contains(Stock stock)
    {
        return stock.keySet().stream().allMatch(rohstoff -> this.get(rohstoff) >= stock.get(rohstoff));
    }

    public void multiply(double skalar)
    {
        this.kosten.entrySet().forEach(entry -> entry.setValue((int) (entry.getValue() * skalar)));
    }

    public boolean subtract(Stock stock)
    {
        if (this.contains(stock))
        {
            for (MaterialType materialType : stock.keySet())
            {
                this.put(materialType, (this.get(materialType) - stock.get(materialType)));
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
        Stock other = (Stock) obj;
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
    public Set<java.util.Map.Entry<MaterialType, Integer>> entrySet()
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
    public Set<MaterialType> keySet()
    {
        return this.kosten.keySet();
    }

    @Override
    public Integer put(MaterialType key, Integer value)
    {
        return this.kosten.put(key, value);
    }

    @Override
    public void putAll(Map<? extends MaterialType, ? extends Integer> m)
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
