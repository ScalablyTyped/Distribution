package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Tracer sends each annotation to a Recorder implementation */
trait Recorder extends js.Object {
  def record(rec: Record): Unit
}

object Recorder {
  @scala.inline
  def apply(record: Record => Unit): Recorder = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
  
    __obj.asInstanceOf[Recorder]
  }
}

