# **Задачи на потоки**

* [My first thread]() (Easy)

    * Создать public static class TestThread - нить с интерфейсом Runnable. TestThread должен выводить в консоль "My first thread".

* [My second thread]() (Easy)

    * Создать public static класс TestThread, унаследованный от класса Thread.
    * Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
    * Метод run должен выводить в консоль "it's a run method".

* [Список и нити]() (Medium)

    * Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
    * SpecialThread должен выводить в консоль свой стек-трейс.

* [Вывод стек-трейса]() (Easy)

    * В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.

* [Поговорим о музыке]() (Medium)

    * Измени класс Violin так, чтоб он стал таском для нити. Используй интерфейс MusicalInstrument
    * Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
        * Считай время начала игры - метод startPlaying().
        * Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
        * Считай время окончания игры - метод stopPlaying().
        * Выведи на консоль продолжительность игры в миллисекундах.