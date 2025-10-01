public class Computer
{
    private String hersteller; // Eigenschaft; Der Name des Herstellers
    private boolean laptop;     // Ob es Laptops gibt oder nicht (Ja oder Nein)
    private int preis;          // Wie viel es kostet
    
    
    /*
     * It is creating a new Instance of the class Computer.
     * 
     */
    public Computer(String hersteller, boolean laptop, int preis)
    {
     setHersteller(hersteller);
     setLaptop(laptop);
     setPreis(preis);
    }
    
    public Computer()
    {
     setHersteller("Intel");
     setLaptop(true);
     setPreis(2000);
    }
    
    public void setHersteller(String hersteller)
    {
        // set the property hersteller to the value of the parameter newHersteller.
        this.hersteller = hersteller;
    }
        public void setLaptop(boolean laptop)
    {
        // set the property laptop to the value of the parameter newLaptop.
        this.laptop = laptop;
    }
       public void setPreis(int preis)
    {
        // set the property preis to the value of the newPreis.
        this.preis = preis;
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
    
   public void printComputer()
    {
    System.out.println("Hersteller: " + hersteller + ", Laptop: " + laptop + ", Preis: " + preis + " Euro");
    }
   }