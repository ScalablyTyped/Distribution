package typings
package zxcvbnLib.zxcvbnMod.zxcvbnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ZXCVBNResult extends js.Object {
  /**
           * how long it took zxcvbn to calculate an answer,
           * in milliseconds.
           */
  var calc_time: scala.Double
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
  var guesses: scala.Double
  /**
           * order of magnitude of result.guesses
           */
  var guesses_log10: scala.Double
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

