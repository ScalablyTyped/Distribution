package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "ConsoleRecorder")
@js.native
class ConsoleRecorder () extends Recorder {
  def this(logger: js.Function1[/* message */ java.lang.String, scala.Unit]) = this()
  /* CompleteClass */
  override def record(rec: Record): scala.Unit = js.native
}

