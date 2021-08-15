package Baeldung.Hamcrest.practice04_CollectionMatcher;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CollectionMatcherTest {
    // Simple check to find out if a Collection is empty
    @Test
    public void givenCollection_whenEmpty_thenCorrect() {
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, empty());
    }

    // To check the size of a Collection
    @Test
    public void givenAList_whenChecksSize_thenCorrect() {
        List<String> hamcrestMatchers = Arrays.asList("collections", "beans", "text", "number");
        assertThat(hamcrestMatchers, hasSize(4));
    }

    // to assert that an array has a required size
    @Test
    public void givenArray_whenChecksSize_thenCorrect() {
        String[] hamcrestMatchers = { "collections", "beans", "text", "number" };
        assertThat(hamcrestMatchers, arrayWithSize(4));
    }

    // a Collection contains given members, regardless of order
    @Test
    public void givenAListAndValues_whenChecksListForGivenValues_thenCorrect() {
        List<String> hamcrestMatchers = Arrays.asList( "collections", "beans", "text", "number" );
        assertThat(hamcrestMatchers, containsInAnyOrder("beans", "text", "collections", "number"));
    }

    // the Collection members are in given order
    @Test
    public void givenAListAndValues_whenChecksListForGivenValuesWithOrder_thenCorrect() {
        List<String> hamcrestMatchers = Arrays.asList( "collections", "beans", "text", "number");
        assertThat(hamcrestMatchers, contains("collections", "beans", "text", "number"));
    }

    // To check if an array has a single given element
    @Test
    public void givenArrayAndValue_whenValueFoundInArray_thenCorrect() {
        String[] hamcrestMatchers = { "collections", "beans", "text", "number" };
        assertThat(hamcrestMatchers, hasItemInArray("text"));
    }

    // To check if an array has a single given element(alternative)
    @Test
    public void givenValueAndArray_whenValueIsOneOfArrayElements_thenCorrect() {
        String[] hamcrestMatchers = { "collections", "beans", "text", "number" };
        assertThat("text", isOneOf(hamcrestMatchers));
    }

    // the same with a different matcher
    @Test
    public void givenValueAndArray_whenValueFoundInArray_thenCorrect() {
        String[] array = new String[] { "collections", "beans", "text", "number" };
        assertThat("beans", isIn(array));
    }

    // if the array contains given elements regardless of order
    @Test
    public void givenArrayAndValues_whenValuesFoundInArray_thenCorrect() {
        String[] hamcrestMatchers = new String[] {"collections", "beans", "text", "number"};
        assertThat(hamcrestMatchers, arrayContainingInAnyOrder("beans", "collections", "number", "text"));
    }

    // To check if the array contains given elements but in the given order
    @Test
    public void givenArrayAndValues_whenValuesFoundInArrayInOrder_thenCorrect() {
        String[] hamcrestMatchers = new String[] {"collections", "beans", "text", "number"};
        assertThat(hamcrestMatchers, arrayContaining("collections", "beans", "text", "number"));
    }

    // To check if it contains a given key
    @Test
    public void givenMapAndKey_whenKeyFoundInMap_thenCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("blogname", "baeldung");
        assertThat(map, hasKey("blogname"));
    }

    // To check if it contains a given value
    @Test
    public void givenMapAndValue_whenValueFoundInMap_thenCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("blogname", "baeldung");
        assertThat(map, hasValue("baeldung"));
    }

    // To check if it contains a given key and value
    @Test
    public void givenMapAndEntry_whenEntryFoundInMap_thenCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("blogname", "baeldung");
        assertThat(map, hasEntry("blogname", "baeldung"));
    }
}
