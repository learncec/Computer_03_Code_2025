public class Computer
{
    private String hersteller; // Eigenschaft; Der Name des Herstellers
    private boolean laptop;     // Ob es Laptops gibt oder nicht (Ja oder Nein)
    private int preis;          // Wie viel es kostet
    private int mhz;
    
    
    /*
     * It is creating a new Instance of the class Computer.
     * 
     */
    public Computer(String hersteller, boolean laptop, int preis,int mhz)
    {
     setHersteller(hersteller);
     setLaptop(laptop);
     setPreis(preis);
     setMhz(mhz);
    }
    public Computer(String hersteller, boolean laptop, int preis)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(2000);
    }
    public Computer(String hersteller, boolean laptop)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(899);
        setMhz(2000);
    }
    public Computer(String hersteller, int preis)
    {
        setHersteller(hersteller);
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }
    public Computer()
    {
     setHersteller("Lenovo");
     setLaptop(true);
     setPreis(899);
     setMhz(2000);
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
    public void setMhz(int mhz)
    {
        this.mhz = mhz;
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
    public int getMhz()
    {
        return mhz;
    }
    
   public void printComputer()
    {
    if(laptop == true)
    {
    System.out.println("Hersteller: " + hersteller + ", Laptop ist vorhanden, Preis: " + preis + " Euro");
    }
    else{
    System.out.println("Hersteller: " + hersteller + ", Computer ist vorhanden, Preis: " + preis + " Euro"); 
    }
    }
   }