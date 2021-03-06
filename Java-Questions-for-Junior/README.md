# Вопросы на собеседовании junior java developer
## ООП (Объектно-ориентированное программирование)

* Что такое ООП?
	* ООП - методология, парадигма программирования. В ней программа состоит из неких сущностей - объектов. ООП - это описание взимодействия таких объектов.
* Что такое объект?
	* Некая сущность, обладающая свойством (данные) и поведением (методы). Обеъкт может включать данные элементарного типа (числа, строки, ...), так и другие созданные объекты.
* Назовите основные принципы ООП.
	* Абстракция, инкапсуляция, наследование, полиморфизм
* Что такое наследование?
	* Концепция ООП, при котором объект может принимать свойства и поведения другого существующего объекта и дополнять черты, характерные только для него. Способствует повоторному использованию компонентов и порождает иерархию классов. 
* Что такое полиморфизм? Какие проявления полиморфизма в Java Вы знаете?
	* Концепция ООП, способность программы идентично использовать объекты с одинаковым интерфейсом без информации о конкретном типе этого объекта. Возможны проявления в виде перезагрузки методов и переопределении методов родителя.
* Что такое инкапсуляция?
	* Концепция ООП, при которой объединяются свойства и поведение в классе. Так же скрытие внутренней реализации от других классов. 
* Что такое aбстракция?
	* Выделение и использование только тех характеристик объекта, которые представляют значимость. Абстракция позволяет работать с объектами, не вдаваясь в особенности реализации.
* В чем преимущества объектно-ориентированных языков программирования?
	* Возможность создавать ПО меньшего размера за счет использования одного и того же кода с разными данными.
* Как использование объектно–ориентированного подхода улучшает разработку программного обеспечения?
* Имеется выражение «является» (is a) и «имеет» (has). Что они * подразумевают в плане принципов ООП? В чем разница между композицией и агрегацией?
* Что вы подразумеваете под полиморфизмом, инкапсуляцией и динамическим связыванием?

## Java core
* Чем отличается JRE, JVM и JDK?
	* JRE (Java Runtime Environment) - минимальная реализация виртуальной машины, необходимая длядля исполнения Java - приложений, без компилятора и других средств разработки. Состоит из виртуальной машины - Java Virtual Machine и библиотеки Java классов.
	* JDK (Java Development Kit) - комплект разработчика приложений на языке Java, включающий в себя компилятор Java(javac), стандартные библиотеки классов Java, примеры, документацию, различные утилиты и исполнительную среду Java(JRE).
	* JVM (Java Virtual Machine) - основная часть исполняющей системы Java, так называемой Java Runtime Environment (JRE). Виртуальная машина интерпретирует байт-код Java, предварительно созданный из исходного текста Java-программы компилятором Java (javac). JVM может также использоваться для выполнения программ, написанных на других языках программирования.
* Опишите модификаторы доступа в Java.
* Что такое package level access.
	* Нет явного модификатора доступа. Уровень доступа в пределах пакета. Его еще называют доступом по-умолчанию.
* Чем абстрактный клас отличается от интерфейса? В каких случаях Вы бы использовали абстрактный класс, а в каких интерфейс?
* Может ли объект получить доступ к private-переменной класса? Если, да, то каким образом?
* Для чего в джаве статические блоки?
* Можно ли перегрузить static метод?
* Расскажите про внутренние классы. Когда вы их будете использовать?
* В чем разница между переменной экземпляра класса и статической переменной? Приведите пример.
* Приведите пример когда можно использовать статический метод?
* Расскажите про классы-загрузчики (class loaders) и про динамическую загрузку классов.
* Что такое статическая и что  такое динамическая загрузка класса?
* Для чего нужен оператор "assert" в java? 
* Почему в некоторых интерфейсах  вообще не определяют методов? 
* Какая основная разница между String, StringBuffer, StringBuilder? 
* Расскажите про потоки ввода-вывода  Java.
* Что такое Heap и Stack память в Java?
* Какая разница между Stack и Heap памятью в Java?
* Расскажите про модель памяти  в java?
* Как работает сборщик мусора (garbage collector)? 
* Расскажите про приведение типов.  Что такое понижение и повышение  типа? Когда вы получаете ClassCastException? 
* Что такое статический класс, какие особенности его использования?
* Каким образом из вложенного класса получить доступ к полю внешнего класса.
* Какие существуют типы вложенных классов? Для чего они используются? 
* Возможно ли при переопределении (override) метода изменить: 
	* Модификатор доступа
	* Возвращаемый тип
	* Тип аргумента или количество
	* Имя аргументов
	* Изменять порядок, количество или вовсе убрать секцию throws?
