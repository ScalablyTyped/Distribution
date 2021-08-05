package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Tracer sends each annotation to a Recorder implementation */
trait Recorder extends StObject {
  
  def record(rec: Record): Unit
}
object Recorder {
  
  inline def apply(record: Record => Unit): Recorder = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[Recorder]
  }
  
  extension [Self <: Recorder](x: Self) {
    
    inline def setRecord(value: Record => Unit): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
  }
}
