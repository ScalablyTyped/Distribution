package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "ConsoleRecorder")
@js.native
class ConsoleRecorder ()
  extends StObject
     with Recorder {
  def this(logger: js.Function1[/* message */ String, Unit]) = this()
  
  /* CompleteClass */
  override def record(rec: Record): Unit = js.native
}
