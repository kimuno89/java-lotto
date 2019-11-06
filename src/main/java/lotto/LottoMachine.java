package lotto;

import lotto.view.LottoInputView;
import lotto.view.LottoResultView;

/**
 * @author : 김윤호
 * @version : 1.0
 * @date : 2019-11-02 22:36
 */
public class LottoMachine {
    public static void main(String[] args) {
        LottoOrder lottoMachine = new LottoOrder(LottoInputView.inputPurchaseAmount());
        LottoResultView.printLotto(lottoMachine.getLotto());
    }
}
