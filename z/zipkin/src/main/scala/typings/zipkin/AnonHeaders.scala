package typings.zipkin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders[H] extends js.Object {
  var headers: H with Anon0
}

object AnonHeaders {
  @scala.inline
  def apply[H](headers: H with Anon0): AnonHeaders[H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaders[H]]
  }
}

