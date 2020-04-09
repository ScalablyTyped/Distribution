package typings.ytSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeconds extends js.Object {
  var seconds: Double
  var timestamp: String
}

object AnonSeconds {
  @scala.inline
  def apply(seconds: Double, timestamp: String): AnonSeconds = {
    val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSeconds]
  }
}

