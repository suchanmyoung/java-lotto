package step2;

import java.util.Map;
import step2.domain.LottoGame;
import step2.domain.LottoNumber;
import step2.domain.LottoResult;
import step2.domain.Ticket;
import step2.view.InputView;
import step2.view.OutputView;

import java.util.List;

public class LottoApplication {
    public static void main(String[] args) {
        OutputView.printPriceNotification();
        Ticket ticket = Ticket.from(InputView.inputPrice());
        int ticketCount = ticket.getTicketCount();
        OutputView.printPurchaseResult(ticketCount);
        LottoGame lottoGame = LottoGame.newInstance();
        List<LottoNumber> lottoNumbers = lottoGame.playLotto(ticketCount);
        OutputView.printLottoNumbers(lottoNumbers);
        OutputView.printWinningNumberNotification();
        List<Integer> winningNumbers = InputView.inputWinningNumbers();
        LottoResult lottoResult = LottoResult.from(winningNumbers);
        Map<LottoNumber, Integer> drawLottoResult = lottoResult.drawLottoResult(lottoNumbers);
        OutputView.printDrawResult(drawLottoResult);
    }
}
