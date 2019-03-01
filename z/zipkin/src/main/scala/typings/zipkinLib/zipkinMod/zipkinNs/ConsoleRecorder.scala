package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleRecorder extends Recorder

object ConsoleRecorder {
  @scala.inline
  def apply(record: js.Function1[Record, scala.Unit]): ConsoleRecorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("record")(record)
    __obj.asInstanceOf[ConsoleRecorder]
  }
}

