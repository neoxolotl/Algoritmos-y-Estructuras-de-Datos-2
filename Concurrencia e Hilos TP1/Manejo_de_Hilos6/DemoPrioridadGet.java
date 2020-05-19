class DemoPrioridadGet extends Thread
{
    public void run()
    {
        System.out.println("Dentro del método run");
    }

    public static void main(String[]args)
    {
        DemoPrioridadGet t1 = new DemoPrioridadGet();
        DemoPrioridadGet t2 = new DemoPrioridadGet();
        DemoPrioridadGet t3 = new DemoPrioridadGet();

        System.out.println("Prioridad del hilo t1 : " +
                t1.getPriority()); // Por defecto 5
        System.out.println("Prioridad del hilo t2 : " +
                t2.getPriority()); // Por defecto 5
        System.out.println("Prioridad del hilo t3 : " +
                t3.getPriority()); // Por defecto 5

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        // t3.setPriority(21); arrojará IllegalArgumentException
        System.out.println("Prioridad del hilo t1 : " +
                t1.getPriority());  //2
        System.out.println("Prioridad del hilo t2 : " +
                t2.getPriority()); //5
        System.out.println("Prioridad del hilo t3 : " +
                t3.getPriority());//8

        // Hilo Principal (Main thread)
        System.out.print(Thread.currentThread().getName()+": ");
        System.out.println("Prioridad del hilo Main : "
                + Thread.currentThread().getPriority());

        // La prioridad del hilo principal se establece en 10
        Thread.currentThread().setPriority(10);
        System.out.println("Prioridad del hilo Main : "
                + Thread.currentThread().getPriority());
    }
}
