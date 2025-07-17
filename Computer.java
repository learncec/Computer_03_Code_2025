public class Computer
{
    private String hersteller; // Eigenschaft der Name des Herstellers
    private boolean laptop;     // Ob es Laptops gibt oder nicht (Ja oder Nein)
    private int preis;          // Wie viel es kostet
    
    
    /*
     * It is creating a new Instance of the class Computer.
     * 
     */
    private Computer(String newHersteller, boolean newLaptop, int newPreis)
    {
     setHersteller(newHersteller);
     setLaptop(newLaptop);
     setPreis(newPreis);
    }
    
    public void setHersteller(String newHersteller)
    {
        // set the property hersteller to the value of the parameter newHersteller.
        hersteller = newHersteller;
    }
    
    public void setLaptop(boolean newLaptop)
    {
        // set the property laptop to the value of the parameter newLaptop.
        laptop = newLaptop;
    }
    
    public void setPreis(int newPreis)
    {
        // set the property preis to the value of the newPreis.
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