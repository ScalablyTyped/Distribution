package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers[H] extends js.Object {
  var headers: H with Anon_0
}

object Anon_Headers {
  @scala.inline
  def apply[H](headers: H with Anon_0): Anon_Headers[H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Headers[H]]
  }
}

