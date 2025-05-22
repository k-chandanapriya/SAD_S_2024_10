package SOLID;

public class ISP_01 {

    public static interface Printer {
        void printDocument();   
    }
// Interface for devices that can scan
    public static interface Scanner {
        void scanDocument();
    }
// Interface for devices that can send faxes
    public static interface Fax {
        void faxDocument();
    }

// A class that implements all three interfaces
    public static class MultiFunctionPrinter implements Printer, Scanner, Fax {
        @Override
        public void printDocument() {
            System.out.println("Sending document to the printer");
        }

        @Override
        public void scanDocument() {
            System.out.println("Scanning document");
        }

        @Override
        public void faxDocument() {
            System.out.println("Faxing document");
        }
    }

    public static void main(String[] args) {
        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.printDocument();
        multiFunctionPrinter.scanDocument();        
        multiFunctionPrinter.faxDocument();
    }
}
