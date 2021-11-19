package nivel2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;


class TestMainClass {
	
	@Test
	void test() {
		Object pepe = new Object();
		assertThat(pepe,is(pepe));
	}

    @Test
    void demoHamcrest() {
        boolean a = true;
        boolean b = true;

        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
        assertThat(a, is(b));
    }
        
    @Test
    public void compruebaLongitudString() {
        assertThat("Mordor", length(is(6)));
    }
    public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
              return actual.length();
            }
        };
    }
    
    
}