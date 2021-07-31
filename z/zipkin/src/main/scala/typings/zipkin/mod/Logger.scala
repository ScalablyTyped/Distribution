package typings.zipkin.mod

import typings.zipkin.mod.model.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Logger (or transport) is what the Recorder uses to send spans to Zipkin.
  * @see https://github.com/openzipkin/zipkin-js/#transports Official transport implementations
  */
trait Logger extends StObject {
  
  def logSpan(span: Span): Unit
}
object Logger {
  
  @scala.inline
  def apply(logSpan: Span => Unit): Logger = {
    val __obj = js.Dynamic.literal(logSpan = js.Any.fromFunction1(logSpan))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogSpan(value: Span => Unit): Self = StObject.set(x, "logSpan", js.Any.fromFunction1(value))
  }
}
