package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRecorder extends Recorder

object BatchRecorder {
  @scala.inline
  def apply(record: js.Function1[Record, scala.Unit]): BatchRecorder = {
    val __obj = js.Dynamic.literal(record = record)
  
    __obj.asInstanceOf[BatchRecorder]
  }
}

