# JUnit Java
Тестовые примеры использования JUnit

## Примеры на основе курса Udemy [Hamcrest Quick Start: Enhanced JUnit syntax and capabilities](https://www.udemy.com/course/hamcrest/learn/lecture/22166184?start=0#overview)
Тестовые примеры с использованием библиотеки Hamcrest
* Introduction
  * [link](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice01_AssertThat_EqualsTo_methods/AssertThat_EqualsTo.java) assertThat()
  * String methods
      * [lnik](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice02_String_methods/Theory01_startsWith_endsWith_containsString_equalTo.java) startsWith(), endsWith(), containsString(), equalTo()
      * [lnik](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice02_String_methods/Theory02_emptyString_blankString_nullString.java) emptyString(), blankString(), nullString()
  * Number methods
      * [lnik](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice03_Number_methods/Theory01_lessThan_etc.java) lessThan(), lessThanOrEqualTo(), equalTo(), greaterThanOrEqualTo(), greaterThan()
      * [lnik](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice03_Number_methods/Theory02_closeTo.java) closeTo()
  * [link](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice04_Expressive_syntax/Theory01_is_not_equalTo.java) Expressive syntax
  * [link](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice05_Matcher_practice1/RideEligible.java) Matcher practice 1
  * [link](src/Udemi/Hamcrest_Quick_start/part01_Introduction/practice06_Matcher_practice2/ThermometerAccuracy.java) Matcher practice 2
* Hamcrest In Greater Depth
  * Array methods
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice07_Array_methods/Theory1_emptyArray.java) emptyArray()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice07_Array_methods/Theory2_arrayWithSize_etc.java) arrayWithSize(), hasItemInArray(), arrayContaining(), arrayContainingInAnyOrder()
  * Collection methods
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice08_Collection_methods/Theory1_lists_empty_hasItem_etc.java) **Empty List** nullValue(), empty(), hasSize(), hasItem(), hasItems(), contains(), containsInAnyOrder()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice08_Collection_methods/Theory2_lists_anyOrder.java) **List**: greaterThan(), greaterThanOrEqualTo(), lessThan(), lessThanOrEqualTo()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice08_Collection_methods/Theory3_sets.java) **Set**: hasSize(), hasItem(), hasItems(), containsInAnyOrder()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice08_Collection_methods/Theory4_maps_anEmptyMap_etc.java) **Map**: hasKey(), hasValue(), hasEntry()
  * Object methods, anything()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice09_Object_methods_and_Anything/Theory1_nullValue_notNullValue.java) nullValue(), notNullValue()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice09_Object_methods_and_Anything/Theory2_instanceOf_isA.java) **List, Map**: instanceOf(), isA()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice09_Object_methods_and_Anything/Theory3_instanceOf_isA.java) **Object**: instanceOf(), isA()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice09_Object_methods_and_Anything/Theory4_sameInstance.java) sameInstance()
    * [link](src/Udemi/Hamcrest_Quick_start/part02_Hamcrest_In_Greater_Depth/practice09_Object_methods_and_Anything/Theory5_anything.java) anything()
* Custom Hamcrest Matchers
  * [link](src/Udemi/Hamcrest_Quick_start/part03_Custom_Hamcrest_Matchers/practice11_custom_matchers_IsOdd) Custom Hamcrest matcher: IsOdd
  * [link](src/Udemi/Hamcrest_Quick_start/part03_Custom_Hamcrest_Matchers/practice12_custom_matchers_Sum) Custom Hamcrest Matcher: Sum
  * [link](src/Udemi/Hamcrest_Quick_start/part03_Custom_Hamcrest_Matchers/practice13_custom_matchers_StartsWith) Write Your Own Custom Matcher: StartsWith
  * [link](src/Udemi/Hamcrest_Quick_start/part03_Custom_Hamcrest_Matchers/practice14_custom_matchers_AlphaNumeric) Write Your Own Custom Matcher: AlphaNumeric
* Beans
  * [link](src/Udemi/Hamcrest_Quick_start/part04_Beans/practice15_beans/) Methods for Java Beans

## Примеры на основе курса Udemy [JUnit 5 Quick Start: Java Unit Testing](https://www.udemy.com/course/junit-quick-start-for-beginners-java-unit-testing/learn/lecture/18764200?start=0#overview)
Тестовые примеры JUnit
* [link](src/Udemi/JUnit5_Quick_Start/practice1_assertEqual_assetNotEqual/) First JUnit tests: @Test,
assertEquals(), assertNotEquals()
* [link](src/Udemi/JUnit5_Quick_Start/practice2_assertTrue_assertFalse/) The assertTrue() and assertFalse()
methods.
* [link](src/Udemi/JUnit5_Quick_Start/practice3_bugFix_practice/) Fielding a bug report : best-practices
demonstration
* [link](src/Udemi/JUnit5_Quick_Start/practice4_future_request_tdd/) Implementing a feature request :
best-practices demonstration
* [link](src/Udemi/JUnit5_Quick_Start/practice5_beforeAll_afterAll/) @BeforeAll, @AfterAll annotations
* [link](src/Udemi/JUnit5_Quick_Start/practice6_assertArrayEquals/) The assertArrayEquals() method
* [link](src/Udemi/JUnit5_Quick_Start/practice7_bugFix/) Development practice: performing a
bugfix