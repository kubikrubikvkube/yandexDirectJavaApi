package ru.contextguide.campaign.campaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;

/**
 * Настройки временного таргетинга и почасовой корректировки ставок.
 */

public class Schedule implements JsonSerializableObject {
    /**
     * Не более 7 элементов в массиве.
     * Каждый элемент массива содержит 25 чисел, разделенных запятыми. Первое число — номер дня недели: от 1 (понедельник) до 7 (воскресенье). Следующие 24 числа — последовательность коэффициентов к ставке для показа объявлений в соответствующие часы. Коэффициенты указываются в процентах от 0 до 200, значение должно быть кратно 10. Коэффициент 0 означает, что объявления в этот час не показываются. Пример элемента массива: 1,0,0,50,50,100,100,150,200,200,150,100,100,80,70,100,100,100,50,50,40,30,0,0,0
     * Примечание.
     * Если в массиве отсутствует элемент, соответствующий дню недели, то объявления в этот день показываются круглосуточно, с коэффициентом 100%.
     * Если выбрана автоматическая стратегия показа, коэффициент 0 означает запрет показов, а любой другой коэффициент означает разрешение показов (то есть эквивалентен 100).
     */
    private List<String> items;

    public List<String> getItems() {
        return items;
    }


    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(items, schedule.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}