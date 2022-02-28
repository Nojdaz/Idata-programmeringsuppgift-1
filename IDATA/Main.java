public class Main {
    public static void main(String[] args){
        DevIdata DI = new DevIdata();
        ProductionIdata PI = new ProductionIdata();

        System.out.println(PI.getDepartment());
        System.out.println(PI.getMainWork());
        System.out.println(DI.getDepartment());
        System.out.println(DI.getMainWork());

    }
}
