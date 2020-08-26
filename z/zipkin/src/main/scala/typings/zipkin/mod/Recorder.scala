package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Tracer sends each annotation to a Recorder implementation */
@js.native
trait Recorder extends js.Object {
  def record(rec: Record): Unit = js.native
}

object Recorder {
  @scala.inline
  def apply(record: Record => Unit): Recorder = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[Recorder]
  }
  @scala.inline
  implicit class RecorderOps[Self <: Recorder] (val x: Self) extends AnyVal {
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
    def setRecord(value: Record => Unit): Self = this.set("record", js.Any.fromFunction1(value))
  }
  
}

