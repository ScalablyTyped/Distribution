package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleRecorder extends Recorder

object ConsoleRecorder {
  @scala.inline
  def apply(record: Record => scala.Unit): ConsoleRecorder = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
  
    __obj.asInstanceOf[ConsoleRecorder]
  }
}

