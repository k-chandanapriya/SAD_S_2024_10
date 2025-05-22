package SOLID;

public class DIP_02 {

  
    public interface Notification {
        void doNotify();
    }

    public static class EmailNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!");
        }
    }
    //Low-level module: SMSNotification implementing the interface
    public static class SMSNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via SMS!");
        }
    }
    //High-level module: Employee depending on the abstraction
    public static class Employee {
        private Notification notification;

        // this is "Dependency Injection" (composition style)
        public Employee(Notification notification) {
            this.notification = notification;
        }

        public void notifyEmployee() {
            notification.doNotify();
        }
    }

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        Employee employee = new Employee(emailNotification);
        employee.notifyEmployee();
    }
}
