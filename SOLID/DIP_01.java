package SOLID;

public class DIP_01 {

   //Abstraction (interface)
    public interface deviceoperation {
        void turnOn();
        void turnOff();
    
        
    }
    //Low-level module:lightbulb implementing the interface
    public static class LightBulb implements deviceoperation {
        public void turnOn() {
            System.out.println("Light is ON!");
        }
        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }
    //High-level module: switch depending on the abstraction
    public static class Switch {
        private deviceoperation device;

        // this is "Dependency Injection" (composition style)
        public Switch(deviceoperation device) {
            this.device = device;
            
        }

        public void operate() {
            device.turnOn();
        }
    }

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate();
    }
}
