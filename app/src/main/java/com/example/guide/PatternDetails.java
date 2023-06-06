package com.example.guide;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PatternDetails extends AppCompatActivity {
    ArrayList<Pattern> patterns = new ArrayList<Pattern>();
    String id;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pattern_details);
        Intent intent = getIntent();
        id = intent.getStringExtra("keyIdButton");
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        PatternAdapter adapter = new PatternAdapter(this, patterns);
        recyclerView.setAdapter(adapter);
        System.out.println(id);

    }
//No adapter attached; skipping layout
    private void setInitialData() {
        switch (id) {
            case "2131231218":
                patterns.add(new Pattern("Абстрактная фабрика", "Предоставляет интерфейс для создания семейств взаимосвязанных или \n" +
                        "взаимозависимых объектов, не специфицируя их конкретных классов"));
                patterns.add(new Pattern("Строитель", "Отделяет конструирование сложного объекта от его представления, так что \n" +
                        "в результате одного и того же процесса конструирования могут получаться \n" +
                        "разные представления"));
                patterns.add(new Pattern("Фабричный метод", "Определяет интерфейс для создания объекта, но оставляет подклассам решение о том, экземпляры какого класса должны создаваться. Фабричный метод позволяет классу делегировать создание экземпляров подклассам"));
                break;
            case "2131231219":
                patterns.add(new Pattern("Адаптер", "Преобразует интерфейс одного класса в другой интерфейс, на который \n" +
                        "рассчитаны клиенты. Адаптер обеспечивает совместную работу классов \n" +
                        "с несовместимыми интерфейсами, которая без него была бы невозможна."));
                patterns.add(new Pattern("Мост", "Отделить абстракцию от ее реализации так, чтобы то и другое можно было \n" +
                        "изменять независимо"));
                patterns.add(new Pattern("Компоновщик", "Компонует объекты в древовидные структуры для представления иерархий \n" +
                        "«часть — целое». Позволяет клиентам единообразно трактовать индивидуальные и составные объекты."));
                break;
            case "2131231220":
                patterns.add(new Pattern("Цепочка обязанностей", "Позволяет избежать привязки отправителя запроса к его получателю, предоставляя возможность обработать запрос нескольким объектам. Связывает \n" +
                        "объекты-получатели в цепочку и передает запрос по этой цепочке, пока он \n" +
                        "не будет обработан"));
                patterns.add(new Pattern("Команда", "Инкапсулирует запрос в объекте, позволяя тем самым параметризовать клиенты для разных запросов, ставить запросы в очередь или протоколировать \n" +
                        "их, а также поддерживать отмену операций"));
                patterns.add(new Pattern("Интерпретатор", "Для заданного языка определяет представление его грамматики, а также \n" +
                        "интерпретатор предложений этого языка"));
                break;
        }
    }
}
