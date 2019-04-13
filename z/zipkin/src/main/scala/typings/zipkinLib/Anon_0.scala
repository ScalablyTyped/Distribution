package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var `X-B3-Flags`: js.UndefOr[zipkinLib.zipkinLibStrings.`1` | zipkinLib.zipkinLibStrings.`0`] = js.undefined
  var `X-B3-ParentSpanId`: js.UndefOr[java.lang.String] = js.undefined
  var `X-B3-Sampled`: js.UndefOr[zipkinLib.zipkinLibStrings.`1` | zipkinLib.zipkinLibStrings.`0`] = js.undefined
  var `X-B3-SpanId`: java.lang.String
  var `X-B3-TraceId`: java.lang.String
}

object Anon_0 {
  @scala.inline
  def apply(
    `X-B3-SpanId`: java.lang.String,
    `X-B3-TraceId`: java.lang.String,
    `X-B3-Flags`: zipkinLib.zipkinLibStrings.`1` | zipkinLib.zipkinLibStrings.`0` = null,
    `X-B3-ParentSpanId`: java.lang.String = null,
    `X-B3-Sampled`: zipkinLib.zipkinLibStrings.`1` | zipkinLib.zipkinLibStrings.`0` = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-B3-SpanId")(`X-B3-SpanId`)
    __obj.updateDynamic("X-B3-TraceId")(`X-B3-TraceId`)
    if (`X-B3-Flags` != null) __obj.updateDynamic("X-B3-Flags")(`X-B3-Flags`.asInstanceOf[js.Any])
    if (`X-B3-ParentSpanId` != null) __obj.updateDynamic("X-B3-ParentSpanId")(`X-B3-ParentSpanId`)
    if (`X-B3-Sampled` != null) __obj.updateDynamic("X-B3-Sampled")(`X-B3-Sampled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

