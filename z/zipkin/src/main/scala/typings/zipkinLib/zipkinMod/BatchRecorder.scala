package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "BatchRecorder")
@js.native
class BatchRecorder protected ()
  extends zipkinLib.zipkinMod.zipkinNs.BatchRecorder {
  def this(args: zipkinLib.Anon_Logger) = this()
  /* CompleteClass */
  override def record(rec: zipkinLib.zipkinMod.zipkinNs.Record): scala.Unit = js.native
}

