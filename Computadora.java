public class Computadora extends DispositivoElectronicoDeConsumo{
    protected Microprocesador cpu;
    protected long ramMB;
    public Computadora(Microprocesador cpu, long ramMB){
        this.cpu = cpu;
        this.ramMB = ramMB;
    }
        public Microprocesador getCpu(Microprocesador cpu) {
            return cpu;
        }
        public void setCpu(Microprocesador cpu) {
            this.cpu = cpu;
        }
        public long getRamMB(long ramMB) {
            return ramMB;
        }
        public void setRamMB(long ramMB) {
            this.ramMB = ramMB;
        }
    
        @Override
        public String toString() {
            return super.toString();
        }
    }