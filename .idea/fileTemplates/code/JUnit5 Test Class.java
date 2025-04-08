import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

#parse("File Header.java")
class ${NAME} {

    private ${CLASS_NAME} testee = new ${CLASS_NAME}();

    @ParameterizedTest
    @MethodSource("vals")
    void name() {
    ${BODY}
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of()
        );
    }
}