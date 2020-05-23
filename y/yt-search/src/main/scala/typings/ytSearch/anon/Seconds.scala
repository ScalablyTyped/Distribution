package typings.ytSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seconds extends js.Object {
  var seconds: Double
  var timestamp: String
}

object Seconds {
  @scala.inline
  def apply(seconds: Double, timestamp: String): Seconds = {
    val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seconds]
  }
}