* Что такое autoboxing?
* Что такое Generics?
* Какова истинная цель использования обобщенных типов в Java? 
* Каким образом передаются переменные в методы, по значению или по ссылке?
* Какие методы есть у класса Object?
* Правила переопределения метода Object.equals().
* Если вы хотите переопределить equals(), какие условия должны удовлетворяться для переопределенного метода?
* Какая связь между hashCode и equals?
* Каким образом реализованы методы hashCode и equals в классе Object?
* Что будет, если переопределить equals не переопределяя hashCode? Какие могут возникнуть проблемы?
* Есть ли какие-либо рекомендации о том, какие поля следует использовать при подсчете hashCode?
* Для чего нужен метод hashCode()?
* Правила переопределения метода Object.hashCode().
* Расскажите про клонирование объектов. В чем отличие между поверхностным и глубоким клонированием?
* Правила переопределения метода Object.clone().
* Где и как вы можете использовать  закрытый конструктор?
* Что такое конструктор по умолчанию?
* Опишите метод Object.finalize().
* Чем отличаются слова final, finally и finalize?
* Опишите иерархию исключений.
* Какие виды исключений в Java вы знаете, чем они отличаются? 
* Что такое checked и unchecked Exception?
* Как создать свой unchecked Exception?
* Какие есть Unchecke exeption?
* Что такое Error?
* Опишите работу блока try-catch-finally.
* Возможно ли использование блока try-finally (без catch)?
* Всегда ли исполняется блок finally?
* Какие есть оссобенности класса String? что делает метод intern().
* Можно ли наследовать строковый тип, почему?
* Почему строка является популярным ключом в HashMap в Java?
* Дайте определение понятию конкатенация строк.
* Как перевернуть строку?
* Как сравнить значение двух строк?
* Как обрезать пробелы в начале и конце строки?
* Дайте определение понятию "пул строк".
* Можно ли синхронизировать доступ к строке?
* Как правильно сравнить значения строк двух различных объектов типа String и StringBuffer?
* Почему строка неизменная и финализированная в Java?
* Напишите метод удаления данного символа из строки.
* Что такое рефлексия?
* Что произойдет со сборщиком мусора (GC), если во время выполнения метода finalize() некоторого объекта произойдет исключение?
* Что такое интернационализация, локализация?
* Что такое Аннотации в Java?
* Какие функции выполняет Аннотации?
* Какие встроенные аннотации в Java вы знаете?
* Что делают аннотации @Retention, @Documented, @Target и @Inherited?
* Что делают аннотации @Override, @Deprecated, @SafeVarargs и @SuppressWarnings?
* Какой жизненный цикл аннотации можно указать с помощью @Retention?
* К каким элементам можно применять аннотацию, как это указать?
* Как создать свою Аннотацию?
* Атрибуты каких типов допустимы в аннотациях?
* Что такое  JMX?
* Какие выгоды предлагает JMX?
* Что еще умеет JMX кроме дистанционного управления?
* Что такое MBean?
* Какие типы MBeans существуют?
* Что такое MBean Server?
* Какие механизмы обеспечивают безопасность в технологии Java?
* Назовите несколько видов проверок которые выполняет верификатор байт-кода Java?
* Что вы знаете о "диспетчере защиты" в Java?
* Что такое JAAS?
* Что такое Рефакторинг?

## Java collections framework (JCF)- это набор связанных классов и интерфейсов, реализующих commonly reusable collection структур данных.
* Что такое Коллекция?
* Назовите основные интерфейсы коллекций и их имплементации.
* Чем отличается ArrayList от LinkedList? В каких случаях лучше использовать первый, а в каких второй?
	* ArrayList - список, реализованный на основе массива, LinkedList - связный список, основанный на объектах, с сылками между ними. Приемущества ArrayList -  в возможности доступа к произвольному элементу по индексу за постоянное время. Недостатки ArrayList - при вставке/удалении в/из середину списка - происходит перезапись элементов справа. Плюсы LinkedList - удаление/вставка за постоянное время, доступ к элементу за линейное время. LinkedList стоит использовать при работе с серединой списка или нужно гарантированное время добавления элемента в список.
