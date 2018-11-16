package typings
package zxcvbnLib.zxcvbnMod.zxcvbnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ZXCVBNAttackTime extends js.Object {
  /**
           * offline attack with user-unique salting but a fast hash
           * function like SHA-1, SHA-256 or MD5. A wide range of
           * reasonable numbers anywhere from one billion - one trillion
           * guesses per second, depending on number of cores and machines.
           * ballparking at 10B/sec.
           */
  var offline_fast_hashing_1e10_per_second: java.lang.String | scala.Double
  /**
           * offline attack. assumes multiple attackers,
           * proper user-unique salting, and a slow hash function
           * w/ moderate work factor, such as bcrypt, scrypt, PBKDF2.
           */
  var offline_slow_hashing_1e4_per_second: java.lang.String | scala.Double
  /**
           * online attack on a service that doesn't ratelimit,
           * or where an attacker has outsmarted ratelimiting.
           */
  var online_no_throttling_10_per_second: java.lang.String | scala.Double
  /**
           * online attack on a service that ratelimits password auth attempts.
           */
  var online_throttling_100_per_hour: java.lang.String | scala.Double
}

