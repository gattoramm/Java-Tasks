## __Примеры и упражнения из книги Б. Эккель "Философия JAVA"__

### Глава 2 - Все является объектом

<details><summary><b>Упражнения</b></summary>

> [1](src/part2/Exercises/Ex1_DefaultInit/Ex1.java) - Создайте класс с полями int и char, которые не инициализируются в программе. Выведите их значения, чтобы убедиться в том, чтo Java выполняет инициализацию по умолчанию.

> [6](src/part2/Exercises/Ex6_Storage/Ex6.java) - Напишите программу, включающую метод storage().

> [7 8](src/part2/Exercises/Ex7_8_IncrementableStatic/Ex7_8.java) - Напишите программу с классом lncrementable, которая демонстрирует, что независимо от количества созданных объектов класс содержит только один экземпляр поля static.

> [9](src/part2/Exercises/Ex9_PrimaryType/Ex9.java) - Напишите программу, демонстрирующую автоматическую упаковку примитивных типов.

</details>

### Глава 3 - Операторы

<details><summary><b>Упражнения</b></summary>

> [2](src/part3/Exercises/Ex2_AliasingFloat/Ex2.java) - Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.

> [3](src/part3/Exercises/Ex3_AliasingMethod/Ex3.java) - Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методов.

> [5 6](src/part3/Exercises/Ex5_6_ObjectsEquals/Ex5_6.java) - Создайте класс Dog, содержащий два поля типа String: name и says. В методе main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями. Выведите значения обоих полей для каждого из объектов. Создайте новую ссылку на Dog и присвойте ее объекту spot. Сравните ссылки оператором == и методом equals().

> [8](src/part3/Exercises/Ex8_LongToBinary/Ex8.java) - Покажите, что шестнадцатеричная и восьмеричная записи могут использоваться с типом long. Для вывода результатов используйте метод Long.toBinaryString().

> [9](src/part3/Exercises/Ex9_MinMaxFloatDoubleExponential/Ex9.java) - Выведите наибольшее и наименьшее число в экспоненциальной записи для типов float и double.

> [10](src/part3/Exercises/Ex10_BinaryOperations/Ex10.java) - Напишите программу с двумя константами: обе константы состоят из чередующихся нулей и единиц, но у одной нулю равен младший бит, а у другой старший (подсказка: константы проще всего определить в шестнадцатеричном виде). Объедините эти две константы всеми возможными поразрядными операторами. Для вывода результатов используйте метод Integer.toBinaryString().

> [14](src/part3/Exercises/Ex14_StringOperations/Ex14.java) - Напишите метод, который получает два аргумента String, выполняет с ними все операции логических сравнений и выводит результаты. Для операций == и I = также выполните проверку equals(). Вызовите свой метод из main() для нескольких разных объектов String.

</details>

### Глава 4 - Управляющие конструкции

<details><summary><b>Пример из книги</b></summary>

> [Пример](src/part4/BookExamples/control/WhileTest.java) - Генерация случайных чисел до тех пор, пока не будет выполнено определенное условие.

</details>

<details><summary><b>Упражнения</b></summary>

> [15](src/part4/Exercises/Ex15_100nums/Ex15.java) - Напишите программу, которая выводит числа от 1 до 100.

> [16](src/part4/Exercises/Ex16_RandomInt/Ex16.java) - Напишите программу, которая генерирует 25 случайных значений типа int. Для каждого значения команда if-else сообщает, в каком отношении оно находится с другим случайно сгенерированным числом (больше, меньше, равно).

> [17](src/part4/Exercises/Ex17_RandomIntInfinity/Ex17.java) - Измените упражнение 2 так, чтобы код выполнялся в «бесконечном» цикле while. Программа должна работать до тех пор, пока ее выполнение не будет прервано с клавиатуры.

> [20](src/part4/Exercises/Ex20_MethodTest/Ex20.java) - Создайте метод test() так, чтобы он получал два аргумента begin и end, а значение testval проверялось на принадлежность к диапазону [ begin, end] (с включением границ).

</details>

### Глава 5 - Инициализация и завершение

<details><summary><b>Пример из книги</b></summary>

> [Пример](src/part5_Initialization/BookExamples/TerminaionCondition/TerminationCondition.java) - Условие "готовности". Явная финализация.

