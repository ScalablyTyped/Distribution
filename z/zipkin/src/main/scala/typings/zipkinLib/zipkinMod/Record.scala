package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var annotation: IAnnotation
  var timestamp: scala.Double
  var traceId: TraceId
}

object Record {
  @scala.inline
  def apply(annotation: IAnnotation, timestamp: scala.Double, traceId: TraceId): Record = {
    val __obj = js.Dynamic.literal(annotation = annotation, timestamp = timestamp, traceId = traceId)
  
    __obj.asInstanceOf[Record]
  }
}

