package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0[H] extends js.Object {
  var headers: H with (/* import warning: ImportType.apply Failed type conversion: {[X-B3-TraceId] : string, [X-B3-SpanId] : string, [X-B3-ParentSpanId]? : string, [X-B3-Sampled]? : '1' | '0', [X-B3-Flags]? : '1' | '0'} */ js.Any)
}

object Anon_0 {
  @scala.inline
  def apply[H](
    headers: H with (/* import warning: ImportType.apply Failed type conversion: {[X-B3-TraceId] : string, [X-B3-SpanId] : string, [X-B3-ParentSpanId]? : string, [X-B3-Sampled]? : '1' | '0', [X-B3-Flags]? : '1' | '0'} */ js.Any)
  ): Anon_0[H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0[H]]
  }
}

