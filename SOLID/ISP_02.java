package SOLID;

public class ISP_02 {
    
    public static interface Worker {
        void work();       
    }
    public static interface Restable {
        void rest();
    }

    public static class Developer implements Worker, Restable {
        @Override
        public void work() {
            System.out.println("Developer is coding");
        }

        @Override
        public void rest() {
            System.out.println("Developer is making a break");
        }
    }

    public static class Robot implements Worker {
        @Override
        public void work() {
            System.out.println("Robot is working hard ");
        }       
    }
    public static void perfromRest(Restable restable) {
        restable.rest();
    }
    public static void perfromWork(Worker worker) {
        worker.work();
    }
 
    public static void main(String[] args) {
        Developer developer = new Developer();
        Robot robot = new Robot();
        perfromWork(developer);
        perfromRest(developer);
        perfromWork(robot);
    }
}
