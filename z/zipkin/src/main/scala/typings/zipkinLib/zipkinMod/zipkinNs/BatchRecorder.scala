package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRecorder extends Recorder

object BatchRecorder {
  @scala.inline
  def apply(record: Record => scala.Unit): BatchRecorder = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
  
    __obj.asInstanceOf[BatchRecorder]
  }
}

