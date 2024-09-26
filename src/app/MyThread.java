package src.app;

class MyThread extends Thread {

    private DataHandler dataHandler;  // Спільний ресурс

    public MyThread(String name, DataHandler dataHandler) {
        super(name);  // Передаємо ім'я потоку
        this.dataHandler = dataHandler;
    }

    @Override
    public void run() {
        dataHandler.getOutput();  // Виклик методу для виведення даних
    }
}
