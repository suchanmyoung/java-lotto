package step2.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrizeTest {

    @DisplayName("3이 인자로 들어오면 5000원을 보상한다")
    @Test
    void matchCount_3_is_5000prize() {
        int reward = Prize.getPrize(3).getReward();
        Assertions.assertThat(reward).isEqualTo(5000);
    }

    @DisplayName("4가 인자로 들어오면 50000원을 보상한다")
    @Test
    void matchCount_4_is_50000prize() {
        int reward = Prize.getPrize(4).getReward();
        Assertions.assertThat(reward).isEqualTo(50000);
    }

    @DisplayName("5가 인자로 들어오면 1500000원을 보상한다")
    @Test
    void matchCount_5_is_1500000prize() {
        int reward = Prize.getPrize(5).getReward();
        Assertions.assertThat(reward).isEqualTo(1500000);
    }

    @DisplayName("6이 인자로 들어오면 2000000000원을 보상한다")
    @Test
    void matchCount_6_is_2000000000prize() {
        int reward = Prize.getPrize(6).getReward();
        Assertions.assertThat(reward).isEqualTo(2000000000);
    }

    @DisplayName("7 이상이 인자로 들어오면 예외 처리")
    @ParameterizedTest
    @ValueSource(ints = {7, 8, 9, 10})
    void matchCount_max_6(int matchCount) {
        Assertions.assertThatThrownBy(() -> Prize.getPrize(matchCount))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