> [Пример](src/part5_Initialization/BookExamples/OrderOfInitialization/OrderOfInitialization.java) - Порядок инициализации. Очередность инициализации.

> [Пример](src/part5_Initialization/BookExamples/StaticInitialization/StaticInitialization.java) - Инициализация статических классов. Инициализация статической памяти.

> [Пример](src/part5_Initialization/BookExamples/EpclicitStatic/EpclicitStatic.java) - Явная инициализация статических классов. Инициализация static.

> [Пример](src/part5_Initialization/BookExamples/ArraysOfPrimitives/ArraysOfPrimitives.java) - Инициализация массива. Копирование ссылки на массив.

> [Пример](src/part5_Initialization/BookExamples/ArrayInit/ArrayNew.java) - Инициализация массива. Создание массива примитивных типов.

> [Пример](src/part5_Initialization/BookExamples/ArrayInit/ArrayInit.java) - Инициализация массива. Инициализация массивов объектов.

> [Пример](src/part5_Initialization/BookExamples/ArrayClassObj/ArrayClassObj.java) - Инициализация массива. Создание массива непримитивных объектов.

> [Пример](src/part5_Initialization/BookExamples/DynamicArray/DynamicArray.java) - Инициализация массива. Создание массива объектов String для передачи альтернативных аргументов командной строки методу main() другого класса.

> [Пример](src/part5_Initialization/BookExamples/VarArgs/VarArgs.java) - Списки аргументов переменной длины. Производные классы от общего корневого класса Object.

> [Пример](src/part5_Initialization/BookExamples/VarArgs/NewVarArgs.java) - Списки аргументов переменной длины. Определения переменного списка аргументов через многоточие.

> [Пример](src/part5_Initialization/BookExamples/OptionalTrailingArguments/OptionalTrailingArguments.java) - Списки аргументов переменной длины. Список аргументов переменной длины.

> [Пример](src/part5_Initialization/BookExamples/VarArgs/VarargType.java) - Списки аргументов переменной длины. Список аргументов переменной длины в массив.

> [Пример](src/part5_Initialization/BookExamples/VarArgs/AutoboxingVarargs.java) - Списки аргументов переменной длины. Автоматическая упаковка.

> [Пример](src/part5_Initialization/BookExamples/VarArgs/OverloadingVarargs.java) - Списки аргументов переменной длины. Списки аргументов переменной длины с перезагрузкой.

> [Пример](src/part5_Initialization/BookExamples/VarArgs/OverloadingVarargs2.java) - Списки аргументов переменной длины. Списки аргументов переменной длины с перезагрузкой. В одном из методов аргумент «постоянной длины».

> [Пример](src/part5_Initialization/BookExamples/VarArgs/OverloadingVarargs3.java) - Списки аргументов переменной длины. Списки аргументов переменной длины с перезагрузкой. В одном из методов аргумент «постоянной длины» в двух методах.

</details>

<details><summary><b>Упражнения</b></summary>

> [1](src/part5_Initialization/Exercises/Ex1_DefaultInit/Ex1.java) - Создайте класс с неинициализированной ссылкой на String. Покажите, что Java инициализирует ссылку значением null.

> [2](src/part5_Initialization/Exercises/Ex2_TwoObjConstrAndInit/Ex2.java) - Создайте класс с полем String, инициализируемым в точке определения, и другим полем, инициализируемым конструктором.

> [3](src/part5_Initialization/Exercises/Ex3_DefaultConstructor/Ex3.java) - Создайте класс с конструктором по умолчанию (без параметров), который выводит на экран сообщение. Создайте объект этого класса.

> [4](src/part5_Initialization/Exercises/Ex4_OverConstructors/Ex4.java) - Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий в качестве параметра строку (String) и распечатывающий ее вместе с сообщением.

> [5](src/part5_Initialization/Exercises/Ex5_OverMethod/Ex5.java) - Создайте класс Dog (собака) с перегруженным методом bark() (лай). Методдолжен быть перегружен для разных примитивных типов данных с целью вывода сообщения о лае, завывании, поскуливании и т. п. в зависимости от версии перегруженного метода. Напишите метод main(), вызывающий все версии.

