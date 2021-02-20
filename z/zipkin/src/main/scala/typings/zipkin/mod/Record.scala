package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends StObject {
  
  var annotation: IAnnotation = js.native
  
  var timestamp: Double = js.native
  
  var traceId: TraceId = js.native
}
object Record {
  
  @scala.inline
  def apply(annotation: IAnnotation, timestamp: Double, traceId: TraceId): Record = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: IAnnotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceId(value: TraceId): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
  }
}
