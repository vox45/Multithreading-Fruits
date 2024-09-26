package src.app;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    String[] fruits = new DataRepository().getData();  // Отримуємо масив фруктів

    public void getOutput() {
        synchronized (this) {  // Синхронізований блок для безпечного виведення
            StringBuilder sb = new StringBuilder();
            AtomicInteger count = new AtomicInteger(1);  // Лічильник для нумерації

            for (String fruit : fruits) {
                sb.append(String.format("(%d) %s ", count.getAndIncrement(), fruit));
            }

            // Виводимо ім'я потоку та список фруктів
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
}
