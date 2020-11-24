package typings.zxcvbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZXCVBNResult extends js.Object {
  
  /**
    * how long it took zxcvbn to calculate an answer,
    * in milliseconds.
    */
  var calc_time: Double = js.native
  
  /**
    * same keys as result.crack_times_seconds,
    * with friendlier display string values:
    * "less than a second", "3 hours", "centuries", etc.
    */
  var crack_times_display: ZXCVBNAttackTime = js.native
  
  /**
    * dictionary of back-of-the-envelope crack time
    * estimations, in seconds, based on a few scenarios.
    */
  var crack_times_seconds: ZXCVBNAttackTime = js.native
  
  /**
    * verbal feedback to help choose better passwords. set when score <= 2.
    */
  var feedback: ZXCVBNFeedback = js.native
  
  /**
    * estimated guesses needed to crack password
    */
  var guesses: Double = js.native
  
  /**
    * order of magnitude of result.guesses
    */
  var guesses_log10: Double = js.native
  
  /**
    * Integer from 0-4 (useful for implementing a strength bar):
    * 0 too guessable: risky password. (guesses < 10^3)
    * 1 very guessable: protection from throttled online attacks. (guesses < 10^6)
    * 2 somewhat guessable: protection from unthrottled online attacks. (guesses < 10^8)
    * 3 safely unguessable: moderate protection from offline slow-hash scenario. (guesses < 10^10)
    * 4 very unguessable: strong protection from offline slow-hash scenario. (guesses >= 10^10)
    */
  var score: ZXCVBNScore = js.native
  
  /**
    * the list of patterns that zxcvbn based the
    * guess calculation on.
    */
  var sequence: js.Array[ZXCVBNSequence] = js.native
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
  
  @scala.inline
  implicit class ZXCVBNResultOps[Self <: ZXCVBNResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalc_time(value: Double): Self = this.set("calc_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrack_times_display(value: ZXCVBNAttackTime): Self = this.set("crack_times_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrack_times_seconds(value: ZXCVBNAttackTime): Self = this.set("crack_times_seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback(value: ZXCVBNFeedback): Self = this.set("feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuesses(value: Double): Self = this.set("guesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuesses_log10(value: Double): Self = this.set("guesses_log10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: ZXCVBNScore): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceVarargs(value: ZXCVBNSequence*): Self = this.set("sequence", js.Array(value :_*))
    
    @scala.inline
    def setSequence(value: js.Array[ZXCVBNSequence]): Self = this.set("sequence", value.asInstanceOf[js.Any])
  }
}
