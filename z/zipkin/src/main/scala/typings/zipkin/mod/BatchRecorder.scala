package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(args: typings.zipkin.anon.Logger) = this()
  
  def flush(): Unit = js.native
}
