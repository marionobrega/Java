class main
{ 
    public static void main(String[] args)
    {   
        //Array de Stings
        
        System.out.println(args);
        for(int i=0; i<args.length; i++)
        {
            System.out.print(args[i]);
            {
                if(i < args.length-1)
                {
                    System.out.print(" e ");
                }
                else
                {
                    System.out.print(" -- ");
                }
            }
        }
        for(int i =0; i<args.length; i++)
        {
            System.out.print(args[i] + " e ");
        }
        System.out.println();
        
        
        
        //ARRAY DE INTEIROS
        int notas[] = {7,10,9};
        System.out.println(notas);
        for(int i =0; i<3; i++)
        {
            System.out.println(notas);
        }
        
        //Forma 1
        System.out.println("Helllo World");
        //forma 2
        String hello = "Hello world";
        System.out.println(hello.toUpperCase());
    }
}