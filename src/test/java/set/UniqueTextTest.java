package set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/*
2. Идентичные тексты [#212655 #58988].
 */
class UniqueTextTest {
    @Test
    void whenIsEqualsTru() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(uniqueText.isEquals(origin, text)).isTrue();
    }

    @Test
    public void isNotEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(uniqueText.isEquals(origin, text)).isFalse();
    }
}