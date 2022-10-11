package step2.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    public static int inputPrice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static List<Integer> inputWinningNumbers() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(", "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());
    }
}
