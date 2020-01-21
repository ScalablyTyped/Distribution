package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "ConsoleRecorder")
@js.native
class ConsoleRecorder () extends Recorder {
  def this(logger: js.Function1[/* message */ String, Unit]) = this()
  /* CompleteClass */
  override def record(rec: Record): Unit = js.native
}

