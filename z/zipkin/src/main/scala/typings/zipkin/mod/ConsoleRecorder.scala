package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "ConsoleRecorder")
@js.native
class ConsoleRecorder () extends Recorder {
  def this(logger: js.Function1[/* message */ String, Unit]) = this()
}
