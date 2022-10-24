package step4.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import step4.domain.LottoNumber;
import step4.domain.LottoNumberGenerator;
import step4.domain.LottoNumbers;
import step4.domain.Ticket;

public class InputView {

    public static int inputPrice() {
        OutputView.printPriceNotification();
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int inputManualLottoCount() {
        OutputView.printManualLottoCount();
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static List<int[]> inputManualLottoNumbers(Ticket manualLottoTicket) {
        OutputView.printManualLottoNumberNotification();

        Scanner scanner = new Scanner(System.in);
        int ticketCount = manualLottoTicket.getTicketCount();
        List<int[]> manualLottoNumbers = new ArrayList<>();
        for (int i = 0; i < ticketCount; i++) {
            manualLottoNumbers.add(Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray());
        }
        return manualLottoNumbers;
    }

    public static List<Integer> inputWinningNumbers() {
        OutputView.printWinningNumberNotification();
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(", "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());
    }

    public static int inputBonusBall() {
        OutputView.printBonusBallNotification();
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
