package edu.hw1;

import java.util.stream.Stream;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @ParameterizedTest
    @MethodSource("nestableDataProvider")
    public void testIsNestable(int[] arr1, int[] arr2, boolean expected) {
        assertEquals(expected, Task3.isNestable(arr1, arr2));
    }

    @Contract(pure = true) private static @NotNull Stream<Object[]> nestableDataProvider() {
        return Stream.of(
            new Object[] {new int[] {1, 2, 3, 4}, new int[] {0, 6}, true},
            new Object[] {new int[] {3, 1}, new int[] {4, 0}, true},
            new Object[] {new int[] {9, 9, 8}, new int[] {8, 9}, false},
            new Object[] {new int[] {1, 2, 3, 4}, new int[] {2, 3}, false},
            new Object[] {new int[] {}, new int[] {0, 1}, true},
            new Object[] {new int[] {0, 1}, new int[] {}, false},
            new Object[] {new int[] {}, new int[] {}, true},
            new Object[] {new int[] {-3, -1}, new int[] {-4, 0}, true},
            new Object[] {new int[] {-3, -4}, new int[] {-4, -3}, false},
            new Object[] {new int[] {1, 2, 3}, new int[] {1, 4}, false},
            new Object[] {new int[] {1, 2, 3}, new int[] {0, 3}, false},
            new Object[] {new int[] {10, 20, 30}, new int[] {5, 35}, true},
            new Object[] {new int[] {10}, new int[] {9, 11}, true},
            new Object[] {new int[] {2, 3, 4}, new int[] {1, 2, 3, 4, 5}, true}
        );
    }
}