* Чем отличается HashMap от Hashtable?
	* HashMap сотоит из элементов масиива, которые хранят ссылки на списки элементов. При добавлении новой пары ключ-значение, вычисляется хэш-код ключа, на основании которого вычисляется номер массива, в которую попадет элемент. Если такой элемент уже есть, то происходит последовательный переход по ссылкам в поисках последнего элемента от которого и ставится ссылка на вновь добавленный элемент. Если в списке найден элемент с таким же ключем, он заменяется. HashMap не потокобезопасен и не синхронизирован и позволяет хранение null ключей и значений. Hashtable не позволяет хранение ключа null и потокобезопасен и синхронизированность, но это делает его медленным.
* Чем отличается ArrayList от Vector?
* Как сравниваются елементы коллекций?
* Расположите в виде иерархии следующие интерфейсы: List, Set, Map, SortedSet,  SortedMap, Collection,Iterable, Iterator, NavigableSet, NavigableMap.
* Почему Map - это не Collection, в то время как List и Set являются Collection?
* Дайте определение понятию "iterator".
* Что вы знаете об интерфейсе Iterable?
* Как одной строчкой преобразовать HashSet в ArrayList?
* Как одной строчкой преобразовать ArrayList в HashSet?
* Как перебрать все ключи Map учитывая, что Map - это не Iterable?
* Как перебрать все значения Map учитывая, что Map - это не Iterable?
* Как перебрать все пары ключ-значение в Map учитывая, что Map - это не Iterable?
* В чем проявляется "сортированность" SortedMap, кроме того, что toString()  выводит все по порядку?
* Как одним вызовом копировать элементы из любой Collection в массив?
* Реализуйте симметрическую разность двух коллекций используя методы Collection (addAll(), removeAll(), retainAll()).
* Сравните Enumeration и Iterator.
* Как между собой связаны Iterable и Iterator?
	* Интерфейс Iterable имеет только один метод iterator(), который возвращает итератор коллекции для ее обхода.
