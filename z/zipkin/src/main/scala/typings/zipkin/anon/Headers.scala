package typings.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers[H] extends js.Object {
  var headers: H with XB3Flags
}

object Headers {
  @scala.inline
  def apply[H](headers: H with XB3Flags): Headers[H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers[H]]
  }
}

