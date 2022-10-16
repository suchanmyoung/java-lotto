package step2.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LottoNumberGenerator {

    private static final int MIN_LOTTO_RANGE = 1;
    private static final int MAX_LOTTO_RANGE = 45;
    private static final List<Integer> lottoNumbersCache = new ArrayList<>();

    static {
        IntStream.rangeClosed(MIN_LOTTO_RANGE, MAX_LOTTO_RANGE)
            .forEach(i -> lottoNumbersCache.add(i));
    }

    private LottoNumberGenerator() {
    }

    public static int generateLottoNumber() {
        Collections.shuffle(lottoNumbersCache);

        return lottoNumbersCache.stream()
            .findFirst()
            .get()
            .intValue();
    }
}
