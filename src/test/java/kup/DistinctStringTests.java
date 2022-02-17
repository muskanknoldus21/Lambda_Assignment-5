package kup;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctStringTests {

    //      Given test cases
    List<String> stringList = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));
    List<String> stringList2 = new ArrayList<>(Arrays.asList("the", "tree", "the", "tree", "the", "tree","an","an","a"));

    @Test
    public void shouldReturnDistinct(){
        List<String> expected1 = Arrays.asList("clojure","java","scala");
        List<String> expected2 = Arrays.asList("a","an","the","tree");

        List<String> distinctList1= DistinctString.getDistinctStrings(stringList);
        List<String> distinctList2= DistinctString.getDistinctStrings(stringList2);

        Assert.assertEquals(expected1,distinctList1);
        Assert.assertEquals(expected2,distinctList2);
    }
}
