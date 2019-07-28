package typings.zipkin.zipkinMod

import typings.zipkin.Anon_Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "BatchRecorder")
@js.native
class BatchRecorder protected () extends Recorder {
  def this(args: Anon_Logger) = this()
  def flush(): Unit = js.native
  /* CompleteClass */
  override def record(rec: Record): Unit = js.native
}

