package typings.zipkin.mod

import typings.zipkin.AnonLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "BatchRecorder")
@js.native
class BatchRecorder protected () extends Recorder {
  /**
    * @constructor
    * @param {Object} args
    * @param {Logger} args.logger logs the data to zipkin server
    * @param {number} args.timeout timeout after which an unfinished span is
    * flushed to zipkin in **microseconds**. Passing this value has
    * implications in the reported data of the span so we discourage users
    * to pass a value for it unless there is a good reason for.
    */
  def this(args: AnonLogger) = this()
  def flush(): Unit = js.native
  /* CompleteClass */
  override def record(rec: Record): Unit = js.native
}