* Как между собой связаны Iterable, Iterator и "for-each " введенный в Java 5?
* Сравните Iterator и ListIterator.
* Что произойдет, если я вызову Iterator.next() не "спросив" Iterator.hasNext()?
* Что произойдет, если я вызову Iterator.next() перед этим 10 раз вызвав  Iterator.hasNext()? Я пропущу 9 элементов?
* Если у меня есть коллекция и порожденный итератор, изменится ли коллекция, если я вызову iterator.remove()?
* Если у меня есть коллекция и порожденный итератор, изменится ли итератор, если я вызову collection.remove(..)?
* Зачем добавили ArrayList, если уже был Vector?
* В реализации класса ArrayList есть следующие поля: Object[] elementData, int size. Объясните, зачем хранить отдельно size, если всегда можно взять elementData.length?
* LinkedList - это односвязный, двусвязный или четырехсвязный список?
* Какое худшее время работы метода contain() для элемента, который есть в LinkedList (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?
* Какое худшее время работы метода contain() для элемента, который есть в ArrayList (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?
* Какое худшее время работы метода add() для LinkedList (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?
* Какое худшее время работы метода add() для ArrayList (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?
* Сколько выделяется элементов в памяти при вызове ArrayList.add()?
* Сколько выделяется элементов в памяти при вызове LinkedList.add()?
* Оцените количество памяти на хранение одного примитива типа byte в  LinkedList?
* Оцените количество памяти на хранение одного примитива типа byte в ArrayList?
* Я добавляю элемент в середину List-а: list.add(list.size()/2, newElem). Для кого эта операция медленнее - для ArrayList или для LinkedList?
* Как перебрать элементы LinkedList в обратном порядке, не используя медленный get(index)?
* Как одним вызовом из List получить List со всеми элементами, кроме первых и последних 3-х?
* Могут ли у разных объектов в памяти (ref0 != ref1) быть ref0.hashCode() == ref1.hashCode()?
* Могут ли у разных объектов в памяти (ref0 != ref1) быть ref0.equals(ref1) == true?
* Могут ли у разных ссылок на один объект в памяти (ref0 == ref1) быть  ref0.equals(ref1) == false?
* Есть класс Point{int x, y;}. Почему хэш-код в виде 31 * x + y предпочтительнее чем x + y?
* Если у класса Point{int x, y;} "правильно " реализовать метод equals (return ref0.x == ref1.x && ref0.y == ref1.y), но сделать хэш-код в виде int hashCode() {return x;}, то будут ли корректно такие точки помещаться и извлекаться из HashSet?
equals() порождает отношение эквивалентности. Какими из свойств обладает такое отношение: коммутативность, симметричность, рефлексивность, дистрибутивность, ассоциативность, транзитивность?
* Можно ли так реализовать equals(Object that) {return this.hashCode() == that.hashCode()}?
* В equals требуется проверять, что аргумент (equals(Object that)) такого же типа как и сам объект. В чем разница между this.getClass() == that.getClass() и that instanceof MyClass?
* Можно ли реализовать метод equals класса MyClass вот так: class MyClass {public boolean equals(MyClass that) {return this == that;}}?
* Будет ли работать HashMap, если все ключи будут возвращать int hashCode() {return 42;}?
* Зачем добавили HashMap, если уже был Hashtable?
* Согласно Кнуту и Кормену существует две основных реализации хэш-таблицы: на основе открытой адресацией и на основе метода цепочек. Как реализована HashMap? Почему так сделали (по вашему мнению)? В чем минусы и плюсы каждого подхода?
* Сколько переходов по ссылкам происходит, когда вы делаете HashMap.get(key) по ключу, который есть в таблице?
* Сколько создается новых объектов, когда вы добавляете новый элемент в HashMap?
* * Как работает HashMap при попытке сохранить в нее два элемента по ключам с одинаковым hashCode, но для которых equals == false?
HashMap может выродиться в список даже для ключей с разным hashCode. Как это возможно?
* Какое худшее время работы метода get(key) для ключа, которого нет в таблице (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?
* Какое худшее время работы метода get(key) для ключа, который есть в таблице (O(1), O(log(N)), O(N), O(N*log(N)), O(N*N))?
* Объясните смысл параметров в конструкторе HashMap(int initialCapacity, float loadFactor).
В чем разница между HashMap и IdentityHashMap? Для чего нужна IdentityHashMap? Как может быть полезна для реализации сериализации или клонирования? 
* В чем разница между HashMap и WeakHashMap? Для чего нужна WeakHashMap?
* В WeakHashMap используются WeakReferences. А почему бы не создать SoftHashMap на SoftReferences?
* В WeakHashMap используются WeakReferences. А почему бы не создать PhantomHashMap на PhantomReferences?
* Сделайте HashSet из HashMap (используйте только множество ключей, но не множество значений).
* Сделайте HashMap из HashSet (HashSet<Map.Entry<K, V>>). 
* Сравните интерфейсы java.util.Queue и java.util.Deque.
* Кто кого расширяет: Queue расширяет Deque, или Deque расширяет Queue?
* Почему LinkedList реализует и List, и Deque?
* В чем разница между классами java.util.Arrays и java.lang.reflect.Array?
* В чем разница между классами java.util.Collection и java.util.Collections?
* Напишите НЕмногопоточную программу, которая заставляет коллекцию выбросить ConcurrentModificationException.
* Что такое "fail-fast поведение"? 
* Для множеств еnum-ов есть специальный класс java.util.EnumSet? Зачем? Чем авторов не устраивал HashSet или TreeSet? 
java.util.Stack - считается "устаревшим". Чем его рекомендуют заменять? Почему? 
* Какая коллекция реализует дисциплину обслуживания FIFO?
* Какая коллекция реализует дисциплину обслуживания FILO?
* Приведите пример, когда какая-либо коллекция выбрасывает UnsupportedOperationException.
* Почему нельзя написать "ArrayList<List> numbers = new ArrayList<ArrayList>();" но можно "List<ArrayList> numbers = new ArrayList<ArrayList>();"?
* LinkedHashMap - что это еще за "зверь"? Что в нем от LinkedList, а что от HashMap? 
* LinkedHashSet - что это еще за "зверь"? Что в нем от LinkedList, а что от HashSet?
* Говорят, на LinkedHashMap легко сделать простенький кэш c "invalidation policy", знаете как?
* Что позволяет сделать PriorityQueue?
* В чем заключаются отличия java.util.Comparator от java.lang.Comparable?

## Java 8
* Какие нововведения, появились в Java 8?
* Как сортировать список строк с помощью лямбда-выражения?
* Какова структура лямбда-выражения?
* К каким переменным есть доступ у Лямбда-выражений?
* Что такое ссылки на метод?
* Какие виды ссылок на методы вы знаете?
* Объясните выражение System.out::println.
* Что такое функциональные интерфейсы?
* Для чего нужен функциональный интерфейс BiConsumer<T,U>?
* Для чего нужен функциональный интерфейс BiFunction<T,U,R>?
* Для чего нужен функциональный интерфейс BinaryOperator<T>?
* Для чего нужен функциональный интерфейс BiPredicate<T,U>?
* Для чего нужен функциональный интерфейс BooleanSupplier?
* Для чего нужен функциональный интерфейс Consumer<T>?
* Для чего нужен функциональный интерфейс DoubleBinaryOperator?
* Для чего нужен функциональный интерфейс DoubleConsumer?
* Для чего нужен функциональный интерфейс DoubleFunction<R>?
* Для чего нужен функциональный интерфейс DoublePredicate?
* Для чего нужен функциональный интерфейс DoubleSupplier?
* Для чего нужен функциональный интерфейс DoubleToIntFunction?
* Для чего нужен функциональный интерфейс DoubleToLongFunction?
* Для чего нужен функциональный интерфейс DoubleUnaryOperator?
* Для чего нужен функциональный интерфейс Function<T,R>?
* Для чего нужен функциональный интерфейс IntBinaryOperator?
* Для чего нужен функциональный интерфейс IntConsumer?
* Для чего нужен функциональный интерфейс IntFunction<R>?
* Для чего нужен функциональный интерфейс IntPredicate?
* Для чего нужен функциональный интерфейс IntSupplier?
* Для чего нужен функциональный интерфейс IntToDoubleFunction?
* Для чего нужен функциональный интерфейс IntToLongFunction?
* Для чего нужен функциональный интерфейс IntUnaryOperator?
* Для чего нужен функциональный интерфейс LongBinaryOperator?
* Для чего нужен функциональный интерфейс LongConsumer?
* Для чего нужен функциональный интерфейс LongFunction<R>?
* Для чего нужен функциональный интерфейс LongPredicate?
* Для чего нужен функциональный интерфейс LongSupplier?
* Для чего нужен функциональный интерфейс LongToDoubleFunction?
* Для чего нужен функциональный интерфейс LongToIntFunction?
* Для чего нужен функциональный интерфейс LongUnaryOperator?
* Для чего нужен функциональный интерфейс ObjDoubleConsumer<T>?
* Для чего нужен функциональный интерфейс ObjIntConsumer<T>?
* Для чего нужен функциональный интерфейс ObjLongConsumer<T>?
* Для чего нужен функциональный интерфейс Predicate<T>?
* Для чего нужен функциональный интерфейс Supplier<T>?
* Для чего нужен функциональный интерфейс ToDoubleBiFunction<T,U>?
* Для чего нужен функциональный интерфейс ToDoubleFunction<T>?
* Для чего нужен функциональный интерфейс ToIntBiFunction<T,U>?
* Для чего нужен функциональный интерфейс ToIntFunction<T>?
* Для чего нужен функциональный интерфейс ToLongBiFunction<T,U>?
* Для чего нужен функциональный интерфейс ToLongFunction<T>?
* Для чего нужен функциональный интерфейс UnaryOperator<T>?
* Что такое StringJoiner?
* Что такое default методы?
* Что такое static методы?
* Как вызывать default-метод интерфейса в классе?
* Как вызывать static-метод интерфейса в классе?
* Что такое потоки(stream) в Java 8
* Для чего нужен метод collect Java 8?
* В чем разница между коллекцией(Collection) и потоком(Stream)?
* Для чего предназначен метод forEach в потоках(stream)?
* Как вывести на экран 10 случайных чисел, используя forEach?
* Для чего предназначен метод map в потоках(stream)?
* Как можно вывести на экран уникальные квадраты чисел используя метод map?
* Какова цель метода filter в потоках(stream)?
* Как вывести на экран количество пустых строк с помощью метода filter?
* Для чего предназначен метод limit в потоках(stream)?
* Для чего предназначен метод sorted в потоках(stream)?
* Как вывести на экран 10 случайных чисел в отсортированном порядке в Java 8?
* Параллельная обработка в Java 8?
* Как найти максимальное число в списке Java 8?
* Как найти минимальное число в списке Java 8?
* Как получить сумму всех чисел в списке, используя Java 8?
* Как получить среднее значение всех чисел, в списке, используя Java 8?
* Что такое Optional?
* Что такое Nashorn?
* Что такое jjs в Java 8?
* Что такое LocalDateTime в Java 8?
* Что такое ZonedDateTime в Java 8?
* Как получить текущую дату с использованием time API из Java 8?
* Как добавить 1 неделю к текущей дате с использованием time API?
* Как добавить 1 месяц к текущей дате с использованием time API?
* Как добавить 1 год к текущей дате с использованием time API?
* Как добавить 10 лет к текущей дате с использованием time API?
* Как получить следующий вторник используя time API?
* Как получить вторую субботу текущего месяца используя time API?
* Как получить текущую дату в миллисекундах используя time API?
* Как получить текущую дату по местному времени в миллисекундах используя используя time API?
* Какой класс появился в Java 8 для декодирования данных?
* Какой класс появился в Java 8 для кодирования данных?
* Как создать Base64 декодировщик?
* Как создать Base64 кодировщик?

## Потоки ввода вывода в java
* Что такоє символьная ссылка?
* Какая разница между I/О и NIO?
* Какие особенности NIO вы знаете?
* Какие существуют виды потоков ввода/вывода?
* Назовите основные классы потоков ввода/вывода.
* Чем отличаются и что общего у OutputStream, InputStream, Writer, Reader?
* Какие подклассы базового класса InputStream ви знаєте, для чего они предназначены?
* Что вы знаете о RandomAccessFile?
* Какие есть режимы доступа к файлу есть у RandomAccessFile ?
* Какие подклассы базового класса OutputStream ви знаєте, для чего они предназначены?
* Для чего используется PushbackInputStream?
* Для чего используется SequenceInputStream?
* Какие подклассы базового класса Reader ви знаєте, для чего они предназначены?
* Какие подклассы базового класса Writer ви знаєте, для чего они предназначены?
* Что  такое абсолютный путь и относительный путь?
* В каких пакетах лежат классы-потоки?
* Что вы знаете о классах-надстройках?
* Какой класс-надстройка позволяет читать данные из входного байтового потока в формате примитивных типов данных?
* Какой класс-надстройка позволяет ускорить чтение/запись за счет использования буфера?
* Какие классы позволяют преобразовать байтовые потоки в символьные и обратно?
* В чем отличие класса PrintWriter от PrintStream?
* Какой класс предназначен для работы с элементами файловой системы?
* Какой символ является разделителем при указании пути в файловой системе?
* Какие методы класса File вы знаете?
* Что вы знаете об интерфейсе FileFilter?
* Какие классы позволяют архивировать объекты?

## Многопоточность в Java (multithreading)
* Чем отличается процесс от  потока?
* Каким образом можно создать поток?
* Что такое монитор?
* Какие способы синхронизации в Java?
* Как работают методы wait и notify/notifyAll?
* Чем отличается работа метода wait с параметром и без параметра?
* Как работает метод Thread.yield()? Чем отличаются методы Thread.sleep() и Thread.yield()?
* Как работает метод Thread.join()?
* Что такое dead lock?
* На каком объекте происходит синхронизация при вызове static synchronized метода?
* Для чего используется ключевое слово volatile, synchronized, transient, native?
* Что значит приоритет потока?
* Что такое потоки –демоны в джава?
* Что значит усыпить поток?
* В каких состояниях может быть  поток в джава? Как вообще работает поток?
* Чем отличаются два интерфейса для реализации задач Runnable и Callable?
* Различия между CyclicBarrier и CountDownLatch?
* Что такое состояние гонки (race condition)?
* Как остановить нить?
* Что происходит, когда в нити появляется исключение?
* Что такое ThreadLocal переменная?
* Что такое FutureTask?
* Различие между interrupted и isInterrupted?
* Почему методы wait и notify вызываются в синхронизированном блоке?
* Что такое пул нитей?
* Различия между livelock и deadlock?
* Как проверить, удерживает ли нить lock?
* Как получить дамп нити?
* Какой JVM параметр используется для контроля размера стека нити?
* Различия между synchronized и ReentrantLock?
* Что такое Semaphore?
* Что будет, если очередь пула нитей уже заполнена, а вы подадите задачу?
* Различия между методами submit() и execute() у пула нитей?
* Что такое блокирующий метод?
* Что такое ReadWriteLock?
* Что такое double checked locking Синглтона?
* Что такое фреймворк Fork/Join?