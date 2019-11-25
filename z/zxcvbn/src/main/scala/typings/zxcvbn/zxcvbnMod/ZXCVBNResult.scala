package typings.zxcvbn.zxcvbnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZXCVBNResult extends js.Object {
  /**
    * how long it took zxcvbn to calculate an answer,
    * in milliseconds.
    */
  var calc_time: Double
  /**
    * same keys as result.crack_times_seconds,
    * with friendlier display string values:
    * "less than a second", "3 hours", "centuries", etc.
    */
  var crack_times_display: ZXCVBNAttackTime
  /**
    * dictionary of back-of-the-envelope crack time
    * estimations, in seconds, based on a few scenarios.
    */
  var crack_times_seconds: ZXCVBNAttackTime
  /**
    * verbal feedback to help choose better passwords. set when score <= 2.
    */
  var feedback: ZXCVBNFeedback
  /**
    * estimated guesses needed to crack password
    */
  var guesses: Double
  /**
    * order of magnitude of result.guesses
    */
  var guesses_log10: Double
  /**
    * Integer from 0-4 (useful for implementing a strength bar):
    * 0 too guessable: risky password. (guesses < 10^3)
    * 1 very guessable: protection from throttled online attacks. (guesses < 10^6)
    * 2 somewhat guessable: protection from unthrottled online attacks. (guesses < 10^8)
    * 3 safely unguessable: moderate protection from offline slow-hash scenario. (guesses < 10^10)
    * 4 very unguessable: strong protection from offline slow-hash scenario. (guesses >= 10^10)
    */
  var score: ZXCVBNScore
  /**
    * the list of patterns that zxcvbn based the
    * guess calculation on.
    */
  var sequence: js.Array[ZXCVBNSequence]
}

object ZXCVBNResult {
  @scala.inline
  def apply(
    calc_time: Double,
    crack_times_display: ZXCVBNAttackTime,
    crack_times_seconds: ZXCVBNAttackTime,
    feedback: ZXCVBNFeedback,
    guesses: Double,
    guesses_log10: Double,
    score: ZXCVBNScore,
    sequence: js.Array[ZXCVBNSequence]
  ): ZXCVBNResult = {
    val __obj = js.Dynamic.literal(calc_time = calc_time.asInstanceOf[js.Any], crack_times_display = crack_times_display.asInstanceOf[js.Any], crack_times_seconds = crack_times_seconds.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], guesses = guesses.asInstanceOf[js.Any], guesses_log10 = guesses_log10.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZXCVBNResult]
  }
}

