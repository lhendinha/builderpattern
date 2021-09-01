public class Computer {

    private String SSD;
    private String RAM;

    private boolean isGraphicsCardEnabled;

    public String getSSD() {
        return SSD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.SSD = builder.SSD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder{

        private String SSD;
        private String RAM;

        private boolean isGraphicsCardEnabled;

        public ComputerBuilder(String ssd, String ram){
            this.SSD = ssd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}