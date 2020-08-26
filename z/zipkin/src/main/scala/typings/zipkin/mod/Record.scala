package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
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
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotation(value: IAnnotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraceId(value: TraceId): Self = this.set("traceId", value.asInstanceOf[js.Any])
  }
  
}

