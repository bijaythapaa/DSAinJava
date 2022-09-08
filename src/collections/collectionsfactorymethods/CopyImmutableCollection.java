package collections.collectionsfactorymethods;

import java.util.*;

public class CopyImmutableCollection {
    Collection<String> collection = Arrays.asList("one", "two", "three");

    List<String> list = List.copyOf(collection);
    Set<String> set = Set.copyOf(collection);
}
