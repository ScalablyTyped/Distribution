package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "BatchRecorder")
@js.native
class BatchRecorder protected () extends Recorder {
  def this(args: zipkinLib.Anon_Logger) = this()
  def flush(): scala.Unit = js.native
  /* CompleteClass */
  override def record(rec: Record): scala.Unit = js.native
}

