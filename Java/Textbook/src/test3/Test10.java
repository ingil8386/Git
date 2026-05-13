package test3;

class Computer {
    private String model;

    public Computer(String model) {
        this.model = model;
    }

    public void show() {
        System.out.println("모델: " + model);
    }

    static class CPU {
        String processor;

        // 생성자
        public CPU(String processor) {
            this.processor = processor;
        }

        // 정보 출력 메서드
        public void info() {
            System.out.println("CPU: " + processor);
        }
    }

    static class RAM {
        int size;

        // 생성자
        public RAM(int size) {
            this.size = size;
        }

        // 정보 출력 메서드
        public void info() {
            System.out.println("RAM: " + size + "GB");
        }
    }
    

    static class SSD {
        int storage;

        // 생성자
        public SSD(int storage) {
            this.storage = storage;
        }

        // 정보 출력 메서드
        public void info() {
            System.out.println("SSD: " + storage + "GB");
        }
    }
}

public class Test10 {
    public static void main(String[] args) {
        Computer.CPU cpu = new Computer.CPU("Intel i7");
        Computer.RAM ram = new Computer.RAM(64);
        Computer.SSD ssd = new Computer.SSD(1024);

        cpu.info();
        ram.info();
        ssd.info();
    }
}
