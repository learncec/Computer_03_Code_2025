public class Computer
{
    private String hersteller;
    private boolean laptop;
    private int preis;
    
    private Computer(String newHersteller, boolean newLaptop, int newPreis)
    {
     setHersteller(newHersteller);
     setLaptop(newLaptop);
     setPreis(newPreis);
    }
    
    public void setHersteller(String newHersteller)
    {
        hersteller = newHersteller;
    }
    
    public void setLaptop(boolean newLaptop)
    {
        laptop = newLaptop;
    }
    
    public void setPreis(int newPreis)
    {
        preis = newPreis;
    }
    
    public String getHersteller()
    {
        return hersteller;
    }
    
    public boolean getLaptop()
    {
        return laptop;
    }
    
    public int getPreis()
    {
        return preis;
    }
}