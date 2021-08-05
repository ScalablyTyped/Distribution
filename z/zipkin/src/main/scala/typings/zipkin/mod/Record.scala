package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  var annotation: IAnnotation
  
  var timestamp: Double
  
  var traceId: TraceId
}
object Record {
  
  inline def apply(annotation: IAnnotation, timestamp: Double, traceId: TraceId): Record = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setAnnotation(value: IAnnotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTraceId(value: TraceId): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
  }
}