> [6](src/part5_Initialization/Exercises/Ex6_ReverseOverMethod/Ex6.java) - Измените предыдущее упражнение так, чтобы два перегруженных метода принимали два аргумента (разных типов) и отличались только порядком их следования в списке аргументов. Проверьте, работает ли это.

> [7](src/part5_Initialization/Exercises/Ex7_WithoutConstructor/Ex7.java) - Создайте класс без конструктора. Создайте объект этого класса в методе main(), чтобы удостовериться, что конструктор по умолчанию синтезируется автоматически.

> [8](src/part5_Initialization/Exercises/Ex8_This/Ex8.java) - Создайте класс с двумя методами. В первом методе дважды вызовите второй метод: один раз без ключевого слова this, а во второй с this — просто для того, чтобы убедиться в работоспособности этого синтаксиса; не используйте этот способ вызова на практике.

> [9](src/part5_Initialization/Exercises/Ex9_ThisConstructor/Ex9.java) - Подготовьте класс с двумя (перегруженными) конструкторами. Используя ключевое слово this, вызовите второй конструктор из первого.

> [10](src/part5_Initialization/Exercises/Ex10_Finalize/Ex10.java) - Создайте класс с методом finalize(), который выводит сообщение. В методе main() создайте объект вашего класса.

> [16](src/part5_Initialization/Exercises/Ex16_ArraysString/Ex16_ArraysString.java) - Создайте массив объектов String. Присвойте объект String каждому элементу. Выведите содержимое массива в цикле for.

> [17 18](src/part5_Initialization/Exercises/Ex17_18ArraysStringWithConctructor/Ex17_18.java) - Создайте класс с конструктором, получающим аргумент String. Выведите значение аргумента во время конструирования. Создайте массив ссылок на этот класс, но не создавайте объекты, которыми заполняется массив. Запустите программу и посмотрите, будут ли выводиться сообщения при вызове конструкторов. Создайте объекты, которыми заполняется массив ссылок.

> [19](src/part5_Initialization/Exercises/Ex19_String_Varargs/Ex_19_String_Varargs.java) - Напишите метод, получающий список аргументов переменной длины с массивом String. Убедитесь в том, что этому методу может передаваться как  список объектов String, разделенных запятыми, так и String[].

> [21](src/part5_Initialization/Exercises/Ex21_22Enums/Ex_21EnumsValOrd.java) - Создайте перечисление с названиями шести типов бумажных денег. Переберите результат values() с выводом каждого значения и его ordinal().

> [22](src/part5_Initialization/Exercises/Ex21_22Enums/Ex_22Switch.java) - Напишите команду switch для перечисления из предыдущего примера. Для каждого случая выведите расширенное описание конкретной валюты.

</details>

### Глава 8 - Полиморфизм

<details><summary><b>Пример из книги</b></summary>

> [Пример](src/part8_Polymorphism/BookExamples/smpl1_music) - Снова о восходящем преобразовании. Пример наследования и восходящего преобразования.

> [Пример](src/part8_Polymorphism/BookExamples/smpl2_shape) - Получение нужного результата. Переопределение интерфейса.

</details>

<details><summary><b>Упражнения</b></summary>

> [1](src/part8_Polymorphism/Exercises/Ex1) - Добавьте аннотацию @Override в примеры с фигурами.

> [3](src/part8_Polymorphism/Exercises/Ex3) - Включите в базовый класс Shapes.java новый метод, выводящий сообщение, но не переопределяйте его в производных классах. Объясните результат. Переопределите его в одном из производных классов и посмотрите, что происходит. Наконец, переопределите метод во всех производных классах.

> [4](src/part8_Polymorphism/Exercises/Ex4) - Добавьте новый подтип Shape к программе Shapes.java и проверьте на методе main(), что полиморфизм работает правильно для вашего нового типа, так же как и для старых типов.

> [5](src/part8_Polymorphism/Exercises/Ex5) - В упражнении 1 добавьте классу Cycle метод wheel(), возвращающий количество колес каждого транспортного средства. Измените метод ride() так, чтобы он вызывал метод wheels(), и убедитесь в том, что полиморфизм успешно работает.

</details>

### Глава 11 - Коллекции объектов